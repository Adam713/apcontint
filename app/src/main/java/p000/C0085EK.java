package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: EK */
class C0085EK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ArrayAdapter f211a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f212b;

    /* renamed from: c */
    public final /* synthetic */ Customer_Det_List_edit2 f213c;

    public C0085EK(Customer_Det_List_edit2 customer_Det_List_edit2, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        this.f213c = customer_Det_List_edit2;
        this.f211a = arrayAdapter;
        this.f212b = autoCompleteTextView;
    }

    public void onClick(View view) {
        this.f213c.mo3697a(this.f211a, this.f212b);
    }
}
