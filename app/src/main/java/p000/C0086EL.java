package p000;

import android.os.Message;
import android.widget.ListView;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: EL */
class C0086EL implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f214a;

    public C0086EL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f214a = customer_Det_List_edit2;
    }

    public void run() {
        if (this.f214a.f2343I.getTag() == null) {
            Customer_Det_List_edit2 customer_Det_List_edit2 = this.f214a;
            customer_Det_List_edit2.f2410ya = customer_Det_List_edit2.f2363b.mo465K(customer_Det_List_edit2.f2387n.getText().toString());
            Customer_Det_List_edit2 customer_Det_List_edit22 = this.f214a;
            C0195JU ju = customer_Det_List_edit22.f2363b;
            ListView listView = customer_Det_List_edit22.f2337C;
            String K = ju.mo465K(customer_Det_List_edit22.f2387n.getText().toString());
            Customer_Det_List_edit2 customer_Det_List_edit23 = this.f214a;
            ju.mo507a(listView, K, customer_Det_List_edit23.mo3687a(customer_Det_List_edit23.f2345K.f863d), Value.PERCENTAGE, Value.PERCENTAGE);
        } else {
            Customer_Det_List_edit2 customer_Det_List_edit24 = this.f214a;
            C0195JU ju2 = customer_Det_List_edit24.f2363b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f214a.f2387n.getText().toString());
            String str = "-";
            sb.append(str);
            sb.append(this.f214a.f2343I.getTag().toString());
            customer_Det_List_edit24.f2410ya = ju2.mo465K(sb.toString());
            Customer_Det_List_edit2 customer_Det_List_edit25 = this.f214a;
            C0195JU ju3 = customer_Det_List_edit25.f2363b;
            ListView listView2 = customer_Det_List_edit25.f2337C;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f214a.f2387n.getText().toString());
            sb2.append(str);
            sb2.append(this.f214a.f2343I.getTag().toString());
            String K2 = ju3.mo465K(sb2.toString());
            Customer_Det_List_edit2 customer_Det_List_edit26 = this.f214a;
            ju3.mo507a(listView2, K2, customer_Det_List_edit26.mo3687a(customer_Det_List_edit26.f2345K.f863d), Value.PERCENTAGE, Value.PERCENTAGE);
        }
        Message message = new Message();
        message.obj = "1";
        this.f214a.f2408xa.sendMessage(message);
    }
}
