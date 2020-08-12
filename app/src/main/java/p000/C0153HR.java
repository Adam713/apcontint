package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;

/* renamed from: HR */
class C0153HR implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f334a;

    /* renamed from: b */
    public final /* synthetic */ C0925mS f335b;

    public C0153HR(C0925mS mSVar, AutoCompleteTextView autoCompleteTextView) {
        this.f335b = mSVar;
        this.f334a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f334a.showDropDown();
        return false;
    }
}
