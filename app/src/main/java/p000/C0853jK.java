package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: jK */
class C0853jK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f3149a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f3150b;

    public C0853jK(Customer_Det_List_edit customer_Det_List_edit, boolean z) {
        this.f3150b = customer_Det_List_edit;
        this.f3149a = z;
    }

    public void onClick(View view) {
        this.f3150b.mo3600a(view, this.f3149a);
    }
}
