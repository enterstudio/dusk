package com.mcprog.duskmod.item;

import com.mcprog.duskmod.DuskMod;
import net.minecraft.item.Item;

/**
 * Created by Michael on 10/4/2016.
 */
public class ItemDuskMod extends Item {

    public ItemDuskMod(String unlocalizedName) {
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(DuskMod.creativeTabDuskModCore);
    }


}
