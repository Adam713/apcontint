package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cZ */
public final class C0656cZ extends C0765eZ {

    /* renamed from: a */
    public static int f1962a = 1027;

    /* renamed from: b */
    public final List f1963b = new ArrayList();

    /* renamed from: a */
    public void mo1992a(int i, int i2, int i3, int i4) {
        this.f1963b.add(new Jca(i, i3, i2, i4));
    }

    /* renamed from: a */
    public void mo1812a(C0768c cVar) {
        int size = this.f1963b.size();
        if (size >= 1) {
            int i = f1962a;
            int i2 = size / i;
            int i3 = size % i;
            Jca[] jcaArr = new Jca[size];
            this.f1963b.toArray(jcaArr);
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = f1962a;
                cVar.mo4341a(new C0379RX(jcaArr, i4 * i5, i5));
            }
            if (i3 > 0) {
                cVar.mo4341a(new C0379RX(jcaArr, i2 * f1962a, i3));
            }
        }
    }

    /* renamed from: c */
    public int mo163c() {
        int size = this.f1963b.size();
        if (size < 1) {
            return 0;
        }
        int i = f1962a;
        return ((size / i) * (Lca.m828b(i) + 4)) + 4 + Lca.m828b(size % i);
    }

    /* renamed from: d */
    public int mo1993d() {
        return this.f1963b.size();
    }
}
