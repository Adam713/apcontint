package p000;

import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: BS */
class C0031BS implements OnActionExpandListener {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f54a;

    public C0031BS(C0239LS ls) {
        this.f54a = ls;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        Log.d("search=", "onMenuItemActionCollapse");
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        Log.d("search=", "onMenuItemActionExpand");
        return true;
    }
}
