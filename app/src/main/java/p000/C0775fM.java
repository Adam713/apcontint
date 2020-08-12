package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport;

/* renamed from: fM */
class C0775fM implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f2951a;

    /* renamed from: b */
    public final /* synthetic */ FragmentStatePagerSupport f2952b;

    public C0775fM(FragmentStatePagerSupport fragmentStatePagerSupport, Dialog dialog) {
        this.f2952b = fragmentStatePagerSupport;
        this.f2951a = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2952b.f2435n.setCurrentItem(i);
        this.f2951a.dismiss();
    }
}
