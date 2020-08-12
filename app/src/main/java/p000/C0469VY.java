package p000;

/* renamed from: VY */
public final class C0469VY extends C0080DY {

    /* renamed from: a */
    public static final Tca f1346a = Uca.m1284a(1);

    /* renamed from: b */
    public static final Tca f1347b = Uca.m1284a(2);

    /* renamed from: c */
    public static final Tca f1348c = Uca.m1284a(4);

    /* renamed from: d */
    public static final Tca f1349d = Uca.m1284a(8);

    /* renamed from: e */
    public static final Tca f1350e = Uca.m1284a(16);

    /* renamed from: f */
    public static final Tca f1351f = Uca.m1284a(32);

    /* renamed from: g */
    public short f1352g;

    /* renamed from: h */
    public short f1353h;

    /* renamed from: i */
    public short f1354i;

    /* renamed from: j */
    public short f1355j;

    /* renamed from: k */
    public short f1356k;

    /* renamed from: l */
    public int f1357l;

    /* renamed from: m */
    public int f1358m;

    /* renamed from: n */
    public short f1359n;

    /* renamed from: o */
    public short f1360o;

    /* renamed from: a */
    public void mo1370a(int i) {
        this.f1357l = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1386o());
        jda.writeShort(mo1391t());
        jda.writeShort(mo1392u());
        jda.writeShort(mo1384m());
        jda.writeShort(mo1389r());
        jda.writeShort(mo1378h());
        jda.writeShort(mo1383l());
        jda.writeShort(mo1388q());
        jda.writeShort(mo1390s());
    }

    /* renamed from: b */
    public void mo1371b(int i) {
        this.f1358m = i;
    }

    /* renamed from: b */
    public void mo1372b(short s) {
        this.f1355j = s;
    }

    /* renamed from: c */
    public void mo1373c(short s) {
        this.f1352g = s;
    }

    /* renamed from: d */
    public void mo1374d(short s) {
        this.f1359n = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 61;
    }

    /* renamed from: e */
    public void mo1375e(short s) {
        this.f1356k = s;
    }

    /* renamed from: f */
    public void mo1376f(short s) {
        this.f1360o = s;
    }

    /* renamed from: g */
    public int mo36g() {
        return 18;
    }

    /* renamed from: g */
    public void mo1377g(short s) {
        this.f1353h = s;
    }

    /* renamed from: h */
    public int mo1378h() {
        return this.f1357l;
    }

    /* renamed from: h */
    public void mo1379h(short s) {
        this.f1354i = s;
    }

    /* renamed from: i */
    public boolean mo1380i() {
        return f1349d.mo1258d(this.f1356k);
    }

    /* renamed from: j */
    public boolean mo1381j() {
        return f1351f.mo1258d(this.f1356k);
    }

    /* renamed from: k */
    public boolean mo1382k() {
        return f1350e.mo1258d(this.f1356k);
    }

    /* renamed from: l */
    public int mo1383l() {
        return this.f1358m;
    }

    /* renamed from: m */
    public short mo1384m() {
        return this.f1355j;
    }

    /* renamed from: n */
    public boolean mo1385n() {
        return f1346a.mo1258d(this.f1356k);
    }

    /* renamed from: o */
    public short mo1386o() {
        return this.f1352g;
    }

    /* renamed from: p */
    public boolean mo1387p() {
        return f1347b.mo1258d(this.f1356k);
    }

    /* renamed from: q */
    public short mo1388q() {
        return this.f1359n;
    }

    /* renamed from: r */
    public short mo1389r() {
        return this.f1356k;
    }

    /* renamed from: s */
    public short mo1390s() {
        return this.f1360o;
    }

    /* renamed from: t */
    public short mo1391t() {
        return this.f1353h;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[WINDOW1]\n");
        stringBuffer.append("    .h_hold          = ");
        stringBuffer.append(Integer.toHexString(mo1386o()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .v_hold          = ");
        stringBuffer.append(Integer.toHexString(mo1391t()));
        stringBuffer.append(str);
        stringBuffer.append("    .width           = ");
        stringBuffer.append(Integer.toHexString(mo1392u()));
        stringBuffer.append(str);
        stringBuffer.append("    .height          = ");
        stringBuffer.append(Integer.toHexString(mo1384m()));
        stringBuffer.append(str);
        stringBuffer.append("    .options         = ");
        stringBuffer.append(Integer.toHexString(mo1389r()));
        stringBuffer.append(str);
        stringBuffer.append("        .hidden      = ");
        stringBuffer.append(mo1385n());
        stringBuffer.append(str);
        stringBuffer.append("        .iconic      = ");
        stringBuffer.append(mo1387p());
        stringBuffer.append(str);
        stringBuffer.append("        .hscroll     = ");
        stringBuffer.append(mo1380i());
        stringBuffer.append(str);
        stringBuffer.append("        .vscroll     = ");
        stringBuffer.append(mo1382k());
        stringBuffer.append(str);
        stringBuffer.append("        .tabs        = ");
        stringBuffer.append(mo1381j());
        stringBuffer.append(str);
        stringBuffer.append("    .activeSheet     = ");
        stringBuffer.append(Integer.toHexString(mo1378h()));
        stringBuffer.append(str);
        stringBuffer.append("    .firstVisibleTab    = ");
        stringBuffer.append(Integer.toHexString(mo1383l()));
        stringBuffer.append(str);
        stringBuffer.append("    .numselectedtabs = ");
        stringBuffer.append(Integer.toHexString(mo1388q()));
        stringBuffer.append(str);
        stringBuffer.append("    .tabwidthratio   = ");
        stringBuffer.append(Integer.toHexString(mo1390s()));
        stringBuffer.append(str);
        stringBuffer.append("[/WINDOW1]\n");
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public short mo1392u() {
        return this.f1354i;
    }
}
