package elex.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.lib.ElexIDs;
import elex.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * Elemental Experimentation
 * 
 * ItemResearchBinder
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemResearchBinder extends Item {
    
    public ItemResearchBinder(int par1) {
        super(par1 - Reference.SHIFTED_ID_RANGE_CORRECTION);
        setCreativeTab(ElementalExperimentation.elexTab);
        setMaxStackSize(1);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + ElexIDs.RESEARCH_BINDER_UNLOCALIZED_NAME;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        itemIcon = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.RESEARCH_BINDER_UNLOCALIZED_NAME);
    }
    
    @Override
    public void onCreated(ItemStack stack, World world, EntityPlayer player) {
        if (!stack.hasTagCompound()) {
            stack.setTagCompound(new NBTTagCompound());
            stack.stackTagCompound.setString("Owner", player.username);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean useExtraInformation) {
        if (stack.hasTagCompound()) {
            info.add("Owner: " + stack.stackTagCompound.getString("Owner"));
        }
    }

}
