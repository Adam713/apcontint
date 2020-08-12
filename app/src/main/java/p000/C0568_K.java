package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: _K */
class C0568_K implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f1727a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f1728b;

    public C0568_K(Customer_Det_List_edit2 customer_Det_List_edit2, Handler handler) {
        this.f1728b = customer_Det_List_edit2;
        this.f1727a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C0195JU ju = this.f1728b.f2363b;
        StringBuilder sb = new StringBuilder();
        sb.append("insert into groups  (name )  values( '");
        sb.append(this.f1728b.f2390oa);
        sb.append("'  )");
        ju.mo562d(sb.toString());
        this.f1728b.f2388na = true;
        Handler handler = this.f1727a;
        handler.sendMessage(handler.obtainMessage());
    }
}
