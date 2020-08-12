package p000;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: fU */
class C0783fU implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f2968a;

    /* renamed from: b */
    public final /* synthetic */ Context f2969b;

    /* renamed from: c */
    public final /* synthetic */ AlertDialog f2970c;

    /* renamed from: d */
    public final /* synthetic */ C0195JU f2971d;

    public C0783fU(C0195JU ju, EditText editText, Context context, AlertDialog alertDialog) {
        this.f2971d = ju;
        this.f2968a = editText;
        this.f2969b = context;
        this.f2970c = alertDialog;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.f2971d.mo533b(r3.f2969b);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r4 = p000.C0195JU.f445e     // Catch:{ Exception -> 0x00ab }
            if (r4 == 0) goto L_0x00ab
            JU r4 = r3.f2971d     // Catch:{ Exception -> 0x00a4 }
            android.widget.EditText r0 = r3.f2968a     // Catch:{ Exception -> 0x00a4 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a4 }
            r4.f475N = r0     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r4 = "imei_code="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r0.<init>()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = p000.C0195JU.f445e     // Catch:{ Exception -> 0x00a4 }
            r0.append(r1)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = ":"
            r0.append(r1)     // Catch:{ Exception -> 0x00a4 }
            JU r1 = r3.f2971d     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = r1.f475N     // Catch:{ Exception -> 0x00a4 }
            r0.append(r1)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a4 }
            android.util.Log.d(r4, r0)     // Catch:{ Exception -> 0x00a4 }
            JU r4 = r3.f2971d     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r4 = r4.f475N     // Catch:{ Exception -> 0x00a4 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00a4 }
            if (r4 != 0) goto L_0x0045
            JU r4 = r3.f2971d     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r0 = r3.f2969b     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = p000.C0195JU.f445e     // Catch:{ Exception -> 0x00a4 }
            r4.mo552c(r0, r1)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00ab
        L_0x0045:
            java.lang.String r4 = p000.C0195JU.f446f     // Catch:{ Exception -> 0x00a4 }
            r0 = 14
            r1 = 0
            java.lang.String r4 = r4.substring(r1, r0)     // Catch:{ Exception -> 0x00a4 }
            android.widget.EditText r2 = r3.f2968a     // Catch:{ Exception -> 0x00a4 }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r2.substring(r1, r0)     // Catch:{ Exception -> 0x00a4 }
            boolean r4 = r4.equals(r0)     // Catch:{ Exception -> 0x00a4 }
            if (r4 == 0) goto L_0x009c
            JU r4 = r3.f2971d     // Catch:{ Exception -> 0x00a4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r0.<init>()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = "insert into valid(imei,imei_code) values('"
            r0.append(r2)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = p000.C0195JU.f445e     // Catch:{ Exception -> 0x00a4 }
            r0.append(r2)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = "','"
            r0.append(r2)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = p000.C0195JU.f446f     // Catch:{ Exception -> 0x00a4 }
            r0.append(r2)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = "');"
            r0.append(r2)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a4 }
            r4.mo562d(r0)     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r4 = r3.f2969b     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r0 = r3.f2969b     // Catch:{ Exception -> 0x00a4 }
            r2 = 2131755168(0x7f1000a0, float:1.9141208E38)
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x00a4 }
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r0, r1)     // Catch:{ Exception -> 0x00a4 }
            r4.show()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00ab
        L_0x009c:
            JU r4 = r3.f2971d     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r0 = r3.f2969b     // Catch:{ Exception -> 0x00a4 }
            r4.mo533b(r0)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00ab
        L_0x00a4:
            JU r4 = r3.f2971d     // Catch:{ Exception -> 0x00ab }
            android.content.Context r0 = r3.f2969b     // Catch:{ Exception -> 0x00ab }
            r4.mo533b(r0)     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            android.support.v7.app.AlertDialog r4 = r3.f2970c
            r4.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0783fU.onClick(android.view.View):void");
    }
}
