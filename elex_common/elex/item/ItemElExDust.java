package elex.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.lib.ElexIDs;
import elex.lib.Reference;

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
            return "item." + ElexIDs.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES[stack.getItemDamage()];
        }
        if (dustType == 1) {
            return "item." + ElexIDs.METAL_DUST_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage());
        }
        if (dustType == 2) {
            return "item." + ElexIDs.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.get(stack.getItemDamage());
        }
        if (dustType == 3) {
            return "item." + ElexIDs.VANILLA_DUST_REAL_UNLOCALIZED_NAMES[stack.getItemDamage()];
        }
        if (dustType == 4) {
            return "item." + ElexIDs.ALLOY_DUST_REAL_UNLOCALIZED_NAMES[stack.getItemDamage()];
        }
        return "something.went.wrong";
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        if (dustType == 0) {
            icons = new Icon[ElexIDs.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES.length];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES[i]);
            }
        }
        if (dustType == 1) {
            icons = new Icon[ElexIDs.METAL_DUST_REAL_UNLOCALIZED_NAMES.size()];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.METAL_DUST_REAL_UNLOCALIZED_NAMES.get(i));
            }
        }
        if (dustType == 2) {
            icons = new Icon[ElexIDs.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.size()];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.get(i));
            }
        }
        if (dustType == 3) {
            icons = new Icon[ElexIDs.VANILLA_DUST_REAL_UNLOCALIZED_NAMES.length];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.VANILLA_DUST_REAL_UNLOCALIZED_NAMES[i]);
            }
        }
        if (dustType == 4) {
            icons = new Icon[ElexIDs.ALLOY_DUST_REAL_UNLOCALIZED_NAMES.length];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.ALLOY_DUST_REAL_UNLOCALIZED_NAMES[i]);
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
            for (int i = 0; i < ElexIDs.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES.length; i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
        if (dustType == 1) {
            for (int i = 0; i < ElexIDs.METAL_DUST_REAL_UNLOCALIZED_NAMES.size(); i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
        if (dustType == 2) {
            for (int i = 0; i < ElexIDs.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.size(); i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
        if (dustType == 3) {
            for (int i = 0; i < ElexIDs.VANILLA_DUST_REAL_UNLOCALIZED_NAMES.length; i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
        if (dustType == 4) {
            for (int i = 0; i < ElexIDs.ALLOY_DUST_REAL_UNLOCALIZED_NAMES.length; i++) {
                ItemStack stack = new ItemStack(id, 1, i);
                list.add(stack);
            }
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean useExtraInformation) {
        if (dustType == 0) {
            info.add(ElexIDs.COMPOUND_DUST_MOLECULE_STRINGS[stack.getItemDamage()]);
        }
        if (dustType == 1) {
            info.add(ElexIDs.METAL_DUST_MOLECULE_STRINGS.get(stack.getItemDamage()));
        }
        if (dustType == 2) {
            info.add(ElexIDs.PURE_NONMETAL_DUST_MOLECULE_STRINGS.get(stack.getItemDamage()));
        }
        if (dustType == 3) {
            info.add(ElexIDs.VANILLA_DUST_MOLECULE_STRINGS[stack.getItemDamage()]);
        }
        if (dustType == 4) {
            info.add(ElexIDs.ALLOY_DUST_MOLECULE_STRINGS[stack.getItemDamage()]);
        }
    }
    
}
