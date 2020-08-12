package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ZP */
class C0550ZP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f1658a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f1659b;

    public C0550ZP(C0523YQ yq, AlertDialog alertDialog) {
        this.f1659b = yq;
        this.f1658a = alertDialog;
    }

    public void onClick(View view) {
        if (this.f1659b.mo1585i()) {
            this.f1658a.dismiss();
            this.f1659b.mo1524F();
        }
    }
}
