package elex.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.core.Position;
import elex.core.RenderUtilities;
import elex.lib.ElexIDs;
import elex.lib.Reference;
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
        setUnlocalizedName(ElexIDs.GRINDER_UNLOCALIZED_NAME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        baseIcon = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.MACHINE_BLOCK_BASE);
        frontIcon = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.GRINDER_UNLOCALIZED_NAME + "_front");
        idleFrontIcon = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.GRINDER_UNLOCALIZED_NAME + "_idle");
        topIcon = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.GRINDER_UNLOCALIZED_NAME + "_top");
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
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int i, int j) {
        if (j == 0 && i == 3) {
            return idleFrontIcon;
        }
        if (i == j && i > 1) {
            return idleFrontIcon;
        }
        if (j == 10 && i == 3) {
            return frontIcon;
        }
        if (i + 10 == j && i > 1) {
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
        if (player.isSneaking()) {
            return false;
        }
        
        if (!world.isRemote && !player.isSneaking()) {
            FMLNetworkHandler.openGui(player, ElementalExperimentation.instance, 0, world, x, y, z);
        }
        
        return true;
    }
    
    @Override
    public void breakBlock(World world, int x, int y, int z, int id, int meta) {
        TileEntity entity = world.getBlockTileEntity(x, y, z);
        if (entity != null && entity instanceof IInventory) {
            IInventory inventory = (IInventory)entity;
            
            for (int i = 0; i < inventory.getSizeInventory(); i++) {
                ItemStack stack = inventory.getStackInSlotOnClosing(i);
                
                if (stack != null) {
                    float spawnX = x + world.rand.nextFloat();
                    float spawnY = y + world.rand.nextFloat();
                    float spawnZ = z + world.rand.nextFloat();
                    
                    EntityItem droppedItem = new EntityItem(world, spawnX, spawnY, spawnZ, stack);
                    
                    droppedItem.motionX = world.rand.nextFloat() * 0.05F;
                    droppedItem.motionY = world.rand.nextFloat() * 0.05F;
                    droppedItem.motionZ = world.rand.nextFloat() * 0.05F;
                    
                    world.spawnEntityInWorld(droppedItem);
                }
            }
        }
        
        super.breakBlock(world, x, y, z, id, meta);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityGrinder();
    }
}
