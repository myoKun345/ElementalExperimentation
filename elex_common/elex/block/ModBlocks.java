package elex.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import elex.lib.BlockIds;
import net.minecraft.block.Block;

public class ModBlocks {
    public static Block centrifuge;
    public static Block grinder;
    public static Block blockElExOre;
    public static Block blockElExOre2;
    public static Block blockElExItemOre;
    public static Block blockElExItemOreStorage;
    public static Block blockElExMetalStorage;
    public static Block blockElExMetalStorage2;
    
    public static void init() {
        centrifuge = new BlockCentrifuge(BlockIds.CENTRIFUGE);
        grinder = new BlockGrinder(BlockIds.GRINDER);
        blockElExOre = new BlockElExOre(BlockIds.BLOCK_ELEX_ORE);
        blockElExOre2 = new BlockElExOre2(BlockIds.BLOCK_ELEX_ORE_2);
        blockElExItemOre = new BlockElExItemOre(BlockIds.ITEM_ELEX_ORE);
        blockElExItemOreStorage = new BlockElExItemOreStorage(BlockIds.BLOCK_ELEX_ITEM_ORE_STORAGE);
        blockElExMetalStorage = new BlockElExMetalStorage(BlockIds.BLOCK_ELEX_METAL_STORAGE);
        blockElExMetalStorage2 = new BlockElExMetalStorage2(BlockIds.BLOCK_ELEX_METAL_STORAGE_2);
        
        GameRegistry.registerBlock(centrifuge, "centrifugeElEx");
        GameRegistry.registerBlock(grinder, "grinderElEx");
        GameRegistry.registerBlock(blockElExOre, ItemBlockElExOre.class, "blockElExOre");
        GameRegistry.registerBlock(blockElExOre2, ItemBlockElExOre2.class, "blockElExOre2");
        GameRegistry.registerBlock(blockElExItemOreStorage, ItemBlockElExItemOreStorage.class, "blockElExItemOreStorage");
        GameRegistry.registerBlock(blockElExMetalStorage, ItemBlockElExMetalStorage.class, "blockElExMetalStorage");
        GameRegistry.registerBlock(blockElExMetalStorage2, ItemBlockElExMetalStorage2.class, "blockElExMetalStorage2");
    }
}
