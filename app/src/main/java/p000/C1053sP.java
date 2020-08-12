package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: sP */
class C1053sP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f3735a;

    /* renamed from: b */
    public final /* synthetic */ C1134wP f3736b;

    public C1053sP(C1134wP wPVar, Handler handler) {
        this.f3736b = wPVar;
        this.f3735a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3736b.f3949P = false;
        Handler handler = this.f3735a;
        handler.sendMessage(handler.obtainMessage());
    }
}
