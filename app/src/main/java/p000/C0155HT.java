package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: HT */
class C0155HT implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0216KT f337a;

    public C0155HT(C0216KT kt) {
        this.f337a = kt;
    }

    public void onClick(View view) {
        try {
            new C1205zT(this.f337a).show(this.f337a.getActivity().getFragmentManager(), "datePicker");
        } catch (Exception unused) {
        }
    }
}
