package p000;

import android.os.Message;
import android.widget.ListView;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: sK */
class C1048sK implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit f3729a;

    public C1048sK(Customer_Det_List_edit customer_Det_List_edit) {
        this.f3729a = customer_Det_List_edit;
    }

    public void run() {
        if (this.f3729a.f2265I.getTag() == null) {
            Customer_Det_List_edit customer_Det_List_edit = this.f3729a;
            customer_Det_List_edit.f2322ta = customer_Det_List_edit.f2285b.mo465K(customer_Det_List_edit.f2309n.getText().toString());
            Customer_Det_List_edit customer_Det_List_edit2 = this.f3729a;
            C0195JU ju = customer_Det_List_edit2.f2285b;
            ListView listView = customer_Det_List_edit2.f2259C;
            String K = ju.mo465K(customer_Det_List_edit2.f2309n.getText().toString());
            Customer_Det_List_edit customer_Det_List_edit3 = this.f3729a;
            ju.mo507a(listView, K, customer_Det_List_edit3.mo3592a(customer_Det_List_edit3.f2267K.f863d), Value.PERCENTAGE, Value.PERCENTAGE);
        } else {
            Customer_Det_List_edit customer_Det_List_edit4 = this.f3729a;
            C0195JU ju2 = customer_Det_List_edit4.f2285b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3729a.f2309n.getText().toString());
            String str = "-";
            sb.append(str);
            sb.append(this.f3729a.f2265I.getTag().toString());
            customer_Det_List_edit4.f2322ta = ju2.mo465K(sb.toString());
            Customer_Det_List_edit customer_Det_List_edit5 = this.f3729a;
            C0195JU ju3 = customer_Det_List_edit5.f2285b;
            ListView listView2 = customer_Det_List_edit5.f2259C;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f3729a.f2309n.getText().toString());
            sb2.append(str);
            sb2.append(this.f3729a.f2265I.getTag().toString());
            String K2 = ju3.mo465K(sb2.toString());
            Customer_Det_List_edit customer_Det_List_edit6 = this.f3729a;
            ju3.mo507a(listView2, K2, customer_Det_List_edit6.mo3592a(customer_Det_List_edit6.f2267K.f863d), Value.PERCENTAGE, Value.PERCENTAGE);
        }
        Message message = new Message();
        message.obj = "1";
        this.f3729a.f2320sa.sendMessage(message);
    }
}
