package p000;

import android.os.Message;

/* renamed from: ZG */
class C0540ZG implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Message f1643a;

    /* renamed from: b */
    public final /* synthetic */ C0562a f1644b;

    public C0540ZG(C0562a aVar, Message message) {
        this.f1644b = aVar;
        this.f1643a = message;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown handler message received: ");
        sb.append(this.f1643a.what);
        throw new AssertionError(sb.toString());
    }
}
