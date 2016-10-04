package com.mcprog.duskmod.recipe;

import com.mcprog.duskmod.block.ModBlocks;
import com.mcprog.duskmod.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Michael on 10/4/2016.
 * Recipes that can be created by vanilla means
 */
public class RecipesVanilla {

    public static void registerRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.stoneChannel, 2), new Object[] {
            "c c",
            "ccc",
            Character.valueOf('c'), Blocks.STONE
        });

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.channelStation), new Object[] {
            "t",
            "s",
            Character.valueOf('t'), Blocks.STONE,
            Character.valueOf('s'), Blocks.SANDSTONE
        });
    }
}
