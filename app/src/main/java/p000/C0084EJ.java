package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_All;

/* renamed from: EJ */
class C0084EJ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f209a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_All f210b;

    public C0084EJ(Customer_Det_List_All customer_Det_List_All, AlertDialog alertDialog) {
        this.f210b = customer_Det_List_All;
        this.f209a = alertDialog;
    }

    public void onClick(View view) {
        Customer_Det_List_All customer_Det_List_All;
        try {
            this.f210b.f2225I = 1;
            String str = "";
            if (this.f210b.f2228L.getText() == null) {
                this.f210b.f2226J = str;
            } else {
                this.f210b.f2226J = this.f210b.f2228L.getText().toString();
            }
            if (this.f210b.f2229M.getText() == null) {
                customer_Det_List_All = this.f210b;
            } else {
                customer_Det_List_All = this.f210b;
                str = this.f210b.f2229M.getText().toString();
            }
            customer_Det_List_All.f2227K = str;
            this.f210b.mo3546f();
        } catch (Exception unused) {
        }
        this.f209a.dismiss();
    }
}
