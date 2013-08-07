package elex.block;

import java.util.Random;

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
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.lib.BlockIds;
import elex.lib.Reference;
import elex.player.Position;
import elex.render.RenderUtilities;
import elex.tileentity.TileEntityGrinder;

/**
 * Elemental Experimentation
 * 
 * BlockGrinder
 * 
 * @author Myo-kun
 * @credit BuildCraft team
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockGrinder extends BlockContainer {
    
    private final Random grinderRandom = new Random();
    
    private boolean isActive;
    
    private static boolean keepFurnaceInventory;
    
    @SideOnly(Side.CLIENT)
    private Icon baseIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon frontIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon idleFrontIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon topIcon;
    
    public BlockGrinder(int par1) {
        super(par1, Material.iron);
        setCreativeTab(ElementalExperimentation.elexTab);
        setHardness(5F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName(BlockIds.GRINDER_UNLOCALIZED_NAME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        baseIcon = register.registerIcon(Reference.MOD_ID + ":" + BlockIds.MACHINE_BLOCK_BASE);
        frontIcon = register.registerIcon(Reference.MOD_ID + ":" + BlockIds.GRINDER_UNLOCALIZED_NAME + "_front");
        idleFrontIcon = register.registerIcon(Reference.MOD_ID + ":" + BlockIds.GRINDER_UNLOCALIZED_NAME + "_idle");
        topIcon = register.registerIcon(Reference.MOD_ID + ":" + BlockIds.GRINDER_UNLOCALIZED_NAME + "_top");
    }
    
    @Override
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
        super.onBlockPlacedBy(world, i, j, k, entityliving, stack);

        ForgeDirection orientation = RenderUtilities.get2dOrientation(new Position(entityliving.posX, entityliving.posY, entityliving.posZ), new Position(i, j, k));

        world.setBlockMetadataWithNotify(i, j, k, orientation.getOpposite().ordinal(),1);
        if (entityliving instanceof EntityPlayer) {
            TileEntityGrinder grinder = (TileEntityGrinder) world.getBlockTileEntity(i, j, k);
            grinder.placedBy = (EntityPlayer) entityliving;
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
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            FMLNetworkHandler.openGui(player, ElementalExperimentation.instance, 0, world, x, y, z);
        }
        
        return true;
    }
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityGrinder();
    }
}
