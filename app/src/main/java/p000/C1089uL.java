package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: uL */
class C1089uL implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f3822a;

    public C1089uL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f3822a = customer_Det_List_edit2;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f3822a.mo3675H();
    }
}
