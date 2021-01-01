package us.timinc.jsonifycraft.description;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import us.timinc.jsonifycraft.JsonifyCraft;
import us.timinc.jsonifycraft.description.providers.IProviderBlock;
import us.timinc.jsonifycraft.description.providers.IProviderItem;
import us.timinc.jsonifycraft.description.tidbits.Harvester;
import us.timinc.jsonifycraft.world.JsonedBlock;
import us.timinc.jsonifycraft.world.JsonedBlockItem;

import java.util.ArrayList;
import java.util.List;

public class BlockDescription extends ItemDescription implements IProviderBlock, IProviderItem {
    public String material = "ground";
    public String sounds = "stone";
    public String mapcolor = "";
    public int light = 0;
    public float resistance = -1.0F;
    public float hardness = -1.0F;
    public float slip = -1.0F;
    public Harvester harvester = null;

    transient List<Block> blocks;

    @Override
    public List<Block> getBlocks() {
        if (blocks == null) {
            blocks = new ArrayList<>();

            blocks.add(new JsonedBlock(this).setRegistryName(name)
                    .setUnlocalizedName(JsonifyCraft.MODID + "." + name));
        }
        return blocks;
    }

    @Override
    public List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        getBlocks()
                .forEach(block -> items.add(new JsonedBlockItem(block, this).setRegistryName(block.getRegistryName())
                        .setUnlocalizedName(block.getUnlocalizedName())));
        return items;
    }
}
