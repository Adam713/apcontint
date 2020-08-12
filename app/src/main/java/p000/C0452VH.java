package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: VH */
class C0452VH implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f1305a;

    /* renamed from: b */
    public final /* synthetic */ CustomerList f1306b;

    public C0452VH(CustomerList customerList, Handler handler) {
        this.f1306b = customerList;
        this.f1305a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1306b.f2083E = false;
        Handler handler = this.f1305a;
        handler.sendMessage(handler.obtainMessage());
    }
}
