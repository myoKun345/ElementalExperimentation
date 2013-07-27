package elex.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.lib.BlockIds;
import elex.lib.Reference;

/**
 * Elemental Experimentation
 * 
 * BlockCentrifuge
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockCentrifuge extends Block {
    
    @SideOnly(Side.CLIENT)
    private Icon baseIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon frontIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon topIcon;
    
    public BlockCentrifuge(int par1) {
        super(par1, Material.iron);
        setCreativeTab(ElementalExperimentation.elexTab);
        setHardness(5F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName(BlockIds.CENTRIFUGE_UNLOCALIZED_NAME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        baseIcon = register.registerIcon(Reference.MOD_ID + ":" + BlockIds.MACHINE_BLOCK_BASE);
        frontIcon = register.registerIcon(Reference.MOD_ID + ":" + BlockIds.CENTRIFUGE_UNLOCALIZED_NAME + "_front");
        topIcon = register.registerIcon(Reference.MOD_ID + ":" + BlockIds.CENTRIFUGE_UNLOCALIZED_NAME + "_top");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        if (side == 1) {
            return topIcon;
        }
        return baseIcon;
    }
    
    @Override
    public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
        spawnDirt(world, 180, 12, -345);
        return true;
    }
    
    private void spawnDirt (World world, int x, int y, int z) {
        if (world.isAirBlock(x, y, z)) {
            world.setBlock(x, y, z, Block.dirt.blockID);
        }
        System.out.println("spawned dirt");
    }
    
}
