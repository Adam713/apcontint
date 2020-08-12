package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: nL */
class C0940nL implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f3420a;

    public C0940nL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f3420a = customer_Det_List_edit2;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3420a.f2387n.setText(adapterView.getItemAtPosition(i).toString());
        Customer_Det_List_edit2 customer_Det_List_edit2 = this.f3420a;
        customer_Det_List_edit2.mo3708b(customer_Det_List_edit2.f2387n.getText().toString());
        if (!this.f3420a.f2363b.mo524a("t_name_lock", false) || this.f3420a.f2389o.getText() == null || this.f3420a.f2389o.getText().toString().length() <= 0) {
            this.f3420a.f2389o.requestFocus();
        } else {
            this.f3420a.f2391p.requestFocus();
        }
        this.f3420a.mo3748p();
        this.f3420a.mo3675H();
    }
}
