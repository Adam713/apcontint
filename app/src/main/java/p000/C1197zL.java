package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: zL */
class C1197zL implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f4196a;

    public C1197zL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f4196a = customer_Det_List_edit2;
    }

    public boolean onQueryTextChange(String str) {
        this.f4196a.mo3717c(str);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
