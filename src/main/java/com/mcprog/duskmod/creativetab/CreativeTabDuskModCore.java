package com.mcprog.duskmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Michael on 10/4/2016.
 */
public class CreativeTabDuskModCore extends CreativeTabs {

    public CreativeTabDuskModCore(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.GLOWSTONE_DUST;
    }
}
