package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: PO */
class C0328PO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f941a;

    /* renamed from: b */
    public final /* synthetic */ C1134wP f942b;

    public C0328PO(C1134wP wPVar, AlertDialog alertDialog) {
        this.f942b = wPVar;
        this.f941a = alertDialog;
    }

    public void onClick(View view) {
        C1134wP wPVar;
        try {
            this.f942b.f3955V = 1;
            String str = "";
            if (this.f942b.f3958Y.getText() == null) {
                this.f942b.f3956W = str;
            } else {
                this.f942b.f3956W = this.f942b.f3958Y.getText().toString();
            }
            if (this.f942b.f3959Z.getText() == null) {
                wPVar = this.f942b;
            } else {
                wPVar = this.f942b;
                str = this.f942b.f3959Z.getText().toString();
            }
            wPVar.f3957X = str;
            this.f942b.mo5326n();
        } catch (Exception unused) {
        }
        this.f941a.dismiss();
    }
}
