package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: XP */
class C0502XP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f1445a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f1446b;

    public C0502XP(C0523YQ yq, AlertDialog alertDialog) {
        this.f1446b = yq;
        this.f1445a = alertDialog;
    }

    public void onClick(View view) {
        C0523YQ yq = this.f1446b;
        if (yq.mo1549a(yq.f1517Ja.getId())) {
            this.f1445a.dismiss();
            this.f1446b.mo1524F();
            if (this.f1446b.f1596q.size() > 0) {
                this.f1446b.mo1533O();
            }
        }
    }
}
