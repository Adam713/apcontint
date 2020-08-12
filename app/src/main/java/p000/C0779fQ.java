package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fQ */
class C0779fQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f2962a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f2963b;

    public C0779fQ(C0523YQ yq, AlertDialog alertDialog) {
        this.f2963b = yq;
        this.f2962a = alertDialog;
    }

    public void onClick(View view) {
        if (this.f2963b.mo1582h()) {
            C0523YQ yq = this.f2963b;
            if (yq.f1610x) {
                yq.mo1525G();
                this.f2963b.mo1524F();
                return;
            }
            this.f2962a.dismiss();
            this.f2963b.mo1524F();
            if (this.f2963b.f1596q.size() > 0) {
                this.f2963b.mo1533O();
            }
        }
    }
}
