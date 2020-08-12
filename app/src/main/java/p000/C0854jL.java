package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: jL */
class C0854jL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f3151a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f3152b;

    public C0854jL(Customer_Det_List_edit2 customer_Det_List_edit2, Handler handler) {
        this.f3152b = customer_Det_List_edit2;
        this.f3151a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3152b.mo3690a();
        this.f3152b.f2398sa = true;
        Handler handler = this.f3151a;
        handler.sendMessage(handler.obtainMessage());
    }
}
