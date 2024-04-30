/**
 *
 * @author Mangaliso Linda Dlamini S2110978
 */
package com.example.dlamini_mangaliso_s2110978;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPreferencesManager {
    private static final String KEY_UPDATE_TIME = "update_time";

    public static void saveUpdateTime(Context context, String updateTime) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(KEY_UPDATE_TIME, updateTime);
        editor.apply();
    }

    public static String getUpdateTime(Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(KEY_UPDATE_TIME, "08:00");
    }
}

