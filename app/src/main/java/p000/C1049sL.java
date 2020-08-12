package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: sL */
class C1049sL implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f3730a;

    public C1049sL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f3730a = customer_Det_List_edit2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getX() <= ((float) ((this.f3730a.f2389o.getCompoundDrawables()[0] != null ? this.f3730a.f2389o.getCompoundDrawables()[0].getBounds().width() : 0) + this.f3730a.f2389o.getPaddingLeft() + this.f3730a.f2389o.getLeft()))) {
                this.f3730a.f2389o.setText("");
                this.f3730a.f2389o.requestFocus();
                this.f3730a.mo3675H();
                return false;
            }
            if (motionEvent.getX() >= ((float) ((this.f3730a.f2389o.getRight() - this.f3730a.f2389o.getPaddingRight()) - (this.f3730a.f2389o.getCompoundDrawables()[2] != null ? this.f3730a.f2389o.getCompoundDrawables()[2].getBounds().width() : 0)))) {
                C0195JU ju = this.f3730a.f2363b;
                String str = "t_name_lock";
                ju.mo543b(str, true ^ ju.mo524a(str, false));
                this.f3730a.mo3673F();
            }
        }
        return false;
    }
}
