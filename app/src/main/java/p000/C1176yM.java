package p000;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: yM */
class C1176yM implements OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FragmentStatePagerSupport_Main f4140a;

    public C1176yM(FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main) {
        this.f4140a = fragmentStatePagerSupport_Main;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C0195JU ju;
        String str;
        String str2 = "hint_curr_check";
        if (z) {
            ju = this.f4140a.f2469j;
            str = "1";
        } else {
            ju = this.f4140a.f2469j;
            str = "0";
        }
        ju.mo631x(str2, str);
    }
}
