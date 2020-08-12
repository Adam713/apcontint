package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: WR */
class C0483WR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f1383a;

    /* renamed from: b */
    public final /* synthetic */ C0925mS f1384b;

    public C0483WR(C0925mS mSVar, Handler handler) {
        this.f1384b = mSVar;
        this.f1383a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1384b.f3362S = false;
        Handler handler = this.f1383a;
        handler.sendMessage(handler.obtainMessage());
    }
}
