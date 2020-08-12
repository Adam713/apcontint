package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import com.valdio.valdioveliu.recyclerview.CustomerList2;

/* renamed from: qI */
class C1004qI implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ CustomerList2 f3600a;

    public C1004qI(CustomerList2 customerList2) {
        this.f3600a = customerList2;
    }

    public boolean onQueryTextChange(String str) {
        this.f3600a.mo3418a(str);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
