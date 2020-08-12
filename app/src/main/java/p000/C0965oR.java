package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.frag.CurrList_edit;

/* renamed from: oR */
class C0965oR implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f3510a;

    /* renamed from: b */
    public final /* synthetic */ CurrList_edit f3511b;

    public C0965oR(CurrList_edit currList_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f3511b = currList_edit;
        this.f3510a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f3510a.showDropDown();
        return false;
    }
}
