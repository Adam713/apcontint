package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: YP */
class C0522YP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f1495a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f1496b;

    public C0522YP(C0523YQ yq, AlertDialog alertDialog) {
        this.f1496b = yq;
        this.f1495a = alertDialog;
    }

    public void onClick(View view) {
        C0523YQ yq = this.f1496b;
        if (yq.mo1549a(yq.f1519Ka.getId())) {
            this.f1495a.dismiss();
            this.f1496b.mo1524F();
            if (this.f1496b.f1596q.size() > 0) {
                this.f1496b.mo1533O();
            }
        }
    }
}
