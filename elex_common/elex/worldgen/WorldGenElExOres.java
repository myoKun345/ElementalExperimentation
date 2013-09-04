package elex.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import elex.core.ConfigurationSettings;
import elex.lib.ElexIDs;
import elex.worldgen.biome.Biomes;

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
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 4, ConfigurationSettings.COPPER_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.SILVER_GEN) {
                for (int a = 0; a < ConfigurationSettings.SILVER_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.SILVER_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 10, ConfigurationSettings.SILVER_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.TIN_GEN) {
                for (int a = 0; a < ConfigurationSettings.TIN_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.TIN_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 13, ConfigurationSettings.TIN_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.CHROMIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.CHROMIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.CHROMIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 1, ConfigurationSettings.CHROMIUM_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.OSMIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.OSMIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.OSMIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE_2, 1, ConfigurationSettings.OSMIUM_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.RUTHENIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.RUTHENIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.RUTHENIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 7, ConfigurationSettings.RUTHENIUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.RHODIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.RHODIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.RHODIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 8, ConfigurationSettings.RHODIUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.PALLADIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.PALLADIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.PALLADIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 9, ConfigurationSettings.PALLADIUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.IRIDIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.IRIDIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.IRIDIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE_2, 2, ConfigurationSettings.IRIDIUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.PLATINUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.PLATINUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.PLATINUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE_2, 3, ConfigurationSettings.PLATINUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.NICKEL_GEN) {
                for (int a = 0; a < ConfigurationSettings.NICKEL_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.NICKEL_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 3, ConfigurationSettings.NICKEL_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.COBALT_GEN) {
                for (int a = 0; a < ConfigurationSettings.COBALT_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.COBALT_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 2, ConfigurationSettings.COBALT_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.CADMIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.CADMIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.CADMIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 11, ConfigurationSettings.CADMIUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.MOLYBDENUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.MOLYBDENUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.MOLYBDENUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 6, ConfigurationSettings.MOLYBDENUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.INDIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.INDIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.INDIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 12, ConfigurationSettings.INDIUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.ALUMINIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.ALUMINIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.ALUMINIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 0, ConfigurationSettings.ALUMINIUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.TANTALUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.TANTALUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.TANTALUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE_2, 0, ConfigurationSettings.TANTALUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.ARSENIC_GEN) {
                for (int a = 0; a < ConfigurationSettings.ARSENIC_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.ARSENIC_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 5, ConfigurationSettings.ARSENIC_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.TELLURIUM_GEN) {
                for (int a = 0; a < ConfigurationSettings.TELLURIUM_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.TELLURIUM_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 15, ConfigurationSettings.TELLURIUM_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.ANTIMONY_GEN) {
                for (int a = 0; a < ConfigurationSettings.ANTIMONY_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.ANTIMONY_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE, 14, ConfigurationSettings.ANTIMONY_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.BISMUTH_GEN) {
                for (int a = 0; a < ConfigurationSettings.BISMUTH_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.BISMUTH_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE_2, 5, ConfigurationSettings.BISMUTH_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.LEAD_GEN) {
                for (int a = 0; a < ConfigurationSettings.LEAD_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.LEAD_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.BLOCK_ELEX_ORE_2, 4, ConfigurationSettings.LEAD_BPV,
                            Block.stone.blockID)).generate(world, random,
                            XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.AQUAMARINE_GEN) {
                for (int a = 0; a < ConfigurationSettings.AQUAMARINE_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.AQUAMARINE_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.ITEM_ELEX_ORE, 0, ConfigurationSettings.AQUAMARINE_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.BORAX_GEN) {
                for (int a = 0; a < ConfigurationSettings.BORAX_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.BORAX_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.ITEM_ELEX_ORE, 1, ConfigurationSettings.BORAX_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.FLUORITE_GEN) {
                for (int a = 0; a < ConfigurationSettings.FLUORITE_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.FLUORITE_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.ITEM_ELEX_ORE, 2, ConfigurationSettings.FLUORITE_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.FORSTERITE_GEN) {
                for (int a = 0; a < ConfigurationSettings.FORSTERITE_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.FORSTERITE_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.ITEM_ELEX_ORE, 3, ConfigurationSettings.FORSTERITE_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.PETALITE_GEN) {
                for (int a = 0; a < ConfigurationSettings.PETALITE_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.PETALITE_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.ITEM_ELEX_ORE, 4, ConfigurationSettings.PETALITE_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.PURE_QUARTZ_GEN) {
                for (int a = 0; a < ConfigurationSettings.PURE_QUARTZ_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.PURE_QUARTZ_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.ITEM_ELEX_ORE, 5, ConfigurationSettings.PURE_QUARTZ_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.SPODUMENE_GEN) {
                for (int a = 0; a < ConfigurationSettings.SPODUMENE_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.SPODUMENE_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.ITEM_ELEX_ORE, 6, ConfigurationSettings.SPODUMENE_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
            if (ConfigurationSettings.HALITE_GEN) {
                for (int a = 0; a < ConfigurationSettings.HALITE_VPC; a++) {
                    int XCoord = chunkX + random.nextInt(16);
                    int YCoord = random.nextInt(ConfigurationSettings.HALITE_TOPY);
                    int ZCoord = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ElexIDs.ITEM_ELEX_ORE, 7, ConfigurationSettings.HALITE_BPV, Block.stone.blockID)).generate(world, random, XCoord, YCoord, ZCoord);
                }
            }
        }
        
        if (ConfigurationSettings.STONE_GEN_MASTER_SWITCH) {
            if (ConfigurationSettings.MARBLE_GEN) {
                for (int i = 0; i < 4; i++) {
                    int x = chunkX + random.nextInt(16);
                    int y = random.nextInt(96);
                    int z = chunkZ + random.nextInt(16);
                    if (world.getBiomeGenForCoords(x, z) == BiomeGenBase.plains || world.getBiomeGenForCoords(x, z).biomeID == ConfigurationSettings.EVAPORITE_PLAINS_ID) {
                        new WorldGenMinable(ElexIDs.BLOCK_BUILDING_MATERIAL, 0,
                                64, Block.stone.blockID).generate(world,
                                random, x, y, z);
                    }
                }
            }
            if (ConfigurationSettings.BASALT_GEN) {
                for (int i = 0; i < 4; i++) {
                    int x = chunkX + random.nextInt(16);
                    int y = random.nextInt(96);
                    int z = chunkZ + random.nextInt(16);
                    if (world.getBiomeGenForCoords(x, z) == BiomeGenBase.taiga || world.getBiomeGenForCoords(x, z) == BiomeGenBase.taigaHills) {
                        new WorldGenMinable(ElexIDs.BLOCK_BUILDING_MATERIAL, 1,
                                64, Block.stone.blockID).generate(world,
                                random, x, y, z);
                    }
                }
            }
            if (ConfigurationSettings.DEEP_SANDSTONE_GEN) {
                for (int i = 0; i < 4; i++) {
                    int x = chunkX + random.nextInt(16);
                    int y = random.nextInt(96);
                    int z = chunkZ + random.nextInt(16);
                    if (world.getBiomeGenForCoords(x, z) == BiomeGenBase.desert || world.getBiomeGenForCoords(x, z) == BiomeGenBase.desertHills) {
                        new WorldGenMinable(ElexIDs.BLOCK_BUILDING_MATERIAL, 2,
                                64, Block.stone.blockID).generate(world,
                                random, x, y, z);
                    }
                }
            }
            if (ConfigurationSettings.GRANITE_GEN) {
                for (int i = 0; i < 4; i++) {
                    int x = chunkX + random.nextInt(16);
                    int y = random.nextInt(96);
                    int z = chunkZ + random.nextInt(16);
                    if (world.getBiomeGenForCoords(x, z) == BiomeGenBase.extremeHills || world.getBiomeGenForCoords(x, z) == BiomeGenBase.extremeHillsEdge) {
                        new WorldGenMinable(ElexIDs.BLOCK_BUILDING_MATERIAL, 3,
                                64, Block.stone.blockID).generate(world,
                                random, x, y, z);
                    }
                }
            }
            if (ConfigurationSettings.LIMESTONE_GEN) {
                for (int i = 0; i < 4; i++) {
                    int x = chunkX + random.nextInt(16);
                    int y = random.nextInt(96);
                    int z = chunkZ + random.nextInt(16);
                    if (world.getBiomeGenForCoords(x, z) == BiomeGenBase.forest || world.getBiomeGenForCoords(x, z) == BiomeGenBase.forestHills) {
                        new WorldGenMinable(ElexIDs.BLOCK_BUILDING_MATERIAL, 4,
                                64, Block.stone.blockID).generate(world,
                                random, x, y, z);
                    }
                }
            }
        }
    }
    
    public void generateNether(World world, Random random, int i, int j) {
        
    }
    
}
