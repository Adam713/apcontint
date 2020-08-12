package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: NH */
class C0275NH implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f756a;

    /* renamed from: b */
    public final /* synthetic */ CustomerList f757b;

    public C0275NH(CustomerList customerList, AutoCompleteTextView autoCompleteTextView) {
        this.f757b = customerList;
        this.f756a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f756a.showDropDown();
        return false;
    }
}
