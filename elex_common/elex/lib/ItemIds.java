package elex.lib;

import java.util.Stack;

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
        "spodumene", "halite" };
    public static final String MERCURY_INJECTOR_UNLOCALIZED_NAME = "mercuryInjector";
    public static final String ELEX_COMPOUND_DUST_UNLOCALIZED_NAME = "itemElexCompoundDust";
    public static final String[] ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES = 
        { "dustAquamarine", "dustBorax", "dustFluorite", 
        "dustForsterite", "dustPetalite", "dustArtificialQuartz", 
        "dustSpodumene", "dustHalite" }; 
    public static final String ELEX_METAL_DUST_UNLOCALIZED_NAME = "itemElexMetalDust";
    public static final Stack<String> ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES = new Stack<String>();
    public static final String ELEX_INGOT_UNLOCALIZED_NAME = "itemElexIngot";
    public static final Stack<String> ELEX_INGOT_REAL_UNLOCALIZED_NAMES = new Stack<String>();
    public static final String ELEX_PURE_NONMETAL_DUST_UNLOCALIZED_NAME = "itemElexPureNonmetalDust";
    public static final Stack<String> ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES = new Stack<String>();
    public static final String VANILLA_DUST_UNLOCALIZED_NAME = "itemVanillaDust";
    public static final String[] VANILLA_DUST_REAL_UNLOCALIZED_NAMES = 
        { "dustNetherQuartz", "dustIron", "dustGold" };
    
    /* Molecule Strings */
    public static final String[] COMPOUND_DUST_MOLECULE_STRINGS = 
        { "Be3Al2(SiO3)6", "Na2B4O7(H2O)10", "CaF2", 
        "Mg2SiO4", "LiAlSi4O10", "SiO2", 
        "LiAl(SiO3)2", "NaCl" };
    public static final Stack<String> METAL_DUST_MOLECULE_STRINGS = new Stack<String>();
    public static final Stack<String> PURE_NONMETAL_DUST_MOLECULE_STRINGS = new Stack<String>();
    public static final String[] VANILLA_DUST_MOLECULE_STRINGS =
        { "FeSiO2", "Fe", "Au" };
    
    /* Other Information Strings */
    public static final String RADIOACTIVE_UNLOCALIZED = "string.element.radioactive";
}
