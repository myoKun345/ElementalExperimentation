package elex.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.lib.ItemIds;
import elex.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

/**
 * Elemental Experimentation
 * 
 * ItemElExIngot
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemElExIngot extends Item {
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    public ItemElExIngot(int id) {
        super(id - Reference.SHIFTED_ID_RANGE_CORRECTION);
        setCreativeTab(ElementalExperimentation.elexTab);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + ItemIds.ELEX_INGOT_UNLOCALIZED_NAME + stack.getItemDamage();
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        icons = new Icon[ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.length];
        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int dmg) {
        return icons[dmg];
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(int id, CreativeTabs tab, List list) {
        for (int i = 0; i < ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.length; i++) {
            ItemStack stack = new ItemStack(id, 1, i);
            list.add(stack);
        }
    }
    
}