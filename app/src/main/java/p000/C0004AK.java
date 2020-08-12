package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: AK */
class C0004AK implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f6a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f7b;

    /* renamed from: c */
    public final /* synthetic */ Customer_Det_List_edit2 f8c;

    public C0004AK(Customer_Det_List_edit2 customer_Det_List_edit2, AutoCompleteTextView autoCompleteTextView, Dialog dialog) {
        this.f8c = customer_Det_List_edit2;
        this.f6a = autoCompleteTextView;
        this.f7b = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f6a.setText(adapterView.getItemAtPosition(i).toString());
        this.f7b.dismiss();
    }
}
