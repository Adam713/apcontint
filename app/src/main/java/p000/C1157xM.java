package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: xM */
class C1157xM implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String f4088a;

    /* renamed from: b */
    public final /* synthetic */ FragmentStatePagerSupport_Main f4089b;

    public C1157xM(FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main, String str) {
        this.f4089b = fragmentStatePagerSupport_Main;
        this.f4088a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4089b.f2469j.mo480S(this.f4088a);
    }
}
