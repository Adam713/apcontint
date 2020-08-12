package p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: MO */
class C0262MO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f721a;

    public C0262MO(C1134wP wPVar) {
        this.f721a = wPVar;
    }

    public void onClick(View view) {
        try {
            new C0370RO(this.f721a).show(this.f721a.getActivity().getFragmentManager(), "datePicker");
        } catch (Exception e) {
            Log.d("Date error=", e.getMessage());
        }
    }
}
