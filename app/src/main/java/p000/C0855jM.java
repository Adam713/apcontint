package p000;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: jM */
class C0855jM implements OnPageChangeListener {

    /* renamed from: a */
    public Boolean f3153a = Boolean.valueOf(true);

    /* renamed from: b */
    public int f3154b = 0;

    /* renamed from: c */
    public final /* synthetic */ FragmentStatePagerSupport_Main f3155c;

    public C0855jM(FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main) {
        this.f3155c = fragmentStatePagerSupport_Main;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        this.f3155c.mo3776a(i);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("");
        Log.d("Page.CreateView=", sb.toString());
    }
}
