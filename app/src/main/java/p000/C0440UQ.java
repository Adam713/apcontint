package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: UQ */
class C0440UQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f1258a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f1259b;

    public C0440UQ(C0523YQ yq, Handler handler) {
        this.f1259b = yq;
        this.f1258a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1259b.mo1537a();
        this.f1259b.f1595pa = true;
        Handler handler = this.f1258a;
        handler.sendMessage(handler.obtainMessage());
    }
}
