package com.mcprog.duskmod;

import com.mcprog.duskmod.block.ModBlocks;
import com.mcprog.duskmod.creativetab.CreativeTabDuskModCore;
import com.mcprog.duskmod.item.ModItems;
import com.mcprog.duskmod.proxy.CommonProxy;
import com.mcprog.duskmod.recipe.RecipesVanilla;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DuskMod.MODID, version = DuskMod.VERSION, name = DuskMod.MOD_NAME)
public class DuskMod
{
    public static final String MODID = "duskmod";
    public static final String VERSION = "1.0.0";
    public static final String MOD_NAME = "Dusk Mod";

    @SidedProxy(clientSide = "com.mcprog.duskmod.proxy.ClientProxy", serverSide = "com.mcprog.duskmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    /*
    Used for GUIs and entities and such
     */
    @Mod.Instance
    public static DuskMod instance;

    public static CreativeTabDuskModCore creativeTabDuskModCore;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        /*
        Register blocks and items
        Register Tile Entities
        Register entities
        Assign ore dict names
         */

        creativeTabDuskModCore = new CreativeTabDuskModCore();
        ModItems.preInit();
        ModItems.registerItems();
        ModBlocks.preInit();
        ModBlocks.registerBlocks();
        proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        /*
        Register world generators
        Register recipes
        Register event handlers
        Send IMC messages (idk what IMC is)
         */
        RecipesVanilla.registerRecipes();
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        /*
        Mod compat or anything that needs other mods' inits to be done
         */

        proxy.postInit(event);
    }
}
