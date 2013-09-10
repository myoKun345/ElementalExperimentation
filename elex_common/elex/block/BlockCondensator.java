package elex.block;

import java.util.logging.Level;

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
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.core.LogHelper;
import elex.core.Position;
import elex.core.RenderUtilities;
import elex.lib.ElexIDs;
import elex.lib.Reference;
import elex.tileentity.TileEntityCondensator;
import elex.tileentity.TileEntityCondensator.EnumCondensatorMode;

/**
 * Elemental Experimentation
 * 
 * BlockCondensator
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockCondensator extends BlockContainer {
    
    @SideOnly(Side.CLIENT)
    private Icon baseIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon frontIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon activeIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon topIcon;
    
    public BlockCondensator(int id) {
        super(id, Material.iron);
        setCreativeTab(ElementalExperimentation.elexTab);
        setHardness(5F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName(ElexIDs.CONDENSATOR_UNLOCALIZED_NAME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        baseIcon = register.registerIcon(Reference.MOD_ID + ":caseCarbonSteel");
        frontIcon = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.CONDENSATOR_UNLOCALIZED_NAME + "_front");
        activeIcon = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.CONDENSATOR_UNLOCALIZED_NAME + "_active");
        topIcon = register.registerIcon(Reference.MOD_ID + ":" + ElexIDs.CONDENSATOR_UNLOCALIZED_NAME + "_top");
    }
    
    @Override
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
        super.onBlockPlacedBy(world, i, j, k, entityliving, stack);

        ForgeDirection orientation = RenderUtilities.get2dOrientation(new Position(entityliving.posX, entityliving.posY, entityliving.posZ), new Position(i, j, k));

        world.setBlockMetadataWithNotify(i, j, k, orientation.getOpposite().ordinal(),1);
        if (entityliving instanceof EntityPlayer) {
            TileEntityCondensator condensator = (TileEntityCondensator) world.getBlockTileEntity(i, j, k);
            condensator.placedBy = (EntityPlayer) entityliving;
        }
        
        setDefaultMode(world, i, j, k);
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
            FMLNetworkHandler.openGui(player, ElementalExperimentation.instance, 2, world, x, y, z);
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
        return new TileEntityCondensator();
    }
    
    public void setDefaultMode(World world, int x, int y, int z) {
        TileEntityCondensator te = (TileEntityCondensator)world.getBlockTileEntity(x, y, z);
        if (world.getBiomeGenForCoords(x, z) != BiomeGenBase.hell) {
            te.modeAir = true;
            te.modeWater = true;
            te.enableMode(te.modeAir);
            te.enableMode(te.modeWater);
            te.setCurrentMode(EnumCondensatorMode.WATER, te.modeAir);
            LogHelper.log(Level.INFO, "Output: " + te.currentMode.getFluid() + te.modeAir + te.modeWater);
        }
        else if (world.getBiomeGenForCoords(x, z) == BiomeGenBase.hell) {
            te.modeNetherAir = true;
            te.enableMode(te.modeNetherAir);
            te.setCurrentMode(EnumCondensatorMode.NETHER, te.modeNetherAir);
        }
    }

}
