package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: MK */
class C0258MK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ArrayAdapter f708a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f709b;

    /* renamed from: c */
    public final /* synthetic */ Customer_Det_List_edit2 f710c;

    public C0258MK(Customer_Det_List_edit2 customer_Det_List_edit2, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        this.f710c = customer_Det_List_edit2;
        this.f708a = arrayAdapter;
        this.f709b = autoCompleteTextView;
    }

    public void onClick(View view) {
        this.f710c.mo3697a(this.f708a, this.f709b);
    }
}
