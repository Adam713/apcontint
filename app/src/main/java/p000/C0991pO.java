package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.IPPreferenceFragment;

/* renamed from: pO */
class C0991pO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IPPreferenceFragment f3576a;

    public C0991pO(IPPreferenceFragment iPPreferenceFragment) {
        this.f3576a = iPPreferenceFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3576a.f2672c.mo1418b();
        this.f3576a.getActivity().finish();
    }
}
