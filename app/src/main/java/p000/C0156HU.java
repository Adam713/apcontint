package p000;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: HU */
class C0156HU implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f338a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f339b;

    /* renamed from: c */
    public final /* synthetic */ C0195JU f340c;

    public C0156HU(C0195JU ju, Context context, AlertDialog alertDialog) {
        this.f340c = ju;
        this.f338a = context;
        this.f339b = alertDialog;
    }

    public void onClick(View view) {
        try {
            this.f340c.mo552c(this.f338a, C0195JU.f445e);
        } catch (Exception unused) {
        }
        this.f339b.dismiss();
    }
}
