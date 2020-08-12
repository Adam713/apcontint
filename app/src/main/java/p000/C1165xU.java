package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;

/* renamed from: xU */
class C1165xU implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f4104a;

    /* renamed from: b */
    public final /* synthetic */ C0195JU f4105b;

    public C1165xU(C0195JU ju, AutoCompleteTextView autoCompleteTextView) {
        this.f4105b = ju;
        this.f4104a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f4104a.showDropDown();
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getX() <= ((float) ((this.f4104a.getCompoundDrawables()[0] != null ? this.f4104a.getCompoundDrawables()[0].getBounds().width() : 0) + this.f4104a.getPaddingLeft() + this.f4104a.getLeft()))) {
                this.f4104a.setText("");
                this.f4104a.requestFocus();
                return false;
            }
            if (motionEvent.getX() >= ((float) ((this.f4104a.getRight() - this.f4104a.getPaddingRight()) - (this.f4104a.getCompoundDrawables()[2] != null ? this.f4104a.getCompoundDrawables()[2].getBounds().width() : 0)))) {
            }
        }
        return false;
    }
}
