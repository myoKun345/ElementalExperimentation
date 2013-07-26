package elex.lib;

public class ItemIds {
    /* Config Category */
    public static final String CATEGORY_ITEM_IDS = "Item IDs";
    
    /* Default Item IDs */
    public static final int ELEX_ORE_DEFAULT = 16231;
    public static final int MERCURY_INJECTOR_DEFAULT = 16232;
    public static final int ELEX_DUST_DEFAULT = 16233;
    
    /* Current Item IDs */
    public static int ELEX_ORE;
    public static int MERCURY_INJECTOR;
    public static int ELEX_DUST;
    
    /* Item Config Keys */
    public static final String ELEX_ORE_KEY = "ITEMORES";
    public static final String MERCURY_INJECTOR_KEY = "MercuryInjectorID";
    public static final String ELEX_DUST_KEY = "DUSTS";
    
    /* Item Unlocalized Names */
    public static final String ELEX_ORE_UNLOCALIZED_NAME = "itemElexOre";
    public static final String[] ELEX_ORE_REAL_UNLOCALIZED_NAMES = { "aquamarine", "borax", "fluorite", "forsterite", "petalite", "quartzArtificial", "spodumene" };
    public static final String MERCURY_INJECTOR_UNLOCALIZED_NAME = "mercuryInjector";
    public static final String ELEX_DUST_UNLOCALIZED_NAME = "itemElexDust";
    public static final String[] ELEX_DUST_REAL_UNLOCALIZED_NAMES = { "dustAquamarine", "dustBorax", "dustFluorite", "dustForsterite", "dustPetalite", "dustArtificialQuartz", "dustSpodumene" };
    
    /* Molecule Strings */
    public static final String[] ELEX_ITEM_ORES_MOLECULE_STRINGS = { "Be3 Al2 (Si O3)6", "Na2 B4 O7 (H2 O)10", "Ca F2", "Mg2 Si O4", "Li Al Si4 O10", "Si O2", "Li Al (Si O3)2" };
    
    /* Temporary Item English Names */
    public static final String[] ELEX_ORE_ENGLISH_NAMES = { "Aquamarine", "Borax", "Fluorite", "Forsterite", "Petalite", "Artificial Quartz", "Spodumene" };
    public static final String MERCURY_INJECTOR_ENGLISH_NAME = "Mercury Injector";
    public static final String[] ELEX_DUST_ENGLISH_NAMES = { "Aquamarine Dust", "Borax Dust", "Fluorite Dust", "Forsterite Dust", "Petalite Dust", "Artificial Quartz Dust", "Spodumene Dust" };
}
