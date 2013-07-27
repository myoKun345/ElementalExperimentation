package elex.configuration;

import java.io.File;

import elex.lib.BlockIds;
import elex.lib.ItemIds;

import net.minecraftforge.common.Configuration;

/**
 * Elemental Experimentation
 * 
 * ConfigurationHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ConfigurationHandler {
    public static void init(File file){
        Configuration config = new Configuration(file);
        
        config.load();
        
        BlockIds.ITEM_ELEX_ORE = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.ITEM_ELEX_ORE_KEY, BlockIds.ITEM_ELEX_ORE_DEFAULT).getInt();
        BlockIds.BLOCK_ELEX_ORE = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.BLOCK_ELEX_ORE_KEY, BlockIds.BLOCK_ELEX_ORE_DEFAULT).getInt();
        BlockIds.BLOCK_ELEX_ORE_2 = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.BLOCK_ELEX_ORE_2_KEY, BlockIds.BLOCK_ELEX_ORE_2_DEFAULT).getInt();
        BlockIds.CENTRIFUGE = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.CENTRIFUGE_KEY, BlockIds.CENTRIFUGE_DEFAULT).getInt();
        BlockIds.GRINDER = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.GRINDER_KEY, BlockIds.GRINDER_DEFAULT).getInt();
        
        ItemIds.ELEX_ORE = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.ELEX_ORE_KEY, ItemIds.ELEX_ORE_DEFAULT).getInt();
        ItemIds.MERCURY_INJECTOR = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.MERCURY_INJECTOR_KEY, ItemIds.MERCURY_INJECTOR_DEFAULT).getInt();
        ItemIds.ELEX_DUST = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.ELEX_DUST_KEY, ItemIds.ELEX_DUST_DEFAULT).getInt();
        ItemIds.ELEX_INGOT = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.ELEX_INGOT_KEY, ItemIds.ELEX_INGOT_DEFAULT).getInt();
        
        config.save();
    }
}
