package elex.api;

import java.util.LinkedList;
import java.util.logging.Level;

import elex.fluids.ModFluids;
import elex.lib.BlockIds;
import elex.lib.FluidIds;
import elex.lib.ItemIds;
import elex.log.LogHelper;

/**
 * Elemental Experimentation
 * 
 * ElexAPI
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ElexAPI {
    
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
            
            if (BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.size() < 16) {
                BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
            }else
            if (BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.size() < 16) {
                BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
            }else
            if (BlockIds.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.size() < 16) {
                BlockIds.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
            }else
            if (BlockIds.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.size() < 16) {
                BlockIds.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
            }else
            if (BlockIds.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.size() < 16) {
                BlockIds.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
            }else
            if (BlockIds.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.size() < 16) {
                BlockIds.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES.add("block" + element.name);
            }
            
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
