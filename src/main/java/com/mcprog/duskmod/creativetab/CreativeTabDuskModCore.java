package com.mcprog.duskmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Michael on 10/4/2016.
 */
public class CreativeTabDuskModCore extends CreativeTabs {

    public CreativeTabDuskModCore() {
        super(getNextID(), "creative_tab_dusk_mod_core");
    }

    @Override
    public Item getTabIconItem() {
        return Items.GLOWSTONE_DUST;
    }
}
