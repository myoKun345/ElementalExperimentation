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
    
    /* Current Item IDs */
    public static int ELEX_ORE;
    public static int MERCURY_INJECTOR;
    public static int ELEX_COMPOUND_DUST;
    public static int ELEX_METAL_DUST;
    public static int ELEX_INGOT;
    public static int ELEX_PURE_NONMETAL_DUST;
    public static int VANILLA_DUST;
    
    /* Item Config Keys */
    public static final String ELEX_ORE_KEY = "ITEMORES";
    public static final String MERCURY_INJECTOR_KEY = "MercuryInjectorID";
    public static final String ELEX_COMPOUND_DUST_KEY = "COMPOUNDDUSTS";
    public static final String ELEX_METAL_DUST_KEY = "METALDUSTS";
    public static final String ELEX_INGOT_KEY = "INGOTS";
    public static final String ELEX_PURE_NONMETAL_DUST_KEY = "PURENONMETALDUSTS";
    public static final String VANILLA_DUST_KEY = "VANILLADUSTS";
    
    /* Item Unlocalized Names */
    public static final String ELEX_ORE_UNLOCALIZED_NAME = "itemElexOre";
    public static final String[] ELEX_ORE_REAL_UNLOCALIZED_NAMES = 
        { "aquamarine", "borax", "fluorite", 
        "forsterite", "petalite", "quartzArtificial", 
        "spodumene", "halite", "ruby",
        "sapphire", "uvarovite", "tsavorite",
        "turquoise", "galena", "sylvite",
        "gypsum", "thortveitite", "anatase",
        "brookite" };
    public static final String MERCURY_INJECTOR_UNLOCALIZED_NAME = "mercuryInjector";
    public static final String ELEX_COMPOUND_DUST_UNLOCALIZED_NAME = "itemElexCompoundDust";
    public static final String[] ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES = 
        { "dustAquamarine", "dustBorax", "dustFluorite", 
        "dustForsterite", "dustPetalite", "dustArtificialQuartz", 
        "dustSpodumene", "dustHalite", "dustRuby", 
        "dustSapphire", "dustUvarovite", "dustTsavorite",
        "dustTurquoise", "dustGalena", "dustSylvite",
        "dustGypsum", "dustThortveitite", "dustAnatase", 
        "dustBrookite" }; 
    public static final String ELEX_METAL_DUST_UNLOCALIZED_NAME = "itemElexMetalDust";
    public static final LinkedList<String> ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
    public static final String ELEX_INGOT_UNLOCALIZED_NAME = "itemElexIngot";
    public static final LinkedList<String> ELEX_INGOT_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
    public static final String ELEX_PURE_NONMETAL_DUST_UNLOCALIZED_NAME = "itemElexPureNonmetalDust";
    public static final LinkedList<String> ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES = new LinkedList<String>();
    public static final String VANILLA_DUST_UNLOCALIZED_NAME = "itemVanillaDust";
    public static final String[] VANILLA_DUST_REAL_UNLOCALIZED_NAMES = 
        { "dustNetherQuartz", "dustIron", "dustGold", "dustEmerald" };
    
    /* Molecule Strings */
    public static final String[] COMPOUND_DUST_MOLECULE_STRINGS = 
        { "Be3Al2(SiO3)6", "Na2B4O7(H2O)10", "CaF2", 
        "Mg2SiO4", "LiAlSi4O10", "SiO2", 
        "LiAl(SiO3)2", "NaCl", "Al2O3Cr",
        "Al2O3", "Ca3Cr2(SiO4)3", "Ca3Al2(SiO4)3",
        "CuAl6(PO4)4(OH)8(H2O)4", "PbS", "KCl",
        "CaSO4(H2O)2", "Sc2Si2O7", "TiO2",
        "TiO2" };
    public static final LinkedList<String> METAL_DUST_MOLECULE_STRINGS = new LinkedList<String>();
    public static final LinkedList<String> PURE_NONMETAL_DUST_MOLECULE_STRINGS = new LinkedList<String>();
    public static final String[] VANILLA_DUST_MOLECULE_STRINGS =
        { "FeSiO2", "Fe", "Au",
        "Be3Al2(SiO3)6" };
    
    /* Other Information Strings */
    public static final String RADIOACTIVE_UNLOCALIZED = "string.element.radioactive";
    
    /* Native Metal Ore Element ID Array */
    public static final LinkedList<Integer> METAL_ORE_ELEMENT_IDS = new LinkedList<Integer>();
}
