package p000;

/* renamed from: DZ */
public final class C0081DZ extends C0080DY {

    /* renamed from: a */
    public static final Tca f184a = Uca.m1284a(1);

    /* renamed from: b */
    public static final Tca f185b = Uca.m1284a(2);

    /* renamed from: c */
    public static final Tca f186c = Uca.m1284a(4);

    /* renamed from: d */
    public static final Tca f187d = Uca.m1284a(8);

    /* renamed from: e */
    public static final Tca f188e = Uca.m1284a(16);

    /* renamed from: f */
    public static final Tca f189f = Uca.m1284a(32);

    /* renamed from: g */
    public static final Tca f190g = Uca.m1284a(64);

    /* renamed from: h */
    public static final Tca f191h = Uca.m1284a(128);

    /* renamed from: i */
    public static final Tca f192i = Uca.m1284a(256);

    /* renamed from: j */
    public double f193j;

    /* renamed from: k */
    public double f194k;

    /* renamed from: l */
    public double f195l;

    /* renamed from: m */
    public double f196m;

    /* renamed from: n */
    public double f197n;

    /* renamed from: o */
    public short f198o;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeDouble(this.f193j);
        jda.writeDouble(this.f194k);
        jda.writeDouble(this.f195l);
        jda.writeDouble(this.f196m);
        jda.writeDouble(this.f197n);
        jda.writeShort(this.f198o);
    }

    public Object clone() {
        C0081DZ dz = new C0081DZ();
        dz.f193j = this.f193j;
        dz.f194k = this.f194k;
        dz.f195l = this.f195l;
        dz.f196m = this.f196m;
        dz.f197n = this.f197n;
        dz.f198o = this.f198o;
        return dz;
    }

    /* renamed from: e */
    public short mo34e() {
        return 4127;
    }

    /* renamed from: g */
    public int mo36g() {
        return 42;
    }

    /* renamed from: h */
    public double mo164h() {
        return this.f197n;
    }

    /* renamed from: i */
    public double mo165i() {
        return this.f195l;
    }

    /* renamed from: j */
    public double mo166j() {
        return this.f194k;
    }

    /* renamed from: k */
    public double mo167k() {
        return this.f193j;
    }

    /* renamed from: l */
    public double mo168l() {
        return this.f196m;
    }

    /* renamed from: m */
    public short mo169m() {
        return this.f198o;
    }

    /* renamed from: n */
    public boolean mo170n() {
        return f188e.mo1258d(this.f198o);
    }

    /* renamed from: o */
    public boolean mo171o() {
        return f186c.mo1258d(this.f198o);
    }

    /* renamed from: p */
    public boolean mo172p() {
        return f185b.mo1258d(this.f198o);
    }

    /* renamed from: q */
    public boolean mo173q() {
        return f184a.mo1258d(this.f198o);
    }

    /* renamed from: r */
    public boolean mo174r() {
        return f187d.mo1258d(this.f198o);
    }

    /* renamed from: s */
    public boolean mo175s() {
        return f191h.mo1258d(this.f198o);
    }

    /* renamed from: t */
    public boolean mo176t() {
        return f189f.mo1258d(this.f198o);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[VALUERANGE]\n");
        stringBuffer.append("    .minimumAxisValue     = ");
        String str = " (";
        stringBuffer.append(str);
        stringBuffer.append(mo167k());
        String str2 = " )";
        stringBuffer.append(str2);
        String str3 = "line.separator";
        stringBuffer.append(System.getProperty(str3));
        stringBuffer.append("    .maximumAxisValue     = ");
        stringBuffer.append(str);
        stringBuffer.append(mo166j());
        stringBuffer.append(str2);
        stringBuffer.append(System.getProperty(str3));
        stringBuffer.append("    .majorIncrement       = ");
        stringBuffer.append(str);
        stringBuffer.append(mo165i());
        stringBuffer.append(str2);
        stringBuffer.append(System.getProperty(str3));
        stringBuffer.append("    .minorIncrement       = ");
        stringBuffer.append(str);
        stringBuffer.append(mo168l());
        stringBuffer.append(str2);
        stringBuffer.append(System.getProperty(str3));
        stringBuffer.append("    .categoryAxisCross    = ");
        stringBuffer.append(str);
        stringBuffer.append(mo164h());
        stringBuffer.append(str2);
        stringBuffer.append(System.getProperty(str3));
        stringBuffer.append("    .options              = ");
        stringBuffer.append("0x");
        stringBuffer.append(Yca.m1593a(mo169m()));
        stringBuffer.append(str);
        stringBuffer.append(mo169m());
        stringBuffer.append(str2);
        stringBuffer.append(System.getProperty(str3));
        stringBuffer.append("         .automaticMinimum         = ");
        stringBuffer.append(mo173q());
        stringBuffer.append(10);
        stringBuffer.append("         .automaticMaximum         = ");
        stringBuffer.append(mo172p());
        stringBuffer.append(10);
        stringBuffer.append("         .automaticMajor           = ");
        stringBuffer.append(mo171o());
        stringBuffer.append(10);
        stringBuffer.append("         .automaticMinor           = ");
        stringBuffer.append(mo174r());
        stringBuffer.append(10);
        stringBuffer.append("         .automaticCategoryCrossing     = ");
        stringBuffer.append(mo170n());
        stringBuffer.append(10);
        stringBuffer.append("         .logarithmicScale         = ");
        stringBuffer.append(mo176t());
        stringBuffer.append(10);
        stringBuffer.append("         .valuesInReverse          = ");
        stringBuffer.append(mo178v());
        stringBuffer.append(10);
        stringBuffer.append("         .crossCategoryAxisAtMaximum     = ");
        stringBuffer.append(mo175s());
        stringBuffer.append(10);
        stringBuffer.append("         .reserved                 = ");
        stringBuffer.append(mo177u());
        stringBuffer.append(10);
        stringBuffer.append("[/VALUERANGE]\n");
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public boolean mo177u() {
        return f192i.mo1258d(this.f198o);
    }

    /* renamed from: v */
    public boolean mo178v() {
        return f190g.mo1258d(this.f198o);
    }
}
