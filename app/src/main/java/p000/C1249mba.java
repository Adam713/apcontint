package p000;

/* renamed from: mba reason: case insensitive filesystem */
public final class C1249mba implements C1277vca {

    /* renamed from: a */
    public C0952nX f3409a;

    /* renamed from: b */
    public short f3410b;

    /* renamed from: c */
    public C1167xW f3411c;

    public C1249mba(short s, C0952nX nXVar, C1279wba wba) {
        this(s, nXVar, wba.mo5399k());
    }

    public C1249mba(short s, C0952nX nXVar, C1167xW xWVar) {
        this.f3409a = null;
        this.f3410b = 0;
        this.f3411c = null;
        this.f3411c = xWVar;
        this.f3410b = s;
        this.f3409a = nXVar;
    }

    /* renamed from: a */
    public String mo4782a() {
        return mo4783a(this.f3411c);
    }

    /* renamed from: a */
    public String mo4783a(C1167xW xWVar) {
        return new C1252nba(xWVar).mo4892a(mo4788b());
    }

    /* renamed from: a */
    public void mo4784a(Aca aca) {
        mo4785a((C1261qba) aca);
    }

    /* renamed from: a */
    public void mo4785a(C1261qba qba) {
        this.f3409a.mo4850c(true);
        this.f3409a.mo4874p(qba.mo5041a());
    }

    /* renamed from: a */
    public void mo4786a(C1279wba wba) {
        if (wba.mo5399k() != this.f3411c) {
            throw new IllegalArgumentException("This Style does not belong to the supplied Workbook. Are you trying to assign a style from one workbook to the cell of a differnt workbook?");
        }
    }

    /* renamed from: a */
    public void mo4787a(short s) {
        this.f3409a.mo4848b(true);
        this.f3409a.mo4862j(s);
    }

    /* renamed from: b */
    public short mo4788b() {
        return this.f3409a.mo4891z();
    }

    /* renamed from: b */
    public void mo4789b(short s) {
        this.f3409a.mo4848b(true);
        this.f3409a.mo4854f(s);
    }

    /* renamed from: c */
    public final void mo4790c() {
        if (this.f3409a.mo4887w() == 64) {
            if (this.f3409a.mo4885v() != 65) {
                mo4800i(65);
            }
        } else if (this.f3409a.mo4885v() == 65 && this.f3409a.mo4887w() != 64) {
            mo4800i(64);
        }
    }

    /* renamed from: c */
    public void mo4791c(short s) {
        this.f3409a.mo4847b(s);
    }

    /* renamed from: d */
    public short mo4792d() {
        return this.f3410b;
    }

    /* renamed from: d */
    public void mo4793d(short s) {
        this.f3409a.mo4846a(true);
        this.f3409a.mo4851d(s);
    }

    /* renamed from: e */
    public void mo4794e(short s) {
        this.f3409a.mo4870n(s);
        mo4790c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1249mba)) {
            return false;
        }
        C1249mba mba = (C1249mba) obj;
        C0952nX nXVar = this.f3409a;
        if (nXVar == null) {
            if (mba.f3409a != null) {
                return false;
            }
        } else if (!nXVar.equals(mba.f3409a)) {
            return false;
        }
        return this.f3410b == mba.f3410b;
    }

    /* renamed from: f */
    public void mo4796f(short s) {
        this.f3409a.mo4848b(true);
        this.f3409a.mo4855g(s);
    }

    /* renamed from: g */
    public void mo4797g(short s) {
        this.f3409a.mo4848b(true);
        this.f3409a.mo4860i(s);
    }

    /* renamed from: h */
    public void mo4798h(short s) {
        this.f3409a.mo4888w(s);
    }

    public int hashCode() {
        C0952nX nXVar = this.f3409a;
        return (((nXVar == null ? 0 : nXVar.hashCode()) + 31) * 31) + this.f3410b;
    }

    /* renamed from: i */
    public void mo4800i(short s) {
        this.f3409a.mo4868m(s);
        mo4790c();
    }
}
