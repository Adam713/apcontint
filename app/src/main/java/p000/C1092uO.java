package p000;

import android.os.Build.VERSION;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.SwitchPreference;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.SecurityPreferenceFragment;

/* renamed from: uO */
class C1092uO implements OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SecurityPreferenceFragment f3825a;

    public C1092uO(SecurityPreferenceFragment securityPreferenceFragment) {
        this.f3825a = securityPreferenceFragment;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        SecurityPreferenceFragment securityPreferenceFragment;
        int i;
        if (VERSION.SDK_INT >= 14) {
            Boolean bool = (Boolean) obj;
            if (((SwitchPreference) preference).isChecked() != bool.booleanValue()) {
                boolean booleanValue = bool.booleanValue();
                String a = this.f3825a.mo4106a("prefPassword", "");
                if (booleanValue) {
                    securityPreferenceFragment = this.f3825a;
                    i = 0;
                } else {
                    securityPreferenceFragment = this.f3825a;
                    i = 2;
                }
                securityPreferenceFragment.mo4107a(i, a);
            }
        }
        return true;
    }
}
