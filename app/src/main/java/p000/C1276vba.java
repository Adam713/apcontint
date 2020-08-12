package p000;

import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: vba reason: case insensitive filesystem */
public final class C1276vba implements Gca {

    /* renamed from: a */
    public static final nda f3903a = mda.m3128a(C1276vba.class);

    /* renamed from: b */
    public static final int f3904b = nda.f3486a;

    /* renamed from: c */
    public final C1147wW f3905c = C1147wW.m3711p();

    /* renamed from: d */
    public final TreeMap<Integer, C1270tba> f3906d = new TreeMap<>();

    /* renamed from: e */
    public final C1167xW f3907e;

    /* renamed from: f */
    public final C1279wba f3908f;

    /* renamed from: g */
    public int f3909g;

    /* renamed from: h */
    public int f3910h;

    public C1276vba(C1279wba wba) {
        this.f3908f = wba;
        this.f3907e = wba.mo5399k();
    }

    /* renamed from: a */
    public int mo5254a() {
        return this.f3909g;
    }

    /* renamed from: a */
    public int mo320a(Jca jca) {
        jca.mo752a(C1247lca.EXCEL97);
        mo5260b(jca);
        return this.f3905c.mo5368a(jca.mo754b(), jca.mo751a(), jca.mo756d(), jca.mo755c());
    }

    /* renamed from: a */
    public C1270tba m3598a(int i) {
        C1270tba tba = new C1270tba(this.f3908f, this, i);
        mo5256a(tba, true);
        return tba;
    }

    /* renamed from: a */
    public void mo322a(int i, int i2) {
        mo5255a(i, i2, i, i2);
    }

    /* renamed from: a */
    public void mo5255a(int i, int i2, int i3, int i4) {
        mo5263c(i);
        mo5265d(i2);
        if (i3 < i) {
            throw new IllegalArgumentException("leftmostColumn parameter must not be less than colSplit parameter");
        } else if (i4 >= i2) {
            mo5262c().mo5375b(i, i2, i4, i3);
        } else {
            throw new IllegalArgumentException("topRow parameter must not be less than leftmostColumn parameter");
        }
    }

    /* renamed from: a */
    public final void mo5256a(C1270tba tba, boolean z) {
        this.f3906d.put(Integer.valueOf(tba.mo5153b()), tba);
        if (z) {
            this.f3905c.mo5373a(tba.mo5155c());
        }
        boolean z2 = true;
        if (this.f3906d.size() != 1) {
            z2 = false;
        }
        if (tba.mo5153b() > mo5258b() || z2) {
            this.f3910h = tba.mo5153b();
        }
        if (tba.mo5153b() < mo5254a() || z2) {
            this.f3909g = tba.mo5153b();
        }
    }

    /* renamed from: a */
    public void mo5257a(boolean z) {
        mo5262c().mo5380v().mo1477a(z);
    }

    /* renamed from: b */
    public int mo5258b() {
        return this.f3910h;
    }

    /* renamed from: b */
    public C1270tba mo5259b(int i) {
        return (C1270tba) this.f3906d.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo5260b(Jca jca) {
        int a = jca.mo751a();
        int d = jca.mo756d();
        int c = jca.mo755c();
        for (int b = jca.mo754b(); b <= d; b++) {
            for (int i = a; i <= c; i++) {
                C1270tba b2 = mo5259b(b);
                if (b2 != null) {
                    C1246lba a2 = b2.mo5149a(i);
                    if (a2 != null && a2.mo4692o()) {
                        Jca g = a2.mo4684g();
                        if (g.mo757e() > 1 && (g.mo753a(jca.mo754b(), jca.mo751a()) || g.mo753a(jca.mo754b(), jca.mo751a()))) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("The range ");
                            sb.append(jca.mo649g());
                            sb.append(" intersects with a multi-cell array formula. ");
                            sb.append("You cannot merge cells of an array.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo5261b(boolean z) {
        mo5262c().mo5380v().mo1483d(z);
    }

    /* renamed from: c */
    public C1147wW mo5262c() {
        return this.f3905c;
    }

    /* renamed from: c */
    public void mo5263c(int i) {
        int a = C1247lca.EXCEL97.mo4695a();
        if (i > a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Maximum column number is ");
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0) {
            throw new IllegalArgumentException("Minimum column number is 0");
        }
    }

    /* renamed from: d */
    public Iterator<Fca> mo5264d() {
        return this.f3906d.values().iterator();
    }

    /* renamed from: d */
    public void mo5265d(int i) {
        int c = C1247lca.EXCEL97.mo4697c();
        if (i > c) {
            StringBuilder sb = new StringBuilder();
            sb.append("Maximum row number is ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0) {
            throw new IllegalArgumentException("Minumum row number is 0");
        }
    }

    public Iterator<Fca> iterator() {
        return mo5264d();
    }
}
