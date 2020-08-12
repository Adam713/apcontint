package p000;

import android.os.Build.VERSION;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.SwitchPreference;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.OthersPreferenceFragment;

/* renamed from: qO */
class C1010qO implements OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ OthersPreferenceFragment f3606a;

    public C1010qO(OthersPreferenceFragment othersPreferenceFragment) {
        this.f3606a = othersPreferenceFragment;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        if (VERSION.SDK_INT >= 14) {
            Boolean bool = (Boolean) obj;
            if (((SwitchPreference) preference).isChecked() != bool.booleanValue()) {
                C0195JU.f451k = bool.booleanValue();
                FragmentStatePagerSupport_Main.f2451d = true;
            }
        }
        return true;
    }
}
