package p000;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: lM */
class C0900lM extends ActionBarDrawerToggle {

    /* renamed from: a */
    public final /* synthetic */ FragmentStatePagerSupport_Main f3285a;

    public C0900lM(FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main, Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this.f3285a = fragmentStatePagerSupport_Main;
        super(activity, drawerLayout, toolbar, i, i2);
    }

    public void onDrawerClosed(View view) {
        this.f3285a.getSupportActionBar().setTitle(this.f3285a.f2455B);
        this.f3285a.invalidateOptionsMenu();
    }

    public void onDrawerOpened(View view) {
        this.f3285a.getSupportActionBar().setTitle(this.f3285a.f2454A);
        this.f3285a.invalidateOptionsMenu();
    }
}
