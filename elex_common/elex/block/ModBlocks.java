package elex.block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import elex.lib.BlockIds;

public class ModBlocks {
    public static Block centrifuge;
    public static Block grinder;
    public static Block blockElExOre;
    public static Block blockElExOre2;
    public static Block blockElExItemOre;
    public static Block blockElExItemOre2;
    public static Block blockElExItemOre3;
    public static Block blockElExItemOreStorage;
    public static Block blockElExMetalStorage;
    public static Block blockElExMetalStorage2;
    public static Block blockElExMetalStorage3;
    public static Block blockElExMetalStorage4;
    public static Block blockElExMetalStorage5;
    public static Block blockMachineCase;
    
    public static void init() {
        centrifuge = new BlockCentrifuge(BlockIds.CENTRIFUGE);
        grinder = new BlockGrinder(BlockIds.GRINDER);
        blockElExOre = new BlockElExOre(BlockIds.BLOCK_ELEX_ORE);
        blockElExOre2 = new BlockElExOre2(BlockIds.BLOCK_ELEX_ORE_2);
        blockElExItemOre = new BlockElExItemOre(BlockIds.ITEM_ELEX_ORE, 0);
        blockElExItemOre2 = new BlockElExItemOre(BlockIds.ITEM_ELEX_ORE_2, 1);
        blockElExItemOre3 = new BlockElExItemOre(BlockIds.ITEM_ELEX_ORE_3, 2);
        blockElExItemOreStorage = new BlockElExItemOreStorage(BlockIds.BLOCK_ELEX_ITEM_ORE_STORAGE);
        blockElExMetalStorage = new BlockElExMetalStorage(BlockIds.BLOCK_ELEX_METAL_STORAGE, 0);
        blockElExMetalStorage2 = new BlockElExMetalStorage(BlockIds.BLOCK_ELEX_METAL_STORAGE_2, 1);
        blockElExMetalStorage3 = new BlockElExMetalStorage(BlockIds.BLOCK_ELEX_METAL_STORAGE_3, 2);
        blockElExMetalStorage4 = new BlockElExMetalStorage(BlockIds.BLOCK_ELEX_METAL_STORAGE_4, 3);
        blockElExMetalStorage5 = new BlockElExMetalStorage(BlockIds.BLOCK_ELEX_METAL_STORAGE_5, 4);
        blockMachineCase = new BlockMachineCase(BlockIds.BLOCK_MACHINE_CASE);
        
        GameRegistry.registerBlock(centrifuge, "centrifugeElEx");
        GameRegistry.registerBlock(grinder, "grinderElEx");
        GameRegistry.registerBlock(blockElExItemOre, ItemBlockElExItemOre.class, "blockElExItemOre");
        GameRegistry.registerBlock(blockElExItemOre2, ItemBlockElExItemOre2.class, "blockElExItemOre2");
        GameRegistry.registerBlock(blockElExItemOre3, ItemBlockElExItemOre3.class, "blockElExItemOre3");
        GameRegistry.registerBlock(blockElExOre, ItemBlockElExOre.class, "blockElExOre");
        GameRegistry.registerBlock(blockElExOre2, ItemBlockElExOre2.class, "blockElExOre2");
        GameRegistry.registerBlock(blockElExItemOreStorage, ItemBlockElExItemOreStorage.class, "blockElExItemOreStorage");
        GameRegistry.registerBlock(blockElExMetalStorage, ItemBlockElExMetalStorage.class, "blockElExMetalStorage");
        GameRegistry.registerBlock(blockElExMetalStorage2, ItemBlockElExMetalStorage2.class, "blockElExMetalStorage2");
        GameRegistry.registerBlock(blockElExMetalStorage3, ItemBlockElExMetalStorage3.class, "blockElExMetalStorage3");
        GameRegistry.registerBlock(blockElExMetalStorage4, ItemBlockElExMetalStorage4.class, "blockElExMetalStorage4");
        GameRegistry.registerBlock(blockElExMetalStorage5, ItemBlockElExMetalStorage5.class, "blockElExMetalStorage5");
        GameRegistry.registerBlock(blockMachineCase, ItemBlockMachineCase.class, "blockMachineCase");
    }
}
