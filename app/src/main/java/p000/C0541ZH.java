package p000;

import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: ZH */
class C0541ZH implements OnActionExpandListener {

    /* renamed from: a */
    public final /* synthetic */ CustomerList f1645a;

    public C0541ZH(CustomerList customerList) {
        this.f1645a = customerList;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        this.f1645a.mo3378b(1);
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        this.f1645a.mo3378b(1);
        return true;
    }
}
