package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List;

/* renamed from: NI */
class C0276NI implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List f758a;

    public C0276NI(Customer_Det_List customer_Det_List) {
        this.f758a = customer_Det_List;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f758a.mo3481a(1);
        }
        this.f758a.setSupportProgressBarIndeterminateVisibility(true);
        this.f758a.mo3485b(str);
        this.f758a.setSupportProgressBarIndeterminateVisibility(false);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f758a.mo3481a(2);
        return false;
    }
}
