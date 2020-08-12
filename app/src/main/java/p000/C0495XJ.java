package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: XJ */
class C0495XJ implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f1432a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f1433b;

    public C0495XJ(Customer_Det_List_edit customer_Det_List_edit, Dialog dialog) {
        this.f1433b = customer_Det_List_edit;
        this.f1432a = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            Customer_Det_List_edit customer_Det_List_edit = this.f1433b;
            customer_Det_List_edit.f2296ga = 4;
            String str = customer_Det_List_edit.f2297h;
            if (str != null && str.length() >= 3) {
                Customer_Det_List_edit customer_Det_List_edit2 = this.f1433b;
                C0195JU ju = customer_Det_List_edit2.f2285b;
                String str2 = customer_Det_List_edit2.f2297h;
                C0232LL f = customer_Det_List_edit2.mo3656s();
                Customer_Det_List_edit customer_Det_List_edit3 = this.f1433b;
                ju.mo637z(str2, ju.mo498a(f, customer_Det_List_edit3.f2289d, customer_Det_List_edit3.mo3592a(customer_Det_List_edit3.f2267K.f863d)));
                this.f1432a.dismiss();
            }
        } else {
            if (i == 1) {
                Customer_Det_List_edit customer_Det_List_edit4 = this.f1433b;
                customer_Det_List_edit4.f2296ga = 3;
                String str3 = customer_Det_List_edit4.f2297h;
                if (str3 != null && str3.length() >= 3) {
                    Customer_Det_List_edit customer_Det_List_edit5 = this.f1433b;
                    C0195JU ju2 = customer_Det_List_edit5.f2285b;
                    String str4 = customer_Det_List_edit5.f2297h;
                    C0232LL f2 = customer_Det_List_edit5.mo3656s();
                    Customer_Det_List_edit customer_Det_List_edit6 = this.f1433b;
                    ju2.mo634y(str4, ju2.mo498a(f2, customer_Det_List_edit6.f2289d, customer_Det_List_edit6.mo3592a(customer_Det_List_edit6.f2267K.f863d)));
                }
            } else if (i == 2) {
                Customer_Det_List_edit customer_Det_List_edit7 = this.f1433b;
                C0195JU ju3 = customer_Det_List_edit7.f2285b;
                C0232LL f3 = customer_Det_List_edit7.mo3656s();
                Customer_Det_List_edit customer_Det_List_edit8 = this.f1433b;
                ju3.mo486V(ju3.mo498a(f3, customer_Det_List_edit8.f2289d, customer_Det_List_edit8.mo3592a(customer_Det_List_edit8.f2267K.f863d)));
            }
            this.f1432a.dismiss();
        }
        Customer_Det_List_edit customer_Det_List_edit9 = this.f1433b;
        String k = customer_Det_List_edit9.f2287c;
        Customer_Det_List_edit customer_Det_List_edit10 = this.f1433b;
        customer_Det_List_edit9.mo3605a(k, customer_Det_List_edit10.f2289d, customer_Det_List_edit10.f2297h, customer_Det_List_edit10.f2291e);
        this.f1432a.dismiss();
    }
}
