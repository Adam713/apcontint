package p000;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.adam.myapplication.CustomerList_tmp;

/* renamed from: AI */
class C0002AI extends ActionBarDrawerToggle {

    /* renamed from: a */
    public final /* synthetic */ CustomerList_tmp f4a;

    public C0002AI(CustomerList_tmp customerList_tmp, Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this.f4a = customerList_tmp;
        super(activity, drawerLayout, toolbar, i, i2);
    }

    public void onDrawerClosed(View view) {
        this.f4a.getSupportActionBar().setTitle(this.f4a.f2162r);
        this.f4a.invalidateOptionsMenu();
    }

    public void onDrawerOpened(View view) {
        this.f4a.getSupportActionBar().setTitle(this.f4a.f2161q);
        this.f4a.invalidateOptionsMenu();
    }
}
