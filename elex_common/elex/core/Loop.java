package elex.core;

import java.util.LinkedList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
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
    
    public static void loopOreDictBlockList(LinkedList<String> loopThrough, Block block) {
        for (int i = 0; i < loopThrough.size(); i++) {
            OreDictionary.registerOre(loopThrough.get(i), new ItemStack(block, 1, i));
        }
    }
    
    public static void loopOreDictItemList(LinkedList<String> loopThrough, Item item) {
        for (int i = 0; i < loopThrough.size(); i++) {
            OreDictionary.registerOre(loopThrough.get(i), new ItemStack(item, 1, i));
        }
    }
    
    public static void loopFurnaceBlock(String[] loopThrough, int inputID, Block output, float XP) {
        for (int i = 0; i < loopThrough.length; i++) {
            FurnaceRecipes.smelting().addSmelting(inputID, i, new ItemStack(output, 1, i), XP);
        }
    }
    
    public static void loopFurnaceItem(String[] loopThrough, int inputID, Item output, float XP) {
        for (int i = 0; i < loopThrough.length; i++) {
            FurnaceRecipes.smelting().addSmelting(inputID, i, new ItemStack(output, 1, i), XP);
        }
    }
    
    public static void loopFurnaceBlockList(LinkedList<String> loopThrough, int inputID, Block output, float XP) {
        for (int i = 0; i < loopThrough.size(); i++) {
            FurnaceRecipes.smelting().addSmelting(inputID, i, new ItemStack(output, 1, i), XP);
        }
    }
    
    public static void loopFurnaceItemList(LinkedList<String> loopThrough, int inputID, Item output, float XP) {
        for (int i = 0; i < loopThrough.size(); i++) {
            FurnaceRecipes.smelting().addSmelting(inputID, i, new ItemStack(output, 1, i), XP);
        }
    }
    
    public static void loopFurnaceBlockShifted(String[] loopThrough, int inputID, Block output, float XP, int shiftMetaBy) {
        for (int i = 0; i < loopThrough.length; i++) {
            FurnaceRecipes.smelting().addSmelting(inputID, i, new ItemStack(output, 1, i + shiftMetaBy), XP);
        }
    }
    
    public static void loopFurnaceItemShifted(String[] loopThrough, int inputID, Item output, float XP, int shiftMetaBy) {
        for (int i = 0; i < loopThrough.length; i++) {
            FurnaceRecipes.smelting().addSmelting(inputID, i, new ItemStack(output, 1, i + shiftMetaBy), XP);
        }
    }
    
    public static void loopFurnaceBlockListShifted(LinkedList<String> loopThrough, int inputID, Block output, float XP, int shiftMetaBy) {
        for (int i = 0; i < loopThrough.size(); i++) {
            FurnaceRecipes.smelting().addSmelting(inputID, i, new ItemStack(output, 1, i + shiftMetaBy), XP);
        }
    }
    
    public static void loopFurnaceItemListShifted(LinkedList<String> loopThrough, int inputID, Item output, float XP, int shiftMetaBy) {
        for (int i = 0; i < loopThrough.size(); i++) {
            FurnaceRecipes.smelting().addSmelting(inputID, i, new ItemStack(output, 1, i + shiftMetaBy), XP);
        }
    }

}
