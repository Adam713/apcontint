package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: zK */
class C1196zK implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f4194a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f4195b;

    public C1196zK(Customer_Det_List_edit customer_Det_List_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f4195b = customer_Det_List_edit;
        this.f4194a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4194a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
