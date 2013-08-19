package elex.lib;

import java.util.LinkedList;

public class ItemIds {
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
    public static final int ALLOY_INGOT_DEFAULT = 16239;
    public static final int MACHINE_PART_DEFAULT = 16240;
    public static final int METAL_NUGGET_DEFAULT = 16241;
    public static final int ALLOY_NUGGET_DEFAULT = 16242;
    public static final int IRON_NUGGET_DEFAULT = 16243;
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
    public static int ALLOY_INGOT;
    public static int MACHINE_PART;
    public static int METAL_NUGGET;
    public static int ALLOY_NUGGET;
    public static int IRON_NUGGET;
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
    public static final String ALLOY_INGOT_KEY = "ALLOYINGOTS";
    public static final String MACHINE_PART_KEY = "MACHINEPARTS";
    public static final String METAL_NUGGET_KEY = "METALNUGGETS";
    public static final String ALLOY_NUGGET_KEY = "ALLOYNUGGETS";
    public static final String IRON_NUGGET_KEY = "IronNuggetID";
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
        "columbite", "pezzottaite", "benitoite" };
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
        "dustColumbite", "dustPezzottaite", "dustBenitoite" };
    public static final LinkedList<String> ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
    public static final LinkedList<String> ELEX_INGOT_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
    public static final LinkedList<String> ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
    public static final String[] VANILLA_DUST_REAL_UNLOCALIZED_NAMES = 
        { "dustNetherQuartz", "dustIron", "dustGold", 
        "dustEmerald", "dustCoal", "dustCharcoal" };
    public static final String[] ALLOY_DUST_REAL_UNLOCALIZED_NAMES = 
        { "dustCarbonSteel", "dustVanadiumSteel", "dustBronze", 
        "dustElectrum", "dustScandinium", "dustOsmiridium" };
    public static final String[] ALLOY_INGOT_REAL_UNLOCALIZED_NAMES = 
        { "ingotCarbonSteel", "ingotVanadiumSteel", "ingotBronze",
        "ingotElectrum", "ingotScandinium", "ingotOsmiridium" };
    public static final String[] MACHINE_PART_REAL_UNLOCALIZED_NAMES = 
        { "partSpinRotor", "partHighSpeedMotor", "partGrindStone" };
    public static final LinkedList<String> METAL_NUGGET_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
    public static final String[] ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES = 
        { "nuggetCarbonSteel", "nuggetVanadiumSteel", "nuggetBronze",
        "nuggetElectrum", "nuggetScandinium", "nuggetOsmiridium" };
    public static final String IRON_NUGGET_UNLOCALIZED_NAME = "nuggetIron";
    public static final String RESEARCH_BINDER_UNLOCALIZED_NAME = "researchBinder";
    public static final String[] ELEX_ARMOR_REAL_UNLOCALIZED_NAMES = 
        { "helmetCarbon", "plateCarbon", "pantsCarbon", "bootsCarbon" }; 
    
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
        "FeNb2O6", "Cs(Be2Li)Al2Si6O18", "BaTiSi3O9" };
    public static final LinkedList<String> METAL_DUST_MOLECULE_STRINGS = new LinkedList<String>();
    public static final LinkedList<String> PURE_NONMETAL_DUST_MOLECULE_STRINGS = new LinkedList<String>();
    public static final String[] VANILLA_DUST_MOLECULE_STRINGS =
        { "FeSiO2", "Fe", "Au",
        "Be3Al2(SiO3)6", "C2", "C7H4O" };
    public static final String[] ALLOY_DUST_MOLECULE_STRINGS = 
        { "Fe-C", "Fe-V", "Cu-Sn",
        "Au-Ag", "Al-Sc", "Os-Ir" };
    
    /* Other Information Strings */
    public static final String RADIOACTIVE_UNLOCALIZED = "string.element.radioactive";
    
    /* Native Metal Ore Element ID Array */
    public static final LinkedList<Integer> METAL_ORE_ELEMENT_IDS = new LinkedList<Integer>();
}
