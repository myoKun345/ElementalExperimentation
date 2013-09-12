package elex.network;

import java.io.File;
import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;
import elex.research.ResearchData;

/**
 * Elemental Experimentation
 * 
 * ResearchHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ResearchHandler {
    
    public static File worldSaveDir;
    
    public static HashMap<String, ResearchData> playerData = new HashMap<String, ResearchData>();
    
    public static ResearchData forPlayer(String username)
    {
        return playerData.get(username);
    }

    public static void loadPlayer(EntityPlayer player)
    {
        System.out.println("Loading Research Data: " + player.username);
        playerData.put(player.username, new ResearchData(player.username, new File(worldSaveDir, "ElEx/players")));
    }

    public static void unloadPlayer(EntityPlayer player)
    {
        System.out.println("Unloading Research Data: " + player.username);
        ResearchData data = playerData.remove(player.username);
        if(data != null) {
            data.save();
        }
    }
}
