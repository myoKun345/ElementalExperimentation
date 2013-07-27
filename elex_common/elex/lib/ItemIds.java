package elex.lib;

public class ItemIds {
    /* Config Category */
    public static final String CATEGORY_ITEM_IDS = "Item IDs";
    
    /* Default Item IDs */
    public static final int ELEX_ORE_DEFAULT = 16231;
    public static final int MERCURY_INJECTOR_DEFAULT = 16232;
    public static final int ELEX_DUST_DEFAULT = 16233;
    public static final int ELEX_INGOT_DEFAULT = 16234;
    
    /* Current Item IDs */
    public static int ELEX_ORE;
    public static int MERCURY_INJECTOR;
    public static int ELEX_DUST;
    public static int ELEX_INGOT;
    
    /* Item Config Keys */
    public static final String ELEX_ORE_KEY = "ITEMORES";
    public static final String MERCURY_INJECTOR_KEY = "MercuryInjectorID";
    public static final String ELEX_DUST_KEY = "DUSTS";
    public static final String ELEX_INGOT_KEY = "INGOTS";
    
    /* Item Unlocalized Names */
    public static final String ELEX_ORE_UNLOCALIZED_NAME = "itemElexOre";
    public static final String[] ELEX_ORE_REAL_UNLOCALIZED_NAMES = 
        { "aquamarine", "borax", "fluorite", 
        "forsterite", "petalite", "quartzArtificial", 
        "spodumene" };
    public static final String MERCURY_INJECTOR_UNLOCALIZED_NAME = "mercuryInjector";
    public static final String ELEX_DUST_UNLOCALIZED_NAME = "itemElexDust";
    public static final String[] ELEX_DUST_REAL_UNLOCALIZED_NAMES = 
        { "dustAquamarine", "dustBorax", "dustFluorite", 
        "dustForsterite", "dustPetalite", "dustArtificialQuartz", 
        "dustSpodumene", "dustNetherQuartz", "dustCopper",
        "dustSilver", "dustTin", "dustChromium",
        "dustOsmium", "dustRuthenium", "dustRhodium",
        "dustPalladium", "dustIridium", "dustPlatinum",
        "dustNickel", "dustCobalt", "dustCadmium",
        "dustMolybdenum", "dustIndium", "dustAluminium",
        "dustTantalum", "dustArsenic", "dustTellurium",
        "dustAntimony", "dustBismuth", "dustLead",
        "dustIron", "dustGold" };
    public static final String ELEX_INGOT_UNLOCALIZED_NAME = "itemElexIngot";
    public static final String[] ELEX_INGOT_REAL_UNLOCALIZED_NAMES = 
        { "ingotCopper", "ingotSilver", "ingotTin",
        "ingotChromium", "ingotOsmium", "ingotRuthenium",
        "ingotRhodium", "ingotPalladium", "ingotIridium",
        "ingotPlatinum", "ingotNickel", "ingotCobalt",
        "ingotCadmium", "ingotMolybdenum", "ingotIndium",
        "ingotAluminium", "ingotTantalum", "ingotArsenic",
        "ingotTellurium", "ingotAntimony", "ingotBismuth",
        "ingotLead" };
    
    /* Molecule Strings */
    public static final String[] MOLECULE_STRINGS = 
        { "Be3Al2(SiO3)6", "Na2B4O7(H2O)10", "CaF2", 
        "Mg2SiO4", "LiAlSi4O10", "SiO2", 
        "LiAl(SiO3)2", "FeSiO2", "Cu",
        "Ag", "Sn", "Cr",
        "Os", "Ru", "Rh",
        "Pd", "Ir", "Pt",
        "Ni", "Co", "Cd",
        "Mo", "In", "Al",
        "Ta", "As", "Te",
        "Sb", "Bi", "Pb",
        "Fe", "Au" };
}
