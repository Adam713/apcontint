package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: eK */
class C0750eK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Handler f2901a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f2902b;

    public C0750eK(Customer_Det_List_edit customer_Det_List_edit, Handler handler) {
        this.f2902b = customer_Det_List_edit;
        this.f2901a = handler;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C0195JU ju = this.f2902b.f2285b;
        StringBuilder sb = new StringBuilder();
        sb.append("insert into groups  (name )  values( '");
        sb.append(this.f2902b.f2308ma);
        sb.append("'  )");
        ju.mo562d(sb.toString());
        this.f2902b.f2306la = true;
        Handler handler = this.f2901a;
        handler.sendMessage(handler.obtainMessage());
    }
}
