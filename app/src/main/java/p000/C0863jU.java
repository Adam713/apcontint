package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: jU */
class C0863jU implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f3166a;

    /* renamed from: b */
    public final /* synthetic */ String f3167b;

    /* renamed from: c */
    public final /* synthetic */ C0195JU f3168c;

    public C0863jU(C0195JU ju, Context context, String str) {
        this.f3168c = ju;
        this.f3166a = context;
        this.f3167b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3168c.mo502a(this.f3166a, this.f3167b);
    }
}
