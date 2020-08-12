package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;

/* renamed from: PR */
class C0331PR implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f946a;

    /* renamed from: b */
    public final /* synthetic */ C0925mS f947b;

    public C0331PR(C0925mS mSVar, AutoCompleteTextView autoCompleteTextView) {
        this.f947b = mSVar;
        this.f946a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f946a.showDropDown();
        return false;
    }
}
