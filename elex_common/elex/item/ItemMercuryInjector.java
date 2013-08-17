package elex.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.lib.ItemIds;
import elex.lib.Reference;

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
    
    @SideOnly(Side.CLIENT)
    private Icon emptyIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon halfIcon;
    
    public ItemMercuryInjector(int par1) 
    {
        super(par1 - Reference.SHIFTED_ID_RANGE_CORRECTION);
        setCreativeTab(ElementalExperimentation.elexTab);
        setMaxStackSize(1);
        setUnlocalizedName(ItemIds.MERCURY_INJECTOR_UNLOCALIZED_NAME);
        setMaxDamage(125);
    }
    
    @Override
    public boolean func_111207_a(ItemStack stack, EntityPlayer player, EntityLivingBase target)
    {
        target.attackEntityFrom(DamageSource.causePlayerDamage(player), 20.0F);
        stack.damageItem(1, target);
        
        return false;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        itemIcon = register.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + ItemIds.MERCURY_INJECTOR_UNLOCALIZED_NAME);
        emptyIcon = register.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + ItemIds.MERCURY_INJECTOR_UNLOCALIZED_NAME + "_empty");
        halfIcon = register.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + ItemIds.MERCURY_INJECTOR_UNLOCALIZED_NAME + "_half");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int dmg) {
        if (dmg >= 120) {
            return emptyIcon;
        }
        if (dmg >= 62) {
            return halfIcon;
        }
        return itemIcon;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean useExtraInformation) {
        milliBuckets = (125 - stack.getItemDamage()) * 8;
        
        if (0 == stack.getItemDamage()) {
            info.add("1000 mB " + LanguageRegistry.instance().getStringLocalization("string.millibuckets.remaining"));
        }else{
            info.add(milliBuckets + " mB " + LanguageRegistry.instance().getStringLocalization("string.millibuckets.remaining"));
        }
    }
}
