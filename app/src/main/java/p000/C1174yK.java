package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: yK */
class C1174yK implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f4136a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f4137b;

    /* renamed from: c */
    public final /* synthetic */ Customer_Det_List_edit f4138c;

    public C1174yK(Customer_Det_List_edit customer_Det_List_edit, AutoCompleteTextView autoCompleteTextView, Dialog dialog) {
        this.f4138c = customer_Det_List_edit;
        this.f4136a = autoCompleteTextView;
        this.f4137b = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4136a.setText(adapterView.getItemAtPosition(i).toString());
        this.f4137b.dismiss();
    }
}
