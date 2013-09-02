package elex.api;

import java.util.logging.Level;

import net.minecraft.item.Item;
import elex.fluids.ModFluids;
import elex.lib.BlockIds;
import elex.lib.FluidIds;
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

    public boolean hasNativeOre;
    
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
