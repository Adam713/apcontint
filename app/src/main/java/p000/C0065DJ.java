package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_All;

/* renamed from: DJ */
class C0065DJ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_All f164a;

    public C0065DJ(Customer_Det_List_All customer_Det_List_All) {
        this.f164a = customer_Det_List_All;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f164a.f2225I = 0;
            this.f164a.mo3546f();
        } catch (Exception unused) {
        }
    }
}
