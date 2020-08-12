package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: rQ */
class C1034rQ implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3688a;

    public C1034rQ(C0523YQ yq) {
        this.f3688a = yq;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f3688a.f1501Ba.showDropDown();
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getX() <= ((float) ((this.f3688a.f1501Ba.getCompoundDrawables()[0] != null ? this.f3688a.f1501Ba.getCompoundDrawables()[0].getBounds().width() : 0) + this.f3688a.f1501Ba.getPaddingLeft() + this.f3688a.f1501Ba.getLeft()))) {
                this.f3688a.f1501Ba.setText("");
                this.f3688a.f1501Ba.requestFocus();
                this.f3688a.mo1528J();
            }
        }
        return false;
    }
}
