package myokun.mods.elex.api;

/**
 * Elemental Experimentation
 * 
 * StorageBlockHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IStorageBlockHandler {
    
    /**
     * Implement this class, override this method and add your storage block logic inside.
     * @param element - Given by ElexAPI.addStuff.
     */
    public void addStorageBlocks(Element element);

}
