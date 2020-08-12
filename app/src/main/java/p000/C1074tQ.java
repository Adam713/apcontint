package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: tQ */
class C1074tQ implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3784a;

    public C1074tQ(C0523YQ yq) {
        this.f3784a = yq;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f3784a.f1503Ca.showDropDown();
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getX() <= ((float) ((this.f3784a.f1503Ca.getCompoundDrawables()[0] != null ? this.f3784a.f1503Ca.getCompoundDrawables()[0].getBounds().width() : 0) + this.f3784a.f1503Ca.getPaddingLeft() + this.f3784a.f1503Ca.getLeft()))) {
                this.f3784a.f1503Ca.setText("");
                this.f3784a.f1503Ca.requestFocus();
                this.f3784a.mo1528J();
            }
        }
        return false;
    }
}
