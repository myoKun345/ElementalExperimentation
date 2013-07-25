package elex.item;

import java.io.File;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.lib.ItemIds;
import elex.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

/**
 * Elemental Experimentation
 * 
 * ItemMercuryInjector
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemMercuryInjector extends Item {

    private int milliBuckets;
    
    public ItemMercuryInjector(int par1) 
    {
        super(par1);
        setCreativeTab(CreativeTabs.tabCombat);
        setMaxStackSize(1);
        setUnlocalizedName(ItemIds.MERCURY_INJECTOR_UNLOCALIZED_NAME);
        setMaxDamage(125);
    }
    
    @Override
    public boolean func_111207_a(ItemStack stack, EntityPlayer player, EntityLivingBase target)
    {
        target.attackEntityFrom(DamageSource.generic, 100.0F);
        stack.damageItem(1, target);
        
        return false;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        itemIcon = register.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + ItemIds.MERCURY_INJECTOR_UNLOCALIZED_NAME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean useExtraInformation) {
        milliBuckets = (125 - stack.getItemDamage()) * 8;
        int zero = 0;
        
        if (0 == stack.getItemDamage()) {
            info.add("1000 mB left");
        }else{
            info.add(milliBuckets + " mB left");
        }
    }
}
