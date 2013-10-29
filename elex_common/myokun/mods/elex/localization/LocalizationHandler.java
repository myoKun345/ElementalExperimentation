package myokun.mods.elex.localization;

import myokun.mods.elex.core.Localizations;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Elemental Experimentation
 * 
 * LocalizationHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class LocalizationHandler {
    public static void loadLanguages() {
        for (String localizationFile : Localizations.localeFiles) {
            LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationUtility.getLocaleFromFileName(localizationFile), LocalizationUtility.isXMLLanguageFile(localizationFile));
        }
    }
}
