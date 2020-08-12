package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: iK */
class C0833iK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f3093a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f3094b;

    public C0833iK(Customer_Det_List_edit customer_Det_List_edit, Handler handler) {
        this.f3094b = customer_Det_List_edit;
        this.f3093a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3094b.f2304ka = false;
        Handler handler = this.f3093a;
        handler.sendMessage(handler.obtainMessage());
    }
}
