package us.timinc.jsonifycraft.world;

import com.google.common.primitives.Ints;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import us.timinc.jsonifycraft.JsonifyCraft;
import us.timinc.jsonifycraft.description.BlockDescription;
import us.timinc.mcutil.MCRegistry;

public class JsonedBlockItem extends ItemBlock {
    private final BlockDescription description;

    private EnumRarity rarity;

    public JsonedBlockItem(Block block, BlockDescription blockDescription) {
        super(block);
        description = blockDescription;
        setup();
    }

    private void setup() {
        // Max stack size
        setMaxStackSize(Ints.constrainToRange(description.stack, 1, 64));

        // Rarity
        if (MCRegistry.RARITIES.isValidName(description.rarity)) {
            setRarity(MCRegistry.RARITIES.getFromName(description.rarity));
        } else {
            JsonifyCraft.log("Attempted rarity %s for %s, but it does not exist.", description.rarity, description.name);
        }
    }

    public JsonedBlockItem setRarity(EnumRarity rarity) {
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
}
