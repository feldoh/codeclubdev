package uk.co.dexterlowe.codeclubdev;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CodeClubTabs {
    public static final CreativeModeTab CODE_CLUB_TAB = new CreativeModeTab("codeclubtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CodeClubItems.CODE_CLUBIUM.get());
        }
    };
}
