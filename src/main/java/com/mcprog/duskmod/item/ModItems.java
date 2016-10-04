package com.mcprog.duskmod.item;

import com.mcprog.duskmod.DuskMod;
import com.mcprog.duskmod.creativetab.CreativeTabDuskModCore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Michael on 10/4/2016.
 */
public class ModItems {

    public static Item stoneChannel;

    public static void preInit() {
        stoneChannel = new ItemDuskMod("stone_channel");
    }

    public static void registerItems() {
        //GameRegistry.register(stoneChannel, new ResourceLocation(DuskMod.MODID, stoneChannel.getUnlocalizedName()));
        registerItem(stoneChannel);
    }

    public static void registerRenders() {
        registerRender(stoneChannel);
    }

    private static void registerItem(Item item) {
        GameRegistry.register(item, new ResourceLocation(DuskMod.MODID, item.getUnlocalizedName().substring(5)));
    }

    private static void registerRender(Item item) {
        Minecraft.getMinecraft()
                .getRenderItem()
                .getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(DuskMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
