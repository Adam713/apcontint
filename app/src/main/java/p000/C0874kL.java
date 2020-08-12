package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: kL */
class C0874kL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f3200a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f3201b;

    public C0874kL(Customer_Det_List_edit2 customer_Det_List_edit2, Handler handler) {
        this.f3201b = customer_Det_List_edit2;
        this.f3200a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3201b.f2398sa = false;
        Handler handler = this.f3200a;
        handler.sendMessage(handler.obtainMessage());
    }
}
