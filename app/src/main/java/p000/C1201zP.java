package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: zP */
class C1201zP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f4200a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f4201b;

    public C1201zP(C0523YQ yq, Handler handler) {
        this.f4201b = yq;
        this.f4200a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4201b.f1597qa = false;
        Handler handler = this.f4200a;
        handler.sendMessage(handler.obtainMessage());
    }
}
