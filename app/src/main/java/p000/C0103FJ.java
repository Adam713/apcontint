package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: FJ */
class C0103FJ implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f240a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f241b;

    public C0103FJ(Customer_Det_List_edit customer_Det_List_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f241b = customer_Det_List_edit;
        this.f240a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f240a.showDropDown();
        return false;
    }
}
