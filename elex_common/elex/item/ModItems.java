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
}
