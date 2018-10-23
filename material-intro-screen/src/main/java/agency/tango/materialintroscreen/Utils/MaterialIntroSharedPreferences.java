package agency.tango.materialintroscreen.Utils;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * This is a singleton class manages all application specific preferences data.
 */
public class MaterialIntroSharedPreferences {
    private static final String TAG = "MaterialIntroSP";

    private static final String SHARED_PREFS_NAME = "MaterialIntroSP";
    private static final String SHARED_PREFS_USER_LANGUAGE_PREFERENCE = "LangPref";
    
    private Context appContext = null;
    private static MaterialIntroSharedPreferences materialIntroSharedPrefs;
    private SharedPreferences sharedPrefs = null;

    private MaterialIntroSharedPreferences(Context context) {
        this.appContext = context;
    }

    public static MaterialIntroSharedPreferences getInstance(Context context) {
        if (materialIntroSharedPrefs == null) {
            materialIntroSharedPrefs = new MaterialIntroSharedPreferences(context);

            materialIntroSharedPrefs.sharedPrefs =
                    context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);

        }
        return materialIntroSharedPrefs;
    }

    public void setSharedPrefsUserLanguagePref(String language){
        this.sharedPrefs.edit().putString(SHARED_PREFS_USER_LANGUAGE_PREFERENCE, language).commit();
    }

    public String getSharedPrefsUserLanguagePref(){
        return materialIntroSharedPrefs.sharedPrefs.getString(SHARED_PREFS_USER_LANGUAGE_PREFERENCE, "en");
    }
}

