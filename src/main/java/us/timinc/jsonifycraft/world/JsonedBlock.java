package us.timinc.jsonifycraft.world;

import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import us.timinc.jsonifycraft.JsonifyCraft;
import us.timinc.jsonifycraft.description.BlockDescription;
import us.timinc.mcutil.MCRegistry;

public class JsonedBlock extends Block {
    private final BlockDescription description;

    public JsonedBlock(BlockDescription blockDescription) {
        super(MCRegistry.MATERIALS.getFromName(blockDescription.material), MCRegistry.MATERIAL_COLORS.isValidName(blockDescription.mapcolor) ? MCRegistry.MATERIAL_COLORS.getFromName(blockDescription.mapcolor) : MCRegistry.MATERIALS.getFromName(blockDescription.material).getMaterialMapColor());
        this.description = blockDescription;
        setup();
    }

    private void setup() {
        // Sound type
        if (MCRegistry.SOUND_TYPES.isValidName(description.sounds)) {
            setSoundType(MCRegistry.SOUND_TYPES.getFromName(description.sounds));
        }

        // Light
        if (description.light >= 0 && description.light <= 15) {
            setLightLevel(description.light);
        } else {
            int trueLight = Ints.constrainToRange(description.light, 0, 15);
            JsonifyCraft.log("Attempted light value of %s is invalid. Set to %s.", description.light, trueLight);
            setLightLevel(trueLight);
        }

        // Hardness and resistance
        setHardness(description.hardness);
        setResistance(description.resistance / 3.0F);

        // Slipperiness
        if (description.slip != -1.0F) {
            setDefaultSlipperiness(Floats.constrainToRange(description.slip, 0.001F, 0.999F));
        }

        // Tool
        if (description.harvester != null) {
            setHarvestLevel(description.harvester.tool, description.harvester.level);
        }

        // Group
        setCreativeTab(MCRegistry.ITEM_GROUPS.getFromName(description.group));
    }

    @Override
    public Block setLightLevel(float value) {
        return super.setLightLevel(value / 15.0F);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        if (description == null)
            return super.getCollisionBoundingBox(blockState, worldIn, pos);

        return description.hasFlag("ghost") ? NULL_AABB : super.getCollisionBoundingBox(blockState, worldIn, pos);
    }
}
