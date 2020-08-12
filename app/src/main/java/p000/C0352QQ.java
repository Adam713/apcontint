package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;

/* renamed from: QQ */
class C0352QQ implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f1019a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f1020b;

    public C0352QQ(C0523YQ yq, AutoCompleteTextView autoCompleteTextView) {
        this.f1020b = yq;
        this.f1019a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f1019a.showDropDown();
        return false;
    }
}
