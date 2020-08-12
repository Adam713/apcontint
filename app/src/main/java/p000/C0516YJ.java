package p000;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: YJ */
class C0516YJ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Snackbar f1488a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f1489b;

    public C0516YJ(Customer_Det_List_edit customer_Det_List_edit, Snackbar snackbar) {
        this.f1489b = customer_Det_List_edit;
        this.f1488a = snackbar;
    }

    public void onClick(View view) {
        this.f1488a.dismiss();
    }
}
