package p000;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: GQ */
class C0130GQ extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f284a;

    public C0130GQ(C0523YQ yq) {
        this.f284a = yq;
    }

    public void handleMessage(Message message) {
        StringBuilder sb = new StringBuilder();
        sb.append(message.obj);
        sb.append("");
        Log.d("msg=", sb.toString());
        if (!message.obj.toString().equals("0") && message.obj.toString().equals("1")) {
            C0195JU ju = this.f284a.f1606v;
            StringBuilder sb2 = new StringBuilder();
            C0523YQ yq = this.f284a;
            sb2.append(yq.f1606v.mo465K(yq.f1567fb));
            sb2.append(".pdf");
            ju.mo462I(sb2.toString());
        }
        this.f284a.mo1578f(false);
    }
}
