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
import elex.core.ElexIDs;
import elex.core.Reference;

/**
 * Elemental Experimentation
 * 
 * BlockElExOre
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockElExOre extends Block {
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    public BlockElExOre(int id) {
        super(id, Material.rock);
        setHardness(3.0F);
        setResistance(5.0F);
        setCreativeTab(ElementalExperimentation.elexTab);
        setStepSound(Block.soundStoneFootstep);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        icons = new Icon[ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length];
        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES[i]);
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
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            list.add(new ItemStack(id, 1, i));
        }
    }
    
    @Override
    public int damageDropped(int meta) {
        return meta;
    }

}
