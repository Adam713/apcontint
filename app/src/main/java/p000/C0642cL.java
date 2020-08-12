package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: cL */
class C0642cL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f1937a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f1938b;

    public C0642cL(Customer_Det_List_edit2 customer_Det_List_edit2, Handler handler) {
        this.f1938b = customer_Det_List_edit2;
        this.f1937a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1938b.mo3694a(this.f1937a);
    }
}
