package elex.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
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
 * ItemElExOre
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemElExOre extends Item {
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    public ItemElExOre(int id) {
        super(id - Reference.SHIFTED_ID_RANGE_CORRECTION);
        setCreativeTab(ElementalExperimentation.elexTab);
        setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES[stack.getItemDamage()];
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        icons = new Icon[ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length];
        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES[i]);
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
        for (int i = 0; i < ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            ItemStack stack = new ItemStack(id, 1, i);
            list.add(stack);
        }
    }

}
