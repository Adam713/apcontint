package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: oP */
class C0963oP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f3504a;

    /* renamed from: b */
    public final /* synthetic */ String f3505b;

    /* renamed from: c */
    public final /* synthetic */ EditText f3506c;

    /* renamed from: d */
    public final /* synthetic */ AlertDialog f3507d;

    /* renamed from: e */
    public final /* synthetic */ C1134wP f3508e;

    public C0963oP(C1134wP wPVar, EditText editText, String str, EditText editText2, AlertDialog alertDialog) {
        this.f3508e = wPVar;
        this.f3504a = editText;
        this.f3505b = str;
        this.f3506c = editText2;
        this.f3507d = alertDialog;
    }

    public void onClick(View view) {
        C0195JU ju;
        String str;
        String str2;
        if (C0008AO.m5a(this.f3504a)) {
            if (this.f3505b != null) {
                C0195JU ju2 = this.f3508e.f3989p;
                StringBuilder sb = new StringBuilder();
                sb.append("update customers set name='");
                sb.append(this.f3506c.getText().toString());
                sb.append("',gsm='");
                sb.append(this.f3504a.getText().toString());
                sb.append("' where id='");
                sb.append(this.f3508e.f3961b);
                sb.append("'");
                ju2.mo562d(sb.toString());
                this.f3508e.f3967e = this.f3504a.getText().toString();
                C1134wP wPVar = this.f3508e;
                int i = wPVar.f3954U;
                if (i == 1) {
                    wPVar.f3989p.mo541b(this.f3504a.getText().toString());
                } else {
                    if (i == 2) {
                        ju = wPVar.f3989p;
                        str2 = this.f3504a.getText().toString();
                        C1134wP wPVar2 = this.f3508e;
                        str = wPVar2.f3989p.mo531b(wPVar2.f3936C, wPVar2.f3963c, wPVar2.mo5288a(wPVar2.f3935B.f863d));
                    } else {
                        ju = wPVar.f3989p;
                        str2 = this.f3504a.getText().toString();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f3508e.getString(2131755382));
                        sb2.append(this.f3508e.f3965d);
                        str = sb2.toString();
                    }
                    ju.mo634y(str2, str);
                }
            }
            this.f3507d.dismiss();
        }
    }
}
