package p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: rS */
class C1036rS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f3692a;

    public C1036rS(C0239LS ls) {
        this.f3692a = ls;
    }

    public void onClick(View view) {
        if (view.getId() == 2131296497) {
            this.f3692a.amount_add_btn(view);
        } else if (view.getId() == 2131296503) {
            Log.d("onItemClicked=", ":before....");
            this.f3692a.f645W.onButtonClicked(view);
        } else if (view.getId() == 16908292) {
            this.f3692a.no_result_btn(view);
        }
    }
}
