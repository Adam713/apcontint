package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: uK */
class C1088uK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ImageView f3820a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f3821b;

    public C1088uK(Customer_Det_List_edit customer_Det_List_edit, ImageView imageView) {
        this.f3821b = customer_Det_List_edit;
        this.f3820a = imageView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            C0195JU ju = this.f3821b.f2285b;
            StringBuilder sb = new StringBuilder();
            sb.append(C0195JU.f442b);
            sb.append(this.f3820a.getTag().toString());
            ju.mo460H(sb.toString());
        } catch (Exception unused) {
        }
    }
}
