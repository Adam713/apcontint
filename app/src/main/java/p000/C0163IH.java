package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: IH */
class C0163IH implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String f370a;

    /* renamed from: b */
    public final /* synthetic */ CustomerList f371b;

    public C0163IH(CustomerList customerList, String str) {
        this.f371b = customerList;
        this.f370a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C0195JU ju = this.f371b.f2089c;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f370a);
        sb.append("-market.db");
        ju.mo480S(sb.toString());
    }
}
