package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: UO */
class C0438UO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f1254a;

    /* renamed from: b */
    public final /* synthetic */ C1134wP f1255b;

    public C0438UO(C1134wP wPVar, AlertDialog alertDialog) {
        this.f1255b = wPVar;
        this.f1254a = alertDialog;
    }

    public void onClick(View view) {
        C1134wP wPVar = this.f1255b;
        if (wPVar.mo5294a(wPVar.f3976ia.getId())) {
            this.f1254a.dismiss();
        }
    }
}
