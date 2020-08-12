package p000;

import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: iM */
class C0835iM implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FragmentStatePagerSupport_Main f3096a;

    public C0835iM(FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main) {
        this.f3096a = fragmentStatePagerSupport_Main;
    }

    public void run() {
        this.f3096a.f2467h.setCurrentItem(FragmentStatePagerSupport_Main.f2449b);
        FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main = this.f3096a;
        if (fragmentStatePagerSupport_Main.f2461H == 4) {
            boolean z = C0195JU.f451k;
            fragmentStatePagerSupport_Main.setTitle(((C0260MM) fragmentStatePagerSupport_Main.f2472m.get(FragmentStatePagerSupport_Main.f2449b)).mo890c());
        }
    }
}
