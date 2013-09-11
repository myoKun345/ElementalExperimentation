package elex.block;

import java.util.List;
import java.util.Random;
import java.util.logging.Level;

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
import elex.core.LogHelper;
import elex.core.Reference;

/**
 * Elemental Experimentation
 * 
 * BlockElExItemOre
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockElExItemOre extends Block {
    
    private int blockListNumber;
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    public BlockElExItemOre(int id, int type) {
        super(id, Material.rock);
        this.blockListNumber = type;
        setHardness(3.0F);
        setResistance(5.0F);
        setCreativeTab(ElementalExperimentation.elexTab);
        setStepSound(Block.soundStoneFootstep);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        if (blockListNumber == 0) {
            icons = new Icon[ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":"
                        + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES[i]);
            }
        }
        if (blockListNumber == 1) {
            icons = new Icon[ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":"
                        + ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES[i]);
            }
        }
        if (blockListNumber == 2) {
            icons = new Icon[ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length];
            for (int i = 0; i < icons.length; i++) {
                icons[i] = register.registerIcon(Reference.MOD_ID + ":"
                        + ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES[i]);
            }
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        int fixedMeta;
        
        if (blockListNumber == 0) {
            fixedMeta = meta;
            
            return icons[fixedMeta];
        }
        if (blockListNumber == 1) {
            fixedMeta = meta - 16;
            
            if (fixedMeta < 0) {
                fixedMeta = fixedMeta + 16;
            }
            
            return icons[fixedMeta];
        }
        if (blockListNumber == 2) {
            fixedMeta = meta - 32;
            
            if (fixedMeta < 0) {
                fixedMeta = fixedMeta + 32;
            }
            
            return icons[fixedMeta];
        }
        else {
            LogHelper.log(Level.SEVERE, "Block list number is out of range. Notify Myo-kun immediately!");
            return icons[0];
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int id, CreativeTabs tab, List list) {
        if (blockListNumber == 0) {
            for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
                list.add(new ItemStack(id, 1, i));
            }
        }
        if (blockListNumber == 1) {
            for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
                list.add(new ItemStack(id, 1, i));
            }
        }
        if (blockListNumber == 2) {
            for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length; i++) {
                list.add(new ItemStack(id, 1, i));
            }
        }
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return ElexIDs.ELEX_ORE;
    }
    
    @Override
    public int quantityDropped(int meta, int fortune, Random random)
    {
        return quantityDroppedWithBonus(fortune, random);
    }
    
    @Override
    public int quantityDroppedWithBonus(int bonus, Random par2Random) {
        int output;
        
        if (bonus != 0) {
            int rnd = par2Random.nextInt(bonus * 3) + 1;
            
            if (rnd <= 0) {
                LogHelper.log(Level.INFO, rnd + ", so 1");
                
                output = 1;
            }
            if (rnd > 9) {
                LogHelper.log(Level.INFO, rnd + ", so 9");
                
                output = 9;
            }
            else {
                LogHelper.log(Level.INFO, rnd + "");
                
                output = rnd;
            }
        }
        else {
            output = 1;
        }
        
        return output;
    }
    
    @Override
    public int damageDropped(int meta) {
        if (blockListNumber == 0) {
            return meta;
        }
        if (blockListNumber == 1) {
            return meta + 16;
        }
        if (blockListNumber == 2) {
            return meta + 32;
        }
        else {
            return 0;
        }
    }

}