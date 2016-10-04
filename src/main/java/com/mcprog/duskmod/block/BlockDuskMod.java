package com.mcprog.duskmod.block;

import com.mcprog.duskmod.DuskMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/**
 * Created by Michael on 10/4/2016.
 */
public class BlockDuskMod extends Block {

    public BlockDuskMod(Material materialIn, String unlocalizedName) {
        super(materialIn);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(DuskMod.creativeTabDuskModCore);
    }

    /*@Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }*/
}
