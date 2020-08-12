package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: vL */
class C1109vL implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f3867a;

    public C1109vL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f3867a = customer_Det_List_edit2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getX() >= ((float) (((this.f3867a.f2391p.getRight() - this.f3867a.f2391p.getLeft()) - this.f3867a.f2391p.getPaddingRight()) - (this.f3867a.f2391p.getCompoundDrawables()[2] != null ? this.f3867a.f2391p.getCompoundDrawables()[2].getBounds().width() : 0)))) {
                EditText editText = this.f3867a.f2391p;
                if (editText.getText() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f3867a.f2391p.getText().toString());
                    sb.append("000");
                    str = sb.toString();
                } else {
                    str = "";
                }
                editText.setText(str);
                this.f3867a.f2391p.requestFocus();
            }
        }
        return false;
    }
}
