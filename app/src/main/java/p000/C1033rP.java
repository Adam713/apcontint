package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: rP */
class C1033rP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f3686a;

    /* renamed from: b */
    public final /* synthetic */ C1134wP f3687b;

    public C1033rP(C1134wP wPVar, Handler handler) {
        this.f3687b = wPVar;
        this.f3686a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3687b.mo5297b();
        this.f3687b.f3949P = true;
        Handler handler = this.f3686a;
        handler.sendMessage(handler.obtainMessage());
    }
}
