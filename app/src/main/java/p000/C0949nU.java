package p000;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: nU */
class C0949nU implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f3430a;

    /* renamed from: b */
    public final /* synthetic */ EditText f3431b;

    /* renamed from: c */
    public final /* synthetic */ EditText f3432c;

    /* renamed from: d */
    public final /* synthetic */ Context f3433d;

    /* renamed from: e */
    public final /* synthetic */ EditText f3434e;

    /* renamed from: f */
    public final /* synthetic */ EditText f3435f;

    /* renamed from: g */
    public final /* synthetic */ AlertDialog f3436g;

    /* renamed from: h */
    public final /* synthetic */ C0195JU f3437h;

    public C0949nU(C0195JU ju, EditText editText, EditText editText2, EditText editText3, Context context, EditText editText4, EditText editText5, AlertDialog alertDialog) {
        this.f3437h = ju;
        this.f3430a = editText;
        this.f3431b = editText2;
        this.f3432c = editText3;
        this.f3433d = context;
        this.f3434e = editText4;
        this.f3435f = editText5;
        this.f3436g = alertDialog;
    }

    public void onClick(View view) {
        boolean a = C0008AO.m5a(this.f3430a);
        if (!C0008AO.m5a(this.f3431b)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f3432c)) {
            a = false;
        }
        if (a) {
            String obj = this.f3431b.getText().toString();
            String str = "";
            if (C0195JU.f447g.equals(str)) {
                try {
                    C0195JU.f447g = this.f3437h.mo558d(this.f3437h.f478w);
                } catch (Exception unused) {
                }
            }
            if (C0195JU.f447g != null && !this.f3437h.mo489X(obj.trim()).substring(0, C0195JU.f447g.length()).equals(C0195JU.f447g)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0195JU.f447g);
                sb.append(this.f3437h.mo489X(obj.trim()));
                obj = sb.toString();
            }
            String str2 = obj;
            C0195JU ju = this.f3437h;
            Context context = this.f3433d;
            String str3 = C0195JU.f445e;
            String obj2 = this.f3430a.getText().toString();
            String obj3 = this.f3432c.getText().toString();
            String obj4 = this.f3434e.getText().toString();
            if (this.f3435f.getText() != null) {
                str = this.f3435f.getText().toString();
            }
            ju.mo520a(context, str3, obj2, str2, obj3, obj4, str, 0);
            this.f3436g.dismiss();
        }
    }
}
