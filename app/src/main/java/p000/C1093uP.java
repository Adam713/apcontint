package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/* renamed from: uP */
class C1093uP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f3826a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f3827b;

    /* renamed from: c */
    public final /* synthetic */ C1134wP f3828c;

    public C1093uP(C1134wP wPVar, TextView textView, AlertDialog alertDialog) {
        this.f3828c = wPVar;
        this.f3826a = textView;
        this.f3827b = alertDialog;
    }

    public void onClick(View view) {
        this.f3828c.mo5299b(this.f3826a.getTag().toString());
        this.f3828c.f3989p.mo486V(this.f3826a.getTag().toString());
        this.f3827b.dismiss();
    }
}
