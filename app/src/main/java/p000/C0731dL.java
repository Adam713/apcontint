package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: dL */
class C0731dL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f2850a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f2851b;

    public C0731dL(Customer_Det_List_edit2 customer_Det_List_edit2, Handler handler) {
        this.f2851b = customer_Det_List_edit2;
        this.f2850a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2851b.f2386ma = false;
        Handler handler = this.f2850a;
        handler.sendMessage(handler.obtainMessage());
    }
}
