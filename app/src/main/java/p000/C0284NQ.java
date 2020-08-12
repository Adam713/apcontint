package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: NQ */
class C0284NQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f769a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f770b;

    public C0284NQ(C0523YQ yq, Handler handler) {
        this.f770b = yq;
        this.f769a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f770b.f1595pa = false;
        Handler handler = this.f769a;
        handler.sendMessage(handler.obtainMessage());
    }
}
