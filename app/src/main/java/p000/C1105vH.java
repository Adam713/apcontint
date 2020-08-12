package p000;

import android.os.Message;

/* renamed from: vH */
class C1105vH implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Message f3861a;

    /* renamed from: b */
    public final /* synthetic */ C1126a f3862b;

    public C1105vH(C1126a aVar, Message message) {
        this.f3862b = aVar;
        this.f3861a = message;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled stats message.");
        sb.append(this.f3861a.what);
        throw new AssertionError(sb.toString());
    }
}
