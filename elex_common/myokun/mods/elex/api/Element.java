package myokun.mods.elex.api;

import net.minecraft.item.Item;

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

    public boolean hasNativeOre;
    
    /**
     * Create variable instances of this class to add elements.
     * @param id - The id of the element.
     * @param melt - The melting point, in Kelvin, as a floating point number.
     * @param boil - The boiling point, in Kelvin, as a floating point number.
     * @param sym - The molecular symbol, for use in tooltips and so on.
     * @param vanillaIngot - Does this element already have an ingot in vanilla Minecraft?
     * @param metal - Is this element a metal?
     * @param rad - Is this element radioactive?
     * @param hasNative - Does this element have a native ore block?
     * @param phase - The phase of this element at room temperature.
     * @param name - The name of this element.
     */
    public Element(int id, float melt, float boil, String sym, boolean vanillaIngot, boolean metal, boolean rad, boolean hasNative, String phase, String name)
    {
        this.elementID = id;
        this.atomicNumber = id + 1;
        this.meltingPoint = melt;
        this.boilingPoint = boil;
        this.symbol = sym;
        this.metal = metal;
        this.radioactive = rad;
        this.hasNativeOre = hasNative;
        this.phase = phase;
        this.name = name;
        this.hasVanillaIngot = vanillaIngot;
    }
    
    public Element(int id, float sublime, String sym, boolean vanillaIngot, boolean metal, boolean rad, boolean hasNative, String phase, String name) {
        this(id, 0F, 0F, sym, vanillaIngot, metal, rad, hasNative, phase, name);
        this.sublimationPoint = sublime;
        this.hasVanillaIngot = vanillaIngot;
    }
    
    public Element(int id, float melt, float boil, String sym, boolean vanillaIngot, Item vanillaIngotItem, boolean metal, boolean rad, boolean hasNative, String phase, String name) {
        this(id, melt, boil, sym, vanillaIngot, metal, rad, hasNative, phase, name);
        this.vanillaIngot = vanillaIngotItem;
        this.hasVanillaIngot = true;
    }
    
}
