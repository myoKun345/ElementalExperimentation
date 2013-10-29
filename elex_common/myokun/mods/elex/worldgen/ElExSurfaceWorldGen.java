package myokun.mods.elex.worldgen;

import java.util.Random;

import myokun.mods.elex.core.ConfigurationSettings;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * Elemental Experimentation
 * 
 * ElExSurfaceWorldGen
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ElExSurfaceWorldGen implements IWorldGenerator {
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        
        int x = chunkX * 16 + random.nextInt(16);
        int z = chunkZ * 16 + random.nextInt(16);
        
        BiomeGenBase biome = world.getBiomeGenForCoords(x, z);
        
        if (ConfigurationSettings.SURFACE_GEN_MASTER_SWITCH == true && world.provider.canRespawnHere()) {
            if (ConfigurationSettings.SALT_LAKES_GEN == true) {
                if (biome.biomeID == ConfigurationSettings.EVAPORITE_PLAINS_ID) {
                    if (random.nextInt(ConfigurationSettings.SALT_LAKES_RARITY) == 0) {
                        int lakeX = x - 8 + random.nextInt(16);
                        int lakeY = random.nextInt(128);
                        int lakeZ = z - 8 + random.nextInt(16);
                        new WorldGenSaltLakes().generate(world, random, lakeX,
                                lakeY, lakeZ);
                    }
                }
            }
        }
    }

}
