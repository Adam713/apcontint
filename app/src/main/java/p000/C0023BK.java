package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: BK */
class C0023BK implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f45a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f46b;

    public C0023BK(Customer_Det_List_edit2 customer_Det_List_edit2, AutoCompleteTextView autoCompleteTextView) {
        this.f46b = customer_Det_List_edit2;
        this.f45a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f45a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
