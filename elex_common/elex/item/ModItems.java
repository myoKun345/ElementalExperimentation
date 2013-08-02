package elex.item;

import net.minecraft.item.Item;
import elex.lib.ItemIds;

public class ModItems {
    public static Item itemElExOre;
    public static Item mercuryInjector;
    public static Item itemElExCompoundDust;
    public static Item itemElExMetalDust;
    public static Item itemElExIngot;
    public static Item itemElExPureNonmetalDust;
    public static Item itemVanillaDust;
    public static Item itemAlloyDust;
    public static Item itemAlloyIngot;
    
    public static void init() {
        itemElExOre = new ItemElExOre(ItemIds.ELEX_ORE);
        mercuryInjector = new ItemMercuryInjector(ItemIds.MERCURY_INJECTOR);
        itemElExCompoundDust = new ItemElExDust(ItemIds.ELEX_COMPOUND_DUST, 0);
        itemElExMetalDust = new ItemElExDust(ItemIds.ELEX_METAL_DUST, 1);
        itemElExIngot = new ItemElExIngot(ItemIds.ELEX_INGOT, 0);
        itemElExPureNonmetalDust = new ItemElExDust(ItemIds.ELEX_PURE_NONMETAL_DUST, 2);
        itemVanillaDust = new ItemElExDust(ItemIds.VANILLA_DUST, 3);
        itemAlloyDust = new ItemElExDust(ItemIds.ALLOY_DUST, 4);
        itemAlloyIngot = new ItemElExIngot(ItemIds.ALLOY_INGOT, 1);
    }
}
