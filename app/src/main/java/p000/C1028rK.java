package p000;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: rK */
class C1028rK extends Handler {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit f3681a;

    public C1028rK(Customer_Det_List_edit customer_Det_List_edit) {
        this.f3681a = customer_Det_List_edit;
    }

    public void handleMessage(Message message) {
        StringBuilder sb = new StringBuilder();
        sb.append(message.obj);
        sb.append("");
        Log.d("msg=", sb.toString());
        if (!message.obj.toString().equals("0") && message.obj.toString().equals("1")) {
            C0195JU ju = this.f3681a.f2285b;
            StringBuilder sb2 = new StringBuilder();
            Customer_Det_List_edit customer_Det_List_edit = this.f3681a;
            sb2.append(customer_Det_List_edit.f2285b.mo465K(customer_Det_List_edit.f2322ta));
            sb2.append(".pdf");
            ju.mo462I(sb2.toString());
        }
        this.f3681a.mo3614b(false);
    }
}
