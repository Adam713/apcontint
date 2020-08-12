package p000;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: aI */
class C0596aI extends ActionBarDrawerToggle {

    /* renamed from: a */
    public final /* synthetic */ CustomerList f1805a;

    public C0596aI(CustomerList customerList, Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this.f1805a = customerList;
        super(activity, drawerLayout, toolbar, i, i2);
    }

    public void onDrawerClosed(View view) {
        this.f1805a.getSupportActionBar().setTitle(this.f1805a.f2106t);
        this.f1805a.invalidateOptionsMenu();
    }

    public void onDrawerOpened(View view) {
        this.f1805a.getSupportActionBar().setTitle(this.f1805a.f2105s);
        this.f1805a.invalidateOptionsMenu();
    }
}
