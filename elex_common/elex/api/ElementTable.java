package elex.api;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Elemental Experimentation
 * 
 * ElementTable
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ElementTable {
    
    public static List<Element> elementList = new LinkedList<Element>();
    public static LinkedHashMap<String, ElementTable> tables = new LinkedHashMap<String, ElementTable>();
    
    public static String tableName;
    public static String tableMod;
    public static int tableLength;
    public static List tableMetalDustUnlocalizedList;
    public static List tableMetalDustMoleculeStringList;
    public static List tableMetalIngotUnlocalizedList;
    public static List tableMetalNuggetUnlocalizedList;
    public static IStorageBlockHandler tableMetalStorageBlockListHandler;
    public static List tableNativeOreList;
    public static int[] tablePureNonmetalAllotropeNumbers;
    public static List tablePureNonmetalDustUnlocalizedList;
    public static List tablePureNonmetalDustMoleculeStringList;
    public static List tablePureGasUnlocalizedList;
    
    /**
     * And the longest list of parameters award goes to...
     * Extend this class and fill in all of the parameters in the super call. You will still need to make a variable of your new table,
     * make each of these lists, a storage block list handler (since block metadata only goes to 16) and finally block item and fluid
     * classes to actually use the lists.
     * @param name - The name of the table you are registering.
     * @param modid - The mod ID of the table you are registering.
     * @param length - The length of the table. Any element with an id past this number will be disregarded. (Probably.)
     * @param metalDustUnlocalizedList - A List to store the unlocalized names of your metal dusts.
     * @param metalDustMoleculeStringList - A List to store the molecule strings of your metal dusts.
     * @param metalIngotUnlocalizedList - A List to store the unlocalized names of your metal ingots.
     * @param metalNuggetUnlocalizedList - A List to store the unlocalized names of your metal nuggets.
     * @param metalStorageBlockListHandler - A class that implements IStorageBlockHandler and handles your metal storage blocks. See VanillaStorageBlockHandler for an example.
     * @param nativeOreList - A List to store which elements have native ore blocks that will generate in world.
     * @param pureNonmetalAllotropeNumbers - A simple integer array to store what allotrope number is shown in the tooltip for non-metal dusts.
     * @param pureNonmetalDustUnlocalizedList - A List to store the unlocalized names of your non-metal dusts.
     * @param pureNonmetalDustMoleculeStringList - A List to store the molecule strings of your non-metal dusts.
     * @param pureGasUnlocalizedList - A List to store the unlocalized names of your gases.
     */
    public ElementTable(String name, String modid, int length, 
            List metalDustUnlocalizedList, List metalDustMoleculeStringList, 
            List metalIngotUnlocalizedList, List metalNuggetUnlocalizedList, IStorageBlockHandler metalStorageBlockListHandler, 
            List nativeOreList, int[] pureNonmetalAllotropeNumbers, List pureNonmetalDustUnlocalizedList, 
            List pureNonmetalDustMoleculeStringList, List pureGasUnlocalizedList) {
        this.tableName = name;
        this.tableMod = modid;
        this.tableLength = length;
        this.tableMetalDustUnlocalizedList = metalDustUnlocalizedList;
        this.tableMetalDustMoleculeStringList = metalDustMoleculeStringList;
        this.tableMetalIngotUnlocalizedList = metalIngotUnlocalizedList;
        this.tableMetalNuggetUnlocalizedList = metalNuggetUnlocalizedList;
        this.tableMetalStorageBlockListHandler = metalStorageBlockListHandler;
        this.tableNativeOreList = nativeOreList;
        this.tablePureNonmetalAllotropeNumbers = pureNonmetalAllotropeNumbers;
        this.tablePureNonmetalDustUnlocalizedList = pureNonmetalDustUnlocalizedList;
        this.tablePureNonmetalDustMoleculeStringList = pureNonmetalDustMoleculeStringList;
        this.tablePureGasUnlocalizedList = pureGasUnlocalizedList;
        tables.put(name, this);
    }

}
