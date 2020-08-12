package p000;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: DL */
class C0067DL extends Handler {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f166a;

    public C0067DL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f166a = customer_Det_List_edit2;
    }

    public void handleMessage(Message message) {
        StringBuilder sb = new StringBuilder();
        sb.append(message.obj);
        sb.append("");
        Log.d("msg=", sb.toString());
        if (!message.obj.toString().equals("0") && message.obj.toString().equals("1")) {
            C0195JU ju = this.f166a.f2363b;
            StringBuilder sb2 = new StringBuilder();
            Customer_Det_List_edit2 customer_Det_List_edit2 = this.f166a;
            sb2.append(customer_Det_List_edit2.f2363b.mo465K(customer_Det_List_edit2.f2410ya));
            sb2.append(".pdf");
            ju.mo462I(sb2.toString());
        }
        this.f166a.mo3710b(false);
    }
}
