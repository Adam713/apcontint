package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: kM */
class C0875kM implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f3202a;

    /* renamed from: b */
    public final /* synthetic */ FragmentStatePagerSupport_Main f3203b;

    public C0875kM(FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main, Dialog dialog) {
        this.f3203b = fragmentStatePagerSupport_Main;
        this.f3202a = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3203b.f2467h.setCurrentItem(i);
        this.f3202a.dismiss();
    }
}
