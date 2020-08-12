package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

/* renamed from: IT */
class C0175IT implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0216KT f388a;

    public C0175IT(C0216KT kt) {
        this.f388a = kt;
    }

    public void onClick(View view) {
        try {
            new C1183yT(this.f388a).show(this.f388a.getActivity().getFragmentManager(), "datePicker");
        } catch (Exception e) {
            Toast.makeText(this.f388a.getActivity(), e.getMessage(), 1).show();
        }
    }
}
