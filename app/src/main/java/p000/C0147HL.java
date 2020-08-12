package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: HL */
class C0147HL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f326a;

    public C0147HL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f326a = customer_Det_List_edit2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f326a.mo3754u();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
