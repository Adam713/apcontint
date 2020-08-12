package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: OJ */
class C0299OJ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ArrayAdapter f851a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f852b;

    /* renamed from: c */
    public final /* synthetic */ Customer_Det_List_edit f853c;

    public C0299OJ(Customer_Det_List_edit customer_Det_List_edit, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        this.f853c = customer_Det_List_edit;
        this.f851a = arrayAdapter;
        this.f852b = autoCompleteTextView;
    }

    public void onClick(View view) {
        this.f853c.mo3601a(this.f851a, this.f852b);
    }
}
