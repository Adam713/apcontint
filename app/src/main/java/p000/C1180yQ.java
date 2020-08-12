package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: yQ */
class C1180yQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f4150a;

    public C1180yQ(C0523YQ yq) {
        this.f4150a = yq;
    }

    public void onClick(View view) {
        if (view.getId() == 2131296497) {
            this.f4150a.amount_add_btn(view);
        } else if (view.getId() == 2131296502) {
            this.f4150a.mo1541a(view);
        } else if (view.getId() == 2131296498) {
            this.f4150a.call_btn(view);
        } else if (view.getId() == 2131296503) {
            this.f4150a.help_btn(view);
        } else if (view.getId() == 16908292) {
            this.f4150a.no_result_btn(view);
        }
    }
}
