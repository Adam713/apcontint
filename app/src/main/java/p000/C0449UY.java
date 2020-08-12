package p000;

/* renamed from: UY */
public final class C0449UY extends C0080DY {

    /* renamed from: a */
    public static final Tca f1290a = Uca.m1284a(1);

    /* renamed from: b */
    public static final Tca f1291b = Uca.m1284a(16);

    /* renamed from: c */
    public static final Tca f1292c = Uca.m1284a(32);

    /* renamed from: d */
    public static final Tca f1293d = Uca.m1284a(64);

    /* renamed from: e */
    public static final Tca f1294e = Uca.m1284a(128);

    /* renamed from: f */
    public static final Tca f1295f = Uca.m1284a(1);

    /* renamed from: g */
    public static final Tca f1296g = Uca.m1284a(6);

    /* renamed from: h */
    public static final Tca f1297h = Uca.m1284a(64);

    /* renamed from: i */
    public static final Tca f1298i = Uca.m1284a(128);

    /* renamed from: j */
    public byte f1299j;

    /* renamed from: k */
    public byte f1300k;

    /* renamed from: a */
    public void mo1318a(byte b) {
        this.f1299j = b;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeByte(mo1329q());
        jda.writeByte(mo1328p());
    }

    /* renamed from: b */
    public void mo1319b(byte b) {
        this.f1300k = b;
    }

    public Object clone() {
        C0449UY uy = new C0449UY();
        uy.f1299j = this.f1299j;
        uy.f1300k = this.f1300k;
        return uy;
    }

    /* renamed from: e */
    public short mo34e() {
        return 129;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo1320h() {
        return f1297h.mo1258d(this.f1300k);
    }

    /* renamed from: i */
    public boolean mo1321i() {
        return f1298i.mo1258d(this.f1300k);
    }

    /* renamed from: j */
    public boolean mo1322j() {
        return f1290a.mo1258d(this.f1299j);
    }

    /* renamed from: k */
    public boolean mo1323k() {
        return f1291b.mo1258d(this.f1299j);
    }

    /* renamed from: l */
    public boolean mo1324l() {
        return f1296g.mo1258d(this.f1300k);
    }

    /* renamed from: m */
    public boolean mo1325m() {
        return f1295f.mo1258d(this.f1300k);
    }

    /* renamed from: n */
    public boolean mo1326n() {
        return f1293d.mo1258d(this.f1299j);
    }

    /* renamed from: o */
    public boolean mo1327o() {
        return f1294e.mo1258d(this.f1299j);
    }

    /* renamed from: p */
    public byte mo1328p() {
        return this.f1299j;
    }

    /* renamed from: q */
    public byte mo1329q() {
        return this.f1300k;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[WSBOOL]\n");
        stringBuffer.append("    .wsbool1        = ");
        stringBuffer.append(Integer.toHexString(mo1328p()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("        .autobreaks = ");
        stringBuffer.append(mo1322j());
        stringBuffer.append(str);
        stringBuffer.append("        .dialog     = ");
        stringBuffer.append(mo1323k());
        stringBuffer.append(str);
        stringBuffer.append("        .rowsumsbelw= ");
        stringBuffer.append(mo1326n());
        stringBuffer.append(str);
        stringBuffer.append("        .rowsumsrigt= ");
        stringBuffer.append(mo1327o());
        stringBuffer.append(str);
        stringBuffer.append("    .wsbool2        = ");
        stringBuffer.append(Integer.toHexString(mo1329q()));
        stringBuffer.append(str);
        stringBuffer.append("        .fittopage  = ");
        stringBuffer.append(mo1325m());
        stringBuffer.append(str);
        stringBuffer.append("        .displayguts= ");
        stringBuffer.append(mo1324l());
        stringBuffer.append(str);
        stringBuffer.append("        .alternateex= ");
        stringBuffer.append(mo1320h());
        stringBuffer.append(str);
        stringBuffer.append("        .alternatefo= ");
        stringBuffer.append(mo1321i());
        stringBuffer.append(str);
        stringBuffer.append("[/WSBOOL]\n");
        return stringBuffer.toString();
    }
}
