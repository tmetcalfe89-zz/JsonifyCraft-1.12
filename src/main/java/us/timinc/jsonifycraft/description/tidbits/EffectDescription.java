package us.timinc.jsonifycraft.description.tidbits;

import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class EffectDescription {
  public String effect;
  public int duration;
  public int amplifier;
  public float probability = 1;

  private transient PotionEffect effectInstance = null;

  public PotionEffect getEffect() {
    if (effectInstance == null) {
      effectInstance = new PotionEffect(ForgeRegistries.POTIONS.getValue(new ResourceLocation(effect)), duration, amplifier);
    }
    return effectInstance;
  }
}
