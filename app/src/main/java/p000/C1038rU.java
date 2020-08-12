package p000;

import android.os.Handler;
import android.util.Log;

/* renamed from: rU */
class C1038rU implements a {

    /* renamed from: a */
    public final /* synthetic */ Handler f3694a;

    /* renamed from: b */
    public final /* synthetic */ C0195JU f3695b;

    public C1038rU(C0195JU ju, Handler handler) {
        this.f3695b = ju;
        this.f3694a = handler;
    }

    /* renamed from: a */
    public void mo5073a(ba baVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(baVar.getMessage());
        sb.append("");
        Log.d("Volley error: ", sb.toString());
        baVar.printStackTrace();
        this.f3695b.f476O = false;
        Handler handler = this.f3694a;
        handler.sendMessage(handler.obtainMessage());
        this.f3695b.f472K.dismiss();
    }
}
