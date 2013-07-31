package elex.element;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import elex.lib.ItemIds;
import elex.log.LogHelper;

public class Element {
    public float meltingPoint;
    
    public float boilingPoint;
    
    public float sublimationPoint;
    
    public String symbol;
    
    public boolean metal;
    
    public Item vanillaIngot;
    
    public int elementID;
    
    public int atomicNumber;
    
    public boolean radioactive;
    
    public String phase;
    
    public String name;
    
    public boolean hasVanillaIngot;
    
    public static Element[] elementList = new Element[128];

    public Element setCharacteristic(float melt, float boil)
    {
        this.meltingPoint = melt;
        this.boilingPoint = boil;
        return this;
    }
    
    public Element setSymbol(String sym)
    {
        this.symbol = sym;
        return this;
    }
    
    public Element setSublimationPoint(float sublim)
    {
        this.sublimationPoint = sublim;
        return this;
    }
    
    public Element isMetal(boolean met)
    {
        this.metal = met;
        return this;
    }
    
    public Element setVanillaIngot(Item item)
    {
        this.vanillaIngot = item;
        this.setHasVanillaIngot(true);
        return this;
    }
    
    public Element isRadioactive(boolean rad) {
        this.radioactive = rad;
        return this;
    }
    
    public Element setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    
    public Element setName(String name) {
        this.name = name;
        return this;
    }
    
    public void setHasVanillaIngot(boolean hasVanillaIngot) {
        this.hasVanillaIngot = hasVanillaIngot;
    }
    
    public static Element hydrogen = (new Element(0,
             14.01F, 20.28F, "H", false,
             false, "gas", "Hydrogen"));

    public static Element helium = (new Element(1,
             0.95F, 4.22F, "He", false,
             false, "gas", "Helium"));

    public static Element lithium = (new Element(2,
             453.69F, 1615F, "Li", true,
             false, "solid", "Lithium"));

    public static Element beryllium = (new Element(3,
             1560F, 2742F, "Be", true,
             false, "solid", "Beryllium"));

    public static Element boron = (new Element(4,
             2349F, 4200F, "B", false,
             false, "solid", "Boron"));

    public static Element carbon = (new Element(5, 3915F,
             "C", false, false,
             "solid", "Carbon"));

    public static Element nitrogen = (new Element(6,
             63.15F, 77.36F, "N", false,
             false, "gas", "Nitrogen"));

    public static Element oxygen = (new Element(7,
             54.36F, 90.20F, "O", false,
             false, "gas", "Oxygen"));

    public static Element fluorine = (new Element(8,
             53.53F, 85.03F, "F", false,
             false, "gas", "Fluorine"));

    public static Element neon = (new Element(9,
             24.56F, 27.07F, "Ne", false,
             false, "gas", "Neon"));

    public static Element sodium = (new Element(10,
             370.87F, 1156F, "Na", true,
             false, "solid", "Sodium"));

    public static Element magnesium = (new Element(11,
             923F, 1363F, "Mg", true,
             false, "solid", "Magnesium"));

    public static Element aluminium = (new Element(12,
             933.47F, 2792F, "Al", true,
             false, "solid", "Aluminium"));

    public static Element silicon = (new Element(13,
             1687F, 3538F, "Si", true,
             false, "solid", "Silicon"));

    public static Element phosphorus = (new Element(14,
             317.35F, 553.65F, "P", false,
             false, "solid", "Phosphorus"));

    public static Element sulfur = (new Element(15,
             388.36F, 717.8F, "S", false,
             false, "solid", "Sulfur"));

    public static Element chlorine = (new Element(16,
             171.6F, 239.11F, "Cl", false,
             false, "gas", "Chlorine"));

    public static Element argon = (new Element(17,
             83.8F, 87.3F, "Ar", false,
             false, "gas", "Argon"));

    public static Element potassium = (new Element(18,
             336.53F, 1032F, "K", true,
             false, "solid", "Potassium"));

    public static Element calcium = (new Element(19,
             1115F, 1757F, "Ca", true,
             false, "solid", "Calcium"));

    public static Element scandium = (new Element(20,
             1814F, 3109F, "Sc", true,
             false, "solid", "Scandium"));

    public static Element titanium = (new Element(21,
             1941F, 3560F, "Ti", true,
             false, "solid", "Titanium"));

    public static Element vanadium = (new Element(22,
             2183F, 3680F, "V", true,
             false, "solid", "Vanadium"));

    public static Element chromium = (new Element(23,
             2180F, 2944F, "Cr", true,
             false, "solid", "Chromium"));

    public static Element manganese = (new Element(24,
             1519F, 2334F, "Mn", true,
             false, "solid", "Manganese"));

    public static Element iron = (new Element(25,
             1811F, 3134F, "Fe",
             Item.ingotIron, true, false,
             "solid", "Iron"));

    public static Element cobalt = (new Element(26,
             1768F, 3200F, "Co", true,
             false, "solid", "Cobalt"));

    public static Element nickel = (new Element(27,
             1728F, 3186F, "Ni", true,
             false, "solid", "Nickel"));

    public static Element copper = (new Element(28,
             1357F, 2835F, "Cu", true,
             false, "solid", "Copper"));

    public static Element zinc = (new Element(29,
             692.68F, 1180F, "Zn", true,
             false, "solid", "Zinc"));

    public static Element gallium = (new Element(30,
             302.9146F, 2477F, "Ga", true,
             false, "solid", "Gallium"));

    public static Element germanium = (new Element(31,
             1211.4F, 3106F, "Ge", true,
             false, "solid", "Germanium"));

    public static Element arsenic = (new Element(32, 887F,
             "As", true, false,
             "solid", "Arsenic"));

    public static Element selenium = (new Element(33,
             494F, 958F, "Se", false,
             false, "solid", "Selenium"));

    public static Element bromine = (new Element(34,
             265.8F, 332F, "Br", false,
             false, "liquid", "Bromine"));

    public static Element krypton = (new Element(35,
             115.79F, 119.93F, "Kr", false,
             false, "gas", "Krypton"));

    public static Element rubidium = (new Element(36,
             312.46F, 961F, "Rb", true,
             false, "solid", "Rubidium"));

    public static Element strontium = (new Element(37,
             1050F, 1655F, "Sr", true,
             false, "solid", "Strontium"));

    public static Element yttrium = (new Element(38,
             1799F, 3609F, "Y", true,
             false, "solid", "Yttrium"));

    public static Element zirconium = (new Element(39,
             2128F, 4682F, "Zr", true,
             false, "solid", "Zirconium"));

    public static Element niobium = (new Element(40,
             2750F, 5017F, "Nb", true,
             false, "solid", "Niobium"));

    public static Element molybdenum = (new Element(41,
             2896F, 4912F, "Mo", true,
             false, "solid", "Molybdenum"));

    public static Element technetium = (new Element(42,
             2430F, 4538F, "Tc", true,
             true, "solid", "Technetium"));

    public static Element ruthenium = (new Element(43,
             2607F, 4423F, "Ru", true,
             false, "solid", "Ruthenium"));

    public static Element rhodium = (new Element(44,
             2237F, 3986F, "Rh", true,
             false, "solid", "Rhodium"));

    public static Element palladium = (new Element(45,
             1828.05F, 2830.82F, "Pd",
             true, false, "solid",
             "Palladium"));

    public static Element silver = (new Element(46,
             1234.93F, 2435F, "Ag", true,
             false, "solid", "Silver"));

    public static Element cadmium = (new Element(47,
             594.22F, 1040F, "Cd", true,
             false, "solid", "Cadmium"));

    public static Element indium = (new Element(48,
             429.7485F, 2345F, "In", true,
             false, "solid", "Indium"));

    public static Element tin = (new Element(49,
             505.08F, 2875F, "Sn", true,
             false, "solid", "Tin"));

    public static Element antimony = (new Element(50,
             903.78F, 1860F, "Sb", true,
             false, "solid", "Antimony"));

    public static Element tellurium = (new Element(51,
             722.66F, 1261F, "Te", true,
             false, "solid", "Tellurium"));

    public static Element iodine = (new Element(52,
             386.85F, 457.4F, "I", false,
             false, "solid", "Iodine"));

    public static Element xenon = (new Element(53,
             161.4F, 165.03F, "Xe", false,
             false, "gas", "Xenon"));

    public static Element caesium = (new Element(54,
             301.59F, 944F, "Cs", true,
             false, "solid", "Caesium"));

    public static Element barium = (new Element(55,
             1000F, 2170F, "Ba", true,
             false, "solid", "Barium"));

    public static Element lanthanum = (new Element(56,
             1193F, 3737F, "La", true,
             false, "solid", "Lanthanum"));

    public static Element cerium = (new Element(57,
             1068F, 3716F, "Ce", true,
             false, "solid", "Cerium"));

    public static Element praseodymium = (new Element(58,
             1208F, 3793F, "Pr", true,
             false, "solid", "Praseodymium"));

    public static Element neodymium = (new Element(59,
             1297F, 3347F, "Nd", true,
             false, "solid", "Neodymium"));

    public static Element promethium = (new Element(60,
             1315F, 3273F, "Pm", true,
             true, "solid", "Promethium"));

    public static Element samarium = (new Element(61,
             1345F, 2067F, "Sm", true,
             false, "solid", "Samarium"));

    public static Element europium = (new Element(62,
             1099F, 1802F, "Eu", true,
             false, "solid", "Europium"));

    public static Element gadolinium = (new Element(63,
             1585F, 3546F, "Gd", true,
             true, "solid", "Gadolinium"));

    public static Element terbium = (new Element(64,
             1629F, 3503F, "Tb", true,
             false, "solid", "Terbium"));

    public static Element dysprosium = (new Element(65,
             1680F, 2840F, "Dy", true,
             false, "solid", "Dysprosium"));

    public static Element holmium = (new Element(66,
             1734F, 2993F, "Ho", true,
             false, "solid", "Holmium"));

    public static Element erbium = (new Element(67,
             1802F, 3141F, "Er", true,
             false, "solid", "Erbium"));

    public static Element thulium = (new Element(68,
             1818F, 2223F, "Tm", true,
             false, "solid", "Thulium"));

    public static Element ytterbium = (new Element(69,
             1097F, 1469F, "Yb", true,
             false, "solid", "Ytterbium"));

    public static Element lutetium = (new Element(70,
             1925F, 3675F, "Lu", true,
             false, "solid", "Lutetium"));

    public static Element hafnium = (new Element(71,
             2506F, 4876F, "Hf", true,
             false, "solid", "Hafnium"));

    public static Element tantalum = (new Element(72,
             3290F, 5731F, "Ta", true,
             false, "solid", "Tantalum"));

    public static Element tungsten = (new Element(73,
             3695F, 5828F, "W", true,
             false, "solid", "Tungsten"));

    public static Element rhenium = (new Element(74,
             3459F, 5869F, "Re", true,
             false, "solid", "Rhenium"));

    public static Element osmium = (new Element(75,
             3306F, 5285F, "Os", true,
             false, "solid", "Osmium"));

    public static Element iridium = (new Element(76,
             2739F, 4701F, "Ir", true,
             false, "solid", "Iridium"));

    public static Element platinum = (new Element(77,
             2041.4F, 4098F, "Pt", true,
             false, "solid", "Platinum"));

    public static Element gold = (new Element(78,
             1337.33F, 3129F, "Au",
             Item.ingotGold, true, false,
             "solid", "Gold"));

    public static Element mercury = (new Element(79,
             234.3210F, 629.88F, "Hg",
             true, false, "liquid",
             "Mercury"));

    public static Element thallium = (new Element(80,
             577F, 1746F, "Tl", true,
             false, "solid", "Thallium"));

    public static Element lead = (new Element(81,
             600.61F, 2022F, "Pb", true,
             false, "solid", "Lead"));

    public static Element bismuth = (new Element(82,
             544.7F, 1837F, "Bi", true,
             true, "solid", "Bismuth"));

    public static Element polonium = (new Element(83,
             527F, 1235F, "Po", true,
             true, "solid", "Polonium"));

    public static Element astatine = (new Element(84,
             575F, 610F, "At", false,
             true, "solid", "Astatine"));

    public static Element radon = (new Element(85,
             202F, 211.3F, "Rn", false,
             true, "gas", "Radon"));

    public static Element francium = (new Element(86,
             300F, 950F, "Fr", true,
             true, "solid", "Francium"));

    public static Element radium = (new Element(87,
             973F, 2010F, "Ra", true,
             true, "solid", "Radium"));

    public static Element actinium = (new Element(88,
             1323F, 3471F, "Ac", true,
             true, "solid", "Actinium"));

    public static Element thorium = (new Element(89,
             2115F, 5061F, "Th", true,
             true, "solid", "Thorium"));

    public static Element protactinium = (new Element(90,
             1841F, 4300F, "Pa", true,
             true, "solid", "Protactinium"));

    public static Element uranium = (new Element(91,
             1405.3F, 4404F, "U", true,
             true, "solid", "Uranium"));

    public static Element neptunium = (new Element(92,
             910F, 4273F, "Np", true,
             true, "solid", "Neptunium"));

    public static Element plutonium = (new Element(93,
             912.5F, 3505F, "Pu", true,
             true, "solid", "Plutonium"));

    public static Element americium = (new Element(94,
             1449F, 2880F, "Am", true,
             true, "solid", "Americium"));

    public static Element curium = (new Element(95,
             1613F, 3383F, "Cm", true,
             true, "solid", "Curium"));

    public static Element berkelium = (new Element(96,
             1259F, 3100F, "Bk", true,
             true, "solid", "Berkelium"));

    public static Element californium = (new Element(97,
             1173F, 1470F, "Cf", true,
             true, "solid", "Californium"));

    public static Element einsteinium = (new Element(98,
             1133F, 1450F, "Es", true,
             true, "solid", "Einsteinium"));

    public static Element fermium = (new Element(99,
             1800F, 2150F, "Fm", true,
             true, "solid", "Fermium"));

    public static Element mendelevium = (new Element(100, 1100F, 1450F, "Md",
             true, true, "solid",
             "Mendelevium"));
    
    public Element(int id, float melt, float boil, String sym, boolean metal, boolean rad, String phase, String name)
    {
        this.elementID = id;
        this.atomicNumber = id + 1;
        this.meltingPoint = melt;
        this.boilingPoint = boil;
        this.symbol = sym;
        this.metal = metal;
        this.radioactive = rad;
        this.phase = phase;
        this.name = name;
        
        elementList[id] = this;
        addStuff(id);
        LogHelper.log(Level.INFO, "Element " + this.atomicNumber + " added.");
        if (id == 100) {
            LogHelper.log(Level.INFO, "Elements finished loading.");
        }
    }
    
    public Element(int id, float sublime, String sym, boolean metal, boolean rad, String phase, String name) {
        this(id, 0F, 0F, sym, metal, rad, phase, name);
        this.sublimationPoint = sublime;
    }
    
    public Element(int id, float melt, float boil, String sym, Item vanillaIngot, boolean metal, boolean rad, String phase, String name) {
        this(id, melt, boil, sym, metal, rad, phase, name);
        this.vanillaIngot = vanillaIngot;
        this.hasVanillaIngot = true;
    }
    
    public int getID() {
        return this.elementID;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public float getSublimationPoint() {
        return this.sublimationPoint;
    }
    
    public float getMeltingPoint() {
        return this.meltingPoint;
    }
    
    public float getBoilingPoint() {
        return this.boilingPoint;
    }
    
    public boolean getIsMetal() {
        return this.metal;
    }
    
    public Item getVanillaIngot() {
        return this.vanillaIngot;
    }
    
    public boolean getIsRadioactive() {
        return this.radioactive;
    }
    
    public String getPhase() {
        return this.phase;
    }
    
    public String getName() {
        return this.name;
    }
    
    public static String getUnlocalizedName(int id) {
        return "element." + elementList[id].name.toLowerCase() + ".name";
    }
    
    public boolean isHasVanillaIngot() {
        return this.hasVanillaIngot;
    }
    
    public static void addStuff(int id) {
        if (elementList[id].metal == true && elementList[id].phase == "solid") {
            ItemIds.ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES.add("dust" + elementList[id].name);
            ItemIds.METAL_DUST_MOLECULE_STRINGS.add(elementList[id].symbol);
            ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.add("ingot" + elementList[id].name);
        }
        if (elementList[id].metal == false && elementList[id].phase == "solid") {
            ItemIds.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.add("dust" + elementList[id].name);
            ItemIds.PURE_NONMETAL_DUST_MOLECULE_STRINGS.add(elementList[id].symbol);
        }
        /*LogHelper.log(Level.INFO, "Element " + elementList[id].atomicNumber + ": it is metal: " + elementList[id].metal);
        LogHelper.log(Level.INFO, "It is phase: " + elementList[id].phase);
        LogHelper.log(Level.INFO, "It has an ingot in vanilla: " + elementList[id].hasVanillaIngot);
        LogHelper.log(Level.INFO, "It has the name: " + Block.blocksList[15].getItemIconName());*/
        //LogHelper.log(Level.INFO, "It is unlocalized: " + getUnlocalizedName(id));
    }
}
