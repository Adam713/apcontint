package p000;

/* renamed from: VW */
public final class C0467VW extends C0080DY {

    /* renamed from: a */
    public static final Tca f1325a = Uca.m1284a(1);

    /* renamed from: b */
    public static final Tca f1326b = Uca.m1284a(1792);

    /* renamed from: c */
    public static final Tca f1327c = Uca.m1284a(4096);

    /* renamed from: d */
    public int f1328d;

    /* renamed from: e */
    public int f1329e;

    /* renamed from: f */
    public int f1330f;

    /* renamed from: g */
    public int f1331g = 15;

    /* renamed from: h */
    public int f1332h = 2;

    /* renamed from: i */
    public int f1333i = 2;

    public C0467VW() {
        mo1352b(2275);
    }

    /* renamed from: a */
    public int mo1350a() {
        return this.f1331g;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1355j());
        jda.writeShort(mo1357l());
        jda.writeShort(mo1354i());
        jda.writeShort(mo1350a());
        jda.writeShort(this.f1332h);
        jda.writeShort(this.f1333i);
    }

    /* renamed from: a */
    public boolean mo1351a(int i) {
        return this.f1328d <= i && i <= this.f1329e;
    }

    /* renamed from: b */
    public void mo1352b(int i) {
        this.f1330f = i;
    }

    public Object clone() {
        C0467VW vw = new C0467VW();
        vw.f1328d = this.f1328d;
        vw.f1329e = this.f1329e;
        vw.f1330f = this.f1330f;
        vw.f1331g = this.f1331g;
        vw.f1332h = this.f1332h;
        vw.f1333i = this.f1333i;
        return vw;
    }

    /* renamed from: e */
    public short mo34e() {
        return 125;
    }

    /* renamed from: g */
    public int mo36g() {
        return 12;
    }

    /* renamed from: h */
    public boolean mo1353h() {
        return f1327c.mo1258d(this.f1332h);
    }

    /* renamed from: i */
    public int mo1354i() {
        return this.f1330f;
    }

    /* renamed from: j */
    public int mo1355j() {
        return this.f1328d;
    }

    /* renamed from: k */
    public boolean mo1356k() {
        return f1325a.mo1258d(this.f1332h);
    }

    /* renamed from: l */
    public int mo1357l() {
        return this.f1329e;
    }

    /* renamed from: m */
    public int mo1358m() {
        return f1326b.mo1256c(this.f1332h);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[COLINFO]\n");
        sb.append("  colfirst = ");
        sb.append(mo1355j());
        String str = "\n";
        sb.append(str);
        sb.append("  collast  = ");
        sb.append(mo1357l());
        sb.append(str);
        sb.append("  colwidth = ");
        sb.append(mo1354i());
        sb.append(str);
        sb.append("  xfindex  = ");
        sb.append(mo1350a());
        sb.append(str);
        sb.append("  options  = ");
        sb.append(Yca.m1602c(this.f1332h));
        sb.append(str);
        sb.append("    hidden   = ");
        sb.append(mo1356k());
        sb.append(str);
        sb.append("    olevel   = ");
        sb.append(mo1358m());
        sb.append(str);
        sb.append("    collapsed= ");
        sb.append(mo1353h());
        sb.append(str);
        sb.append("[/COLINFO]\n");
        return sb.toString();
    }
}
