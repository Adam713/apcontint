package p000;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: EU */
class C0095EU implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f228a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f229b;

    /* renamed from: c */
    public final /* synthetic */ C0195JU f230c;

    public C0095EU(C0195JU ju, Context context, AlertDialog alertDialog) {
        this.f230c = ju;
        this.f228a = context;
        this.f229b = alertDialog;
    }

    public void onClick(View view) {
        try {
            this.f230c.mo552c(this.f228a, C0195JU.f445e);
        } catch (Exception unused) {
        }
        this.f229b.dismiss();
    }
}
