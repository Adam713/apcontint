package p000;

/* renamed from: ZZ */
public abstract class C0560ZZ extends Caa implements C0491WZ {

    /* renamed from: c */
    public static final Tca f1685c = Uca.m1284a(32768);

    /* renamed from: d */
    public static final Tca f1686d = Uca.m1284a(16384);

    /* renamed from: e */
    public static final Tca f1687e = Uca.m1284a(16383);

    /* renamed from: f */
    public int f1688f;

    /* renamed from: g */
    public int f1689g;

    /* renamed from: h */
    public int f1690h;

    /* renamed from: i */
    public int f1691i;

    public C0560ZZ() {
    }

    public C0560ZZ(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        if (i2 > i) {
            mo1686b(i);
            mo1692d(i2);
            mo1689b(z);
            mo1693d(z2);
        } else {
            mo1686b(i2);
            mo1692d(i);
            mo1689b(z2);
            mo1693d(z);
        }
        if (i4 > i3) {
            mo1684a(i3);
            mo1690c(i4);
            mo1685a(z3);
            mo1691c(z4);
            return;
        }
        mo1684a(i4);
        mo1690c(i3);
        mo1685a(z4);
        mo1691c(z3);
    }

    /* renamed from: a */
    public final void mo1684a(int i) {
        this.f1690h = f1687e.mo1248a(this.f1690h, i);
    }

    /* renamed from: a */
    public final void mo1685a(boolean z) {
        this.f1690h = f1686d.mo1249a(this.f1690h, z);
    }

    /* renamed from: b */
    public final void mo1686b(int i) {
        this.f1688f = i;
    }

    /* renamed from: b */
    public final void mo1687b(hda hda) {
        this.f1688f = hda.mo401a();
        this.f1689g = hda.mo401a();
        this.f1690h = hda.mo401a();
        this.f1691i = hda.mo401a();
    }

    /* renamed from: b */
    public final void mo1688b(jda jda) {
        jda.writeShort(this.f1688f);
        jda.writeShort(this.f1689g);
        jda.writeShort(this.f1690h);
        jda.writeShort(this.f1691i);
    }

    /* renamed from: b */
    public final void mo1689b(boolean z) {
        this.f1690h = f1685c.mo1249a(this.f1690h, z);
    }

    /* renamed from: c */
    public final void mo1690c(int i) {
        this.f1691i = f1687e.mo1248a(this.f1691i, i);
    }

    /* renamed from: c */
    public final void mo1691c(boolean z) {
        this.f1691i = f1686d.mo1249a(this.f1691i, z);
    }

    /* renamed from: d */
    public final void mo1692d(int i) {
        this.f1689g = i;
    }

    /* renamed from: d */
    public final void mo1693d(boolean z) {
        this.f1691i = f1685c.mo1249a(this.f1691i, z);
    }

    /* renamed from: e */
    public String mo81e() {
        return mo1694g();
    }

    /* renamed from: g */
    public final String mo1694g() {
        Mca mca = new Mca(mo1696i(), mo1695h(), !mo1700m(), !mo1699l());
        Mca mca2 = new Mca(mo1698k(), mo1697j(), !mo1702o(), !mo1701n());
        if (Ica.m399a(mca, mca2)) {
            return new Ica(mca, mca2).mo422a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mca.mo910a());
        sb.append(":");
        sb.append(mca2.mo910a());
        return sb.toString();
    }

    /* renamed from: h */
    public final int mo1695h() {
        return f1687e.mo1256c(this.f1690h);
    }

    /* renamed from: i */
    public final int mo1696i() {
        return this.f1688f;
    }

    /* renamed from: j */
    public final int mo1697j() {
        return f1687e.mo1256c(this.f1691i);
    }

    /* renamed from: k */
    public final int mo1698k() {
        return this.f1689g;
    }

    /* renamed from: l */
    public final boolean mo1699l() {
        return f1686d.mo1258d(this.f1690h);
    }

    /* renamed from: m */
    public final boolean mo1700m() {
        return f1685c.mo1258d(this.f1690h);
    }

    /* renamed from: n */
    public final boolean mo1701n() {
        return f1686d.mo1258d(this.f1691i);
    }

    /* renamed from: o */
    public final boolean mo1702o() {
        return f1685c.mo1258d(this.f1691i);
    }
}
