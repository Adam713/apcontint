package p000;

/* renamed from: sba reason: case insensitive filesystem */
public final class C1267sba implements Comparable<C1267sba>, Dca {

    /* renamed from: a */
    public C0139GZ f3764a;

    /* renamed from: b */
    public C1167xW f3765b;

    /* renamed from: c */
    public C0291NX f3766c;

    public C1267sba() {
        this("");
    }

    public C1267sba(String str) {
        if (str == null) {
            this.f3764a = new C0139GZ("");
        } else {
            this.f3764a = new C0139GZ(str);
        }
    }

    /* renamed from: a */
    public int compareTo(C1267sba sba) {
        return this.f3764a.compareTo(sba.f3764a);
    }

    /* renamed from: a */
    public final C0139GZ mo5108a() {
        return this.f3765b == null ? this.f3764a : (C0139GZ) this.f3764a.clone();
    }

    /* renamed from: a */
    public short mo5109a(int i) {
        return this.f3764a.mo288a(i).mo309b();
    }

    /* renamed from: a */
    public void mo5110a(C0139GZ gz) {
        this.f3764a = gz;
    }

    /* renamed from: a */
    public void mo5111a(C1167xW xWVar, C0291NX nx) {
        this.f3765b = xWVar;
        this.f3766c = nx;
    }

    /* renamed from: b */
    public int mo5112b(int i) {
        return this.f3764a.mo288a(i).mo307a();
    }

    /* renamed from: b */
    public C0139GZ mo5113b() {
        return mo5108a();
    }

    /* renamed from: c */
    public int mo5114c() {
        return this.f3764a.mo286a();
    }

    /* renamed from: d */
    public int mo5116d() {
        return this.f3764a.mo293c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1267sba) {
            return this.f3764a.equals(((C1267sba) obj).f3764a);
        }
        return false;
    }

    public String getString() {
        return this.f3764a.mo297e();
    }

    public String toString() {
        return this.f3764a.toString();
    }
}
