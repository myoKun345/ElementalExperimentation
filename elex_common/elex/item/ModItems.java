package elex.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import elex.lib.ItemIds;
import net.minecraft.item.Item;

public class ModItems {
    public static Item aquamarine;
    public static Item borax;
    public static Item fluorite;
    public static Item forsterite;
    public static Item petalite;
    public static Item quartzArtificial;
    public static Item spodumene;
    public static Item mercuryInjector;
    
    public static void init() {
        mercuryInjector = new ItemMercuryInjector(ItemIds.MERCURY_INJECTOR);
    }
    
    public static void addNames() {
        LanguageRegistry.addName(mercuryInjector, "Mercury Injector");
    }
}
