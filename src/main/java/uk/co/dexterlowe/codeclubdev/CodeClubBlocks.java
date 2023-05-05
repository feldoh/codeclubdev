package uk.co.dexterlowe.codeclubdev;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import uk.co.dexterlowe.codeclubdev.blocks.CodeClubium;

public class CodeClubBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CodeClub.MODID);

    public static final NamingWrapper CODECLUBIUM_NAMER = new NamingWrapper("code_clubium");
    public static final RegistryObject<Block> CODECLUBIUM = BLOCKS.register(CODECLUBIUM_NAMER.getBlockName(), () -> new CodeClubium(BlockBehaviour.Properties
            .of(Material.STONE)
            .requiresCorrectToolForDrops()
            .speedFactor(1.5f)
            .strength(1, 10)));

    public static final RegistryObject<Block> CODECLUBIUM_ORE = BLOCKS.register(CODECLUBIUM_NAMER.getOreName(), () -> new DropExperienceBlock(BlockBehaviour.Properties
            .of(Material.STONE)
            .requiresCorrectToolForDrops()
            .strength(2, 10), UniformInt.of(1, 6)));

    public static final RegistryObject<Block> CODECLUBIUM_DEEPSLATE_ORE = BLOCKS.register(CODECLUBIUM_NAMER.getDeepSlateOreName(), () -> new DropExperienceBlock(BlockBehaviour.Properties
            .of(Material.STONE)
            .requiresCorrectToolForDrops()
            .strength(3, 12), UniformInt.of(5, 8)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
