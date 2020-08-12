package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hS */
class C0820hS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0925mS f3053a;

    public C0820hS(C0925mS mSVar) {
        this.f3053a = mSVar;
    }

    public void onClick(View view) {
        if (view.getId() == 2131296503) {
            this.f3053a.help_btn(view);
        } else if (view.getId() == 2131296497) {
            this.f3053a.amount_add_btn(view);
        } else if (view.getId() == 2131296496) {
            this.f3053a.add_btn(view);
        } else if (view.getId() == 2131296505) {
            this.f3053a.mo4727a(view);
        }
    }
}
