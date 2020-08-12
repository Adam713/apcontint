package com.adam.myapplication;


import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

public class UserSettingActivity extends PreferenceActivity implements OnSharedPreferenceChangeListener {

    /* renamed from: com.valdio.valdioveliu.recyclerview.UserSettingActivity$a */
    public static class C0720a extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(2131951631);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentManager().beginTransaction().replace(16908290, new C0720a()).commit();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("prefUsername")) {
            findPreference(str).setSummary(sharedPreferences.getString(str, ""));
        }
    }
}
