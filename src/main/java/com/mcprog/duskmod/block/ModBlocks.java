package com.mcprog.duskmod.block;

import com.mcprog.duskmod.DuskMod;
import com.mcprog.duskmod.creativetab.CreativeTabDuskModCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Michael on 10/4/2016.
 */
public class ModBlocks {

    public static Block channelStation;

    public static void preInit() {
        channelStation = new BlockChannelStation("channel_station");
    }

    public static void registerBlocks() {
        registerBlock(channelStation);
    }

    public static void registerRenders() {
        registerRender(channelStation);
    }

    private static void registerBlock(Block block) {
        ResourceLocation loc = new ResourceLocation(DuskMod.MODID, block.getUnlocalizedName().substring(5));
        GameRegistry.register(block, loc);
        GameRegistry.register(new ItemBlock(block), loc);
    }

    private static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft()
                .getRenderItem()
                .getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(DuskMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
