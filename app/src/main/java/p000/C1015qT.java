package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: qT */
class C1015qT implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f3611a;

    /* renamed from: b */
    public final /* synthetic */ C0216KT f3612b;

    public C1015qT(C0216KT kt, AlertDialog alertDialog) {
        this.f3612b = kt;
        this.f3611a = alertDialog;
    }

    public void onClick(View view) {
        C0216KT kt;
        try {
            this.f3612b.f546H = 1;
            String str = "";
            if (this.f3612b.f549K.getText() == null) {
                this.f3612b.f547I = str;
            } else {
                this.f3612b.f547I = this.f3612b.f549K.getText().toString();
            }
            if (this.f3612b.f550L.getText() == null) {
                kt = this.f3612b;
            } else {
                kt = this.f3612b;
                str = this.f3612b.f550L.getText().toString();
            }
            kt.f548J = str;
            this.f3612b.mo700e();
        } catch (Exception unused) {
        }
        this.f3611a.dismiss();
    }
}
