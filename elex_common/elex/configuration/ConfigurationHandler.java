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
        
        int test = config.get("Used for Testing", "testValue", 37).getInt();
        String test2 = config.get("Used for Testing", "someTextHere", "apples").getString();
        
        BlockIds.ITEM_ELEX_ORE = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.ITEM_ELEX_ORE_KEY, BlockIds.ITEM_ELEX_ORE_DEFAULT).getInt();
        BlockIds.CENTRIFUGE = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.CENTRIFUGE_KEY, BlockIds.CENTRIFUGE_DEFAULT).getInt();
        
        ItemIds.ELEX_ORE = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.ELEX_ORE_KEY, ItemIds.ELEX_ORE_DEFAULT).getInt();
        ItemIds.MERCURY_INJECTOR = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.MERCURY_INJECTOR_KEY, ItemIds.MERCURY_INJECTOR_DEFAULT).getInt();
        ItemIds.ELEX_DUST = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.ELEX_DUST_KEY, ItemIds.ELEX_DUST_DEFAULT).getInt();
        
        config.save();
        
        System.out.println("Karen bought " + test + " " + test2 + ".");
    }
}
