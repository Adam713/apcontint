package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: CK */
class C0047CK implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f85a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f86b;

    public C0047CK(Customer_Det_List_edit2 customer_Det_List_edit2, AutoCompleteTextView autoCompleteTextView) {
        this.f86b = customer_Det_List_edit2;
        this.f85a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f85a.showDropDown();
        return false;
    }
}
