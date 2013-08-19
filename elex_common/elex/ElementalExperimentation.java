package elex;

import java.io.File;

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
import elex.block.ModBlocks;
import elex.client.gui.GUIHandler;
import elex.configuration.ConfigurationHandler;
import elex.crafting.CraftingRecipes;
import elex.creativetab.CreativeTabElEx;
import elex.fluids.ModFluids;
import elex.item.ModItems;
import elex.lib.BlockIds;
import elex.lib.Reference;
import elex.localization.LocalizationHandler;
import elex.log.LogHelper;
import elex.network.PacketHandler;
import elex.oredict.OreDictionaryHandler;
import elex.proxy.CommonProxy;
import elex.tileentity.ModTileEntities;
import elex.worldgen.ElExSurfaceWorldGen;
import elex.worldgen.WorldGenElExOres;
import elex.worldgen.biome.Biomes;

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
    
    public static EnumArmorMaterial carbonArmorMat = EnumHelper.addArmorMaterial("CARBON", 16000, new int[]{7, 12, 9, 7}, 5);
    
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
        
        /* Fluid Init */
        ModFluids.init();
        
        /* Biome Init */
        Biomes.init();
        
        // carbonArmorMat.customCraftingMaterial
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
        
        GameRegistry.registerWorldGenerator(new ElExSurfaceWorldGen());
        
        new GUIHandler();
        
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", BlockIds.BLOCK_ELEX_METAL_STORAGE + "@" + i);
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", BlockIds.BLOCK_ELEX_METAL_STORAGE_2 + "@" + i);
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", BlockIds.BLOCK_ELEX_METAL_STORAGE_3 + "@" + i);
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", BlockIds.BLOCK_ELEX_METAL_STORAGE_4 + "@" + i);
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size(); i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", BlockIds.BLOCK_ELEX_METAL_STORAGE_5 + "@" + i);
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", BlockIds.BLOCK_ELEX_ITEM_ORE_STORAGE + "@" + i);
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", BlockIds.BLOCK_ELEX_ORE + "@" + i);
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", BlockIds.BLOCK_ELEX_ORE_2 + "@" + i);
        }
        for (int i = 0; i < BlockIds.BLOCK_MACHINE_CASE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FMLInterModComms.sendMessage("BuildCraft|Transport", "add-facade", BlockIds.BLOCK_MACHINE_CASE + "@" + i);
        }
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
    
}
