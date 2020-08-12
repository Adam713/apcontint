package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: GU */
class C0134GU implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f289a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f290b;

    /* renamed from: c */
    public final /* synthetic */ C0195JU f291c;

    public C0134GU(C0195JU ju, Context context, AlertDialog alertDialog) {
        this.f291c = ju;
        this.f289a = context;
        this.f290b = alertDialog;
    }

    public void onClick(View view) {
        try {
            this.f289a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.valdio.valdioveliu.daftar")));
        } catch (Exception unused) {
        }
        this.f290b.dismiss();
    }
}
