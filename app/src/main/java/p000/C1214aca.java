package p000;

import java.io.OutputStream;

/* renamed from: aca reason: case insensitive filesystem */
public final class C1214aca implements C1217bca, Eba {

    /* renamed from: a */
    public ada f1890a = new ada();

    /* renamed from: b */
    public Zba[] f1891b = new Zba[0];

    /* renamed from: c */
    public int f1892c = -2;

    /* renamed from: d */
    public Bba f1893d;

    public C1214aca(Bba bba) {
        this.f1893d = bba;
    }

    /* renamed from: a */
    public int mo224a() {
        return this.f1891b.length;
    }

    /* renamed from: a */
    public void mo225a(int i) {
        this.f1892c = i;
    }

    /* renamed from: a */
    public void mo944a(OutputStream outputStream) {
        int i = 0;
        while (true) {
            Zba[] zbaArr = this.f1891b;
            if (i < zbaArr.length) {
                zbaArr[i].mo944a(outputStream);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public int mo1881b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int a = Zba.m1639a(this.f1893d, i + i2 + this.f1890a.mo1885a());
            int a2 = C1229fca.m2701a(this.f1893d, a);
            if (i == a && i2 == a2) {
                int b = mo1882b(i);
                mo1882b(i2);
                mo1884d();
                return b;
            }
            i = a;
            i2 = a2;
        }
    }

    /* renamed from: b */
    public int mo1882b(int i) {
        int a = this.f1890a.mo1885a();
        if (i > 0) {
            int i2 = i - 1;
            int i3 = a + 1;
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i3 + 1;
                this.f1890a.mo1887a(i3);
                i4++;
                i3 = i5;
            }
            this.f1890a.mo1887a(-2);
        }
        return a;
    }

    /* renamed from: c */
    public int mo1883c() {
        return this.f1892c;
    }

    /* renamed from: d */
    public void mo1884d() {
        this.f1891b = Zba.m1640a(this.f1893d, this.f1890a.mo1890b());
    }
}
