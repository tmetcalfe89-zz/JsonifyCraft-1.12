package us.timinc.mcutil;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.EnumUtils;

import java.util.HashMap;
import java.util.Map;

// TODO: Review all manual set ups for missing entries. I just deleted the ones that weren't in yet.

public abstract class MCRegistry<T> {
    public static final MCRegistry<SoundType> SOUND_TYPES = new MCRegistry<SoundType>() {
        private Map<String, SoundType> soundTypes;

        @Override
        public MCRegistry<SoundType> setup() {
            soundTypes = new HashMap<>();

            soundTypes.put("WOOD", SoundType.WOOD);
            soundTypes.put("GROUND", SoundType.GROUND);
            soundTypes.put("PLANT", SoundType.PLANT);
            soundTypes.put("LILY_PADS", SoundType.PLANT);
            soundTypes.put("STONE", SoundType.STONE);
            soundTypes.put("METAL", SoundType.METAL);
            soundTypes.put("GLASS", SoundType.GLASS);
            soundTypes.put("CLOTH", SoundType.CLOTH);
            soundTypes.put("SAND", SoundType.SAND);
            soundTypes.put("SNOW", SoundType.SNOW);
            soundTypes.put("LADDER", SoundType.LADDER);
            soundTypes.put("ANVIL", SoundType.ANVIL);
            soundTypes.put("SLIME", SoundType.SLIME);
            soundTypes.put("HONEY", SoundType.SLIME);
            soundTypes.put("WET_GRASS", SoundType.SLIME);
            soundTypes.put("CORAL", SoundType.SLIME);
            soundTypes.put("BAMBOO", SoundType.PLANT);
            soundTypes.put("BAMBOO_SAPLING", SoundType.PLANT);
            soundTypes.put("SCAFFOLDING", SoundType.WOOD);
            soundTypes.put("SWEET_BERRY_BUSH", SoundType.PLANT);
            soundTypes.put("CROP", SoundType.PLANT);
            soundTypes.put("STEM", SoundType.PLANT);
            soundTypes.put("VINE", SoundType.PLANT);
            soundTypes.put("NETHER_WART", SoundType.PLANT);
            soundTypes.put("LANTERN", SoundType.ANVIL);
            soundTypes.put("HYPHAE", SoundType.PLANT);
            soundTypes.put("NYLIUM", SoundType.PLANT);
            soundTypes.put("FUNGUS", SoundType.PLANT);
            soundTypes.put("ROOT", SoundType.PLANT);
            soundTypes.put("SHROOMLIGHT", SoundType.SLIME);
            soundTypes.put("NETHER_VINE", SoundType.PLANT);
            soundTypes.put("NETHER_VINE_LOWER_PITCH", SoundType.PLANT);
            soundTypes.put("SOUL_SAND", SoundType.GROUND);
            soundTypes.put("SOUL_SOIL", SoundType.GROUND);
            soundTypes.put("BASALT", SoundType.STONE);
            soundTypes.put("WART", SoundType.PLANT);
            soundTypes.put("NETHERRACK", SoundType.GROUND);
            soundTypes.put("NETHER_BRICK", SoundType.STONE);
            soundTypes.put("NETHER_SPROUT", SoundType.PLANT);
            soundTypes.put("NETHER_ORE", SoundType.STONE);
            soundTypes.put("BONE", SoundType.STONE);
            soundTypes.put("NETHERITE", SoundType.METAL);
            soundTypes.put("ANCIENT_DEBRIS", SoundType.METAL);
            soundTypes.put("LODESTONE", SoundType.STONE);
            soundTypes.put("CHAIN", SoundType.METAL);
            soundTypes.put("NETHER_GOLD", SoundType.METAL);
            soundTypes.put("GILDED_BLACKSTONE", SoundType.METAL);

            return this;
        }

        @Override
        public SoundType getFromName(String name) {
            return soundTypes.get(name.toUpperCase());
        }

        @Override
        public boolean isValidName(String name) {
            return soundTypes.containsKey(name.toUpperCase());
        }
    }.setup();

    public static final MCRegistry<MapColor> MATERIAL_COLORS = new MCRegistry<MapColor>() {
        private Map<String, MapColor> mapColors;

        @Override
        public MCRegistry<MapColor> setup() {
            mapColors = new HashMap<>();

            mapColors.put("AIR", MapColor.AIR);
            mapColors.put("GRASS", MapColor.GRASS);
            mapColors.put("SAND", MapColor.SAND);
            mapColors.put("CLOTH", MapColor.CLOTH);
            mapColors.put("WOOL", MapColor.CLOTH);
            mapColors.put("TNT", MapColor.TNT);
            mapColors.put("ICE", MapColor.ICE);
            mapColors.put("IRON", MapColor.IRON);
            mapColors.put("FOLIAGE", MapColor.FOLIAGE);
            mapColors.put("SNOW", MapColor.SNOW);
            mapColors.put("CLAY", MapColor.CLAY);
            mapColors.put("DIRT", MapColor.DIRT);
            mapColors.put("STONE", MapColor.STONE);
            mapColors.put("WATER", MapColor.WATER);
            mapColors.put("WOOD", MapColor.WOOD);
            mapColors.put("QUARTZ", MapColor.QUARTZ);
            mapColors.put("ADOBE", MapColor.ADOBE);
            mapColors.put("MAGENTA", MapColor.MAGENTA);
            mapColors.put("LIGHT_BLUE", MapColor.LIGHT_BLUE);
            mapColors.put("YELLOW", MapColor.YELLOW);
            mapColors.put("LIME", MapColor.LIME);
            mapColors.put("PINK", MapColor.PINK);
            mapColors.put("GRAY", MapColor.GRAY);
            mapColors.put("SILVER", MapColor.SILVER);
            mapColors.put("LIGHT_GRAY", MapColor.SILVER);
            mapColors.put("CYAN", MapColor.CYAN);
            mapColors.put("PURPLE", MapColor.PURPLE);
            mapColors.put("BLUE", MapColor.BLUE);
            mapColors.put("BROWN", MapColor.BROWN);
            mapColors.put("GREEN", MapColor.GREEN);
            mapColors.put("RED", MapColor.RED);
            mapColors.put("BLACK", MapColor.BLACK);
            mapColors.put("GOLD", MapColor.GOLD);
            mapColors.put("DIAMOND", MapColor.DIAMOND);
            mapColors.put("LAPIS", MapColor.LAPIS);
            mapColors.put("EMERALD", MapColor.EMERALD);
            mapColors.put("OBSIDIAN", MapColor.OBSIDIAN);
            mapColors.put("NETHERRACK", MapColor.NETHERRACK);
            mapColors.put("WHITE_STAINED_HARDENED_CLAY", MapColor.WHITE_STAINED_HARDENED_CLAY);
            mapColors.put("ORANGE_STAINED_HARDENED_CLAY", MapColor.ORANGE_STAINED_HARDENED_CLAY);
            mapColors.put("MAGENTA_STAINED_HARDENED_CLAY", MapColor.MAGENTA_STAINED_HARDENED_CLAY);
            mapColors.put("LIGHT_BLUE_STAINED_HARDENED_CLAY", MapColor.LIGHT_BLUE_STAINED_HARDENED_CLAY);
            mapColors.put("YELLOW_STAINED_HARDENED_CLAY", MapColor.YELLOW_STAINED_HARDENED_CLAY);
            mapColors.put("LIME_STAINED_HARDENED_CLAY", MapColor.LIME_STAINED_HARDENED_CLAY);
            mapColors.put("PINK_STAINED_HARDENED_CLAY", MapColor.PINK_STAINED_HARDENED_CLAY);
            mapColors.put("GRAY_STAINED_HARDENED_CLAY", MapColor.GRAY_STAINED_HARDENED_CLAY);
            mapColors.put("SILVER_STAINED_HARDENED_CLAY", MapColor.SILVER_STAINED_HARDENED_CLAY);
            mapColors.put("LIGHT_GRAY_STAINED_HARDENED_CLAY", MapColor.SILVER_STAINED_HARDENED_CLAY);
            mapColors.put("CYAN_STAINED_HARDENED_CLAY", MapColor.CYAN_STAINED_HARDENED_CLAY);
            mapColors.put("PURPLE_STAINED_HARDENED_CLAY", MapColor.PURPLE_STAINED_HARDENED_CLAY);
            mapColors.put("BLUE_STAINED_HARDENED_CLAY", MapColor.BLUE_STAINED_HARDENED_CLAY);
            mapColors.put("BROWN_STAINED_HARDENED_CLAY", MapColor.BROWN_STAINED_HARDENED_CLAY);
            mapColors.put("GREEN_STAINED_HARDENED_CLAY", MapColor.GREEN_STAINED_HARDENED_CLAY);
            mapColors.put("RED_STAINED_HARDENED_CLAY", MapColor.RED_STAINED_HARDENED_CLAY);
            mapColors.put("BLACK_STAINED_HARDENED_CLAY", MapColor.BLACK_STAINED_HARDENED_CLAY);
            mapColors.put("WHITE_TERRACOTTA", MapColor.WHITE_STAINED_HARDENED_CLAY);
            mapColors.put("ORANGE_TERRACOTTA", MapColor.ORANGE_STAINED_HARDENED_CLAY);
            mapColors.put("MAGENTA_TERRACOTTA", MapColor.MAGENTA_STAINED_HARDENED_CLAY);
            mapColors.put("LIGHT_BLUE_TERRACOTTA", MapColor.LIGHT_BLUE_STAINED_HARDENED_CLAY);
            mapColors.put("YELLOW_TERRACOTTA", MapColor.YELLOW_STAINED_HARDENED_CLAY);
            mapColors.put("LIME_TERRACOTTA", MapColor.LIME_STAINED_HARDENED_CLAY);
            mapColors.put("PINK_TERRACOTTA", MapColor.PINK_STAINED_HARDENED_CLAY);
            mapColors.put("GRAY_TERRACOTTA", MapColor.GRAY_STAINED_HARDENED_CLAY);
            mapColors.put("LIGHT_GRAY_TERRACOTTA", MapColor.SILVER_STAINED_HARDENED_CLAY);
            mapColors.put("CYAN_TERRACOTTA", MapColor.CYAN_STAINED_HARDENED_CLAY);
            mapColors.put("PURPLE_TERRACOTTA", MapColor.PURPLE_STAINED_HARDENED_CLAY);
            mapColors.put("BLUE_TERRACOTTA", MapColor.BLUE_STAINED_HARDENED_CLAY);
            mapColors.put("BROWN_TERRACOTTA", MapColor.BROWN_STAINED_HARDENED_CLAY);
            mapColors.put("GREEN_TERRACOTTA", MapColor.GREEN_STAINED_HARDENED_CLAY);
            mapColors.put("RED_TERRACOTTA", MapColor.RED_STAINED_HARDENED_CLAY);
            mapColors.put("BLACK_TERRACOTTA", MapColor.BLACK_STAINED_HARDENED_CLAY);
            mapColors.put("CRIMSON_NYLIUM", MapColor.RED);
            mapColors.put("CRIMSON_STEM", MapColor.MAGENTA_STAINED_HARDENED_CLAY);
            mapColors.put("CRIMSON_HYPHAE", MapColor.BROWN_STAINED_HARDENED_CLAY);
            mapColors.put("WARPED_NYLIUM", MapColor.CYAN);
            mapColors.put("WARPED_STEM", MapColor.CYAN);
            mapColors.put("WARPED_HYPHAE", MapColor.BROWN_STAINED_HARDENED_CLAY);
            mapColors.put("WARPED_WART", MapColor.CYAN);

            return this;
        }

        @Override
        public MapColor getFromName(String name) {
            return mapColors.get(name.toUpperCase());
        }

        @Override
        public boolean isValidName(String name) {
            return mapColors.containsKey(name.toUpperCase());
        }
    }.setup();

    public static MCRegistry<Float> NOURISHMENT_TIERS = new MCRegistry<Float>() {
        private Map<String, Float> nourishment_tiers;

        @Override
        public MCRegistry<Float> setup() {
            nourishment_tiers = new HashMap<>();

            nourishment_tiers.put("SUPERNATURAL", 2.4F);
            nourishment_tiers.put("GOOD", 1.6F);
            nourishment_tiers.put("NORMAL", 1.2F);
            nourishment_tiers.put("LOW", 0.6F);
            nourishment_tiers.put("POOR", 0.2F);

            return this;
        }

        @Override
        public Float getFromName(String name) {
            return nourishment_tiers.get(name.toUpperCase());
        }

        @Override
        public boolean isValidName(String name) {
            return nourishment_tiers.containsKey(name.toUpperCase());
        }
    }.setup();

    public static MCRegistry<EnumRarity> RARITIES = new MCRegistry<EnumRarity>() {
        @Override
        public MCRegistry<EnumRarity> setup() {
            return this;
        }

        @Override
        public EnumRarity getFromName(String name) {
            return EnumRarity.valueOf(name.toUpperCase());
        }

        @Override
        public boolean isValidName(String name) {
            return EnumUtils.isValidEnum(EnumRarity.class, name.toUpperCase());
        }
    }.setup();

    public static MCRegistry<Material> MATERIALS = new MCRegistry<Material>() {
        private Map<String, Material> materials;

        @Override
        public MCRegistry<Material> setup() {
            materials = new HashMap<>();

            materials.put("AIR", Material.AIR);
            materials.put("GRASS", Material.GRASS);
            materials.put("GROUND", Material.GROUND);
            materials.put("WOOD", Material.WOOD);
            materials.put("ROCK", Material.ROCK);
            materials.put("IRON", Material.IRON);
            materials.put("ANVIL", Material.ANVIL);
            materials.put("WATER", Material.WATER);
            materials.put("LAVA", Material.LAVA);
            materials.put("LEAVES", Material.LEAVES);
            materials.put("PLANTS", Material.PLANTS);
            materials.put("VINE", Material.VINE);
            materials.put("SPONGE", Material.SPONGE);
            materials.put("CLOTH", Material.CLOTH);
            materials.put("FIRE", Material.FIRE);
            materials.put("SAND", Material.SAND);
            materials.put("CIRCUITS", Material.CIRCUITS);
            materials.put("CARPET", Material.CARPET);
            materials.put("GLASS", Material.GLASS);
            materials.put("REDSTONE_LIGHT", Material.REDSTONE_LIGHT);
            materials.put("TNT", Material.TNT);
            materials.put("CORAL", Material.CORAL);
            materials.put("ICE", Material.ICE);
            materials.put("PACKED_ICE", Material.PACKED_ICE);
            materials.put("SNOW", Material.SNOW);
            materials.put("CRAFTED_SNOW", Material.CRAFTED_SNOW);
            materials.put("CACTUS", Material.CACTUS);
            materials.put("CLAY", Material.CLAY);
            materials.put("GOURD", Material.GOURD);
            materials.put("DRAGON_EGG", Material.DRAGON_EGG);
            materials.put("PORTAL", Material.PORTAL);
            materials.put("CAKE", Material.CAKE);
            materials.put("WEB", Material.WEB);
            materials.put("PISTON", Material.PISTON);
            materials.put("BARRIER", Material.BARRIER);
            materials.put("STRUCTURE_VOID", Material.STRUCTURE_VOID);

            return this;
        }

        @Override
        public Material getFromName(String name) {
            return materials.get(name.toUpperCase());
        }

        @Override
        public boolean isValidName(String name) {
            return materials.containsKey(name.toUpperCase());
        }
    }.setup();

    public abstract MCRegistry<? extends T> setup();

    public abstract T getFromName(String name);

    public abstract boolean isValidName(String name);
}
