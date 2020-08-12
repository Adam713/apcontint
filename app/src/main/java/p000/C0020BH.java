package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: BH */
class C0020BH extends Handler {
    public C0020BH(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000);
    }
}
