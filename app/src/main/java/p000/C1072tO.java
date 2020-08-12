package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.OthersPreferenceFragment;

/* renamed from: tO */
class C1072tO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String f3780a;

    /* renamed from: b */
    public final /* synthetic */ String f3781b;

    /* renamed from: c */
    public final /* synthetic */ OthersPreferenceFragment f3782c;

    public C1072tO(OthersPreferenceFragment othersPreferenceFragment, String str, String str2) {
        this.f3782c = othersPreferenceFragment;
        this.f3780a = str;
        this.f3781b = str2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3782c.f2674b.mo449B(this.f3780a, this.f3781b);
        FragmentStatePagerSupport_Main.f2451d = true;
        Toast.makeText(this.f3782c.getActivity(), this.f3782c.getActivity().getString(2131755168), 0).show();
    }
}
