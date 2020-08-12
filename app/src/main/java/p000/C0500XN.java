package p000;

import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp;

/* renamed from: XN */
class C0500XN implements OnActionExpandListener {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month_exp f1443a;

    public C0500XN(Report3_balance_month_exp report3_balance_month_exp) {
        this.f1443a = report3_balance_month_exp;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        this.f1443a.mo4000a(1);
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        this.f1443a.mo4000a(1);
        return true;
    }
}
