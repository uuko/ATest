package com.example.atest.Shareperference;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesHelperImp implements PreferencesHelper {
    private String SharedPreferencesKey = "SharedPreferencesKey";
    private final SharedPreferences mSharedPreferences;


    private static final String PREF_KEY_STRING_DATA = "PREF_KEY_STRING_DATA";
    private static final String PREF_KEY_NAME_DATA = "PREF_KEY_NAME_DATA";
    private static final String PREF_KEY_ID_DATA = "PREF_KEY_ID_DATA";
    public PreferencesHelperImp(Context context) {
        mSharedPreferences = context.getSharedPreferences(SharedPreferencesKey, Context.MODE_PRIVATE);
    }


    @Override
    public String getStringData() {
        return mSharedPreferences.getString(PREF_KEY_STRING_DATA, "");
    }

    @Override
    public void setStringData(String stringData) {
        mSharedPreferences.edit().putString(PREF_KEY_STRING_DATA, stringData).apply();
    }

    @Override
    public String getNameData() {
        return mSharedPreferences.getString(PREF_KEY_NAME_DATA, "");
    }

    @Override
    public void setNameData(String stringData) {
        mSharedPreferences.edit().putString(PREF_KEY_NAME_DATA, stringData).apply();
    }
    @Override
    public Integer getIdData() {
        return mSharedPreferences.getInt(PREF_KEY_ID_DATA, 0);
    }


    @Override
    public void setIdData(Integer intData) {
        mSharedPreferences.edit().putInt(PREF_KEY_ID_DATA, intData).apply();
    }

}
