package elex.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.core.ElexIDs;
import elex.core.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

/**
 * Elemental Experimentation
 * 
 * ItemSaltedMeat
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemSaltedMeat extends ItemFood {
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    private int secret;
    
    public ItemSaltedMeat(int id, ItemFood base, int par3) {
        super(id - Reference.SHIFTED_ID_RANGE_CORRECTION, base.getHealAmount() + 1, base.getSaturationModifier() - 0.1F, true);
        this.secret = par3;
        setCreativeTab(ElementalExperimentation.elexTab);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + ElexIDs.SALTED_MEAT_UNLOCALIZED_NAMES[secret];
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        icons = new Icon[ElexIDs.SALTED_MEAT_UNLOCALIZED_NAMES.length];
        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.SALTED_MEAT_UNLOCALIZED_NAMES[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(ItemStack stack, int pass) {
        return icons[secret];
    }

}
