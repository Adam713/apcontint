package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: pP */
class C0992pP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f3577a;

    public C0992pP(C1134wP wPVar) {
        this.f3577a = wPVar;
    }

    public void onClick(View view) {
        if (view.getId() == 2131296497) {
            this.f3577a.amount_add_btn(view);
        } else if (view.getId() == 2131296498) {
            this.f3577a.call_btn(view);
        } else if (view.getId() == 2131296503) {
            this.f3577a.help_btn(view);
        } else if (view.getId() == 16908292) {
            this.f3577a.no_result_btn(view);
        }
    }
}
