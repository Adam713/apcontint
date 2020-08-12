package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: JS */
class C0193JS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f438a;

    /* renamed from: b */
    public final /* synthetic */ C0239LS f439b;

    public C0193JS(C0239LS ls, AlertDialog alertDialog) {
        this.f439b = ls;
        this.f438a = alertDialog;
    }

    public void onClick(View view) {
        C0239LS ls;
        try {
            this.f439b.f636N = 1;
            String str = "";
            if (this.f439b.f639Q.getText() == null) {
                this.f439b.f637O = str;
            } else {
                this.f439b.f637O = this.f439b.f639Q.getText().toString();
            }
            if (this.f439b.f640R.getText() == null) {
                ls = this.f439b;
            } else {
                ls = this.f439b;
                str = this.f439b.f640R.getText().toString();
            }
            ls.f638P = str;
            this.f439b.mo807h();
        } catch (Exception unused) {
        }
        this.f438a.dismiss();
    }
}
