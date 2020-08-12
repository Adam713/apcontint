package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List;

/* renamed from: ZI */
class C0542ZI implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List f1646a;

    public C0542ZI(Customer_Det_List customer_Det_List) {
        this.f1646a = customer_Det_List;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f1646a.f2186O = 0;
            this.f1646a.mo3495f();
        } catch (Exception unused) {
        }
    }
}
