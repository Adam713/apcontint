package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: fK */
class C0773fK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f2948a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f2949b;

    public C0773fK(Customer_Det_List_edit customer_Det_List_edit, Handler handler) {
        this.f2949b = customer_Det_List_edit;
        this.f2948a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2949b.f2306la = false;
        Handler handler = this.f2948a;
        handler.sendMessage(handler.obtainMessage());
    }
}
