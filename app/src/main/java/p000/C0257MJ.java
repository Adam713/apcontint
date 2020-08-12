package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: MJ */
class C0257MJ implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f706a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f707b;

    public C0257MJ(Customer_Det_List_edit customer_Det_List_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f707b = customer_Det_List_edit;
        this.f706a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f706a.showDropDown();
        return false;
    }
}
