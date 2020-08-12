package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: HJ */
class C0145HJ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ArrayAdapter f318a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f319b;

    /* renamed from: c */
    public final /* synthetic */ Customer_Det_List_edit f320c;

    public C0145HJ(Customer_Det_List_edit customer_Det_List_edit, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        this.f320c = customer_Det_List_edit;
        this.f318a = arrayAdapter;
        this.f319b = autoCompleteTextView;
    }

    public void onClick(View view) {
        this.f320c.mo3601a(this.f318a, this.f319b);
    }
}
