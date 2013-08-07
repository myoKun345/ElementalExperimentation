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
 * ItemElExNugget
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemElExNugget extends Item {
    
    private int nuggetType;
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    public ItemElExNugget(int id, int type) {
        super(id - Reference.SHIFTED_ID_RANGE_CORRECTION);
        setCreativeTab(ElementalExperimentation.elexTab);
        setHasSubtypes(true);
        this.nuggetType = type;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        if (nuggetType == 0) {
            return "item." + ItemIds.METAL_NUGGET_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage());
        }
        if (nuggetType == 1) {
            return "item." + ItemIds.ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES[stack.getItemDamage()];
        }
        if (nuggetType == 2) {
            return "item." + ItemIds.IRON_NUGGET_UNLOCALIZED_NAME;
        }
        return "something.went.wrong";
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        if (nuggetType == 0) {
            icons = new Icon[ItemIds.METAL_NUGGET_REAL_UNLOCALIZED_NAMES.size()];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":"
                        + ItemIds.METAL_NUGGET_REAL_UNLOCALIZED_NAMES.get(i));
            }
        }
        if (nuggetType == 1) {
            icons = new Icon[ItemIds.ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES.length];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":"
                        + ItemIds.ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES[i]);
            }
        }
        if (nuggetType == 2) {
            icons = new Icon[1];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":"
                        + ItemIds.IRON_NUGGET_UNLOCALIZED_NAME);
            }
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
        if (nuggetType == 0) {
            for (int i = 0; i < ItemIds.METAL_NUGGET_REAL_UNLOCALIZED_NAMES
                    .size(); i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
        if (nuggetType == 1) {
            for (int i = 0; i < ItemIds.ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES
                    .length; i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
        if (nuggetType == 2) {
            for (int i = 0; i < 1; i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
    }
    
}