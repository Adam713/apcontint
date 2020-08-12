package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: yP */
class C1179yP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f4148a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f4149b;

    public C1179yP(C0523YQ yq, Handler handler) {
        this.f4149b = yq;
        this.f4148a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4149b.mo1552b();
        this.f4149b.f1597qa = true;
        Handler handler = this.f4148a;
        handler.sendMessage(handler.obtainMessage());
    }
}
