package p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: YO */
class C0521YO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f1494a;

    public C0521YO(C1134wP wPVar) {
        this.f1494a = wPVar;
    }

    public void onClick(View view) {
        try {
            new C0735dP(this.f1494a).show(this.f1494a.getActivity().getFragmentManager(), "datePicker");
        } catch (Exception e) {
            Log.d("Date error=", e.getMessage());
        }
    }
}
