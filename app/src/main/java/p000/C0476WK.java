package p000;

import android.support.design.widget.Snackbar;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: WK */
class C0476WK implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Snackbar f1371a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f1372b;

    public C0476WK(Customer_Det_List_edit2 customer_Det_List_edit2, Snackbar snackbar) {
        this.f1372b = customer_Det_List_edit2;
        this.f1371a = snackbar;
    }

    public void run() {
        this.f1371a.dismiss();
    }
}
