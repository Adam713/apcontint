package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: JK */
class C0185JK implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f422a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f423b;

    public C0185JK(Customer_Det_List_edit2 customer_Det_List_edit2, AutoCompleteTextView autoCompleteTextView) {
        this.f423b = customer_Det_List_edit2;
        this.f422a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f422a.showDropDown();
        return false;
    }
}
