package elex.lib;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import elex.core.ModItems;

/**
 * Elemental Experimentation
 * 
 * ElexIDs
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ElexIDs {
    /* Block */
        /* Config Category */
        public static final String CATEGORY_BLOCK_IDS = "Block IDs";
    
        /* Default Block IDs */
        public static final int BLOCK_ELEX_ORE_DEFAULT = 3671;
        public static final int BLOCK_ELEX_ORE_2_DEFAULT = 3672;
        public static final int BLOCK_ELEX_ITEM_ORE_STORAGE_DEFAULT = 3673;
        public static final int BLOCK_ELEX_METAL_STORAGE_DEFAULT = 3674;
        public static final int BLOCK_ELEX_METAL_STORAGE_2_DEFAULT = 3675;
        public static final int BLOCK_ELEX_METAL_STORAGE_3_DEFAULT = 3676;
        public static final int BLOCK_ELEX_METAL_STORAGE_4_DEFAULT = 3677;
        public static final int BLOCK_ELEX_METAL_STORAGE_5_DEFAULT = 3678;
        public static final int BLOCK_ELEX_METAL_STORAGE_6_DEFAULT = 3679;
        public static final int BLOCK_ALLOY_STORAGE_DEFAULT = 3680;
        public static final int BLOCK_MACHINE_CASE_DEFAULT = 3681;
        public static final int ITEM_ELEX_ORE_DEFAULT = 3682;
        public static final int ITEM_ELEX_ORE_2_DEFAULT = 3683;
        public static final int ITEM_ELEX_ORE_3_DEFAULT = 3684;
        public static final int BLOCK_BUILDING_MATERIAL_DEFAULT = 3686;
        public static final int BLOCK_BRICK_DEFAULT = 3687;
        public static final int CENTRIFUGE_DEFAULT = 3750;
        public static final int GRINDER_DEFAULT = 3751;
        public static final int CONDENSATOR_DEFAULT = 3752;
        public static final int SALT_WATER_BLOCK_DEFAULT = 3800;
    
        /* Current Block IDs */
        public static int ITEM_ELEX_ORE;
        public static int ITEM_ELEX_ORE_2;
        public static int ITEM_ELEX_ORE_3;
        public static int BLOCK_ELEX_ORE;
        public static int BLOCK_ELEX_ORE_2;
        public static int BLOCK_ELEX_ITEM_ORE_STORAGE;
        public static int BLOCK_ELEX_METAL_STORAGE;
        public static int BLOCK_ELEX_METAL_STORAGE_2;
        public static int BLOCK_ELEX_METAL_STORAGE_3;
        public static int BLOCK_ELEX_METAL_STORAGE_4;
        public static int BLOCK_ELEX_METAL_STORAGE_5;
        public static int BLOCK_ELEX_METAL_STORAGE_6;
        public static int BLOCK_MACHINE_CASE;
        public static int BLOCK_ALLOY_STORAGE;
        public static int BLOCK_BUILDING_MATERIAL;
        public static int BLOCK_BRICK;
        public static int CENTRIFUGE;
        public static int GRINDER;
        public static int CONDENSATOR;
        public static int SALT_WATER_BLOCK;
    
        /* Block Config Keys */
        public static final String ITEM_ELEX_ORE_KEY = "ITEMORES";
        public static final String ITEM_ELEX_ORE_2_KEY = "ITEMORES2";
        public static final String ITEM_ELEX_ORE_3_KEY = "ITEMORES3";
        public static final String BLOCK_ELEX_ORE_KEY = "BLOCKORES";
        public static final String BLOCK_ELEX_ORE_2_KEY = "BLOCKORES2";
        public static final String BLOCK_ELEX_ITEM_ORE_STORAGE_KEY = "ITEMORESTORAGEBLOCKS";
        public static final String BLOCK_ELEX_METAL_STORAGE_KEY = "METALSTORAGEBLOCKS";
        public static final String BLOCK_ELEX_METAL_STORAGE_2_KEY = "METALSTORAGEBLOCKS2";
        public static final String BLOCK_ELEX_METAL_STORAGE_3_KEY = "METALSTORAGEBLOCKS3";
        public static final String BLOCK_ELEX_METAL_STORAGE_4_KEY = "METALSTORAGEBLOCKS4";
        public static final String BLOCK_ELEX_METAL_STORAGE_5_KEY = "METALSTORAGEBLOCKS5";
        public static final String BLOCK_ELEX_METAL_STORAGE_6_KEY = "METALSTORAGEBLOCKS6";
        public static final String BLOCK_MACHINE_CASE_KEY = "MACHINECASES";
        public static final String BLOCK_ALLOY_STORAGE_KEY = "ALLOYSTORAGEBLOCKS";
        public static final String BLOCK_BUILDING_MATERIAL_KEY = "BUILDINGMATERIALS";
        public static final String BLOCK_BRICK_KEY = "BRICKS";
        public static final String CENTRIFUGE_KEY = "CentrifugeID";
        public static final String GRINDER_KEY = "GrinderID";
        public static final String CONDENSATOR_KEY = "CondensatorID";
        public static final String SALT_WATER_BLOCK_KEY = "SaltWaterBlockID";
    
        /* Block Unlocalized Names */
        public static final String ITEM_ELEX_ORE_UNLOCALIZED_NAME = "itemElexOreBlock";
        public static final String[] ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES = 
            { "oreAquamarine", "oreBorax", "oreFluorite",
            "oreForsterite", "orePetalite", "oreArtificialQuartz",
            "oreSpodumene", "oreHalite", "oreRuby", 
            "oreSapphire", "oreUvarovite", "oreTsavorite", 
            "oreTurquoise", "oreGalena", "oreSylvite",
            "oreGypsum" };
        public static final String[] ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES = 
            { "oreThortveitite", "oreAnatase", "oreBrookite",
            "oreVanadinite", "orePyrolusite", "oreErythrite",
            "oreSphalerite", "oreGallite", "oreGermanite", 
            "oreMarthozite", "oreBromite", "oreCelestine",
            "oreXenotime", "oreBaddeleyite", "oreColumbite",
            "orePezzottaite" };
        public static final String[] ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES = 
            { "oreBenitoite", "oreMonazite", "oreEuxenite",
            "oreHafnon", "oreTungstate", "oreRheniite",
            "oreCinnabar", "oreHutchinsonite", "oreThorianite",
            "oreUraninite"};
        public static final String[] BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES = 
            { "oreAluminium", "oreChromium", "oreCobalt",
            "oreNickel", "oreCopper", "oreArsenic",
            "oreMolybdenum", "oreRuthenium", "oreRhodium",
            "orePalladium", "oreSilver", "oreCadmium",
            "oreIndium", "oreTin", "oreAntimony",
            "oreTellurium" };
        public static final String[] BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES = 
            { "oreTantalum", "oreOsmium", "oreIridium", 
            "orePlatinum", "oreLead", "oreBismuth" };
        public static final String[] BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES = 
            { "blockAquamarine", "blockBorax", "blockFluorite",
            "blockForsterite", "blockPetalite", "blockArtificialQuartz",
            "blockSpodumene", "blockHalite" };
        public static final List<String> BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static final List<String> BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static final List<String> BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static final List<String> BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static final List<String> BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static final List<String> BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static final String[] BLOCK_MACHINE_CASE_REAL_UNLOCALIZED_NAMES = 
            { "caseCarbonSteel", "caseScandinium", "caseOsmiridium",
            "caseLead" };
        public static final String[] BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES = 
            { "blockCarbonSteel", "blockVanadiumSteel", "blockBronze", 
            "blockElectrum", "blockScandinium", "blockOsmiridium" };
        public static final String[] BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES = 
            { "blockMarble", "blockBasalt", "blockDeepSandstone", 
            "blockGranite", "blockLimestone", "blockRedStone", 
            "blockBlueStone", "blockGreenStone", "blockYellowStone" };
        public static final String[] BLOCK_BRICK_UNLOCALIZED_NAMES = 
            { "blockMarbleBrick", "blockBasaltBrick", "blockDeepSandstoneBrick", 
            "blockGraniteBrick", "blockLimestoneBrick", "blockRedStoneBrick", 
            "blockBlueStoneBrick", "blockGreenStoneBrick", "blockYellowStoneBrick" };
        public static final String CENTRIFUGE_UNLOCALIZED_NAME = "centrifuge";
        public static final String GRINDER_UNLOCALIZED_NAME = "grinder";
        public static final String CONDENSATOR_UNLOCALIZED_NAME = "condensator";
        public static final String SALT_WATER_BLOCK_UNLOCALIZED_NAME = "blockSaltWater";
    
        /* Machine Block Base Texture */
        public static final String MACHINE_BLOCK_BASE = "machine_base";
        
    /* Item */
        /* Config Category */
        public static final String CATEGORY_ITEM_IDS = "Item IDs";
        
        /* Default Item IDs */
        public static final int ELEX_ORE_DEFAULT = 16231;
        public static final int MERCURY_INJECTOR_DEFAULT = 16232;
        public static final int ELEX_COMPOUND_DUST_DEFAULT = 16233;
        public static final int ELEX_METAL_DUST_DEFAULT = 16234;
        public static final int ELEX_INGOT_DEFAULT = 16235;
        public static final int ELEX_PURE_NONMETAL_DUST_DEFAULT = 16236;
        public static final int VANILLA_DUST_DEFAULT = 16237;
        public static final int ALLOY_DUST_DEFAULT = 16238;
        public static final int ARTIFICIAL_COMPOUND_DUST_DEFAULT = 16239;
        public static final int ALLOY_INGOT_DEFAULT = 16240;
        public static final int MACHINE_PART_DEFAULT = 16241;
        public static final int METAL_NUGGET_DEFAULT = 16242;
        public static final int ALLOY_NUGGET_DEFAULT = 16243;
        public static final int IRON_NUGGET_DEFAULT = 16244;
        public static final int IRON_ROD_DEFAULT = 16245;
        public static final int SALTED_BEEF_DEFAULT = 16246;
        public static final int SALTED_CHICKEN_DEFAULT = 16247;
        public static final int SALTED_PORK_DEFAULT = 16248;
        public static final int SALTED_FISH_DEFAULT = 16249;
        public static final int RESEARCH_BINDER_DEFAULT = 16260;
        public static final int[] ELEX_ARMOR_DEFAULT = 
            { 16280, 16281, 16282, 16283 };
        
        /* Current Item IDs */
        public static int ELEX_ORE;
        public static int MERCURY_INJECTOR;
        public static int ELEX_COMPOUND_DUST;
        public static int ELEX_METAL_DUST;
        public static int ELEX_INGOT;
        public static int ELEX_PURE_NONMETAL_DUST;
        public static int VANILLA_DUST;
        public static int ALLOY_DUST;
        public static int ARTIFICIAL_COMPOUND_DUST;
        public static int ALLOY_INGOT;
        public static int MACHINE_PART;
        public static int METAL_NUGGET;
        public static int ALLOY_NUGGET;
        public static int IRON_NUGGET;
        public static int IRON_ROD;
        public static int SALTED_BEEF;
        public static int SALTED_CHICKEN;
        public static int SALTED_PORK;
        public static int SALTED_FISH;
        public static int RESEARCH_BINDER;
        public static int[] ELEX_ARMOR = new int[4];
        
        /* Item Config Keys */
        public static final String ELEX_ORE_KEY = "ITEMORES";
        public static final String MERCURY_INJECTOR_KEY = "MercuryInjectorID";
        public static final String ELEX_COMPOUND_DUST_KEY = "COMPOUNDDUSTS";
        public static final String ELEX_METAL_DUST_KEY = "METALDUSTS";
        public static final String ELEX_INGOT_KEY = "INGOTS";
        public static final String ELEX_PURE_NONMETAL_DUST_KEY = "PURENONMETALDUSTS";
        public static final String VANILLA_DUST_KEY = "VANILLADUSTS";
        public static final String ALLOY_DUST_KEY = "ALLOYDUSTS";
        public static final String ARTIFICIAL_COMPOUND_DUST_KEY = "ARTIFICIALDUSTS";
        public static final String ALLOY_INGOT_KEY = "ALLOYINGOTS";
        public static final String MACHINE_PART_KEY = "MACHINEPARTS";
        public static final String METAL_NUGGET_KEY = "METALNUGGETS";
        public static final String ALLOY_NUGGET_KEY = "ALLOYNUGGETS";
        public static final String IRON_NUGGET_KEY = "IronNuggetID";
        public static final String IRON_ROD_KEY = "IronRodID";
        public static final String SALTED_BEEF_KEY = "SaltedBeefID";
        public static final String SALTED_CHICKEN_KEY = "SaltedChickenID";
        public static final String SALTED_PORK_KEY = "SaltedPorkID";
        public static final String SALTED_FISH_KEY = "SaltedFishID";
        public static final String RESEARCH_BINDER_KEY = "ResearchBinderID";
        public static final String[] ELEX_ARMOR_KEYS = 
            { "CarbonHelmetID", "CarbonChestplateID", "CarbonPantsID", "CarbonBootsID" };
        
        /* Item Unlocalized Names */
        public static final String ELEX_ORE_UNLOCALIZED_NAME = "itemElexOre";
        public static final String[] ELEX_ORE_REAL_UNLOCALIZED_NAMES = 
            { "aquamarine", "borax", "fluorite", 
            "forsterite", "petalite", "quartzArtificial", 
            "spodumene", "halite", "ruby",
            "sapphire", "uvarovite", "tsavorite",
            "turquoise", "galena", "sylvite",
            "gypsum", "thortveitite", "anatase",
            "brookite", "vanadinite", "pyrolusite",
            "erythrite", "sphalerite", "gallite",
            "germanite", "marthozite", "bromite",
            "celestine", "xenotime", "baddeleyite",
            "columbite", "pezzottaite", "benitoite",
            "monazite", "euxenite", "hafnon",
            "tungstate", "rheniite", "cinnabar",
            "hutchinsonite", "thorianite", "uraninite" };
        public static final String MERCURY_INJECTOR_UNLOCALIZED_NAME = "mercuryInjector";
        public static final String[] ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES = 
            { "dustAquamarine", "dustBorax", "dustFluorite", 
            "dustForsterite", "dustPetalite", "dustArtificialQuartz", 
            "dustSpodumene", "dustHalite", "dustRuby", 
            "dustSapphire", "dustUvarovite", "dustTsavorite",
            "dustTurquoise", "dustGalena", "dustSylvite",
            "dustGypsum", "dustThortveitite", "dustAnatase", 
            "dustBrookite", "dustVanadinite", "dustPyrolusite",
            "dustErythrite", "dustSphalerite", "dustGallite",
            "dustGermanite", "dustMarthozite", "dustBromite",
            "dustCelestine", "dustXenotime", "dustBaddeleyite",
            "dustColumbite", "dustPezzottaite", "dustBenitoite",
            "dustMonazite", "dustEuxenite", "dustHafnon",
            "dustTungstate", "dustRheniite", "dustCinnabar",
            "dustHutchinsonite", "dustThorianite", "dustUraninite" };
        public static List<String> METAL_DUST_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static List<String> ELEX_INGOT_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static List<String> ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static final String[] VANILLA_DUST_REAL_UNLOCALIZED_NAMES = 
            { "dustNetherQuartz", "dustIron", "dustGold", 
            "dustEmerald", "dustCoal", "dustCharcoal",
            "dustDiamond", "dustLapisLazuli", "dustObsidian" };
        public static final String[] ALLOY_DUST_REAL_UNLOCALIZED_NAMES = 
            { "dustCarbonSteel", "dustVanadiumSteel", "dustBronze", 
            "dustElectrum", "dustScandinium", "dustOsmiridium" };
        public static final String[] ARTIFICIAL_COMPOUND_DUST_UNLOCALIZED_NAMES = 
            { "dustSilicate" };
        public static final String[] ALLOY_INGOT_REAL_UNLOCALIZED_NAMES = 
            { "ingotCarbonSteel", "ingotVanadiumSteel", "ingotBronze",
            "ingotElectrum", "ingotScandinium", "ingotOsmiridium" };
        public static final String[] MACHINE_PART_REAL_UNLOCALIZED_NAMES = 
            { "partSpinRotor", "partHighSpeedMotor", "partGrindStone" };
        public static final List<String> METAL_NUGGET_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
        public static final String[] ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES = 
            { "nuggetCarbonSteel", "nuggetVanadiumSteel", "nuggetBronze",
            "nuggetElectrum", "nuggetScandinium", "nuggetOsmiridium" };
        public static final String IRON_NUGGET_UNLOCALIZED_NAME = "nuggetIron";
        public static final String IRON_ROD_UNLOCALIZED_NAME = "rodIron";
        public static final String RESEARCH_BINDER_UNLOCALIZED_NAME = "researchBinder";
        public static final String[] ELEX_ARMOR_REAL_UNLOCALIZED_NAMES = 
            { "helmetCarbon", "plateCarbon", "pantsCarbon", "bootsCarbon" }; 
        public static final String[] SALTED_MEAT_UNLOCALIZED_NAMES = 
            { "foodSaltedBeef", "foodSaltedChicken", "foodSaltedPork",
            "foodSaltedFish" };
        
        /* Molecule Strings */
        public static final String[] COMPOUND_DUST_MOLECULE_STRINGS = 
            { "Be3Al2(SiO3)6", "Na2B4O7(H2O)10", "CaF2", 
            "Mg2SiO4", "LiAlSi4O10", "SiO2", 
            "LiAl(SiO3)2", "NaCl", "Al2O3Cr",
            "Al2O3", "Ca3Cr2(SiO4)3", "Ca3Al2(SiO4)3",
            "CuAl6(PO4)4(OH)8(H2O)4", "PbS", "KCl",
            "CaSO4(H2O)2", "Sc2Si2O7", "TiO2",
            "TiO2", "Pb5(VO4)3Cl", "MnO2",
            "Co3(AsO4)2(H2O)8", "ZnS", "CuGaS2",
            "Cu26Fe4Ge4S32", "Cu(UO2)3(SeO3)3(OH)2(H2O)7", "HBrO2",
            "SrSO4", "YPO4", "ZrO2",
            "FeNb2O6", "Cs(Be2Li)Al2Si6O18", "BaTiSi3O9",
            "(Rare Earth)PO4", "(Y,Ca,Ce,U,Th)2O6", "HfSiO4",
            "WO4", "ReS2", "HgS",
            "Tl2As5S9", "ThO2", "UO2" };
        public static final List<String> METAL_DUST_MOLECULE_STRINGS = new LinkedList<String>();
        public static final List<String> PURE_NONMETAL_DUST_MOLECULE_STRINGS = new LinkedList<String>();
        public static final String[] VANILLA_DUST_MOLECULE_STRINGS =
            { "FeSiO2", "Fe", "Au",
            "Be3Al2(SiO3)6", "C2", "C7H4O",
            "C", "Ca8Al6Si6O24", "SiO2" };
        public static final String[] ALLOY_DUST_MOLECULE_STRINGS = 
            { "Fe-C", "Fe-V", "Cu-Sn",
            "Au-Ag", "Al-Sc", "Os-Ir" };
        public static final String[] ARTIFICIAL_COMPOUND_DUST_MOLECULE_STRINGS = 
            { "SiO3" };
        
        /* Other Information Strings */
        public static final String RADIOACTIVE_UNLOCALIZED = "string.element.radioactive";
        
    /* Fluid */
        /* Fluid Unlocalized Names */
        public static final String SALT_WATER_UNLOCALIZED_NAME = "saltwater";
        public static final List<String> ELEMENTAL_GAS_UNLOCALIZED_NAMES = new LinkedList<String>();
    
    /* Utility */
        public static final HashMap<String, EnumArmorMaterial> ALLOY_ARMOR_MATERIAL_HASH_MAP = new HashMap<String, EnumArmorMaterial>();
        public static final HashMap<String, EnumToolMaterial> ALLOY_TOOL_MATERIAL_HASH_MAP = new HashMap<String, EnumToolMaterial>();
        public static final List<Integer> METAL_ORE_ELEMENT_IDS = new LinkedList<Integer>();
        public static ItemStack[] NATIVE_ORE_BONUS_IDS;
        public static int[] NATIVE_ORE_BONUS_CHANCES;
}
