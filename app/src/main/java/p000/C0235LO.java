package p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: LO */
class C0235LO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f619a;

    public C0235LO(C1134wP wPVar) {
        this.f619a = wPVar;
    }

    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(view.getId());
        sb.append(":");
        sb.append(2131296451);
        Log.d("Date Picker=", sb.toString());
        try {
            new C0392SO(this.f619a).show(this.f619a.getActivity().getFragmentManager(), "datePicker");
        } catch (Exception e) {
            Log.d("Date error=", e.getMessage());
        }
    }
}
