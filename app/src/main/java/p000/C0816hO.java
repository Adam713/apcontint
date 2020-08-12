package p000;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.RingtonePreference;
import android.text.TextUtils;

/* renamed from: hO */
class C0816hO implements OnPreferenceChangeListener {
    public boolean onPreferenceChange(Preference preference, Object obj) {
        String obj2 = obj.toString();
        CharSequence charSequence = null;
        if (preference instanceof ListPreference) {
            ListPreference listPreference = (ListPreference) preference;
            int findIndexOfValue = listPreference.findIndexOfValue(obj2);
            if (findIndexOfValue >= 0) {
                charSequence = listPreference.getEntries()[findIndexOfValue];
            }
        } else {
            if (preference instanceof RingtonePreference) {
                if (TextUtils.isEmpty(obj2)) {
                    preference.setSummary(2131755338);
                    return true;
                }
                Ringtone ringtone = RingtoneManager.getRingtone(preference.getContext(), Uri.parse(obj2));
                if (ringtone != null) {
                    obj2 = ringtone.getTitle(preference.getContext());
                }
            }
            preference.setSummary(obj2);
            return true;
        }
        preference.setSummary(charSequence);
        return true;
    }
}
