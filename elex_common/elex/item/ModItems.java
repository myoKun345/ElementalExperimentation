package elex.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import elex.lib.ItemIds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
    public static Item itemElExOre;
    public static Item mercuryInjector;
    public static Item itemElExCompoundDust;
    public static Item itemElExMetalDust;
    public static Item itemElExIngot;
    
    public static void init() {
        itemElExOre = new ItemElExOre(ItemIds.ELEX_ORE);
        mercuryInjector = new ItemMercuryInjector(ItemIds.MERCURY_INJECTOR);
        itemElExCompoundDust = new ItemElExDust(ItemIds.ELEX_COMPOUND_DUST, 0);
        itemElExMetalDust = new ItemElExDust(ItemIds.ELEX_METAL_DUST, 1);
        itemElExIngot = new ItemElExIngot(ItemIds.ELEX_INGOT);
    }
}
