package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;

/* renamed from: MQ */
class C0264MQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f723a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f724b;

    public C0264MQ(C0523YQ yq, Handler handler) {
        this.f724b = yq;
        this.f723a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C0195JU ju = this.f724b.f1606v;
        StringBuilder sb = new StringBuilder();
        sb.append("insert into groups  (name )  values( '");
        sb.append(this.f724b.f1588mb);
        sb.append("'  )");
        ju.mo562d(sb.toString());
        this.f724b.f1595pa = true;
        Handler handler = this.f723a;
        handler.sendMessage(handler.obtainMessage());
    }
}
