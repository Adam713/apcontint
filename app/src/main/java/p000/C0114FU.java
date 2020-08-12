package p000;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: FU */
class C0114FU implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f254a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f255b;

    /* renamed from: c */
    public final /* synthetic */ C0195JU f256c;

    public C0114FU(C0195JU ju, Context context, AlertDialog alertDialog) {
        this.f256c = ju;
        this.f254a = context;
        this.f255b = alertDialog;
    }

    public void onClick(View view) {
        try {
            this.f256c.mo552c(this.f254a, C0195JU.f445e);
        } catch (Exception unused) {
        }
        this.f255b.dismiss();
    }
}
