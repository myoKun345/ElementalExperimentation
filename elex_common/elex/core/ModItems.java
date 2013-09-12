package elex.core;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import elex.ElementalExperimentation;
import elex.item.ElexItemArmor;
import elex.item.ElexItemDust;
import elex.item.ElexItemIngot;
import elex.item.ItemElExNugget;
import elex.item.ItemElExOre;
import elex.item.ItemMachinePart;
import elex.item.ItemMercuryInjector;
import elex.item.ItemResearchBinder;
import elex.item.ItemSaltedMeat;

public class ModItems {
    public static Item itemElExOre;
    public static Item mercuryInjector;
    public static Item itemElExCompoundDust;
    public static Item itemElExMetalDust;
    public static Item itemElExIngot;
    public static Item itemElExPureNonmetalDust;
    public static Item itemVanillaDust;
    public static Item itemAlloyDust;
    public static Item itemArtificialDust;
    public static Item itemAlloyIngot;
    public static Item itemMachinePart;
    public static Item itemMetalNugget;
    public static Item itemAlloyNugget;
    public static Item itemIronNugget;
    public static Item itemResearchBinder;
    public static Item itemCarbonHelmet;
    public static Item itemCarbonPlate;
    public static Item itemCarbonPants;
    public static Item itemCarbonBoots;
    public static Item foodSaltedBeef;
    public static Item foodSaltedChicken;
    public static Item foodSaltedPork;
    public static Item foodSaltedFish;
    
    public static void init() {
        itemElExOre = new ItemElExOre(ElexIDs.ELEX_ORE);
        mercuryInjector = new ItemMercuryInjector(ElexIDs.MERCURY_INJECTOR);
        itemElExCompoundDust = new ElexItemDust(ElexIDs.ELEX_COMPOUND_DUST, 0);
        itemElExMetalDust = new ElexItemDust(ElexIDs.ELEX_METAL_DUST, 1);
        itemElExIngot = new ElexItemIngot(ElexIDs.ELEX_INGOT, 0);
        itemElExPureNonmetalDust = new ElexItemDust(ElexIDs.ELEX_PURE_NONMETAL_DUST, 2);
        itemVanillaDust = new ElexItemDust(ElexIDs.VANILLA_DUST, 3);
        itemAlloyDust = new ElexItemDust(ElexIDs.ALLOY_DUST, 4);
        itemArtificialDust = new ElexItemDust(ElexIDs.ARTIFICIAL_COMPOUND_DUST, 5);
        itemAlloyIngot = new ElexItemIngot(ElexIDs.ALLOY_INGOT, 1);
        itemMachinePart = new ItemMachinePart(ElexIDs.MACHINE_PART);
        itemMetalNugget = new ItemElExNugget(ElexIDs.METAL_NUGGET, 0);
        itemAlloyNugget = new ItemElExNugget(ElexIDs.ALLOY_NUGGET, 1);
        itemIronNugget = new ItemElExNugget(ElexIDs.IRON_NUGGET, 2);
        itemResearchBinder = new ItemResearchBinder(ElexIDs.RESEARCH_BINDER);
        itemCarbonHelmet = new ElexItemArmor(ElexIDs.ELEX_ARMOR[0], ElementalExperimentation.carbonArmorMat, 0, 0, "carbon");
        itemCarbonPlate = new ElexItemArmor(ElexIDs.ELEX_ARMOR[1], ElementalExperimentation.carbonArmorMat, 0, 1, "carbon");
        itemCarbonPants = new ElexItemArmor(ElexIDs.ELEX_ARMOR[2], ElementalExperimentation.carbonArmorMat, 1, 2, "carbon");
        itemCarbonBoots = new ElexItemArmor(ElexIDs.ELEX_ARMOR[3], ElementalExperimentation.carbonArmorMat, 0, 3, "carbon");
        foodSaltedBeef = new ItemSaltedMeat(ElexIDs.SALTED_BEEF, (ItemFood)Item.beefCooked, 0);
        foodSaltedChicken = new ItemSaltedMeat(ElexIDs.SALTED_CHICKEN, (ItemFood)Item.chickenCooked, 1);
        foodSaltedPork = new ItemSaltedMeat(ElexIDs.SALTED_PORK, (ItemFood)Item.porkCooked, 2);
        foodSaltedFish = new ItemSaltedMeat(ElexIDs.SALTED_FISH, (ItemFood)Item.fishCooked, 3);
    }
}
