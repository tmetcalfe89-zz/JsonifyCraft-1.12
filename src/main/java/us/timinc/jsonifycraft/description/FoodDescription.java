package us.timinc.jsonifycraft.description;

import net.minecraft.item.Item;
import us.timinc.jsonifycraft.JsonifyCraft;
import us.timinc.jsonifycraft.description.tidbits.EffectDescription;
import us.timinc.jsonifycraft.world.JsonedFood;

import java.util.ArrayList;
import java.util.List;

public class FoodDescription extends ItemDescription {
  public int hunger;
  public float saturation;
  public boolean meat;
  public boolean canEatWhenFull;
  public boolean fastToEat;
  public EffectDescription[] effects = {};

  @Override
  public List<Item> getItems() {
    ArrayList<Item> items = new ArrayList<>();

    items.add(new JsonedFood(this).setRegistryName(name).setUnlocalizedName(JsonifyCraft.MODID + "." + name));

    return items;
  }
}
