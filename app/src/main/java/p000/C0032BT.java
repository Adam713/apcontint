package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: BT */
class C0032BT implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0216KT f55a;

    public C0032BT(C0216KT kt) {
        this.f55a = kt;
    }

    public void onClick(View view) {
        if (view.getId() == 2131296497) {
            this.f55a.amount_add_btn(view);
        } else if (view.getId() == 2131296503) {
            this.f55a.help_btn(view);
        }
    }
}
