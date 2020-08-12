package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: bQ */
class C0628bQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f1904a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f1905b;

    public C0628bQ(C0523YQ yq, AlertDialog alertDialog) {
        this.f1905b = yq;
        this.f1904a = alertDialog;
    }

    public void onClick(View view) {
        if (this.f1905b.mo1587j()) {
            this.f1904a.dismiss();
            this.f1905b.mo1524F();
        }
    }
}
