package elex.element;

import net.minecraft.item.Item;

public class Element {
    public float meltingPoint;
    
    public float boilingPoint;
    
    public float sublimationPoint;
    
    public String symbol;
    
    public boolean metal;
    
    public Item vanillaIngot;
    
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
        return this;
    }
    
    public static final Element hydrogen = (new Element(1).setCharacteristic(14.01F, 20.28F).setSymbol("H").isMetal(false));
    public static final Element helium = (new Element(2).setCharacteristic(0.95F, 4.22F).setSymbol("He").isMetal(false));
    public static final Element lithium = (new Element(3).setCharacteristic(453.69F, 1615F).setSymbol("Li").isMetal(true));
    public static final Element beryllium = (new Element(4).setCharacteristic(1560F, 2742F).setSymbol("Be").isMetal(true));
    public static final Element boron = (new Element(5).setCharacteristic(2349F, 4200F).setSymbol("B").isMetal(false));
    public static final Element carbon = (new Element(6).setSublimationPoint(3915F).setSymbol("C").isMetal(false));
    public static final Element nitrogen = (new Element(7).setCharacteristic(63.15F, 77.36F).setSymbol("N").isMetal(false));
    public static final Element oxygen = (new Element(8).setCharacteristic(54.36F, 90.20F).setSymbol("O").isMetal(false));
    public static final Element fluorine = (new Element(9).setCharacteristic(53.53F, 85.03F).setSymbol("F").isMetal(false));
    public static final Element neon = (new Element(10).setCharacteristic(24.56F, 27.07F).setSymbol("Ne").isMetal(false));
    public static final Element sodium = (new Element(11).setCharacteristic(370.87F, 1156F).setSymbol("Na").isMetal(true));
    public static final Element magnesium = (new Element(12).setCharacteristic(923F, 1363F).setSymbol("Mg").isMetal(true));
    public static final Element aluminium = (new Element(13).setCharacteristic(933.47F, 2792F).setSymbol("Al").isMetal(true));
    public static final Element silicon = (new Element(14).setCharacteristic(1687F, 3538F).setSymbol("Si").isMetal(true));
    public static final Element phosphorus = (new Element(15).setCharacteristic(317.35F, 553.65F).setSymbol("P").isMetal(false));
    public static final Element sulfur = (new Element(16).setCharacteristic(388.36F, 717.8F).setSymbol("S").isMetal(false));
    public static final Element chlorine = (new Element(17).setCharacteristic(171.6F, 239.11F).setSymbol("Cl").isMetal(false));
    public static final Element argon = (new Element(18).setCharacteristic(83.8F, 87.3F).setSymbol("Ar").isMetal(false));
    public static final Element potassium = (new Element(19).setCharacteristic(336.53F, 1032F).setSymbol("K").isMetal(true));
    public static final Element calcium = (new Element(20).setCharacteristic(1115F, 1757F).setSymbol("Ca").isMetal(true));
    public static final Element scandium = (new Element(21).setCharacteristic(1814F, 3109F).setSymbol("Sc").isMetal(true));
    public static final Element titanium = (new Element(22).setCharacteristic(1941F, 3560F).setSymbol("Ti").isMetal(true));
    public static final Element vanadium = (new Element(23).setCharacteristic(2183F, 3680F).setSymbol("V").isMetal(true));
    public static final Element chromium = (new Element(24).setCharacteristic(2180F, 2944F).setSymbol("Cr").isMetal(true));
    public static final Element manganese = (new Element(25).setCharacteristic(1519F, 2334F).setSymbol("Mn").isMetal(true));
    public static final Element iron = (new Element(26).setCharacteristic(1811F, 3134F).setSymbol("Fe").setVanillaIngot(Item.ingotIron).isMetal(true));
    public static final Element cobalt = (new Element(27).setCharacteristic(1768F, 3200F).setSymbol("Co").isMetal(true));
    public static final Element nickel = (new Element(28).setCharacteristic(1728F, 3186F).setSymbol("Ni").isMetal(true));
    public static final Element copper = (new Element(29).setCharacteristic(1357F, 2835F).setSymbol("Cu").isMetal(true));
    public static final Element zinc = (new Element(30).setCharacteristic(692.68F, 1180F).setSymbol("Zn").isMetal(true));
    public static final Element gallium = (new Element(31).setCharacteristic(302.9146F, 2477F).setSymbol("Ga").isMetal(true));
    public static final Element germanium = (new Element(32).setCharacteristic(1211.4F, 3106F).setSymbol("Ge").isMetal(true));
    public static final Element arsenic = (new Element(33).setSublimationPoint(887F).setSymbol("As").isMetal(true));
    public static final Element selenium = (new Element(34).setCharacteristic(494F, 958F).setSymbol("Se").isMetal(false));
    public static final Element bromine = (new Element(35).setCharacteristic(265.8F, 332F).setSymbol("Br").isMetal(false));
    public static final Element krypton = (new Element(36).setCharacteristic(115.79F, 119.93F).setSymbol("Kr").isMetal(false));
    public static final Element rubidium = (new Element(37).setCharacteristic(312.46F, 961F).setSymbol("Rb").isMetal(true));
    public static final Element strontium = (new Element(38).setCharacteristic(1050F, 1655F).setSymbol("Sr").isMetal(true));
    public static final Element yttrium = (new Element(39).setCharacteristic(1799F, 3609F).setSymbol("Y").isMetal(true));
    public static final Element zirconium = (new Element(40).setCharacteristic(2128F, 4682F).setSymbol("Zr").isMetal(true));
    public static final Element niobium = (new Element(41).setCharacteristic(2750F, 5017F).setSymbol("Nb").isMetal(true));
    
    public Element(int num)
    {
        
    }
}
