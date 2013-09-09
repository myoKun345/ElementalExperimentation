package elex.api;

import java.util.logging.Level;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import elex.core.LogHelper;
import elex.core.ModFluids;

/**
 * Elemental Experimentation
 * 
 * ElexAPI
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ElexAPI {
    
    /**
     * Adds an element to your element table.
     * @param element - The variable where you defined the properties of your element.
     * @param table - The element table you are registering to.
     */
    public static void addElement(Element element, ElementTable table) {
        if (element.elementID <= table.tableLength - 1) {
            table.elementList.add(element);
            addStuff(element, table);
        }
        else {
            LogHelper.log(Level.WARNING, "Element " + element.name + " was not registered because its ID exceeded the set length of table " + table.tableName + ". Please report this to the mod author.");
        }
        
        if (element.elementID == table.tableLength - 1) {
            LogHelper.log(Level.INFO, "Finished loading " + table.tableName + "'s elements.");
        }
    }
    
    /**
     * Adds an alloy and respective tool and armor materials.
     * @param alloy - The instance of @see Alloy that you are registering. 
     * @param harvestLevel - The block harvest level of a tool of this material.
     * @param durability - The durability of armor and tools of this material.
     * @param armorPieceValues - The armor values of this material.
     * @param efficiency - The efficiency of a tool of this material on blocks.
     * @param damage - The extra damage to mobs and other players of a sword of this material.
     * @param enchantability - The enchantability level of armor and tools of this material.
     */
    public static void addAlloy(Alloy alloy, int harvestLevel, int durability, int[] armorPieceValues, float efficiency, float damage, int enchantability) {
        alloy.armorMaterialStorage.put(alloy.alloyName, EnumHelper.addArmorMaterial(alloy.alloyName.toUpperCase(), durability, armorPieceValues, enchantability));
        alloy.toolMaterialStorage.put(alloy.alloyName, EnumHelper.addToolMaterial(alloy.alloyName.toUpperCase(), harvestLevel, durability, efficiency, damage, enchantability));
    }
    
    /**
     * Adds a grinder recipe with a bonus result.
     * @param input - The input ItemStack.
     * @param main - The ItemStack output that will always result.
     * @param bonus - The ItemStack output that will result only with a chance.
     * @param chance - The chance (denominator) that the result will include the bonus item.
     * @param time - The time it should take (in ticks, maybe?) for this recipe to complete.
     */
    public static void addGrinderRecipe(ItemStack input, ItemStack main, ItemStack bonus, int chance, int time) {
        GrinderRecipe.grinderRecipes.put(input.getItemName(), new GrinderRecipe(input, main, bonus, chance, time));
    }
    
    /**
     * Adds a grinder recipe without any bonus result.
     * @param input - The input ItemStack.
     * @param main - The ItemStack output.
     * @param time - The time it should take (in ticks, maybe?) for this recipe to complete.
     */
    public static void addGrinderRecipe(ItemStack input, ItemStack main, int time) {
        GrinderRecipe.grinderRecipes.put(input.getItemName(), new GrinderRecipe(input, main, null, 0, time));
    }
    
    static int metalNumber;
    static int nonmetalNumber;
    static int gasNumber;
    static int liquidNumber;
    
    private static void addStuff(Element element, ElementTable table) {
        if (element.hasVanillaIngot == false && element.metal == true && element.phase == "solid") {
            table.tableMetalDustUnlocalizedList.add("dust" + element.name);
            
            table.tableMetalDustMoleculeStringList.add(element.symbol);
            
            table.tableMetalIngotUnlocalizedList.add("ingot" + element.name);
            
            table.tableMetalNuggetUnlocalizedList.add("nugget" + element.name);
            
            table.tableMetalStorageBlockListHandler.addStorageBlocks(element);
            
            metalNumber++;
            
            if (element.hasNativeOre == true) {
                table.tableNativeOreList.add(metalNumber);
            }
            
            LogHelper.log(Level.INFO, "Element " + element.name + " (" + element.atomicNumber + ")" + " added to solid non-vanilla metals at position " + metalNumber + ".");
        }
        if (element.metal == false && element.phase == "solid") {
            nonmetalNumber++;
            
            table.tablePureNonmetalDustUnlocalizedList.add("dust" + element.name);
            table.tablePureNonmetalDustMoleculeStringList.add(element.symbol + table.tablePureNonmetalAllotropeNumbers[nonmetalNumber]);
            LogHelper.log(Level.INFO, "Element " + element.name + " (" + element.atomicNumber + ")" + " added to solid non-vanilla non-metals at position " + nonmetalNumber + ".");
        }
        if (element.phase == "gas") {
            gasNumber++;
            
            table.tablePureGasUnlocalizedList.add("fluid" + element.name);
            ModFluids.addPureGas("fluid" + element.name, gasNumber);
            LogHelper.log(Level.INFO, "Element " + element.name + " (" + element.atomicNumber + ")" + " added to gases at position " + gasNumber + ".");
        }
        if (element.phase == "liquid") {
            liquidNumber++;
            
            LogHelper.log(Level.INFO, "Element " + element.name + " (" + element.atomicNumber + ")" + " added to liquids at position " + liquidNumber + ".");
        }
    }

}
