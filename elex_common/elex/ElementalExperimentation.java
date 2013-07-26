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
import cpw.mods.fml.common.registry.LanguageRegistry;
import elex.block.ModBlocks;
import elex.configuration.ConfigurationHandler;
import elex.creativetab.CreativeTabElEx;
import elex.item.ModItems;
import elex.lib.Reference;
import elex.network.PacketHandler;
import elex.proxy.CommonProxy;

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
        /* Config */
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL + File.separator + Reference.MOD_ID + ".cfg"));
        
        /* Block Init */
        ModBlocks.init();
        
        /* Item Init */
        ModItems.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModItems.addNames();
        ModBlocks.addNames();
        
        //LanguageRegistry.addName(elexTab, "Elemental Experimentation");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
