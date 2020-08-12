package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: NP */
class C0283NP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f767a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f768b;

    public C0283NP(C0523YQ yq, AlertDialog alertDialog) {
        this.f768b = yq;
        this.f767a = alertDialog;
    }

    public void onClick(View view) {
        C0523YQ yq;
        try {
            this.f768b.f1609wa = 1;
            String str = "";
            if (this.f768b.f1615za.getText() == null) {
                this.f768b.f1611xa = str;
            } else {
                this.f768b.f1611xa = this.f768b.f1615za.getText().toString();
            }
            if (this.f768b.f1499Aa.getText() == null) {
                yq = this.f768b;
            } else {
                yq = this.f768b;
                str = this.f768b.f1499Aa.getText().toString();
            }
            yq.f1613ya = str;
            this.f768b.mo1524F();
        } catch (Exception unused) {
        }
        this.f767a.dismiss();
    }
}
