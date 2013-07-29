package elex.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.lib.BlockIds;
import elex.lib.Reference;

/**
 * Elemental Experimentation
 * 
 * BlockElExMetalStorage2
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockElExMetalStorage2 extends Block {
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    public BlockElExMetalStorage2(int par1) {
        super(par1, Material.iron);
        setHardness(5.0F);
        setResistance(10.0F);
        setCreativeTab(ElementalExperimentation.elexTab);
        setStepSound(Block.soundMetalFootstep);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        icons = new Icon[BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.length];
        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Reference.MOD_ID + ":" + BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return icons[meta];
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int id, CreativeTabs tab, List list) {
        for (int i = 0; i < BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            list.add(new ItemStack(id, 1, i));
        }
    }
    
    @Override
    public int damageDropped(int meta) {
        return meta;
    }
    
}