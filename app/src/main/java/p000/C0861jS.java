package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;

/* renamed from: jS */
class C0861jS implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f3163a;

    /* renamed from: b */
    public final /* synthetic */ C0925mS f3164b;

    public C0861jS(C0925mS mSVar, AutoCompleteTextView autoCompleteTextView) {
        this.f3164b = mSVar;
        this.f3163a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f3163a.showDropDown();
        return false;
    }
}
