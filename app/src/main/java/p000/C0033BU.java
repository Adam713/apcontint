package p000;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/* renamed from: BU */
class C0033BU implements a {

    /* renamed from: a */
    public final /* synthetic */ Context f56a;

    /* renamed from: b */
    public final /* synthetic */ C0195JU f57b;

    public C0033BU(C0195JU ju, Context context) {
        this.f57b = ju;
        this.f56a = context;
    }

    /* renamed from: a */
    public void mo70a(ba baVar) {
        Q q = baVar.a;
        String str = this.f57b.f471J;
        StringBuilder sb = new StringBuilder();
        sb.append("api_error: ");
        sb.append(baVar.getMessage());
        sb.append(", code: ");
        sb.append(q);
        Log.e(str, sb.toString());
        Context context = this.f56a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(baVar.getMessage());
        sb2.append("");
        Toast.makeText(context, sb2.toString(), 1).show();
    }
}
