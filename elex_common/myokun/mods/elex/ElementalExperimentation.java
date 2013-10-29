package myokun.mods.elex;

import java.io.File;
import java.util.logging.Level;

import myokun.mods.elex.api.ElementTable;
import myokun.mods.elex.client.gui.GUIHandler;
import myokun.mods.elex.core.CommonProxy;
import myokun.mods.elex.core.ConfigurationHandler;
import myokun.mods.elex.core.CreativeTabElEx;
import myokun.mods.elex.core.ElexIDs;
import myokun.mods.elex.core.ElexStuff;
import myokun.mods.elex.core.LogHelper;
import myokun.mods.elex.core.ModElements;
import myokun.mods.elex.core.ModFluids;
import myokun.mods.elex.core.ModTileEntities;
import myokun.mods.elex.core.OreDictionaryHandler;
import myokun.mods.elex.core.PacketHandler;
import myokun.mods.elex.core.Reference;
import myokun.mods.elex.core.VanillaElementTable;
import myokun.mods.elex.localization.LocalizationHandler;
import myokun.mods.elex.worldgen.ElExSurfaceWorldGen;
import myokun.mods.elex.worldgen.WorldGenElExOres;
import myokun.mods.elex.worldgen.biome.Biomes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Elemental Experimentation
 * 
 * ElementalExperimentation
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, modLanguage = "java,scala")
@NetworkMod(channels = { Reference.CHANNEL_MAIN }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class ElementalExperimentation {
    @Instance(Reference.MOD_ID)
    public static ElementalExperimentation instance;
    
    @SidedProxy(clientSide = "elex.core.ClientProxy", serverSide = "elex.core.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs elexTab = new CreativeTabElEx(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    public static ElementTable vanillaElementTable = new VanillaElementTable("Elemental Experimentation Default", Reference.MOD_ID);
    
    public static EnumArmorMaterial carbonArmorMat = EnumHelper.addArmorMaterial("CARBON", 16000, new int[]{7, 12, 9, 7}, 5);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        /* Log Helper */
        LogHelper.init();
        
        /* Element Init */
        ModElements.addElements();
        LogHelper.log(Level.INFO, ElexIDs.METAL_PLATE_UNLOCALIZED_NAMES.toString());
        
        /* Localization */
        LocalizationHandler.loadLanguages();
        
        /* Config */
        ConfigurationHandler.mainConfig(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + "elex" + File.separator + Reference.MOD_ID + ".cfg"));
        ConfigurationHandler.genConfig(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + "elex" + File.separator + "WorldGen" + ".cfg"));
        
        /* Block Init */
        ElexStuff.addBlocks();
        
        /* Item Init */
        ElexStuff.addItems();
        
        /* Fluid Init */
        ModFluids.init();
        
        /* Biome Init */
        Biomes.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        /* Crafting */
        ElexStuff.addCrafting();
        
        /* Ore Dictionary */
        OreDictionaryHandler.registerOres();
        
        /* Tile Entities */
        ModTileEntities.init();
        
        GameRegistry.registerWorldGenerator(new WorldGenElExOres());
        
        GameRegistry.registerWorldGenerator(new ElExSurfaceWorldGen());
        
        new GUIHandler();
        
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ELEX_METAL_STORAGE + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ELEX_METAL_STORAGE_2 + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ELEX_METAL_STORAGE_3 + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ELEX_METAL_STORAGE_4 + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ELEX_METAL_STORAGE_5 + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ELEX_METAL_STORAGE_6 + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ALLOY_STORAGE + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ELEX_ORE + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_ELEX_ORE_2 + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_MACHINE_CASE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_MACHINE_CASE + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_BRICK_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_BUILDING_MATERIAL + "@" + i);
        }
        for (int i = 0; i < ElexIDs.BLOCK_BRICK_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", ElexIDs.BLOCK_BRICK + "@" + i);
        }
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
    
}
