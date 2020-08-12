package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List;

/* renamed from: _I */
class C0566_I implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f1723a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List f1724b;

    public C0566_I(Customer_Det_List customer_Det_List, AlertDialog alertDialog) {
        this.f1724b = customer_Det_List;
        this.f1723a = alertDialog;
    }

    public void onClick(View view) {
        Customer_Det_List customer_Det_List;
        try {
            this.f1724b.f2186O = 1;
            String str = "";
            if (this.f1724b.f2189R.getText() == null) {
                this.f1724b.f2187P = str;
            } else {
                this.f1724b.f2187P = this.f1724b.f2189R.getText().toString();
            }
            if (this.f1724b.f2190S.getText() == null) {
                customer_Det_List = this.f1724b;
            } else {
                customer_Det_List = this.f1724b;
                str = this.f1724b.f2190S.getText().toString();
            }
            customer_Det_List.f2188Q = str;
            this.f1724b.mo3495f();
        } catch (Exception unused) {
        }
        this.f1723a.dismiss();
    }
}
