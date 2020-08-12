package p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: RS */
class C0374RS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0576_S f1086a;

    public C0374RS(C0576_S _s) {
        this.f1086a = _s;
    }

    public void onClick(View view) {
        if (view.getId() == 2131296497) {
            this.f1086a.amount_add_btn(view);
        } else if (view.getId() == 2131296503) {
            Log.d("onItemClicked=", ":before....");
            this.f1086a.f1738D.onButtonClicked(view);
        }
    }
}
