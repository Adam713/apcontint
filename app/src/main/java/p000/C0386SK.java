package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: SK */
class C0386SK implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f1127a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f1128b;

    public C0386SK(Customer_Det_List_edit2 customer_Det_List_edit2, Dialog dialog) {
        this.f1128b = customer_Det_List_edit2;
        this.f1127a = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            Customer_Det_List_edit2 customer_Det_List_edit2 = this.f1128b;
            customer_Det_List_edit2.f2378ia = 4;
            String str = customer_Det_List_edit2.f2375h;
            if (str != null && str.length() >= 3) {
                Customer_Det_List_edit2 customer_Det_List_edit22 = this.f1128b;
                C0195JU ju = customer_Det_List_edit22.f2363b;
                String str2 = customer_Det_List_edit22.f2375h;
                C0232LL f = customer_Det_List_edit22.mo3756w();
                Customer_Det_List_edit2 customer_Det_List_edit23 = this.f1128b;
                ju.mo637z(str2, ju.mo498a(f, customer_Det_List_edit23.f2367d, customer_Det_List_edit23.mo3687a(customer_Det_List_edit23.f2345K.f863d)));
                this.f1127a.dismiss();
            }
        } else {
            if (i == 1) {
                Customer_Det_List_edit2 customer_Det_List_edit24 = this.f1128b;
                customer_Det_List_edit24.f2378ia = 3;
                String str3 = customer_Det_List_edit24.f2375h;
                if (str3 != null && str3.length() >= 3) {
                    Customer_Det_List_edit2 customer_Det_List_edit25 = this.f1128b;
                    C0195JU ju2 = customer_Det_List_edit25.f2363b;
                    String str4 = customer_Det_List_edit25.f2375h;
                    C0232LL f2 = customer_Det_List_edit25.mo3756w();
                    Customer_Det_List_edit2 customer_Det_List_edit26 = this.f1128b;
                    ju2.mo634y(str4, ju2.mo498a(f2, customer_Det_List_edit26.f2367d, customer_Det_List_edit26.mo3687a(customer_Det_List_edit26.f2345K.f863d)));
                }
            } else if (i == 2) {
                Customer_Det_List_edit2 customer_Det_List_edit27 = this.f1128b;
                C0195JU ju3 = customer_Det_List_edit27.f2363b;
                C0232LL f3 = customer_Det_List_edit27.mo3756w();
                Customer_Det_List_edit2 customer_Det_List_edit28 = this.f1128b;
                ju3.mo486V(ju3.mo498a(f3, customer_Det_List_edit28.f2367d, customer_Det_List_edit28.mo3687a(customer_Det_List_edit28.f2345K.f863d)));
            }
            this.f1127a.dismiss();
        }
        Customer_Det_List_edit2 customer_Det_List_edit29 = this.f1128b;
        String k = customer_Det_List_edit29.f2365c;
        Customer_Det_List_edit2 customer_Det_List_edit210 = this.f1128b;
        customer_Det_List_edit29.mo3701a(k, customer_Det_List_edit210.f2367d, customer_Det_List_edit210.f2375h, customer_Det_List_edit210.f2369e);
        this.f1127a.dismiss();
    }
}
