package p000;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: IU */
class C0176IU implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f389a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f390b;

    /* renamed from: c */
    public final /* synthetic */ C0195JU f391c;

    public C0176IU(C0195JU ju, Context context, AlertDialog alertDialog) {
        this.f391c = ju;
        this.f389a = context;
        this.f390b = alertDialog;
    }

    public void onClick(View view) {
        try {
            this.f391c.mo552c(this.f389a, C0195JU.f445e);
        } catch (Exception unused) {
        }
        this.f390b.dismiss();
    }
}
