package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: oK */
class C0958oK implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit f3499a;

    public C0958oK(Customer_Det_List_edit customer_Det_List_edit) {
        this.f3499a = customer_Det_List_edit;
    }

    public boolean onQueryTextChange(String str) {
        this.f3499a.mo3624d(str);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
