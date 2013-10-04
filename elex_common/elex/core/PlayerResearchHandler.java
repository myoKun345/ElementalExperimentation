package elex.core;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

/**
 * Elemental Experimentation
 *
 * PlayerResearchHandler
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class PlayerResearchHandler implements IExtendedEntityProperties {
	
	public boolean dirty = true;
	
	public static PlayerResearchHandler forPlayer(Entity entity) {
		return (PlayerResearchHandler)entity.getExtendedProperties(Reference.researchId);
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		
	}
	
	@Override
	public void loadNBTData(NBTTagCompound compound) {
		
	}
	
	@Override
	public void init(Entity entity, World world) {
		
	}
	
	
	
}
