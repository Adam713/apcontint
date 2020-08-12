package p000;

/* renamed from: xY */
public final class C1169xY {

    /* renamed from: a */
    public final int f4124a;

    /* renamed from: b */
    public final int f4125b;

    /* renamed from: c */
    public final bda<C0139GZ> f4126c;

    /* renamed from: d */
    public final int[] f4127d;

    /* renamed from: e */
    public final int[] f4128e;

    public C1169xY(bda<C0139GZ> bda, int i, int i2) {
        this.f4126c = bda;
        this.f4124a = i;
        this.f4125b = i2;
        int a = C0931mX.m3087a(bda.mo1956a());
        this.f4127d = new int[a];
        this.f4128e = new int[a];
    }

    /* renamed from: a */
    public static C0139GZ m3830a(bda<C0139GZ> bda, int i) {
        return (C0139GZ) bda.mo1957a(i);
    }

    /* renamed from: a */
    public final C0139GZ mo5451a(int i) {
        return m3830a(this.f4126c, i);
    }

    /* renamed from: a */
    public void mo5452a(C0253LZ lz) {
        lz.writeInt(this.f4124a);
        lz.writeInt(this.f4125b);
        for (int i = 0; i < this.f4126c.mo1956a(); i++) {
            if (i % 8 == 0) {
                int c = lz.mo866c();
                int i2 = i / 8;
                if (i2 < 128) {
                    this.f4127d[i2] = c;
                    this.f4128e[i2] = c;
                }
            }
            mo5451a(i).mo289a(lz);
        }
    }

    /* renamed from: a */
    public int[] mo5453a() {
        return this.f4127d;
    }

    /* renamed from: b */
    public int[] mo5454b() {
        return this.f4128e;
    }
}
