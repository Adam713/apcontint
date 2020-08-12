package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: UH */
class C0427UH implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f1208a;

    /* renamed from: b */
    public final /* synthetic */ CustomerList f1209b;

    public C0427UH(CustomerList customerList, Handler handler) {
        this.f1209b = customerList;
        this.f1208a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C0195JU ju = this.f1209b.f2089c;
        StringBuilder sb = new StringBuilder();
        sb.append("insert into groups  (name )  values( '");
        sb.append(this.f1209b.f2084F);
        sb.append("'  )");
        ju.mo562d(sb.toString());
        this.f1209b.f2083E = true;
        Handler handler = this.f1208a;
        handler.sendMessage(handler.obtainMessage());
    }
}
