package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: pM */
class C0989pM implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String f3573a;

    /* renamed from: b */
    public final /* synthetic */ FragmentStatePagerSupport_Main f3574b;

    public C0989pM(FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main, String str) {
        this.f3574b = fragmentStatePagerSupport_Main;
        this.f3573a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C0195JU c = this.f3574b.f2469j;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3573a);
        sb.append("-market.db");
        c.mo480S(sb.toString());
    }
}
