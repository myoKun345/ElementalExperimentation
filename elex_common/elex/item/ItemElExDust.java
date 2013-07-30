package elex.item;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.element.Element;
import elex.lib.ItemIds;
import elex.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

/**
 * Elemental Experimentation
 * 
 * ItemElExDust
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemElExDust extends ItemElemental {
    
    private int dustType;
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    public ItemElExDust(int par1, int par2) {
        super(par1 - Reference.SHIFTED_ID_RANGE_CORRECTION);
        setCreativeTab(ElementalExperimentation.elexTab);
        setHasSubtypes(true);
        dustType = par2;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        if (dustType == 0) {
            return "item." + ItemIds.ELEX_COMPOUND_DUST_UNLOCALIZED_NAME + "." + stack.getItemDamage();
        }
        if (dustType == 1) {
            return "item." + ItemIds.ELEX_METAL_DUST_UNLOCALIZED_NAME + "." + stack.getItemDamage();
        }
        if (dustType == 2) {
            return "item." + ItemIds.ELEX_PURE_NONMETAL_DUST_UNLOCALIZED_NAME + "." + stack.getItemDamage();
        }
        if (dustType == 3) {
            return "item." + ItemIds.VANILLA_DUST_UNLOCALIZED_NAME + "." + stack.getItemDamage();
        }
        return "something.went.wrong";
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        if (dustType == 0) {
            icons = new Icon[ItemIds.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES.length];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ItemIds.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES[i]);
            }
        }
        if (dustType == 1) {
            icons = new Icon[ItemIds.ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES.size()];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ItemIds.ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES.get(i));
            }
        }
        if (dustType == 2) {
            icons = new Icon[ItemIds.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.size()];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ItemIds.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.get(i));
            }
        }
        if (dustType == 3) {
            icons = new Icon[ItemIds.VANILLA_DUST_REAL_UNLOCALIZED_NAMES.length];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ItemIds.VANILLA_DUST_REAL_UNLOCALIZED_NAMES[i]);
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
        if (dustType == 0) {
            for (int i = 0; i < ItemIds.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES.length; i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
        if (dustType == 1) {
            for (int i = 0; i < ItemIds.ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES.size(); i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
        if (dustType == 2) {
            for (int i = 0; i < ItemIds.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.size(); i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
        if (dustType == 3) {
            for (int i = 0; i < ItemIds.VANILLA_DUST_REAL_UNLOCALIZED_NAMES.length; i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean useExtraInformation) {
        if (dustType == 0) {
            info.add(ItemIds.COMPOUND_DUST_MOLECULE_STRINGS[stack.getItemDamage()]);
        }
        if (dustType == 1) {
            info.add(ItemIds.METAL_DUST_MOLECULE_STRINGS.get(stack.getItemDamage()));
        }
        if (dustType == 2) {
            info.add(ItemIds.PURE_NONMETAL_DUST_MOLECULE_STRINGS.get(stack.getItemDamage()));
        }
        if (dustType == 3) {
            info.add(ItemIds.VANILLA_DUST_MOLECULE_STRINGS[stack.getItemDamage()]);
        }
    }
    
}
