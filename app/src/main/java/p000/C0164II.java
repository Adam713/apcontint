package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import com.valdio.valdioveliu.recyclerview.CustomerList_tmp;

/* renamed from: II */
class C0164II implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ CustomerList_tmp f372a;

    public C0164II(CustomerList_tmp customerList_tmp) {
        this.f372a = customerList_tmp;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f372a.mo3451a(1);
        }
        this.f372a.setSupportProgressBarIndeterminateVisibility(true);
        this.f372a.mo3453a(str);
        this.f372a.setSupportProgressBarIndeterminateVisibility(false);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f372a.mo3451a(2);
        return false;
    }
}
