package elex.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import elex.lib.BlockIds;
import net.minecraft.block.Block;

public class ModBlocks {
    public static Block centrifuge;
    public static Block blockElExOre;
    public static Block blockElExOre2;
    public static Block blockElExItemOre;
    
    public static void init() {
        centrifuge = new BlockCentrifuge(BlockIds.CENTRIFUGE);
        blockElExOre = new BlockElExOre(BlockIds.BLOCK_ELEX_ORE);
        blockElExOre2 = new BlockElExOre2(BlockIds.BLOCK_ELEX_ORE_2);
        blockElExItemOre = new BlockElExItemOre(BlockIds.ITEM_ELEX_ORE);
        
        GameRegistry.registerBlock(centrifuge, "centrifugeElEx");
        GameRegistry.registerBlock(blockElExOre, ItemBlockElExOre.class, "blockElExOre");
        GameRegistry.registerBlock(blockElExOre2, ItemBlockElExOre2.class, "blockElExOre2");
    }
}
