package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: pL */
class C0988pL implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f3572a;

    public C0988pL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f3572a = customer_Det_List_edit2;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3572a.f2389o.setText(adapterView.getItemAtPosition(i).toString());
        this.f3572a.mo3675H();
        this.f3572a.f2391p.requestFocus();
    }
}
