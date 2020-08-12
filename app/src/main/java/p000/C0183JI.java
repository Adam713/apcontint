package p000;

import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;
import com.valdio.valdioveliu.recyclerview.CustomerList_tmp;

/* renamed from: JI */
class C0183JI implements OnActionExpandListener {

    /* renamed from: a */
    public final /* synthetic */ CustomerList_tmp f420a;

    public C0183JI(CustomerList_tmp customerList_tmp) {
        this.f420a = customerList_tmp;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        this.f420a.mo3451a(1);
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        this.f420a.mo3451a(1);
        return true;
    }
}
