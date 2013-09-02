package elex.api;

import java.util.LinkedList;

/**
 * Elemental Experimentation
 * 
 * ElementTable
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ElementTable {
    
    public static LinkedList<Element> elementList = new LinkedList<Element>();
    
    public static String tableName;
    public static String tableMod;
    public static int tableLength;
    public static LinkedList tableMetalDustUnlocalizedList;
    public static LinkedList tableMetalDustMoleculeStringList;
    public static LinkedList tableMetalIngotUnlocalizedList;
    public static LinkedList tableMetalNuggetUnlocalizedList;
    public static String tableMetalStorageBlockListName;
    public static int tableMetalStorageBlockListNumber;
    public static LinkedList tableNativeOreList;
    public static int[] tablePureNonmetalAllotropeNumbers;
    public static LinkedList tablePureNonmetalDustUnlocalizedList;
    public static LinkedList tablePureNonmetalDustMoleculeStringList;
    public static LinkedList tablePureGasUnlocalizedList;
    
    public ElementTable(String name, String modid, int length, 
            LinkedList metalDustUnlocalizedList, LinkedList metalDustMoleculeStringList, 
            LinkedList metalIngotUnlocalizedList, LinkedList metalNuggetUnlocalizedList, String metalStorageBlockListName, 
            int metalStorageBlockListNumber, LinkedList nativeOreList, int[] pureNonmetalAllotropeNumbers, 
            LinkedList pureNonmetalDustUnlocalizedList, LinkedList pureNonmetalDustMoleculeStringList, LinkedList pureGasUnlocalizedList) {
        this.tableName = name;
        this.tableMod = modid;
        this.tableLength = length;
        this.tableMetalDustUnlocalizedList = metalDustUnlocalizedList;
        this.tableMetalDustMoleculeStringList = metalDustMoleculeStringList;
        this.tableMetalIngotUnlocalizedList = metalIngotUnlocalizedList;
        this.tableMetalNuggetUnlocalizedList = metalNuggetUnlocalizedList;
        this.tableMetalStorageBlockListName = metalStorageBlockListName;
        this.tableMetalStorageBlockListNumber = metalStorageBlockListNumber;
        this.tableNativeOreList = nativeOreList;
        this.tablePureNonmetalAllotropeNumbers = pureNonmetalAllotropeNumbers;
        this.tablePureNonmetalDustUnlocalizedList = pureNonmetalDustUnlocalizedList;
        this.tablePureNonmetalDustMoleculeStringList = pureNonmetalDustMoleculeStringList;
        this.tablePureGasUnlocalizedList = pureGasUnlocalizedList;
    }

}
