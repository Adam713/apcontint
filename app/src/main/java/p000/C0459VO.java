package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: VO */
class C0459VO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f1313a;

    /* renamed from: b */
    public final /* synthetic */ C1134wP f1314b;

    public C0459VO(C1134wP wPVar, AlertDialog alertDialog) {
        this.f1314b = wPVar;
        this.f1313a = alertDialog;
    }

    public void onClick(View view) {
        if (this.f1314b.mo5310e()) {
            this.f1313a.dismiss();
        }
    }
}
