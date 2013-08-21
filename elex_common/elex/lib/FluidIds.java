package elex.lib;

import java.util.LinkedList;

/**
 * Elemental Experimentation
 * 
 * FluidIds
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class FluidIds {
    /* Config Category */
    public static String CATEGORY_FLUID_IDS = "Fluid IDs";
    
    /* Default Fluid IDs */
    public static final int SALT_WATER_BLOCK_DEFAULT = 3800;
    
    /* Current Fluid IDs */
    public static int SALT_WATER_BLOCK;
    
    /* Fluid Config Keys */
    public static final String SALT_WATER_BLOCK_KEY = "SaltWaterBlockID";
    
    /* Fluid Unlocalized Names */
    public static final String SALT_WATER_BLOCK_UNLOCALIZED_NAME = "blockSaltWater";
    public static final String SALT_WATER_UNLOCALIZED_NAME = "saltwater";
    public static final LinkedList<String> ELEMENTAL_GAS_UNLOCALIZED_NAMES = new LinkedList<String>();
}
