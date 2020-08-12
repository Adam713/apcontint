package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: AM */
class C0006AM implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FragmentStatePagerSupport_Main f10a;

    public C0006AM(FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main) {
        this.f10a = fragmentStatePagerSupport_Main;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10a.f2469j.mo543b("pref_drive_AutoNotify", false);
        dialogInterface.dismiss();
    }
}
