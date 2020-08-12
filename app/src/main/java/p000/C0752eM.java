package p000;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport;

/* renamed from: eM */
class C0752eM implements OnPageChangeListener {

    /* renamed from: a */
    public Boolean f2904a = Boolean.valueOf(true);

    /* renamed from: b */
    public final /* synthetic */ FragmentStatePagerSupport f2905b;

    public C0752eM(FragmentStatePagerSupport fragmentStatePagerSupport) {
        this.f2905b = fragmentStatePagerSupport;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("");
        Log.d("Page Created=", sb.toString());
        this.f2905b.mo3770a(i);
    }
}
