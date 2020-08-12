package p000;

/* renamed from: bZ */
public final class C0637bZ extends C0765eZ implements C0420TW {

    /* renamed from: a */
    public final C1189yX f1917a;

    /* renamed from: b */
    public C0827hZ f1918b;

    /* renamed from: c */
    public C0099EY f1919c;

    /* renamed from: d */
    public C0037BY f1920d;

    public C0637bZ(C1189yX yXVar, C0099EY ey, C0827hZ hZVar) {
        if (hZVar != null) {
            if (!yXVar.mo5501q()) {
                ey = null;
            } else if (ey == null) {
                throw new C1001pY("Formula record flag is set but String record was not found");
            }
            this.f1919c = ey;
            this.f1917a = yXVar;
            this.f1918b = hZVar;
            if (yXVar.mo5504t()) {
                C1285yba d = yXVar.mo5497m().mo4980d();
                if (d == null) {
                    m1843a(yXVar);
                } else {
                    this.f1920d = hZVar.mo4491a((Mca) d, this);
                }
            }
        } else {
            throw new IllegalArgumentException("sfm must not be null");
        }
    }

    /* renamed from: a */
    public static void m1843a(C1189yX yXVar) {
        if (!(yXVar.mo5499o()[0] instanceof C1239jaa)) {
            yXVar.mo5491a(false);
            return;
        }
        throw new C1001pY("SharedFormulaRecord not found for FormulaRecord with (isSharedFormula=true)");
    }

    /* renamed from: a */
    public short mo277a() {
        return this.f1917a.mo277a();
    }

    /* renamed from: a */
    public void mo1937a(double d) {
        this.f1919c = null;
        this.f1917a.mo5490a(d);
    }

    /* renamed from: a */
    public void mo1938a(int i) {
        this.f1919c = null;
        this.f1917a.mo5493b(i);
    }

    /* renamed from: a */
    public void mo1812a(C0768c cVar) {
        cVar.mo4341a(this.f1917a);
        C0061CY a = this.f1918b.mo4492a(this);
        if (a != null) {
            cVar.mo4341a(a);
        }
        if (this.f1917a.mo5501q()) {
            C0099EY ey = this.f1919c;
            if (ey != null) {
                cVar.mo4341a(ey);
            }
        }
    }

    /* renamed from: a */
    public void mo1939a(String str) {
        if (this.f1919c == null) {
            this.f1919c = new C0099EY();
        }
        this.f1919c.mo219a(str);
        if (str.length() < 1) {
            this.f1917a.mo5505u();
        } else {
            this.f1917a.mo5506v();
        }
    }

    /* renamed from: a */
    public void mo279a(short s) {
        this.f1917a.mo279a(s);
    }

    /* renamed from: b */
    public short mo280b() {
        return this.f1917a.mo280b();
    }

    /* renamed from: b */
    public void mo1940b(int i) {
        this.f1917a.mo1204a(i);
    }

    /* renamed from: b */
    public void mo1941b(short s) {
        this.f1917a.mo1206b(s);
    }

    /* renamed from: d */
    public Jca mo1942d() {
        String str = "not an array formula cell.";
        if (this.f1920d == null) {
            C1285yba d = this.f1917a.mo5497m().mo4980d();
            if (d != null) {
                C0035BW a = this.f1918b.mo4490a(d.mo913c(), (int) d.mo912b());
                if (a != null) {
                    C1282xba m = a.mo118m();
                    return new Jca(m.mo754b(), m.mo756d(), m.mo751a(), m.mo755c());
                }
                StringBuilder sb = new StringBuilder();
                sb.append("ArrayRecord was not found for the locator ");
                sb.append(d.mo910a());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: e */
    public C1189yX mo1943e() {
        return this.f1917a;
    }

    /* renamed from: f */
    public Haa[] mo1944f() {
        C0037BY by = this.f1920d;
        if (by != null) {
            return by.mo76a(this.f1917a);
        }
        C1285yba d = this.f1917a.mo5497m().mo4980d();
        return d != null ? this.f1918b.mo4490a(d.mo913c(), (int) d.mo912b()).mo73n() : this.f1917a.mo5499o();
    }

    /* renamed from: g */
    public String mo1945g() {
        C0099EY ey = this.f1919c;
        if (ey == null) {
            return null;
        }
        return ey.mo220g();
    }

    public int getRow() {
        return this.f1917a.getRow();
    }

    /* renamed from: h */
    public boolean mo1946h() {
        boolean z = false;
        if (this.f1920d != null) {
            return false;
        }
        C1285yba d = this.f1917a.mo5497m().mo4980d();
        if ((d == null ? null : this.f1918b.mo4490a(d.mo913c(), (int) d.mo912b())) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    public void mo1947i() {
        C0037BY by = this.f1920d;
        if (by != null) {
            this.f1918b.mo4493a(by);
        }
    }

    /* renamed from: j */
    public void mo1948j() {
        C0037BY by = this.f1920d;
        if (by != null) {
            this.f1917a.mo5492a(by.mo76a(this.f1917a));
            this.f1917a.mo5491a(false);
            this.f1920d = null;
            return;
        }
        throw new IllegalStateException("Formula not linked to shared formula");
    }

    public String toString() {
        return this.f1917a.toString();
    }
}
