package p000;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Xba */
public final class Xba implements Eba, C1217bca {

    /* renamed from: a */
    public Bba f1479a;

    /* renamed from: b */
    public int f1480b = -2;

    /* renamed from: c */
    public List<Wba> f1481c = new ArrayList();

    /* renamed from: d */
    public C1217bca[] f1482d;

    public Xba(Bba bba) {
        this.f1479a = bba;
        mo1505a((Wba) new Yba());
        this.f1482d = null;
    }

    /* renamed from: a */
    public int mo224a() {
        C1217bca[] bcaArr = this.f1482d;
        if (bcaArr == null) {
            return 0;
        }
        return bcaArr.length;
    }

    /* renamed from: a */
    public void mo225a(int i) {
        this.f1480b = i;
    }

    /* renamed from: a */
    public void mo1505a(Wba wba) {
        this.f1481c.add(wba);
    }

    /* renamed from: a */
    public void mo944a(OutputStream outputStream) {
        if (this.f1482d != null) {
            int i = 0;
            while (true) {
                C1217bca[] bcaArr = this.f1482d;
                if (i < bcaArr.length) {
                    bcaArr[i].mo944a(outputStream);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public Yba mo1506b() {
        return (Yba) this.f1481c.get(0);
    }

    /* renamed from: c */
    public int mo1507c() {
        return this.f1480b;
    }

    /* renamed from: d */
    public void mo1508d() {
        Wba[] wbaArr = (Wba[]) this.f1481c.toArray(new Wba[0]);
        for (int i = 0; i < wbaArr.length; i++) {
            wbaArr[i].mo1433c(i);
        }
        this.f1482d = C1238ica.m2849a(this.f1479a, this.f1481c);
        for (Wba f : wbaArr) {
            f.mo1241f();
        }
    }
}
