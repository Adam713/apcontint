package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: mL */
class C0918mL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f3335a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f3336b;

    public C0918mL(Customer_Det_List_edit2 customer_Det_List_edit2, boolean z) {
        this.f3336b = customer_Det_List_edit2;
        this.f3335a = z;
    }

    public void onClick(View view) {
        this.f3336b.mo3696a(view, this.f3335a);
    }
}
