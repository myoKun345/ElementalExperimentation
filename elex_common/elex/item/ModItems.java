package elex.item;

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
    
    public static void init() {
        aquamarine = new ItemElExOre(ItemIds.AQUAMARINE);
        borax = new ItemElExOre(ItemIds.BORAX);
        fluorite = new ItemElExOre(ItemIds.FLUORITE);
        forsterite = new ItemElExOre(ItemIds.FORSTERITE);
        petalite = new ItemElExOre(ItemIds.PETALITE);
        quartzArtificial = new ItemElExOre(ItemIds.ARTIFICIAL_QUARTZ);
        spodumene = new ItemElExOre(ItemIds.SPODUMENE);
    }
}
