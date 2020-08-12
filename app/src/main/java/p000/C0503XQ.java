package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: XQ */
class C0503XQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f1447a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f1448b;

    public C0503XQ(C0523YQ yq, Handler handler) {
        this.f1448b = yq;
        this.f1447a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1448b.f1595pa = false;
        Handler handler = this.f1447a;
        handler.sendMessage(handler.obtainMessage());
    }
}
