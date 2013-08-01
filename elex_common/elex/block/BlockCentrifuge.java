package elex.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.lib.BlockIds;
import elex.lib.Reference;
import elex.player.Position;
import elex.render.RenderUtilities;
import elex.tileentity.TileEntityCentrifuge;

/**
 * Elemental Experimentation
 * 
 * BlockCentrifuge
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockCentrifuge extends BlockContainer {
    
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
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
        super.onBlockPlacedBy(world, i, j, k, entityliving, stack);

        ForgeDirection orientation = RenderUtilities.get2dOrientation(new Position(entityliving.posX, entityliving.posY, entityliving.posZ), new Position(i, j, k));

        world.setBlockMetadataWithNotify(i, j, k, orientation.getOpposite().ordinal(),1);
        if (entityliving instanceof EntityPlayer) {
            TileEntityCentrifuge centrifuge = (TileEntityCentrifuge) world.getBlockTileEntity(i, j, k);
            centrifuge.placedBy = (EntityPlayer) entityliving;
        }
    }

    @Override
    public Icon getIcon(int i, int j) {
        if (j == 0 && i == 3) {
            return frontIcon;
        }
        if (i == j && i>1) {
            return frontIcon;
        }
        switch (i) {
        case 1:
            return topIcon;
        default:
            return baseIcon;
        }
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
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityCentrifuge();
    }
    
}
