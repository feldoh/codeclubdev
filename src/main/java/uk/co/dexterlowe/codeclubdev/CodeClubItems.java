package uk.co.dexterlowe.codeclubdev;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CodeClubItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CodeClub.MODID);

    public static final RegistryObject<Item> CODE_CLUBIUM = ITEMS
            .register(CodeClubBlocks.CODECLUBIUM_NAMER.baseName(), () -> new Item(new Item.Properties()
                    .stacksTo(50)
                    .tab(CodeClubTabs.CODE_CLUB_TAB)));
    public static final RegistryObject<Item> RAW_CODE_CLUBIUM = ITEMS
            .register(CodeClubBlocks.CODECLUBIUM_NAMER.getRawName(), () -> new Item(new Item.Properties()
                    .stacksTo(42)
                    .tab(CodeClubTabs.CODE_CLUB_TAB)));

    public static final RegistryObject<BlockItem> CODE_CLUBIUM_BLOCK = ITEMS
            .register(CodeClubBlocks.CODECLUBIUM_NAMER.getBlockName(), () -> new BlockItem(CodeClubBlocks.CODECLUBIUM.get(), new Item.Properties()
                    .tab(CodeClubTabs.CODE_CLUB_TAB)));

    public static final RegistryObject<BlockItem> CODE_CLUBIUM_ORE = ITEMS
            .register(CodeClubBlocks.CODECLUBIUM_NAMER.getOreName(), () -> new BlockItem(CodeClubBlocks.CODECLUBIUM_ORE.get(), new Item.Properties()
                    .tab(CodeClubTabs.CODE_CLUB_TAB)));

    public static final RegistryObject<BlockItem> CODE_CLUBIUM_DEEPSLATE_ORE = ITEMS
            .register(CodeClubBlocks.CODECLUBIUM_NAMER.getDeepSlateOreName(), () -> new BlockItem(CodeClubBlocks.CODECLUBIUM_DEEPSLATE_ORE.get(), new Item.Properties()
                    .tab(CodeClubTabs.CODE_CLUB_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
