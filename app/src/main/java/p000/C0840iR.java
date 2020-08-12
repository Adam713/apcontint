package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.frag.CurrList_edit;

/* renamed from: iR */
class C0840iR implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f3101a;

    /* renamed from: b */
    public final /* synthetic */ CurrList_edit f3102b;

    public C0840iR(CurrList_edit currList_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f3102b = currList_edit;
        this.f3101a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f3101a.showDropDown();
        return false;
    }
}
