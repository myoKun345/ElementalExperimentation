Elemental Experimentation
============
A Technical Mod for Minecraft

This mod will recreate the entire periodic table of elements in Minecraft and allow the player to break down items into their component elements for use in further mixing and compounding to make stronger and more useful materials. This mod, by the nature of how it will denote elements and characteristics, will be easily compatible with the many other technical mods that are available for Minecraft.

NBT Data Saved per Item Stack (some of the following may be removed):

  Element: The basic element or elements that compose this stack

  State: The phase of matter of this stack

  Sample: Whether or not this stack is an element sample

If this stack is an element sample, the following NBT data is saved as well:

  Purity: How much an item created with this sample will be degraded as a consequence to its impurity

  Impurities: If Purity is not 100% then this value will be saved detailing what element is causing the element to be impure; using this sample with a purifier will give a portion of these impurities and improve the purity of the sample

The amount of an element in an item stack will be measured in “Elemental Units” or ELU. One sample will contain 16 ELU.

As an example for the elemental composition of a vanilla Minecraft item, here is the element list for one Redstone Dust:

  Redstone Dust - 128 ELU
  
  Copper (Cu) - 48 ELU
  
  Iron (Fe) - 32 ELU
  
  Silicon (Si) - 24 ELU
  
  Phosphorus (P) - 16 ELU
  
  Lead (Pb) - 6 ELU
  
  Uranium (U) - 2 ELU
  
Which describes Redstone Dust as being:

  37.5% Copper

  25% Iron

  18.75% Silicon

  12.5% Phosphorus

  4.75% Lead

  1.5% Uranium
