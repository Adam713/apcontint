package p000;

import android.support.design.widget.Snackbar;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: _J */
class C0567_J implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Snackbar f1725a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f1726b;

    public C0567_J(Customer_Det_List_edit customer_Det_List_edit, Snackbar snackbar) {
        this.f1726b = customer_Det_List_edit;
        this.f1725a = snackbar;
    }

    public void run() {
        this.f1725a.dismiss();
    }
}
