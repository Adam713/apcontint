package p000;

import java.util.Comparator;

/* renamed from: gZ */
class C0807gZ implements Comparator<C0828a> {
    /* renamed from: a */
    public int compare(C0828a aVar, C0828a aVar2) {
        C1282xba m = aVar.mo4495a().mo118m();
        C1282xba m2 = aVar2.mo4495a().mo118m();
        int b = m.mo754b() - m2.mo754b();
        if (b != 0) {
            return b;
        }
        int a = m.mo751a() - m2.mo751a();
        if (a != 0) {
            return a;
        }
        return 0;
    }
}
