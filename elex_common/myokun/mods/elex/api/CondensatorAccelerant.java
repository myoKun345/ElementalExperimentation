package myokun.mods.elex.api;

import java.util.HashMap;

import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 *
 * CondensatorAccelerant
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class CondensatorAccelerant {
	
	public static HashMap<String, CondensatorAccelerant> condensatorAccelerants = new HashMap<String, CondensatorAccelerant>();
	
	public ItemStack accelerantItem;
	public float multiplier;
	
	public CondensatorAccelerant(ItemStack accelerant, int acceleRate) {
		this.accelerantItem = accelerant;
		this.multiplier = acceleRate;
	}
	
}
