package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: IK */
class C0166IK implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f374a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f375b;

    public C0166IK(Customer_Det_List_edit2 customer_Det_List_edit2, AutoCompleteTextView autoCompleteTextView) {
        this.f375b = customer_Det_List_edit2;
        this.f374a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f374a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
