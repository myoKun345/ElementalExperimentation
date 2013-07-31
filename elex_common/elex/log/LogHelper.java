package elex.log;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;
import elex.lib.Reference;

/**
 * Elemental Experimentation
 * 
 * LogHelper
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class LogHelper {
    private static Logger elexLogger = Logger.getLogger(Reference.MOD_ID);
    
    public static void init() {
        elexLogger.setParent(FMLLog.getLogger());
    }
    
    public static void log(Level logLevel, String message) {
        elexLogger.log(logLevel, message);
    }
}
