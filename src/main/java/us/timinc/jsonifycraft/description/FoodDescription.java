package us.timinc.jsonifycraft.description;

import net.minecraft.item.Item;
import us.timinc.jsonifycraft.JsonifyCraft;
import us.timinc.jsonifycraft.description.tidbits.EffectDescription;
import us.timinc.jsonifycraft.world.JsonedFood;
import us.timinc.mcutil.MCRegistry;

import java.util.ArrayList;
import java.util.List;

public class FoodDescription extends ItemDescription {
  public int hunger;
  public float saturation = -1.0F;
  public String nourishment = "normal";
  public EffectDescription[] effects = {};

  @Override
  public List<Item> getItems() {
    ArrayList<Item> items = new ArrayList<>();

    items.add(new JsonedFood(this).setRegistryName(name).setUnlocalizedName(JsonifyCraft.MODID + "." + name));

    return items;
  }

  public float getSaturation() {
    if (saturation != -1.0F) {
      return saturation;
    } else {
      return MCRegistry.NOURISHMENT_TIERS.getFromName(nourishment);
    }
  }
}
