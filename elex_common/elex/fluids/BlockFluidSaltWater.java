package elex.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.BlockFluidClassic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.lib.FluidIds;
import elex.lib.Reference;

/**
 * Elemental Experimentation
 * 
 * BlockFluidSaltWater
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockFluidSaltWater extends BlockFluidClassic {
    
    public static Icon iconStill;
    public static Icon iconFlow;
    
    public BlockFluidSaltWater(int id) {
        super(id, ModFluids.fluidSaltWater, Material.water);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        if (meta == 0) {
            return iconStill;
        }
        else {
            return iconFlow;
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        iconStill = register.registerIcon(Reference.MOD_ID + ":" + FluidIds.SALT_WATER_UNLOCALIZED_NAME + "_still");
        iconFlow = register.registerIcon(Reference.MOD_ID + ":" + FluidIds.SALT_WATER_UNLOCALIZED_NAME + "_flow");
    }
    
    @Override
    public String getUnlocalizedName() {
        return "tile." + FluidIds.SALT_WATER_BLOCK_UNLOCALIZED_NAME;
    }

}
