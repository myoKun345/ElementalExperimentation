package elex.core;

import java.util.LinkedList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Elemental Experimentation
 * 
 * Loop
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class Loop {
    
    public static void loopOreDictBlock(String[] loopThrough, Block block) {
        for (int i = 0; i < loopThrough.length; i++) {
            OreDictionary.registerOre(loopThrough[i], new ItemStack(block, 1, i));
        }
    }
    
    public static void loopOreDictItem(String[] loopThrough, Item item) {
        for (int i = 0; i < loopThrough.length; i++) {
            OreDictionary.registerOre(loopThrough[i], new ItemStack(item, 1, i));
        }
    }
    
    public static void loopOreDictBlockList(LinkedList<String> blockElexMetalStorageRealUnlocalizedNames, Block block) {
        for (int i = 0; i < blockElexMetalStorageRealUnlocalizedNames.size(); i++) {
            OreDictionary.registerOre(blockElexMetalStorageRealUnlocalizedNames.get(i), new ItemStack(block, 1, i));
        }
    }
    
    public static void loopOreDictItemList(LinkedList<String> metalNuggetRealUnlocalizedNames, Item item) {
        for (int i = 0; i < metalNuggetRealUnlocalizedNames.size(); i++) {
            OreDictionary.registerOre(metalNuggetRealUnlocalizedNames.get(i), new ItemStack(item, 1, i));
        }
    }

}
