package elex.creativetab;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.block.ModBlocks;
import elex.item.ModItems;
import elex.lib.BlockIds;
import elex.lib.ItemIds;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Elemental Experimentation
 * 
 * CreativeTabElEx
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class CreativeTabElEx extends CreativeTabs {
    
    public CreativeTabElEx(int par1, String par2Str) {
        super(par1, par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return ModBlocks.centrifuge.blockID;
    }
}
