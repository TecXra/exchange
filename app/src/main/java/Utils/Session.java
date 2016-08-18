package Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Mian Mohsin on 8/15/2016.
 */
public class Session {
    private SharedPreferences sp;
    private SharedPreferences.Editor spEditor;

    public Session(Context context) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);

    }

    public boolean setLogin(boolean status) {
        spEditor = sp.edit();
        spEditor.putBoolean("is_logged_in", status);
        spEditor.commit();
        return true;
    }

    public boolean getLoggedIn() {
        return sp.getBoolean("is_logged_in", false);
    }
}
