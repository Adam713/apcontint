package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: GL */
class C0125GL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ImageView f276a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f277b;

    public C0125GL(Customer_Det_List_edit2 customer_Det_List_edit2, ImageView imageView) {
        this.f277b = customer_Det_List_edit2;
        this.f276a = imageView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            C0195JU ju = this.f277b.f2363b;
            StringBuilder sb = new StringBuilder();
            sb.append(C0195JU.f442b);
            sb.append(this.f276a.getTag().toString());
            ju.mo460H(sb.toString());
        } catch (Exception unused) {
        }
    }
}
