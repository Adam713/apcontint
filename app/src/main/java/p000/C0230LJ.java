package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: LJ */
class C0230LJ implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f602a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f603b;

    public C0230LJ(Customer_Det_List_edit customer_Det_List_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f603b = customer_Det_List_edit;
        this.f602a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f602a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
