package elex.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import elex.lib.ItemIds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
    public static Item itemElExOre;
    public static Item mercuryInjector;
    
    public static void init() {
        itemElExOre = new ItemElExOre(ItemIds.ELEX_ORE);
        mercuryInjector = new ItemMercuryInjector(ItemIds.MERCURY_INJECTOR);
    }
    
    public static void addNames() {
        LanguageRegistry.addName(mercuryInjector, "Mercury Injector");
        
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            LanguageRegistry.addName(new ItemStack(itemElExOre, 1, i), ItemIds.ELEX_ORE_ENGLISH_NAMES[i]);
        }
    }
}
