package elex.util;

import net.minecraftforge.common.ForgeDirection;

/**
 * Elemental Experimentation
 * 
 * RenderUtilities
 * 
 * @author Myo-kun
 * @credit BuildCraft team
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class RenderUtilities {
    public static ForgeDirection get2dOrientation(Position pos1, Position pos2) {
        double Dx = pos1.x - pos2.x;
        double Dz = pos1.z - pos2.z;
        double angle = Math.atan2(Dz, Dx) / Math.PI * 180 + 180;

        if (angle < 45 || angle > 315) {
            return ForgeDirection.EAST;
        } else if (angle < 135) {
            return ForgeDirection.SOUTH;
        } else if (angle < 225) {
            return ForgeDirection.WEST;
        } else {
            return ForgeDirection.NORTH;
        }
    }
}
