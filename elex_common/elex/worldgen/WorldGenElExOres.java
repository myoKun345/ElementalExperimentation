package elex.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import elex.configuration.ConfigurationSettings;
import elex.lib.BlockIds;

/**
 * Elemental Experimentation
 * 
 * WorldGenElExOres
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class WorldGenElExOres implements IWorldGenerator {
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
            switch(world.provider.dimensionId) {
            case -1:
                    generateNether(world, random, chunkX*16, chunkZ*16);
                    break;
            case 0:
                    generateSurface(world, random, chunkX*16, chunkZ*16);
                    break;
            case 1:
                    generateEnd();
                    break;
            }
    }
    
    public void generateEnd() {
        
    }
    
    public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
        if (ConfigurationSettings.ORE_GEN_MASTER_SWITCH) {
            if (ConfigurationSettings.COPPER_GEN) {
                for (int a = 0; a < ConfigurationSettings.COPPER_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.COPPER_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 0, ConfigurationSettings.COPPER_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.SILVER_GEN) {
                for (int a = 0; a < ConfigurationSettings.SILVER_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.SILVER_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 1, ConfigurationSettings.SILVER_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.TIN_GEN) {
                for (int a = 0; a < 3; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(32);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 2, 8, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.CHROMIUM_GEN) {
                for (int a = 0; a < 2; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(56) + random.nextInt(24);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 3, 6, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.OSMIUM_GEN) {
                for (int a = 0; a < 2; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(16);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 4, 2, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.RUTHENIUM_GEN) {
                for (int a = 0; a < 2; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(32);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 5, 5,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.RHODIUM_GEN) {
                for (int a = 0; a < 1; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(16);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 6, 5,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.PALLADIUM_GEN) {
                for (int a = 0; a < 1; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(20);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 7, 6,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.IRIDIUM_GEN) {
                for (int a = 0; a < 3; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(16);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 8, 2,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.PLATINUM_GEN) {
                for (int a = 0; a < 2; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(20);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 9, 5,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.NICKEL_GEN) {
                for (int a = 0; a < 4; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(32);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 10, 8,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.COBALT_GEN) {
                for (int a = 0; a < 3; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(24);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 11, 6,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.CADMIUM_GEN) {
                for (int a = 0; a < 2; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(48);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 12, 5,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.MOLYBDENUM_GEN) {
                for (int a = 0; a < 3; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(32);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 13, 6,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.INDIUM_GEN) {
                for (int a = 0; a < 1; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(32);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 14, 5,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.ALUMINIUM_GEN) {
                for (int a = 0; a < 11; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(72);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE, 15, 8,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.TANTALUM_GEN) {
                for (int a = 0; a < 3; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(48);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE_2, 0, 5,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.ARSENIC_GEN) {
                for (int a = 0; a < 3; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(32);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE_2, 1, 6,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.TELLURIUM_GEN) {
                for (int a = 0; a < 2; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(24);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE_2, 2, 5,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.ANTIMONY_GEN) {
                for (int a = 0; a < 3; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(24);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE_2, 3, 5,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.BISMUTH_GEN) {
                for (int a = 0; a < 3; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(24);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE_2, 4, 4,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.LEAD_GEN) {
                for (int a = 0; a < 3; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(32);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(BlockIds.BLOCK_ELEX_ORE_2, 5, 6,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
        }
    }
    
    public void generateNether(World world, Random random, int i, int j) {
        
    }
    
}
