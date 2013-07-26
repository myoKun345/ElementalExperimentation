package elex.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import elex.lib.ItemIds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
    public static Item itemElExOre;
    public static Item mercuryInjector;
    public static Item itemElExDust;
    
    public static void init() {
        itemElExOre = new ItemElExOre(ItemIds.ELEX_ORE);
        mercuryInjector = new ItemMercuryInjector(ItemIds.MERCURY_INJECTOR);
        itemElExDust = new ItemElExDust(ItemIds.ELEX_DUST);
    }
    
    public static void addNames() {
        LanguageRegistry.addName(mercuryInjector, ItemIds.MERCURY_INJECTOR_ENGLISH_NAME);
        
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            LanguageRegistry.addName(new ItemStack(itemElExOre, 1, i), ItemIds.ELEX_ORE_ENGLISH_NAMES[i]);
        }
        
        for (int i = 0; i < ItemIds.ELEX_DUST_REAL_UNLOCALIZED_NAMES.length; i++) {
            LanguageRegistry.addName(new ItemStack(itemElExDust, 1, i), ItemIds.ELEX_DUST_ENGLISH_NAMES[i]);
        }
    }
}
