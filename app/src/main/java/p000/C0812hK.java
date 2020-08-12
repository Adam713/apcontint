package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: hK */
class C0812hK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f3043a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f3044b;

    public C0812hK(Customer_Det_List_edit customer_Det_List_edit, Handler handler) {
        this.f3044b = customer_Det_List_edit;
        this.f3043a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3044b.mo3598a(this.f3043a);
    }
}
