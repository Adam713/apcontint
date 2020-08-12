package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: qL */
class C1007qL implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f3603a;

    public C1007qL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f3603a = customer_Det_List_edit2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getX() <= ((float) ((this.f3603a.f2387n.getCompoundDrawables()[0] != null ? this.f3603a.f2387n.getCompoundDrawables()[0].getBounds().width() : 0) + this.f3603a.f2387n.getPaddingLeft() + this.f3603a.f2387n.getLeft()))) {
                this.f3603a.f2387n.setText("");
                this.f3603a.f2387n.requestFocus();
                this.f3603a.mo3675H();
                return false;
            }
            if (motionEvent.getX() >= ((float) ((this.f3603a.f2387n.getRight() - this.f3603a.f2387n.getPaddingRight()) - (this.f3603a.f2387n.getCompoundDrawables()[2] != null ? this.f3603a.f2387n.getCompoundDrawables()[2].getBounds().width() : 0)))) {
                C0195JU ju = this.f3603a.f2363b;
                String str = "f_name_lock";
                ju.mo543b(str, true ^ ju.mo524a(str, true));
                this.f3603a.mo3673F();
            }
        }
        return false;
    }
}
