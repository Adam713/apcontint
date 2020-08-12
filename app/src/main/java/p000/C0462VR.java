package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: VR */
class C0462VR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f1317a;

    /* renamed from: b */
    public final /* synthetic */ C0925mS f1318b;

    public C0462VR(C0925mS mSVar, Handler handler) {
        this.f1318b = mSVar;
        this.f1317a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C0195JU ju = this.f1318b.f3372c;
        StringBuilder sb = new StringBuilder();
        sb.append("insert into groups  (name )  values( '");
        sb.append(this.f1318b.f3363T);
        sb.append("'  )");
        ju.mo562d(sb.toString());
        this.f1318b.f3362S = true;
        Handler handler = this.f1317a;
        handler.sendMessage(handler.obtainMessage());
    }
}
