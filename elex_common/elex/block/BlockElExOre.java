package elex.block;

import elex.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockElExOre extends Block {

    public BlockElExOre(int id, Material material) {
        super(id, material);
    }
    
    @SideOnly(Side.CLIENT)
    private Icon[] textures;
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        textures = new Icon[4];
        
        for(int i = 0; i < textures.length; i++) {
            textures[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName2());
        }
    }
}
