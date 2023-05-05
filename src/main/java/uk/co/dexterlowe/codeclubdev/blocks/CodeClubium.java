package uk.co.dexterlowe.codeclubdev.blocks;

import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.slf4j.Logger;
import uk.co.dexterlowe.codeclubdev.CodeClubBlocks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class CodeClubium extends Block {
    public CodeClubium(Properties properties) {
        super(properties);
    }
    private static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pLevel.isClientSide) {
            return InteractionResult.SUCCESS;
        } else if (pHand.equals(InteractionHand.MAIN_HAND)) {
            pLevel.setBlock(pPos.relative(pPlayer.getDirection()), CodeClubBlocks.CODECLUBIUM.get().defaultBlockState(), 3);
            return InteractionResult.CONSUME;
        }
        return InteractionResult.PASS;
    }
}
