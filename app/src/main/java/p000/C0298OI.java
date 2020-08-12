package p000;

import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List;

/* renamed from: OI */
class C0298OI implements OnActionExpandListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List f850a;

    public C0298OI(Customer_Det_List customer_Det_List) {
        this.f850a = customer_Det_List;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        this.f850a.mo3481a(1);
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        this.f850a.mo3481a(1);
        return true;
    }
}
