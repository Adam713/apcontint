package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: TO */
class C0412TO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f1184a;

    /* renamed from: b */
    public final /* synthetic */ C1134wP f1185b;

    public C0412TO(C1134wP wPVar, AlertDialog alertDialog) {
        this.f1185b = wPVar;
        this.f1184a = alertDialog;
    }

    public void onClick(View view) {
        C1134wP wPVar = this.f1185b;
        if (wPVar.mo5294a(wPVar.f3974ha.getId())) {
            this.f1184a.dismiss();
        }
    }
}
