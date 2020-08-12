package p000;

/* renamed from: hY */
public final class C0826hY extends C0080DY {

    /* renamed from: a */
    public static final Tca f3059a = Uca.m1284a(1);

    /* renamed from: b */
    public static final Tca f3060b = Uca.m1284a(2);

    /* renamed from: c */
    public static final Tca f3061c = Uca.m1284a(4);

    /* renamed from: d */
    public static final Tca f3062d = Uca.m1284a(8);

    /* renamed from: e */
    public static final Tca f3063e = Uca.m1284a(16);

    /* renamed from: f */
    public static final Tca f3064f = Uca.m1284a(32);

    /* renamed from: g */
    public static final Tca f3065g = Uca.m1284a(64);

    /* renamed from: h */
    public static final Tca f3066h = Uca.m1284a(128);

    /* renamed from: i */
    public short f3067i;

    /* renamed from: j */
    public short f3068j;

    /* renamed from: k */
    public short f3069k;

    /* renamed from: l */
    public short f3070l;

    /* renamed from: m */
    public short f3071m;

    /* renamed from: n */
    public short f3072n;

    /* renamed from: o */
    public short f3073o;

    /* renamed from: p */
    public short f3074p;

    /* renamed from: q */
    public double f3075q;

    /* renamed from: r */
    public double f3076r;

    /* renamed from: s */
    public short f3077s;

    /* renamed from: a */
    public void mo4460a(double d) {
        this.f3076r = d;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo4485v());
        jda.writeShort(mo4486w());
        jda.writeShort(mo4484u());
        jda.writeShort(mo4474k());
        jda.writeShort(mo4472j());
        jda.writeShort(mo4483t());
        jda.writeShort(mo4476m());
        jda.writeShort(mo4488y());
        jda.writeDouble(mo4477n());
        jda.writeDouble(mo4475l());
        jda.writeShort(mo4468h());
    }

    /* renamed from: b */
    public void mo4461b(double d) {
        this.f3075q = d;
    }

    /* renamed from: b */
    public void mo4462b(short s) {
        this.f3077s = s;
    }

    /* renamed from: c */
    public void mo4463c(short s) {
        this.f3071m = s;
    }

    public Object clone() {
        C0826hY hYVar = new C0826hY();
        hYVar.f3067i = this.f3067i;
        hYVar.f3068j = this.f3068j;
        hYVar.f3069k = this.f3069k;
        hYVar.f3070l = this.f3070l;
        hYVar.f3071m = this.f3071m;
        hYVar.f3072n = this.f3072n;
        hYVar.f3073o = this.f3073o;
        hYVar.f3074p = this.f3074p;
        hYVar.f3075q = this.f3075q;
        hYVar.f3076r = this.f3076r;
        hYVar.f3077s = this.f3077s;
        return hYVar;
    }

    /* renamed from: d */
    public void mo4464d(short s) {
        this.f3070l = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 161;
    }

    /* renamed from: e */
    public void mo4465e(short s) {
        this.f3073o = s;
    }

    /* renamed from: f */
    public void mo4466f(short s) {
        this.f3072n = s;
    }

    /* renamed from: g */
    public int mo36g() {
        return 34;
    }

    /* renamed from: g */
    public void mo4467g(short s) {
        this.f3069k = s;
    }

    /* renamed from: h */
    public short mo4468h() {
        return this.f3077s;
    }

    /* renamed from: h */
    public void mo4469h(short s) {
        this.f3067i = s;
    }

    /* renamed from: i */
    public void mo4470i(short s) {
        this.f3068j = s;
    }

    /* renamed from: i */
    public boolean mo4471i() {
        return f3063e.mo1258d(this.f3072n);
    }

    /* renamed from: j */
    public short mo4472j() {
        return this.f3071m;
    }

    /* renamed from: j */
    public void mo4473j(short s) {
        this.f3074p = s;
    }

    /* renamed from: k */
    public short mo4474k() {
        return this.f3070l;
    }

    /* renamed from: l */
    public double mo4475l() {
        return this.f3076r;
    }

    /* renamed from: m */
    public short mo4476m() {
        return this.f3073o;
    }

    /* renamed from: n */
    public double mo4477n() {
        return this.f3075q;
    }

    /* renamed from: o */
    public boolean mo4478o() {
        return f3060b.mo1258d(this.f3072n);
    }

    /* renamed from: p */
    public boolean mo4479p() {
        return f3059a.mo1258d(this.f3072n);
    }

    /* renamed from: q */
    public boolean mo4480q() {
        return f3062d.mo1258d(this.f3072n);
    }

    /* renamed from: r */
    public boolean mo4481r() {
        return f3065g.mo1258d(this.f3072n);
    }

    /* renamed from: s */
    public boolean mo4482s() {
        return f3064f.mo1258d(this.f3072n);
    }

    /* renamed from: t */
    public short mo4483t() {
        return this.f3072n;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PRINTSETUP]\n");
        stringBuffer.append("    .papersize      = ");
        stringBuffer.append(mo4485v());
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .scale          = ");
        stringBuffer.append(mo4486w());
        stringBuffer.append(str);
        stringBuffer.append("    .pagestart      = ");
        stringBuffer.append(mo4484u());
        stringBuffer.append(str);
        stringBuffer.append("    .fitwidth       = ");
        stringBuffer.append(mo4474k());
        stringBuffer.append(str);
        stringBuffer.append("    .fitheight      = ");
        stringBuffer.append(mo4472j());
        stringBuffer.append(str);
        stringBuffer.append("    .options        = ");
        stringBuffer.append(mo4483t());
        stringBuffer.append(str);
        stringBuffer.append("        .ltor       = ");
        stringBuffer.append(mo4479p());
        stringBuffer.append(str);
        stringBuffer.append("        .landscape  = ");
        stringBuffer.append(mo4478o());
        stringBuffer.append(str);
        stringBuffer.append("        .valid      = ");
        stringBuffer.append(mo4489z());
        stringBuffer.append(str);
        stringBuffer.append("        .mono       = ");
        stringBuffer.append(mo4480q());
        stringBuffer.append(str);
        stringBuffer.append("        .draft      = ");
        stringBuffer.append(mo4471i());
        stringBuffer.append(str);
        stringBuffer.append("        .notes      = ");
        stringBuffer.append(mo4482s());
        stringBuffer.append(str);
        stringBuffer.append("        .noOrientat = ");
        stringBuffer.append(mo4481r());
        stringBuffer.append(str);
        stringBuffer.append("        .usepage    = ");
        stringBuffer.append(mo4487x());
        stringBuffer.append(str);
        stringBuffer.append("    .hresolution    = ");
        stringBuffer.append(mo4476m());
        stringBuffer.append(str);
        stringBuffer.append("    .vresolution    = ");
        stringBuffer.append(mo4488y());
        stringBuffer.append(str);
        stringBuffer.append("    .headermargin   = ");
        stringBuffer.append(mo4477n());
        stringBuffer.append(str);
        stringBuffer.append("    .footermargin   = ");
        stringBuffer.append(mo4475l());
        stringBuffer.append(str);
        stringBuffer.append("    .copies         = ");
        stringBuffer.append(mo4468h());
        stringBuffer.append(str);
        stringBuffer.append("[/PRINTSETUP]\n");
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public short mo4484u() {
        return this.f3069k;
    }

    /* renamed from: v */
    public short mo4485v() {
        return this.f3067i;
    }

    /* renamed from: w */
    public short mo4486w() {
        return this.f3068j;
    }

    /* renamed from: x */
    public boolean mo4487x() {
        return f3066h.mo1258d(this.f3072n);
    }

    /* renamed from: y */
    public short mo4488y() {
        return this.f3074p;
    }

    /* renamed from: z */
    public boolean mo4489z() {
        return f3061c.mo1258d(this.f3072n);
    }
}
