package elex.element;

import elex.lib.ItemIds;
import net.minecraft.item.Item;

public class Element {
    private float meltingPoint;
    
    private float boilingPoint;
    
    private float sublimationPoint;
    
    private String symbol;
    
    private boolean metal;
    
    private Item vanillaIngot;
    
    private int elementID;
    
    private boolean radioactive;
    
    private String phase;
    
    private String name;
    
    private boolean hasVanillaIngot;
    
    public static final Element[] elementList = new Element[128];

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
        setHasVanillaIngot(true);
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
    
    public static final Element hydrogen = 
            (new Element(1)
            .setCharacteristic(14.01F, 20.28F)
            .setSymbol("H")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Hydrogen"));
    
    public static final Element helium = 
            (new Element(2)
            .setCharacteristic(0.95F, 4.22F)
            .setSymbol("He")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Helium"));
    
    public static final Element lithium = 
            (new Element(3)
            .setCharacteristic(453.69F, 1615F)
            .setSymbol("Li")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Lithium"));
    
    public static final Element beryllium = 
            (new Element(4)
            .setCharacteristic(1560F, 2742F)
            .setSymbol("Be")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Beryllium"));
    
    public static final Element boron = 
            (new Element(5)
            .setCharacteristic(2349F, 4200F)
            .setSymbol("B")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Boron"));
    
    public static final Element carbon = 
            (new Element(6)
            .setSublimationPoint(3915F)
            .setSymbol("C")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Carbon"));
    
    public static final Element nitrogen = 
            (new Element(7)
            .setCharacteristic(63.15F, 77.36F)
            .setSymbol("N")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Nitrogen"));
    
    public static final Element oxygen = 
            (new Element(8)
            .setCharacteristic(54.36F, 90.20F)
            .setSymbol("O")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Oxygen"));
    
    public static final Element fluorine = 
            (new Element(9)
            .setCharacteristic(53.53F, 85.03F)
            .setSymbol("F")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Fluorine"));
    
    public static final Element neon = 
            (new Element(10)
            .setCharacteristic(24.56F, 27.07F)
            .setSymbol("Ne")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Neon"));
    
    public static final Element sodium = 
            (new Element(11)
            .setCharacteristic(370.87F, 1156F)
            .setSymbol("Na")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Sodium"));
    
    public static final Element magnesium = 
            (new Element(12)
            .setCharacteristic(923F, 1363F)
            .setSymbol("Mg")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Magnesium"));
    
    public static final Element aluminium = 
            (new Element(13)
            .setCharacteristic(933.47F, 2792F)
            .setSymbol("Al")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Aluminium"));
    
    public static final Element silicon = 
            (new Element(14)
            .setCharacteristic(1687F, 3538F)
            .setSymbol("Si")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Silicon"));
    
    public static final Element phosphorus = 
            (new Element(15)
            .setCharacteristic(317.35F, 553.65F)
            .setSymbol("P")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Phosphorus"));
    
    public static final Element sulfur = 
            (new Element(16)
            .setCharacteristic(388.36F, 717.8F)
            .setSymbol("S")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Sulfur"));
    
    public static final Element chlorine = 
            (new Element(17)
            .setCharacteristic(171.6F, 239.11F)
            .setSymbol("Cl")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Chlorine"));
    
    public static final Element argon = 
            (new Element(18)
            .setCharacteristic(83.8F, 87.3F)
            .setSymbol("Ar")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Argon"));
    
    public static final Element potassium = 
            (new Element(19)
            .setCharacteristic(336.53F, 1032F)
            .setSymbol("K")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Potassium"));
    
    public static final Element calcium = 
            (new Element(20)
            .setCharacteristic(1115F, 1757F)
            .setSymbol("Ca")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Calcium"));
    
    public static final Element scandium = 
            (new Element(21)
            .setCharacteristic(1814F, 3109F)
            .setSymbol("Sc")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Scandium"));
    
    public static final Element titanium = 
            (new Element(22)
            .setCharacteristic(1941F, 3560F)
            .setSymbol("Ti")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Titanium"));
    
    public static final Element vanadium = 
            (new Element(23)
            .setCharacteristic(2183F, 3680F)
            .setSymbol("V")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Vanadium"));
    
    public static final Element chromium = 
            (new Element(24)
            .setCharacteristic(2180F, 2944F)
            .setSymbol("Cr")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Chromium"));
    
    public static final Element manganese = 
            (new Element(25)
            .setCharacteristic(1519F, 2334F)
            .setSymbol("Mn")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Manganese"));
    
    public static final Element iron = 
            (new Element(26)
            .setCharacteristic(1811F, 3134F)
            .setSymbol("Fe")
            .setVanillaIngot(Item.ingotIron)
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Iron"));
    
    public static final Element cobalt = 
            (new Element(27)
            .setCharacteristic(1768F, 3200F)
            .setSymbol("Co")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Cobalt"));
    
    public static final Element nickel = 
            (new Element(28)
            .setCharacteristic(1728F, 3186F)
            .setSymbol("Ni")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Nickel"));
    
    public static final Element copper = 
            (new Element(29)
            .setCharacteristic(1357F, 2835F)
            .setSymbol("Cu")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Copper"));
    
    public static final Element zinc = 
            (new Element(30)
            .setCharacteristic(692.68F, 1180F)
            .setSymbol("Zn")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Zinc"));
    
    public static final Element gallium = 
            (new Element(31)
            .setCharacteristic(302.9146F, 2477F)
            .setSymbol("Ga")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Gallium"));
    
    public static final Element germanium = 
            (new Element(32)
            .setCharacteristic(1211.4F, 3106F)
            .setSymbol("Ge")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Germanium"));
    
    public static final Element arsenic = 
            (new Element(33)
            .setSublimationPoint(887F)
            .setSymbol("As")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Arsenic"));
    
    public static final Element selenium = 
            (new Element(34)
            .setCharacteristic(494F, 958F)
            .setSymbol("Se")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Selenium"));
    
    public static final Element bromine = 
            (new Element(35)
            .setCharacteristic(265.8F, 332F)
            .setSymbol("Br")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("liquid")
            .setName("Bromine"));
    
    public static final Element krypton = 
            (new Element(36)
            .setCharacteristic(115.79F, 119.93F)
            .setSymbol("Kr")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Krypton"));
    
    public static final Element rubidium = 
            (new Element(37)
            .setCharacteristic(312.46F, 961F)
            .setSymbol("Rb")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Rubidium"));
    
    public static final Element strontium = 
            (new Element(38)
            .setCharacteristic(1050F, 1655F)
            .setSymbol("Sr")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Strontium"));
    
    public static final Element yttrium = 
            (new Element(39)
            .setCharacteristic(1799F, 3609F)
            .setSymbol("Y")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Yttrium"));
    
    public static final Element zirconium = 
            (new Element(40)
            .setCharacteristic(2128F, 4682F)
            .setSymbol("Zr")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Zirconium"));
    
    public static final Element niobium = 
            (new Element(41)
            .setCharacteristic(2750F, 5017F)
            .setSymbol("Nb")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Niobium"));
    
    public static final Element molybdenum = 
            (new Element(42)
            .setCharacteristic(2896F, 4912F)
            .setSymbol("Mo")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Molybdenum"));
    
    public static final Element technetium = 
            (new Element(43)
            .setCharacteristic(2430F, 4538F)
            .setSymbol("Tc")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Technetium"));
    
    public static final Element ruthenium = 
            (new Element(44)
            .setCharacteristic(2607F, 4423F)
            .setSymbol("Ru")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Ruthenium"));
    
    public static final Element rhodium = 
            (new Element(45)
            .setCharacteristic(2237F, 3986F)
            .setSymbol("Rh")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Rhodium"));
    
    public static final Element palladium = 
            (new Element(46)
            .setCharacteristic(1828.05F, 2830.82F)
            .setSymbol("Pd")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Palladium"));
    
    public static final Element silver = 
            (new Element(47)
            .setCharacteristic(1234.93F, 2435F)
            .setSymbol("Ag")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Silver"));
    
    public static final Element cadmium = 
            (new Element(48)
            .setCharacteristic(594.22F, 1040F)
            .setSymbol("Cd")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Cadmium"));
    
    public static final Element indium = 
            (new Element(49)
            .setCharacteristic(429.7485F, 2345F)
            .setSymbol("In")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Indium"));
    
    public static final Element tin = 
            (new Element(50)
            .setCharacteristic(505.08F, 2875F)
            .setSymbol("Sn")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Tin"));
    
    public static final Element antimony = 
            (new Element(51)
            .setCharacteristic(903.78F, 1860F)
            .setSymbol("Sb")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Antimony"));
    
    public static final Element tellurium = 
            (new Element(52)
            .setCharacteristic(722.66F, 1261F)
            .setSymbol("Te")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Tellurium"));
    
    public static final Element iodine =
            (new Element(53)
            .setCharacteristic(386.85F, 457.4F)
            .setSymbol("I")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Iodine"));
    
    public static final Element xenon = 
            (new Element(54)
            .setCharacteristic(161.4F, 165.03F)
            .setSymbol("Xe")
            .isMetal(false)
            .isRadioactive(false)
            .setPhase("gas")
            .setName("Xenon"));
    
    public static final Element caesium = 
            (new Element(55)
            .setCharacteristic(301.59F, 944F)
            .setSymbol("Cs")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Caesium"));
    
    public static final Element barium = 
            (new Element(56)
            .setCharacteristic(1000F, 2170F)
            .setSymbol("Ba")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Barium"));
    
    public static final Element lanthanum = 
            (new Element(57)
            .setCharacteristic(1193F, 3737F)
            .setSymbol("La")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Lanthanum"));
    
    public static final Element cerium =
            (new Element(58)
            .setCharacteristic(1068F, 3716F)
            .setSymbol("Ce")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Cerium"));
    
    public static final Element praseodymium = 
            (new Element(59)
            .setCharacteristic(1208F, 3793F)
            .setSymbol("Pr")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Praseodymium"));
    
    public static final Element neodymium =
            (new Element(60)
            .setCharacteristic(1297F, 3347F)
            .setSymbol("Nd")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Neodymium"));
    
    public static final Element promethium = 
            (new Element(61)
            .setCharacteristic(1315F, 3273F)
            .setSymbol("Pm")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Promethium"));
    
    public static final Element samarium = 
            (new Element(62)
            .setCharacteristic(1345F, 2067F)
            .setSymbol("Sm")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Samarium"));
    
    public static final Element europium =
            (new Element(63)
            .setCharacteristic(1099F, 1802F)
            .setSymbol("Eu")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Europium"));
    
    public static final Element gadolinium =
            (new Element(64)
            .setCharacteristic(1585F, 3546F)
            .setSymbol("Gd")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Gadolinium"));
    
    public static final Element terbium =
            (new Element(65)
            .setCharacteristic(1629F, 3503F)
            .setSymbol("Tb")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Terbium"));
    
    public static final Element dysprosium = 
            (new Element(66)
            .setCharacteristic(1680F, 2840F)
            .setSymbol("Dy")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Dysprosium"));
    
    public static final Element holmium =
            (new Element(67)
            .setCharacteristic(1734F, 2993F)
            .setSymbol("Ho")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Holmium"));
    
    public static final Element erbium =
            (new Element(68)
            .setCharacteristic(1802F, 3141F)
            .setSymbol("Er")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Erbium"));
    
    public static final Element thulium = 
            (new Element(69)
            .setCharacteristic(1818F, 2223F)
            .setSymbol("Tm")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Thulium"));
    
    public static final Element ytterbium =
            (new Element(70)
            .setCharacteristic(1097F, 1469F)
            .setSymbol("Yb")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Ytterbium"));
    
    public static final Element lutetium = 
            (new Element(71)
            .setCharacteristic(1925F, 3675F)
            .setSymbol("Lu")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Lutetium"));
    
    public static final Element hafnium = 
            (new Element(72)
            .setCharacteristic(2506F, 4876F)
            .setSymbol("Hf")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Hafnium"));
    
    public static final Element tantalum = 
            (new Element(73)
            .setCharacteristic(3290F, 5731F)
            .setSymbol("Ta")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Tantalum"));
    
    public static final Element tungsten =
            (new Element(74)
            .setCharacteristic(3695F, 5828F)
            .setSymbol("W")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Tungsten"));
    
    public static final Element rhenium = 
            (new Element(75)
            .setCharacteristic(3459F, 5869F)
            .setSymbol("Re")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Rhenium"));
    
    public static final Element osmium = 
            (new Element(76)
            .setCharacteristic(3306F, 5285F)
            .setSymbol("Os")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Osmium"));
    
    public static final Element iridium = 
            (new Element(77)
            .setCharacteristic(2739F, 4701F)
            .setSymbol("Ir")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Iridium"));
    
    public static final Element platinum = 
            (new Element(78)
            .setCharacteristic(2041.4F, 4098F)
            .setSymbol("Pt")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Platinum"));
    
    public static final Element gold = 
            (new Element(79)
            .setCharacteristic(1337.33F, 3129F)
            .setSymbol("Au")
            .setVanillaIngot(Item.ingotGold)
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Gold"));
    
    public static final Element mercury = 
            (new Element(80)
            .setCharacteristic(234.3210F, 629.88F)
            .setSymbol("Hg")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("liquid")
            .setName("Mercury"));
    
    public static final Element thallium = 
            (new Element(81)
            .setCharacteristic(577F, 1746F)
            .setSymbol("Tl")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Thallium"));
    
    public static final Element lead = 
            (new Element(82)
            .setCharacteristic(600.61F, 2022F)
            .setSymbol("Pb")
            .isMetal(true)
            .isRadioactive(false)
            .setPhase("solid")
            .setName("Lead"));
    
    public static Element bismuth = 
            (new Element(83)
            .setCharacteristic(544.7F, 1837F)
            .setSymbol("Bi")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Bismuth"));
    
    public static Element polonium = 
            (new Element(84)
            .setCharacteristic(527F, 1235F)
            .setSymbol("Po")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Polonium"));
    
    public static Element astatine = 
            (new Element(85)
            .setCharacteristic(575F, 610F)
            .setSymbol("At")
            .isMetal(false)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Astatine"));
    
    public static Element radon = 
            (new Element(86)
            .setCharacteristic(202F, 211.3F)
            .setSymbol("Rn")
            .isMetal(false)
            .isRadioactive(true)
            .setPhase("gas")
            .setName("Radon"));
    
    public static Element francium = 
            (new Element(87)
            .setCharacteristic(300F, 950F)
            .setSymbol("Fr")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Francium"));
    
    public static Element radium = 
            (new Element(88)
            .setCharacteristic(973F, 2010F)
            .setSymbol("Ra")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Radium"));
    
    public static Element actinium = 
            (new Element(89)
            .setCharacteristic(1323F, 3471F)
            .setSymbol("Ac")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Actinium"));
    
    public static Element thorium = 
            (new Element(90)
            .setCharacteristic(2115F, 5061F)
            .setSymbol("Th")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Thorium"));
    
    public static Element protactinium = 
            (new Element(91)
            .setCharacteristic(1841F, 4300F)
            .setSymbol("Pa")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Protactinium"));
    
    public static Element uranium = 
            (new Element(92)
            .setCharacteristic(1405.3F, 4404F)
            .setSymbol("U")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Uranium"));
    
    public static Element neptunium = 
            (new Element(93)
            .setCharacteristic(910F, 4273F)
            .setSymbol("Np")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Neptunium"));
    
    public static Element plutonium = 
            (new Element(94)
            .setCharacteristic(912.5F, 3505F)
            .setSymbol("Pu")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Plutonium"));
    
    public static Element americium = 
            (new Element(95)
            .setCharacteristic(1449F, 2880F)
            .setSymbol("Am")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Americium"));
    
    public static Element curium = 
            (new Element(96)
            .setCharacteristic(1613F, 3383F)
            .setSymbol("Cm")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Curium"));
    
    public static Element berkelium = 
            (new Element(97)
            .setCharacteristic(1259F, 3100F)
            .setSymbol("Bk")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Berkelium"));
    
    public static Element californium = 
            (new Element(98)
            .setCharacteristic(1173F, 1470F)
            .setSymbol("Cf")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Californium"));
    
    public static Element einsteinium = 
            (new Element(99)
            .setCharacteristic(1133F, 1450F)
            .setSymbol("Es")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Einsteinium"));
    
    public static Element fermium = 
            (new Element(100)
            .setCharacteristic(1800F, 2150F)
            .setSymbol("Fm")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Fermium"));
    
    public static Element mendelevium = 
            (new Element(101)
            .setCharacteristic(1100F, 1450F)
            .setSymbol("Md")
            .isMetal(true)
            .isRadioactive(true)
            .setPhase("solid")
            .setName("Mendelevium"));
    
    public Element(int num)
    {
        this.elementID = num;
        elementList[num] = this;
        addStuff(num);
    }
    
    public int getID() {
        return elementID;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public float getSublimationPoint() {
        return sublimationPoint;
    }
    
    public float getMeltingPoint() {
        return meltingPoint;
    }
    
    public float getBoilingPoint() {
        return boilingPoint;
    }
    
    public boolean getIsMetal() {
        return metal;
    }
    
    public Item getVanillaIngot() {
        return vanillaIngot;
    }
    
    public boolean getIsRadioactive() {
        return radioactive;
    }
    
    public String getPhase() {
        return phase;
    }
    
    public String getName() {
        return name;
    }
    
    public static String getUnlocalizedName(int id) {
        return "element." + elementList[id].getName().toLowerCase() + ".name";
    }
    
    public boolean isHasVanillaIngot() {
        return hasVanillaIngot;
    }
    
    public static void addStuff(int id) {
        if (elementList[id].getIsMetal() == true & elementList[id].getPhase() == "solid" & elementList[id].isHasVanillaIngot() == false) {
            ItemIds.ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES.push("dust" + elementList[id].getName());
            ItemIds.METAL_DUST_MOLECULE_STRINGS.push(elementList[id].getSymbol());
            ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.push("ingot" + elementList[id].getName());
        }
        if (elementList[id].getIsMetal() == false & elementList[id].getPhase() == "solid") {
            ItemIds.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.push("dust" + elementList[id].getName());
            ItemIds.PURE_NONMETAL_DUST_MOLECULE_STRINGS.push(elementList[id].getSymbol());
        }
    }
}
