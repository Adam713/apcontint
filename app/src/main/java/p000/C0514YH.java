package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: YH */
class C0514YH implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ CustomerList f1486a;

    public C0514YH(CustomerList customerList) {
        this.f1486a = customerList;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f1486a.mo3378b(1);
        }
        this.f1486a.setSupportProgressBarIndeterminateVisibility(true);
        this.f1486a.mo3372a(str);
        this.f1486a.setSupportProgressBarIndeterminateVisibility(false);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f1486a.mo3378b(2);
        return false;
    }
}
