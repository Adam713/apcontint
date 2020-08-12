package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: aL */
class C0599aL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f1809a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f1810b;

    public C0599aL(Customer_Det_List_edit2 customer_Det_List_edit2, Handler handler) {
        this.f1810b = customer_Det_List_edit2;
        this.f1809a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1810b.f2388na = false;
        Handler handler = this.f1809a;
        handler.sendMessage(handler.obtainMessage());
    }
}
