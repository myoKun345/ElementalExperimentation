package elex.core;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import elex.api.Element;
import elex.lib.ElexIDs;
import elex.lib.ElexIDs;
import elex.lib.ElexIDs;

/**
 * Elemental Experimentation
 * 
 * ConfigurationHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ConfigurationHandler {
    public static void mainConfig(File file) {
        Configuration config = new Configuration(file);
        
        config.load();
        
        ElexIDs.ITEM_ELEX_ORE = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.ITEM_ELEX_ORE_KEY, ElexIDs.ITEM_ELEX_ORE_DEFAULT).getInt();
        ElexIDs.ITEM_ELEX_ORE_2 = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.ITEM_ELEX_ORE_2_KEY, ElexIDs.ITEM_ELEX_ORE_2_DEFAULT).getInt();
        ElexIDs.ITEM_ELEX_ORE_3 = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.ITEM_ELEX_ORE_3_KEY, ElexIDs.ITEM_ELEX_ORE_3_DEFAULT).getInt();
        ElexIDs.BLOCK_ELEX_ORE = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ELEX_ORE_KEY, ElexIDs.BLOCK_ELEX_ORE_DEFAULT).getInt();
        ElexIDs.BLOCK_ELEX_ORE_2 = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ELEX_ORE_2_KEY, ElexIDs.BLOCK_ELEX_ORE_2_DEFAULT).getInt();
        ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_KEY, ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_DEFAULT).getInt();
        ElexIDs.BLOCK_ELEX_METAL_STORAGE = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ELEX_METAL_STORAGE_KEY, ElexIDs.BLOCK_ELEX_METAL_STORAGE_DEFAULT).getInt();
        ElexIDs.BLOCK_ELEX_METAL_STORAGE_2 = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_KEY, ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_DEFAULT).getInt();
        ElexIDs.BLOCK_ELEX_METAL_STORAGE_3 = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_KEY, ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_DEFAULT).getInt();
        ElexIDs.BLOCK_ELEX_METAL_STORAGE_4 = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_KEY, ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_DEFAULT).getInt();
        ElexIDs.BLOCK_ELEX_METAL_STORAGE_5 = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_KEY, ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_DEFAULT).getInt();
        ElexIDs.BLOCK_ELEX_METAL_STORAGE_6 = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ELEX_METAL_STORAGE_6_KEY, ElexIDs.BLOCK_ELEX_METAL_STORAGE_6_DEFAULT).getInt();
        ElexIDs.BLOCK_MACHINE_CASE = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_MACHINE_CASE_KEY, ElexIDs.BLOCK_MACHINE_CASE_DEFAULT).getInt();
        ElexIDs.CENTRIFUGE = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.CENTRIFUGE_KEY, ElexIDs.CENTRIFUGE_DEFAULT).getInt();
        ElexIDs.GRINDER = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.GRINDER_KEY, ElexIDs.GRINDER_DEFAULT).getInt();
        ElexIDs.BLOCK_ALLOY_STORAGE = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_ALLOY_STORAGE_KEY, ElexIDs.BLOCK_ALLOY_STORAGE_DEFAULT).getInt();
        ElexIDs.BLOCK_BUILDING_MATERIAL = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_BUILDING_MATERIAL_KEY, ElexIDs.BLOCK_BUILDING_MATERIAL_DEFAULT).getInt();
        ElexIDs.BLOCK_BRICK = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.BLOCK_BRICK_KEY, ElexIDs.BLOCK_BRICK_DEFAULT).getInt();
        ElexIDs.SALT_WATER_BLOCK = config.getBlock(ElexIDs.CATEGORY_BLOCK_IDS, ElexIDs.SALT_WATER_BLOCK_KEY, ElexIDs.SALT_WATER_BLOCK_DEFAULT).getInt();
        
        ElexIDs.ELEX_ORE = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ELEX_ORE_KEY, ElexIDs.ELEX_ORE_DEFAULT).getInt();
        ElexIDs.MERCURY_INJECTOR = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.MERCURY_INJECTOR_KEY, ElexIDs.MERCURY_INJECTOR_DEFAULT).getInt();
        ElexIDs.ELEX_COMPOUND_DUST = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ELEX_COMPOUND_DUST_KEY, ElexIDs.ELEX_COMPOUND_DUST_DEFAULT).getInt();
        ElexIDs.ELEX_METAL_DUST = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ELEX_METAL_DUST_KEY, ElexIDs.ELEX_METAL_DUST_DEFAULT).getInt();
        ElexIDs.ELEX_INGOT = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ELEX_INGOT_KEY, ElexIDs.ELEX_INGOT_DEFAULT).getInt();
        ElexIDs.ELEX_PURE_NONMETAL_DUST = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ELEX_PURE_NONMETAL_DUST_KEY, ElexIDs.ELEX_PURE_NONMETAL_DUST_DEFAULT).getInt();
        ElexIDs.VANILLA_DUST = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.VANILLA_DUST_KEY, ElexIDs.VANILLA_DUST_DEFAULT).getInt();
        ElexIDs.ALLOY_DUST = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ALLOY_DUST_KEY, ElexIDs.ALLOY_DUST_DEFAULT).getInt();
        ElexIDs.ALLOY_INGOT = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ALLOY_INGOT_KEY, ElexIDs.ALLOY_INGOT_DEFAULT).getInt();
        ElexIDs.MACHINE_PART = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.MACHINE_PART_KEY, ElexIDs.MACHINE_PART_DEFAULT).getInt();
        ElexIDs.METAL_NUGGET = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.METAL_NUGGET_KEY, ElexIDs.METAL_NUGGET_DEFAULT).getInt();
        ElexIDs.ALLOY_NUGGET = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ALLOY_NUGGET_KEY, ElexIDs.ALLOY_NUGGET_DEFAULT).getInt();
        ElexIDs.IRON_NUGGET = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.IRON_NUGGET_KEY, ElexIDs.IRON_NUGGET_DEFAULT).getInt();
        ElexIDs.RESEARCH_BINDER = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.RESEARCH_BINDER_KEY, ElexIDs.RESEARCH_BINDER_DEFAULT).getInt();
        ElexIDs.ELEX_ARMOR[0] = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ELEX_ARMOR_KEYS[0], ElexIDs.ELEX_ARMOR_DEFAULT[0]).getInt();
        ElexIDs.ELEX_ARMOR[1] = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ELEX_ARMOR_KEYS[1], ElexIDs.ELEX_ARMOR_DEFAULT[1]).getInt();
        ElexIDs.ELEX_ARMOR[2] = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ELEX_ARMOR_KEYS[2], ElexIDs.ELEX_ARMOR_DEFAULT[2]).getInt();
        ElexIDs.ELEX_ARMOR[3] = config.getItem(ElexIDs.CATEGORY_ITEM_IDS, ElexIDs.ELEX_ARMOR_KEYS[3], ElexIDs.ELEX_ARMOR_DEFAULT[3]).getInt();
        
        config.save();
    }
    
    public static void genConfig(File file) {
        Configuration config = new Configuration(file);
        
        config.load();
        
        ConfigurationSettings.ORE_GEN_MASTER_SWITCH = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ORE_GEN_MASTER_KEY, true, "This will disable ALL ore generation in the mod (theoretically)").getBoolean(true);
        
        ConfigurationSettings.COPPER_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COPPER_GEN_KEY, true, "Copper Ore Configuration").getBoolean(true);
        ConfigurationSettings.COPPER_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COPPER_VPC_KEY, 10).getInt();
        ConfigurationSettings.COPPER_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COPPER_BPV_KEY, 8).getInt();
        ConfigurationSettings.COPPER_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COPPER_TOPY_KEY, 64).getInt();
        
        ConfigurationSettings.SILVER_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SILVER_GEN_KEY, true, "Silver Ore Configuration").getBoolean(true);
        ConfigurationSettings.SILVER_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SILVER_VPC_KEY, 7).getInt();
        ConfigurationSettings.SILVER_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SILVER_BPV_KEY, 8).getInt();
        ConfigurationSettings.SILVER_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SILVER_TOPY_KEY, 56).getInt();
        
        ConfigurationSettings.TIN_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TIN_GEN_KEY, true, "Tin Ore Configuration").getBoolean(true);
        ConfigurationSettings.TIN_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TIN_VPC_KEY, 3).getInt();
        ConfigurationSettings.TIN_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TIN_BPV_KEY, 8).getInt();
        ConfigurationSettings.TIN_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TIN_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.CHROMIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_GEN_KEY, true, "Chromium Ore Configuration").getBoolean(true);
        ConfigurationSettings.CHROMIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.CHROMIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_BPV_KEY, 6).getInt();
        ConfigurationSettings.CHROMIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_TOPY_KEY, 56).getInt();
        ConfigurationSettings.CHROMIUM_BOTY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_BOTY_KEY, 24).getInt();
        
        ConfigurationSettings.OSMIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.OSMIUM_GEN_KEY, true, "Osmium Ore Configuration").getBoolean(true);
        ConfigurationSettings.OSMIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.OSMIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.OSMIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.OSMIUM_BPV_KEY, 2).getInt();
        ConfigurationSettings.OSMIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.OSMIUM_TOPY_KEY, 16).getInt();
        
        ConfigurationSettings.RUTHENIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RUTHENIUM_GEN_KEY, true, "Ruthenium Ore Configuration").getBoolean(true);
        ConfigurationSettings.RUTHENIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RUTHENIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.RUTHENIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RUTHENIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.RUTHENIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RUTHENIUM_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.RHODIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RHODIUM_GEN_KEY, true, "Rhodium Ore Configuration").getBoolean(true);
        ConfigurationSettings.RHODIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RHODIUM_VPC_KEY, 1).getInt();
        ConfigurationSettings.RHODIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RHODIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.RHODIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RHODIUM_TOPY_KEY, 16).getInt();
        
        ConfigurationSettings.PALLADIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PALLADIUM_GEN_KEY, true, "Palladium Ore Configuration").getBoolean(true);
        ConfigurationSettings.PALLADIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PALLADIUM_VPC_KEY, 1).getInt();
        ConfigurationSettings.PALLADIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PALLADIUM_BPV_KEY, 6).getInt();
        ConfigurationSettings.PALLADIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PALLADIUM_TOPY_KEY, 20).getInt();
        
        ConfigurationSettings.IRIDIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.IRIDIUM_GEN_KEY, true, "Iridium Ore Configuration").getBoolean(true);
        ConfigurationSettings.IRIDIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.IRIDIUM_VPC_KEY, 3).getInt();
        ConfigurationSettings.IRIDIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.IRIDIUM_BPV_KEY, 2).getInt();
        ConfigurationSettings.IRIDIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.IRIDIUM_TOPY_KEY, 16).getInt();
        
        ConfigurationSettings.PLATINUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PLATINUM_GEN_KEY, true, "Platinum Ore Configuration").getBoolean(true);
        ConfigurationSettings.PLATINUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PLATINUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.PLATINUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PLATINUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.PLATINUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PLATINUM_TOPY_KEY, 20).getInt();
        
        ConfigurationSettings.NICKEL_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.NICKEL_GEN_KEY, true, "Nickel Ore Configuration").getBoolean(true);
        ConfigurationSettings.NICKEL_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.NICKEL_VPC_KEY, 4).getInt();
        ConfigurationSettings.NICKEL_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.NICKEL_BPV_KEY, 8).getInt();
        ConfigurationSettings.NICKEL_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.NICKEL_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.COBALT_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COBALT_GEN_KEY, true, "Cobalt Ore Configuration").getBoolean(true);
        ConfigurationSettings.COBALT_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COBALT_VPC_KEY, 3).getInt();
        ConfigurationSettings.COBALT_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COBALT_BPV_KEY, 6).getInt();
        ConfigurationSettings.COBALT_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COBALT_TOPY_KEY, 24).getInt();
        
        ConfigurationSettings.CADMIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CADMIUM_GEN_KEY, true, "Cadmium Ore Configuration").getBoolean(true);
        ConfigurationSettings.CADMIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CADMIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.CADMIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CADMIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.CADMIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CADMIUM_TOPY_KEY, 48).getInt();
        
        ConfigurationSettings.MOLYBDENUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.MOLYBDENUM_GEN_KEY, true, "Molybdenum Ore Configuration").getBoolean(true);
        ConfigurationSettings.MOLYBDENUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.MOLYBDENUM_VPC_KEY, 3).getInt();
        ConfigurationSettings.MOLYBDENUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.MOLYBDENUM_BPV_KEY, 6).getInt();
        ConfigurationSettings.MOLYBDENUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.MOLYBDENUM_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.INDIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.INDIUM_GEN_KEY, true, "Indium Ore Configuration").getBoolean(true);
        ConfigurationSettings.INDIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.INDIUM_VPC_KEY, 1).getInt();
        ConfigurationSettings.INDIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.INDIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.INDIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.INDIUM_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.ALUMINIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ALUMINIUM_GEN_KEY, true, "Aluminium Ore Configuration").getBoolean(true);
        ConfigurationSettings.ALUMINIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ALUMINIUM_VPC_KEY, 11).getInt();
        ConfigurationSettings.ALUMINIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ALUMINIUM_BPV_KEY, 8).getInt();
        ConfigurationSettings.ALUMINIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ALUMINIUM_TOPY_KEY, 72).getInt();
        
        ConfigurationSettings.TANTALUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TANTALUM_GEN_KEY, true, "Tantalum Ore Configuration").getBoolean(true);
        ConfigurationSettings.TANTALUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TANTALUM_VPC_KEY, 3).getInt();
        ConfigurationSettings.TANTALUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TANTALUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.TANTALUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TANTALUM_TOPY_KEY, 48).getInt();
        
        ConfigurationSettings.ARSENIC_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ARSENIC_GEN_KEY, true, "Arsenic Ore Configuration").getBoolean(true);
        ConfigurationSettings.ARSENIC_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ARSENIC_VPC_KEY, 3).getInt();
        ConfigurationSettings.ARSENIC_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ARSENIC_BPV_KEY, 6).getInt();
        ConfigurationSettings.ARSENIC_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ARSENIC_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.TELLURIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TELLURIUM_GEN_KEY, true, "Tellurium Ore Configuration").getBoolean(true);
        ConfigurationSettings.TELLURIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TELLURIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.TELLURIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TELLURIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.TELLURIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TELLURIUM_TOPY_KEY, 24).getInt();
        
        ConfigurationSettings.ANTIMONY_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ANTIMONY_GEN_KEY, true, "Antimony Ore Configuration").getBoolean(true);
        ConfigurationSettings.ANTIMONY_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ANTIMONY_VPC_KEY, 3).getInt();
        ConfigurationSettings.ANTIMONY_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ANTIMONY_BPV_KEY, 5).getInt();
        ConfigurationSettings.ANTIMONY_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ANTIMONY_TOPY_KEY, 24).getInt();
        
        ConfigurationSettings.BISMUTH_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BISMUTH_GEN_KEY, true, "Bismuth Ore Configuration").getBoolean(true);
        ConfigurationSettings.BISMUTH_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BISMUTH_VPC_KEY, 3).getInt();
        ConfigurationSettings.BISMUTH_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BISMUTH_BPV_KEY, 4).getInt();
        ConfigurationSettings.BISMUTH_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BISMUTH_TOPY_KEY, 24).getInt();
        
        ConfigurationSettings.LEAD_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.LEAD_GEN_KEY, true, "Lead Ore Configuration").getBoolean(true);
        ConfigurationSettings.LEAD_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.LEAD_VPC_KEY, 3).getInt();
        ConfigurationSettings.LEAD_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.LEAD_BPV_KEY, 6).getInt();
        ConfigurationSettings.LEAD_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.LEAD_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.AQUAMARINE_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.AQUAMARINE_GEN_KEY, true, "Aquamarine Ore Configuration").getBoolean(true);
        ConfigurationSettings.AQUAMARINE_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.AQUAMARINE_VPC_KEY, 6).getInt();
        ConfigurationSettings.AQUAMARINE_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.AQUAMARINE_BPV_KEY, 5).getInt();
        ConfigurationSettings.AQUAMARINE_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.AQUAMARINE_TOPY_KEY, 64).getInt();
        
        ConfigurationSettings.BORAX_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BORAX_GEN_KEY, false, "Borax Ore Configuration").getBoolean(true);
        ConfigurationSettings.BORAX_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BORAX_VPC_KEY, 4).getInt();
        ConfigurationSettings.BORAX_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BORAX_BPV_KEY, 5).getInt();
        ConfigurationSettings.BORAX_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BORAX_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.FLUORITE_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.FLUORITE_GEN_KEY, true, "Fluorite Ore Configuration").getBoolean(true);
        ConfigurationSettings.FLUORITE_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.FLUORITE_VPC_KEY, 4).getInt();
        ConfigurationSettings.FLUORITE_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.FLUORITE_BPV_KEY, 4).getInt();
        ConfigurationSettings.FLUORITE_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.FLUORITE_TOPY_KEY, 48).getInt();
        
        ConfigurationSettings.FORSTERITE_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.FORSTERITE_GEN_KEY, true, "Forsterite Ore Configuration").getBoolean(true);
        ConfigurationSettings.FORSTERITE_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.FORSTERITE_VPC_KEY, 4).getInt();
        ConfigurationSettings.FORSTERITE_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.FORSTERITE_BPV_KEY, 4).getInt();
        ConfigurationSettings.FORSTERITE_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.FORSTERITE_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.PETALITE_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PETALITE_GEN_KEY, true, "Petalite Ore Configuration").getBoolean(true);
        ConfigurationSettings.PETALITE_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PETALITE_VPC_KEY, 4).getInt();
        ConfigurationSettings.PETALITE_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PETALITE_BPV_KEY, 4).getInt();
        ConfigurationSettings.PETALITE_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PETALITE_TOPY_KEY, 48).getInt();
        
        ConfigurationSettings.PURE_QUARTZ_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PURE_QUARTZ_GEN_KEY, true, "Pure Quartz Ore Configuration").getBoolean(true);
        ConfigurationSettings.PURE_QUARTZ_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PURE_QUARTZ_VPC_KEY, 5).getInt();
        ConfigurationSettings.PURE_QUARTZ_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PURE_QUARTZ_BPV_KEY, 4).getInt();
        ConfigurationSettings.PURE_QUARTZ_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PURE_QUARTZ_TOPY_KEY, 16).getInt();
        
        ConfigurationSettings.SPODUMENE_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SPODUMENE_GEN_KEY, true, "Spodumene Ore Configuration").getBoolean(true);
        ConfigurationSettings.SPODUMENE_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SPODUMENE_VPC_KEY, 6).getInt();
        ConfigurationSettings.SPODUMENE_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SPODUMENE_BPV_KEY, 4).getInt();
        ConfigurationSettings.SPODUMENE_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SPODUMENE_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.HALITE_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.HALITE_GEN_KEY, false, "Halite Ore Configuration").getBoolean(true);
        ConfigurationSettings.HALITE_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.HALITE_VPC_KEY, 5).getInt();
        ConfigurationSettings.HALITE_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.HALITE_BPV_KEY, 5).getInt();
        ConfigurationSettings.HALITE_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.HALITE_TOPY_KEY, 64).getInt();
        
        ConfigurationSettings.EVAPORITE_RARITY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.EVAPORITE_RARITY_KEY, 4, "Evaporite Rarity").getInt();
        
        ConfigurationSettings.SURFACE_GEN_MASTER_SWITCH = config.get(ConfigurationSettings.SURFACE_GEN_CATEGORY, ConfigurationSettings.SURFACE_GEN_MASTER_KEY, true, "This will disable ALL surface world gen in the mod").getBoolean(true);
        
        ConfigurationSettings.SALT_LAKES_GEN = config.get(ConfigurationSettings.SURFACE_GEN_CATEGORY, ConfigurationSettings.SALT_LAKES_GEN_KEY, true, "Salt Lakes Configuraion").getBoolean(true);
        ConfigurationSettings.SALT_LAKES_RARITY = config.get(ConfigurationSettings.SURFACE_GEN_CATEGORY, ConfigurationSettings.SALT_LAKES_RARITY_KEY, 2).getInt();
        
        ConfigurationSettings.EVAPORITE_PLAINS_GEN = config.get(ConfigurationSettings.BIOME_CATEGORY, ConfigurationSettings.EVAPORITE_PLAINS_GEN_KEY, true, "Evaporite Plains Configuration").getBoolean(true);
        ConfigurationSettings.EVAPORITE_PLAINS_ID = config.get(ConfigurationSettings.BIOME_CATEGORY, ConfigurationSettings.EVAPORITE_PLAINS_ID_KEY, ConfigurationSettings.EVAPORITE_PLAINS_DEFAULT).getInt();
        
        config.save();
    }
}
