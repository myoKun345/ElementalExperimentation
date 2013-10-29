package myokun.mods.elex.core;

import myokun.mods.elex.ElementalExperimentation;
import myokun.mods.elex.api.Element;
import myokun.mods.elex.api.ElexAPI;
import net.minecraft.item.Item;

/**
 * Elemental Experimentation
 * 
 * ModElements
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ModElements {
    
    public static Element hydrogen = (new Element(0,
            14.01F, 20.28F, "H", false, false,
            false, false, "gas", "Hydrogen"));
    
    public static Element helium = (new Element(1,
            0.95F, 4.22F, "He", false, false,
            false, false, "gas", "Helium"));

   public static Element lithium = (new Element(2,
            453.69F, 1615F, "Li", false, true,
            false, false, "solid", "Lithium"));

   public static Element beryllium = (new Element(3,
            1560F, 2742F, "Be", false, true,
            false, false, "solid", "Beryllium"));

   public static Element boron = (new Element(4,
            2349F, 4200F, "B", false, false,
            false, false, "solid", "Boron"));

   public static Element carbon = (new Element(5, 3915F,
            "C", false, false, false, false,
            "solid", "Carbon"));

   public static Element nitrogen = (new Element(6,
            63.15F, 77.36F, "N", false, false,
            false, false, "gas", "Nitrogen"));

   public static Element oxygen = (new Element(7,
            54.36F, 90.20F, "O", false, false,
            false, false, "gas", "Oxygen"));

   public static Element fluorine = (new Element(8,
            53.53F, 85.03F, "F", false, false,
            false, false, "gas", "Fluorine"));

   public static Element neon = (new Element(9,
            24.56F, 27.07F, "Ne", false, false,
            false, false, "gas", "Neon"));

   public static Element sodium = (new Element(10,
            370.87F, 1156F, "Na", false, true,
            false, false, "solid", "Sodium"));

   public static Element magnesium = (new Element(11,
            923F, 1363F, "Mg", false, true,
            false, false, "solid", "Magnesium"));

   public static Element aluminium = (new Element(12,
            933.47F, 2792F, "Al", false, true,
            false, true, "solid", "Aluminium"));

   public static Element silicon = (new Element(13,
            1687F, 3538F, "Si", false, true,
            false, false, "solid", "Silicon"));

   public static Element phosphorus = (new Element(14,
            317.35F, 553.65F, "P", false, false,
            false, false, "solid", "Phosphorus"));

   public static Element sulfur = (new Element(15,
            388.36F, 717.8F, "S", false, false,
            false, false, "solid", "Sulfur"));

   public static Element chlorine = (new Element(16,
            171.6F, 239.11F, "Cl", false, false,
            false, false, "gas", "Chlorine"));

   public static Element argon = (new Element(17,
            83.8F, 87.3F, "Ar", false, false,
            false, false, "gas", "Argon"));

   public static Element potassium = (new Element(18,
            336.53F, 1032F, "K", false, true,
            false, false, "solid", "Potassium"));

   public static Element calcium = (new Element(19,
            1115F, 1757F, "Ca", false, true,
            false, false, "solid", "Calcium"));

   public static Element scandium = (new Element(20,
            1814F, 3109F, "Sc", false, true,
            false, false, "solid", "Scandium"));

   public static Element titanium = (new Element(21,
            1941F, 3560F, "Ti", false, true,
            false, false, "solid", "Titanium"));

   public static Element vanadium = (new Element(22,
            2183F, 3680F, "V", false, true,
            false, false, "solid", "Vanadium"));

   public static Element chromium = (new Element(23,
            2180F, 2944F, "Cr", false, true,
            false, true, "solid", "Chromium"));

   public static Element manganese = (new Element(24,
            1519F, 2334F, "Mn", false, true,
            false, false, "solid", "Manganese"));

   public static Element iron = (new Element(25,
            1811F, 3134F, "Fe", true,
            Item.ingotIron, true, false, false,
            "solid", "Iron"));

   public static Element cobalt = (new Element(26,
            1768F, 3200F, "Co", false, true,
            false, true, "solid", "Cobalt"));

   public static Element nickel = (new Element(27,
            1728F, 3186F, "Ni", false, true,
            false, true, "solid", "Nickel"));

   public static Element copper = (new Element(28,
            1357F, 2835F, "Cu", false, true,
            false, true, "solid", "Copper"));

   public static Element zinc = (new Element(29,
            692.68F, 1180F, "Zn", false, true,
            false, false, "solid", "Zinc"));

   public static Element gallium = (new Element(30,
            302.9146F, 2477F, "Ga", false, true,
            false, false, "solid", "Gallium"));

   public static Element germanium = (new Element(31,
            1211.4F, 3106F, "Ge", false, true,
            false, false, "solid", "Germanium"));

   public static Element arsenic = (new Element(32, 887F,
            "As", false, true, false, true,
            "solid", "Arsenic"));

   public static Element selenium = (new Element(33,
            494F, 958F, "Se", false, false,
            false, false, "solid", "Selenium"));

   public static Element bromine = (new Element(34,
            265.8F, 332F, "Br", false, false,
            false, false, "liquid", "Bromine"));

   public static Element krypton = (new Element(35,
            115.79F, 119.93F, "Kr", false, false,
            false, false, "gas", "Krypton"));

   public static Element rubidium = (new Element(36,
            312.46F, 961F, "Rb", false, true,
            false, false, "solid", "Rubidium"));

   public static Element strontium = (new Element(37,
            1050F, 1655F, "Sr", false, true,
            false, false, "solid", "Strontium"));

   public static Element yttrium = (new Element(38,
            1799F, 3609F, "Y", false, true,
            false, false, "solid", "Yttrium"));

   public static Element zirconium = (new Element(39,
            2128F, 4682F, "Zr", false, true,
            false, false, "solid", "Zirconium"));

   public static Element niobium = (new Element(40,
            2750F, 5017F, "Nb", false, true,
            false, false, "solid", "Niobium"));

   public static Element molybdenum = (new Element(41,
            2896F, 4912F, "Mo", false, true,
            false, true, "solid", "Molybdenum"));

   public static Element technetium = (new Element(42,
            2430F, 4538F, "Tc", false, true,
            true, false, "solid", "Technetium"));

   public static Element ruthenium = (new Element(43,
            2607F, 4423F, "Ru", false, true,
            false, true, "solid", "Ruthenium"));

   public static Element rhodium = (new Element(44,
            2237F, 3986F, "Rh", false, true,
            false, true, "solid", "Rhodium"));

   public static Element palladium = (new Element(45,
            1828.05F, 2830.82F, "Pd", false,
            true, false, true, "solid",
            "Palladium"));

   public static Element silver = (new Element(46,
            1234.93F, 2435F, "Ag", false, true,
            false, true, "solid", "Silver"));

   public static Element cadmium = (new Element(47,
            594.22F, 1040F, "Cd", false, true,
            false, true, "solid", "Cadmium"));

   public static Element indium = (new Element(48,
            429.7485F, 2345F, "In", false, true,
            false, true, "solid", "Indium"));

   public static Element tin = (new Element(49,
            505.08F, 2875F, "Sn", false, true,
            false, true, "solid", "Tin"));

   public static Element antimony = (new Element(50,
            903.78F, 1860F, "Sb", false, true,
            false, true, "solid", "Antimony"));

   public static Element tellurium = (new Element(51,
            722.66F, 1261F, "Te", false, true,
            false, true, "solid", "Tellurium"));

   public static Element iodine = (new Element(52,
            386.85F, 457.4F, "I", false, false,
            false, false, "solid", "Iodine"));

   public static Element xenon = (new Element(53,
            161.4F, 165.03F, "Xe", false, false,
            false, false, "gas", "Xenon"));

   public static Element caesium = (new Element(54,
            301.59F, 944F, "Cs", false, true,
            false, false, "solid", "Caesium"));

   public static Element barium = (new Element(55,
            1000F, 2170F, "Ba", false, true,
            false, false, "solid", "Barium"));

   public static Element lanthanum = (new Element(56,
            1193F, 3737F, "La", false, true,
            false, false, "solid", "Lanthanum"));

   public static Element cerium = (new Element(57,
            1068F, 3716F, "Ce", false, true,
            false, false, "solid", "Cerium"));

   public static Element praseodymium = (new Element(58,
            1208F, 3793F, "Pr", false, true,
            false, false, "solid", "Praseodymium"));

   public static Element neodymium = (new Element(59,
            1297F, 3347F, "Nd", false, true,
            false, false, "solid", "Neodymium"));

   public static Element promethium = (new Element(60,
            1315F, 3273F, "Pm", false, true,
            true, false, "solid", "Promethium"));

   public static Element samarium = (new Element(61,
            1345F, 2067F, "Sm", false, true,
            false, false, "solid", "Samarium"));

   public static Element europium = (new Element(62,
            1099F, 1802F, "Eu", false, true,
            false, false, "solid", "Europium"));

   public static Element gadolinium = (new Element(63,
            1585F, 3546F, "Gd", false, true,
            true, false, "solid", "Gadolinium"));

   public static Element terbium = (new Element(64,
            1629F, 3503F, "Tb", false, true,
            false, false, "solid", "Terbium"));

   public static Element dysprosium = (new Element(65,
            1680F, 2840F, "Dy", false, true,
            false, false, "solid", "Dysprosium"));

   public static Element holmium = (new Element(66,
            1734F, 2993F, "Ho", false, true,
            false, false, "solid", "Holmium"));

   public static Element erbium = (new Element(67,
            1802F, 3141F, "Er", false, true,
            false, false, "solid", "Erbium"));

   public static Element thulium = (new Element(68,
            1818F, 2223F, "Tm", false, true,
            false, false, "solid", "Thulium"));

   public static Element ytterbium = (new Element(69,
            1097F, 1469F, "Yb", false, true,
            false, false, "solid", "Ytterbium"));

   public static Element lutetium = (new Element(70,
            1925F, 3675F, "Lu", false, true,
            false, false, "solid", "Lutetium"));

   public static Element hafnium = (new Element(71,
            2506F, 4876F, "Hf", false, true,
            false, false, "solid", "Hafnium"));

   public static Element tantalum = (new Element(72,
            3290F, 5731F, "Ta", false, true,
            false, true, "solid", "Tantalum"));

   public static Element tungsten = (new Element(73,
            3695F, 5828F, "W", false, true,
            false, false, "solid", "Tungsten"));

   public static Element rhenium = (new Element(74,
            3459F, 5869F, "Re", false, true,
            false, false, "solid", "Rhenium"));

   public static Element osmium = (new Element(75,
            3306F, 5285F, "Os", false, true,
            false, true, "solid", "Osmium"));

   public static Element iridium = (new Element(76,
            2739F, 4701F, "Ir", false, true,
            false, true, "solid", "Iridium"));

   public static Element platinum = (new Element(77,
            2041.4F, 4098F, "Pt", false, true,
            false, true, "solid", "Platinum"));

   public static Element gold = (new Element(78,
            1337.33F, 3129F, "Au", true,
            Item.ingotGold, true, false, false,
            "solid", "Gold"));

   public static Element mercury = (new Element(79,
            234.3210F, 629.88F, "Hg", false,
            true, false, false, "liquid",
            "Mercury"));

   public static Element thallium = (new Element(80,
            577F, 1746F, "Tl", false, true,
            false, false, "solid", "Thallium"));

   public static Element lead = (new Element(81,
            600.61F, 2022F, "Pb", false, true,
            false, true, "solid", "Lead"));

   public static Element bismuth = (new Element(82,
            544.7F, 1837F, "Bi", false, true,
            true, true, "solid", "Bismuth"));

   public static Element polonium = (new Element(83,
            527F, 1235F, "Po", false, true,
            true, false, "solid", "Polonium"));

   public static Element astatine = (new Element(84,
            575F, 610F, "At", false, false,
            true, false, "solid", "Astatine"));

   public static Element radon = (new Element(85,
            202F, 211.3F, "Rn", false, false,
            true, false, "gas", "Radon"));

   public static Element francium = (new Element(86,
            300F, 950F, "Fr", false, true,
            true, false, "solid", "Francium"));

   public static Element radium = (new Element(87,
            973F, 2010F, "Ra", false, true,
            true, false, "solid", "Radium"));

   public static Element actinium = (new Element(88,
            1323F, 3471F, "Ac", false, true,
            true, false, "solid", "Actinium"));

   public static Element thorium = (new Element(89,
            2115F, 5061F, "Th", false, true,
            true, false, "solid", "Thorium"));

   public static Element protactinium = (new Element(90,
            1841F, 4300F, "Pa", false, true,
            true, false, "solid", "Protactinium"));

   public static Element uranium = (new Element(91,
            1405.3F, 4404F, "U", false, true,
            true, false, "solid", "Uranium"));

   public static Element neptunium = (new Element(92,
            910F, 4273F, "Np", false, true,
            true, false, "solid", "Neptunium"));

   public static Element plutonium = (new Element(93,
            912.5F, 3505F, "Pu", false, true,
            true, false, "solid", "Plutonium"));

   public static Element americium = (new Element(94,
            1449F, 2880F, "Am", false, true,
            true, false, "solid", "Americium"));

   public static Element curium = (new Element(95,
            1613F, 3383F, "Cm", false, true,
            true, false, "solid", "Curium"));

   public static Element berkelium = (new Element(96,
            1259F, 3100F, "Bk", false, true,
            true, false, "solid", "Berkelium"));

   public static Element californium = (new Element(97,
            1173F, 1470F, "Cf", false, true,
            true, false, "solid", "Californium"));

   public static Element einsteinium = (new Element(98,
            1133F, 1450F, "Es", false, true,
            true, false, "solid", "Einsteinium"));

   public static Element fermium = (new Element(99,
            1800F, 2150F, "Fm", false, true,
            true, false, "solid", "Fermium"));
   
   public static Element mendelevium = (new Element(100, 
            1100F, 1450F, "Md", false, true, 
            true, false, "solid", "Mendelevium"));
   
   public static Element nobelium = (new Element(101,
            1100F, 1450F, "No", false, true,
            true, false, "solid", "Nobelium"));
   
   public static Element lawrencium = (new Element(102,
           1100F, 1450F, "Lr", false, true,
           true, false, "solid", "Lawrencium"));
   
   public static Element rutherfordium = (new Element(103,
           2400F, 5800F, "Rf", false, true,
           true, false, "solid", "Rutherfordium"));
   
   public static Element dubnium = (new Element(104,
           2425F, 5800F, "Db", false, true,
           true, false, "solid", "Dubnium"));
   
   public static Element seaborgium = (new Element(105,
           2425F, 5825F, "Sg", false, true,
           true, false, "solid", "Seaborgium"));
   
   public static Element bohrium = (new Element(106,
           2475F, 5825F, "Bh", false, true,
           true, false, "solid", "Bohrium"));
   
   public static Element hassium = (new Element(107,
           2525F, 5800F, "Hs", false, true,
           true, false, "solid", "Hassium"));
   
   public static Element meitnerium = (new Element(108,
           2600F, 5700F, "Mt", false, true,
           true, false, "solid", "Meitnerium"));
   
   public static Element darmstadtium = (new Element(109,
           2800F, 5700F, "Ds", false, true,
           true, false, "solid", "Darmstadtium"));
   
   public static Element roentgenium = (new Element(110,
           3000F, 5700F, "Rg", false, true,
           true, false, "solid", "Roentgenium"));
   
   public static Element copernicium = (new Element(111,
           3100F, 5800F, "Cn", false, true,
           true, false, "solid", "Copernicium"));
   
   public static Element myobium = (new Element(112,
           3200F, 5800F, "Mb", false, true,
           true, false, "solid", "Myobium"));
   
   public static Element pyrodaemium = (new Element(113,
           3100F, 5600F, "Py", false, true,
           true, false, "solid", "Pyrodaemium"));
   
   public static Element galaisium = (new Element(114,
           3000F, 5200F, "Gl", false, true,
           true, false, "solid", "Galaisium"));
   
   public static Element aottium = (new Element(115,
           2800F, 4800F, "Ao", false, true,
           true, false, "solid", "Aottium"));
   
   public static Element pascebestialum = (new Element(116,
           2700F, 4600F, "Ftb", false, true,
           true, false, "solid", "Pascebestialum"));
   
   public static Element nederon = (new Element(117,
           202F, 220F, "Nr", false, false,
           true, false, "gas", "Nederon"));
    
    public static void addElements() {
        ElexAPI.addElement(hydrogen, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(helium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(lithium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(beryllium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(boron, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(carbon, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(nitrogen, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(oxygen, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(fluorine, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(neon, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(sodium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(magnesium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(aluminium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(silicon, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(phosphorus, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(sulfur, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(chlorine, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(argon, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(potassium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(calcium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(scandium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(titanium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(vanadium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(chromium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(manganese, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(iron, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(cobalt, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(nickel, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(copper, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(zinc, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(gallium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(germanium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(arsenic, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(selenium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(bromine, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(krypton, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(rubidium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(strontium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(yttrium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(zirconium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(niobium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(molybdenum, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(technetium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(ruthenium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(rhodium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(palladium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(silver, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(cadmium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(indium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(tin, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(antimony, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(tellurium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(iodine, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(xenon, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(caesium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(barium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(lanthanum, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(cerium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(praseodymium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(neodymium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(promethium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(samarium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(europium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(gadolinium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(terbium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(dysprosium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(holmium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(erbium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(thulium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(ytterbium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(lutetium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(hafnium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(tantalum, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(tungsten, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(rhenium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(osmium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(iridium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(platinum, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(gold, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(mercury, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(thallium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(lead, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(bismuth, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(polonium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(astatine, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(radon, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(francium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(radium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(actinium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(thorium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(protactinium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(uranium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(neptunium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(plutonium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(americium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(curium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(berkelium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(californium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(einsteinium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(fermium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(mendelevium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(nobelium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(lawrencium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(rutherfordium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(dubnium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(seaborgium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(bohrium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(hassium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(meitnerium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(darmstadtium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(roentgenium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(copernicium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(myobium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(pyrodaemium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(galaisium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(aottium, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(pascebestialum, ElementalExperimentation.vanillaElementTable);
        ElexAPI.addElement(nederon, ElementalExperimentation.vanillaElementTable);
    }

}
