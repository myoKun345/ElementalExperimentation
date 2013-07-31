package elex;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import elex.block.ModBlocks;
import elex.configuration.ConfigurationHandler;
import elex.crafting.CraftingRecipes;
import elex.creativetab.CreativeTabElEx;
import elex.item.ModItems;
import elex.lib.ItemIds;
import elex.lib.Reference;
import elex.localization.LocalizationHandler;
import elex.log.LogHelper;
import elex.network.PacketHandler;
import elex.oredict.OreDictionaryHandler;
import elex.proxy.CommonProxy;
import elex.tileentity.ModTileEntities;
import elex.worldgen.WorldGenElExOres;

/**
 * Elemental Experimentation
 * 
 * ElementalExperimentation
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = {Reference.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class ElementalExperimentation {
    @Instance(Reference.MOD_ID)
    public static ElementalExperimentation instance;
    
    @SidedProxy(clientSide = "elex.proxy.ClientProxy", serverSide = "elex.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs elexTab = new CreativeTabElEx(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        /* Log Helper */
        LogHelper.init();
        
        /* Localization */
        LocalizationHandler.loadLanguages();
        
        /* Config */
        ConfigurationHandler.mainConfig(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL + File.separator + Reference.MOD_ID + ".cfg"));
        ConfigurationHandler.genConfig(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL + File.separator + "WorldGen" + ".cfg"));
        
        /* Block Init */
        ModBlocks.init();
        
        /* Item Init */
        ModItems.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        /* Crafting */
        CraftingRecipes.registerRecipes();
        
        /* Ore Dictionary */
        OreDictionaryHandler.registerOres();
        
        /* Tile Entities */
        ModTileEntities.init();
        
        GameRegistry.registerWorldGenerator(new WorldGenElExOres());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
