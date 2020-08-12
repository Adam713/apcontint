package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: lK */
class C0898lK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f3282a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f3283b;

    public C0898lK(Customer_Det_List_edit customer_Det_List_edit, boolean z) {
        this.f3283b = customer_Det_List_edit;
        this.f3282a = z;
    }

    public void onClick(View view) {
        this.f3283b.mo3600a(view, this.f3282a);
    }
}
