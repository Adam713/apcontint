package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: hL */
class C0813hL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String f3045a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f3046b;

    public C0813hL(Customer_Det_List_edit2 customer_Det_List_edit2, String str) {
        this.f3046b = customer_Det_List_edit2;
        this.f3045a = str;
    }

    public void onClick(View view) {
        this.f3046b.f2397s.setText(this.f3045a);
        this.f3046b.f2401u.performClick();
    }
}
