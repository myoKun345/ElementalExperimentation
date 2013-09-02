package elex.worldgen.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

import com.google.common.base.Optional;

import cpw.mods.fml.common.registry.GameRegistry;
import elex.core.ConfigurationSettings;

/**
 * Elemental Experimentation
 * 
 * Biomes
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class Biomes {
    
    public static Optional<? extends BiomeGenBase> evaporitePlains = Optional.absent();
    
    public static void init() {
        initializeBiomes();
        
        addToBiomeDictionary();
        
        registerBiomes();
    }
    
    private static void initializeBiomes() {
        evaporitePlains = Optional.of((new BiomeGenVaporitePlains(ConfigurationSettings.EVAPORITE_PLAINS_ID)).setColor(9286496).setBiomeName("Evaporite Plains").setTemperatureRainfall(0.8F, 0.4F));
    }
    
    private static void addToBiomeDictionary() {
        BiomeDictionary.registerBiomeType(evaporitePlains.get(), Type.PLAINS);
    }
    
    private static void registerBiomes() {
        if (ConfigurationSettings.EVAPORITE_PLAINS_GEN == true) {
            registerBiome(evaporitePlains);
        }
    }
    
    private static void registerBiome(Optional<? extends BiomeGenBase> biome)
    {
        if (biome.isPresent()) {
            GameRegistry.addBiome(biome.get());
        }
    }
    
}
