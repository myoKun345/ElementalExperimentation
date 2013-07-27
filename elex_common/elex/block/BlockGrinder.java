package elex.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.ElementalExperimentation;
import elex.lib.BlockIds;
import elex.lib.Reference;
import elex.tileentity.TileEntityGrinder;

/**
 * Elemental Experimentation
 * 
 * BlockGrinder
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockGrinder extends BlockContainer {
    
    @SideOnly(Side.CLIENT)
    private Icon baseIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon frontIcon;
    
    @SideOnly(Side.CLIENT)
    private Icon topIcon;
    
    public BlockGrinder(int par1, Material par2Material) {
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
        topIcon = register.registerIcon(Reference.MOD_ID + ":" + BlockIds.GRINDER_UNLOCALIZED_NAME + "_top");
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
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityGrinder();
    }
}
