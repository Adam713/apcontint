package p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: XO */
class C0501XO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f1444a;

    public C0501XO(C1134wP wPVar) {
        this.f1444a = wPVar;
    }

    public void onClick(View view) {
        try {
            new C0755eP(this.f1444a).show(this.f1444a.getActivity().getFragmentManager(), "datePicker");
        } catch (Exception e) {
            Log.d("Date error=", e.getMessage());
        }
    }
}
