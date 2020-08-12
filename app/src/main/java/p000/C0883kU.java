package p000;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: kU */
class C0883kU implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f3212a;

    /* renamed from: b */
    public final /* synthetic */ String f3213b;

    /* renamed from: c */
    public final /* synthetic */ Dialog f3214c;

    /* renamed from: d */
    public final /* synthetic */ C0195JU f3215d;

    public C0883kU(C0195JU ju, Context context, String str, Dialog dialog) {
        this.f3215d = ju;
        this.f3212a = context;
        this.f3213b = str;
        this.f3214c = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0 || i == 1) {
            this.f3215d.mo503a(this.f3212a, this.f3213b, i);
        } else if (i == 2) {
            this.f3215d.mo534b(this.f3212a, this.f3213b);
        }
        this.f3214c.dismiss();
    }
}
