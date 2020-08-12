package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/* renamed from: vP */
class C1113vP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f3876a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f3877b;

    /* renamed from: c */
    public final /* synthetic */ C1134wP f3878c;

    public C1113vP(C1134wP wPVar, TextView textView, AlertDialog alertDialog) {
        this.f3878c = wPVar;
        this.f3876a = textView;
        this.f3877b = alertDialog;
    }

    public void onClick(View view) {
        this.f3878c.mo5299b(this.f3876a.getTag().toString());
        this.f3878c.f3989p.mo486V(this.f3876a.getTag().toString());
        this.f3877b.dismiss();
    }
}
