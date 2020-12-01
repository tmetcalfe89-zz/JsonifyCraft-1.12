package us.timinc.jsonifycraft.world;

import com.google.common.primitives.Ints;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import us.timinc.jsonifycraft.JsonifyCraft;
import us.timinc.jsonifycraft.description.FoodDescription;
import us.timinc.mcutil.MCRegistry;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class JsonedFood extends ItemFood {
  private final FoodDescription description;

  private EnumRarity rarity;

  public JsonedFood(FoodDescription foodDescription) {
    super(foodDescription.hunger, foodDescription.saturation, foodDescription.meat);

    this.description = foodDescription;

    setup();
  }

  private void setup() {
    // Group
    setCreativeTab(MCRegistry.ITEM_GROUPS.getFromName(description.group));

    // Max stack size
    setMaxStackSize(Ints.constrainToRange(description.stack, 1, 64));

    // Rarity
    if (MCRegistry.RARITIES.isValidName(description.rarity)) {
      setRarity(MCRegistry.RARITIES.getFromName(description.rarity));
    } else {
      JsonifyCraft.log("Attempted rarity %s for %s, but it does not exist.", description.rarity, description.name);
    }
  }

  public JsonedFood setRarity(EnumRarity rarity) {
    this.rarity = rarity;
    return this;
  }

  @Override
  public boolean hasEffect(ItemStack stack) {
    return stack.getItem() == this && description.hasFlag("shimmer");
  }

  public EnumRarity getRarity(ItemStack stack) {
    if (stack.getItem() != this) {
      return super.getRarity(stack);
    }

    return rarity;
  }

  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
    if (description.hasFlag("lore")) {
      tooltip.add(new TextComponentTranslation(String.format("item.jsonifycraft.%s.lore", description.name)).getFormattedText());
    }
  }

  @Override
  protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
    if (!worldIn.isRemote) {
      Arrays.stream(description.effects).forEach(effect -> {
        if (worldIn.rand.nextFloat() < effect.probability) {
          player.addPotionEffect(effect.getEffect());
        }
      });
    }
  }
}
