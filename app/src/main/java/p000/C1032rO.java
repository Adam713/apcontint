package p000;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import com.valdio.valdioveliu.recyclerview.SettingsActivity;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.OthersPreferenceFragment;

/* renamed from: rO */
class C1032rO implements OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ OthersPreferenceFragment f3685a;

    public C1032rO(OthersPreferenceFragment othersPreferenceFragment) {
        this.f3685a = othersPreferenceFragment;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        SettingsActivity.f2659c = true;
        FragmentStatePagerSupport_Main.f2453f = true;
        this.f3685a.getActivity().recreate();
        return true;
    }
}
