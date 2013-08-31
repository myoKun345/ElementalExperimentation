Elemental Experimentation
============
A Technical Mod for Minecraft

Builds: http://mods.austin-jones.info/builds/elex/

This mod will recreate the entire periodic table of elements in Minecraft and allow the player to break down items into their component elements for use in further mixing and compounding to make stronger and more useful materials. This mod, by the nature of how it will denote elements and characteristics, will be easily compatible with the many other technical mods that are available for Minecraft.

Building it yourself
============

You can *try* to build it yourself with the ant script, but you would probably have to extensively change your workspace and/or the build script to fit. I claim **NO RESPONSIBILITY** for any potential errors or quirks that may arise. There really isn't that much of a need for you to build it yourself because the provided [link](http://mods.austin-jones.info/builds/elex/) up above gets them straight from Jenkins. Deobfuscated jars are also available.

Roadmap
============

## First Release (0.1.xx, ~October/November)

*Basic Implementation of All Elements* Every element implemented with at least a base ingot/fluid for each depending on phase.
*Basic Implementation of Metal Alloys* A semi-automatic system for adding alloys and determining their tool and armor materials.
*API* A way for other mods to add their own table of elements. There will not be a way for mods to add elements to the base table because that would just be silly. (Adding a new table is crossing the line already, so don't push it.)
*Basic Research System* A research system for displaying the properties of elements in-game, as well as discovering new ones.
*Basic Machines* Machines similar to the ones implemented in IndustrialCraft 2 and Thermal Expansion to increase ore output and such.

## Advanced Mechanics (0.2-9.xx, ~December/January-August/September)

*Advanced Implementation of All Elements (Chemistry System)* Every element implemented with their realistic passive effects and reactions. (Holding an uncontained metal ingot will oxidise, holding a radioactive element will hurt, etc.) Potentially will move to Hash Maps or Hash Tables for elements.
*Nuclear Science System* Nuclear reactors (both fusion and fission) to produce power and discover new elements, more advanced machines.
*Power System* A custom power system to power machines, compatible with Universal Electricity's, BuildCraft's and IndustrialCraft's power systems.
*Advanced Research System* A more fleshed-out version of the research system that ties in with the nuclear system, hopefully with dynamic rendering of molecule and crystal structure, etc.
