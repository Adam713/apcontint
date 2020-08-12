package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: yW */
public final class C1186yW {

    /* renamed from: a */
    public final C1188b[] f4158a;

    /* renamed from: b */
    public final C0976oX f4159b;

    /* renamed from: c */
    public final List<C0468VX> f4160c = new ArrayList();

    /* renamed from: d */
    public final int f4161d;

    /* renamed from: e */
    public final C1208zW f4162e;

    /* renamed from: yW$a */
    private static final class C1187a {
    }

    /* renamed from: yW$b */
    private static final class C1188b {

        /* renamed from: a */
        public final C0161HY f4163a;

        /* renamed from: b */
        public final C1000pX[] f4164b = new C1000pX[0];

        /* renamed from: c */
        public final C1187a[] f4165c = new C1187a[0];

        public C1188b(int i) {
            this.f4163a = C0161HY.m322b((short) i);
        }

        /* renamed from: a */
        public C0161HY mo5488a() {
            return this.f4163a;
        }

        /* renamed from: a */
        public String mo5489a(int i) {
            return this.f4164b[i].mo5003h();
        }
    }

    public C1186yW(int i, C1208zW zWVar) {
        this.f4162e = zWVar;
        this.f4158a = new C1188b[]{new C1188b(i)};
        this.f4159b = new C0976oX();
        this.f4161d = 2;
        C0161HY a = this.f4158a[0].mo5488a();
        int a2 = mo5483a(140);
        if (a2 >= 0) {
            int i2 = a2 + 1;
            this.f4162e.mo5558a(i2, this.f4159b);
            this.f4162e.mo5558a(i2, a);
            return;
        }
        throw new RuntimeException("CountryRecord not found");
    }

    /* renamed from: a */
    public int mo5482a(int i) {
        int i2 = 0;
        while (true) {
            C1188b[] bVarArr = this.f4158a;
            if (i2 >= bVarArr.length) {
                i2 = -1;
                break;
            } else if (bVarArr[i2].mo5488a().mo355k()) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int a = this.f4159b.mo4963a(i2, i);
            return a >= 0 ? a : this.f4159b.mo4964a(i2, i, i);
        }
        throw new RuntimeException("Could not find 'internal references' EXTERNALBOOK");
    }

    /* renamed from: a */
    public final int mo5483a(short s) {
        Iterator it = this.f4162e.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C0933mY) it.next()).mo34e() == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public String mo5484a(int i, int i2) {
        return this.f4158a[this.f4159b.mo4962a(i)].mo5489a(i2);
    }

    /* renamed from: b */
    public String[] mo5485b(int i) {
        C0161HY a = this.f4158a[this.f4159b.mo4962a(i)].mo5488a();
        String str = null;
        if (!a.mo354j()) {
            return null;
        }
        int b = this.f4159b.mo4965b(i);
        if (b >= 0) {
            str = a.mo352h()[b];
        }
        return new String[]{a.mo353i(), str};
    }

    /* renamed from: c */
    public int mo5486c(int i) {
        return this.f4159b.mo4965b(i);
    }

    /* renamed from: d */
    public C0468VX mo5487d(int i) {
        return (C0468VX) this.f4160c.get(i);
    }
}
