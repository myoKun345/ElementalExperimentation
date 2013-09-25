package elex.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Elemental Experimentation
 * 
 * ResearchData
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ResearchData {
    
    public String username;
    private File dataFile;
    private NBTTagCompound nbt;
    
    public ResearchData(String playername, File location) {
        username = playername;
        
        dataFile = new File(location, username + ".dat");
        if (!dataFile.getParentFile().exists()) {
            dataFile.getParentFile().mkdirs();
        }
        load();
    }
    
    public static void initDefaults() {
        
    }
    
    public static void setDefaults(String name) {
        
    }
    
    private void load() {
        nbt = new NBTTagCompound();
        try
        {
            if (!dataFile.exists()) {
                dataFile.createNewFile();
            }
            
            if(dataFile.length() > 0)
            {
                DataInputStream din = new DataInputStream(new FileInputStream(dataFile));
                nbt = (NBTTagCompound) NBTBase.readNamedTag(din);
                din.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void save() {

        try
        {
            DataOutputStream dout = new DataOutputStream(new FileOutputStream(dataFile));
            NBTBase.writeNamedTag(nbt, dout);
            dout.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
