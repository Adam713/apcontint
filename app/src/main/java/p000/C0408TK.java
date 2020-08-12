package p000;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: TK */
class C0408TK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Snackbar f1180a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f1181b;

    public C0408TK(Customer_Det_List_edit2 customer_Det_List_edit2, Snackbar snackbar) {
        this.f1181b = customer_Det_List_edit2;
        this.f1180a = snackbar;
    }

    public void onClick(View view) {
        this.f1180a.dismiss();
    }
}
