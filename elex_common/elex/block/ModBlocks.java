package elex.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import elex.lib.BlockIds;
import net.minecraft.block.Block;

public class ModBlocks {
    public static Block centrifuge;
    
    public static void init() {
        centrifuge = new BlockCentrifuge(BlockIds.CENTRIFUGE);
        
        GameRegistry.registerBlock(centrifuge, "centrifugeElEx");
    }
    
    public static void addNames() {
        LanguageRegistry.addName(centrifuge, "Centrifuge");
    }
}
