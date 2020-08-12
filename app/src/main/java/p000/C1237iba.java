package p000;

/* renamed from: iba reason: case insensitive filesystem */
public final class C1237iba extends C0080DY {

    /* renamed from: a */
    public int f3123a;

    /* renamed from: b */
    public int f3124b;

    /* renamed from: c */
    public int f3125c;

    /* renamed from: d */
    public int f3126d;

    /* renamed from: e */
    public int f3127e;

    /* renamed from: f */
    public int f3128f;

    /* renamed from: g */
    public int f3129g;

    /* renamed from: h */
    public int f3130h;

    /* renamed from: i */
    public int f3131i;

    /* renamed from: j */
    public int f3132j;

    /* renamed from: k */
    public int f3133k;

    /* renamed from: l */
    public int f3134l;

    /* renamed from: m */
    public int f3135m;

    /* renamed from: n */
    public int f3136n;

    /* renamed from: o */
    public int f3137o;

    /* renamed from: p */
    public int f3138p;

    /* renamed from: q */
    public int f3139q;

    /* renamed from: r */
    public int f3140r;

    /* renamed from: s */
    public int f3141s;

    /* renamed from: t */
    public int f3142t;

    /* renamed from: u */
    public String f3143u;

    /* renamed from: v */
    public String f3144v;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3123a);
        jda.writeShort(this.f3124b);
        jda.writeShort(this.f3125c);
        jda.writeShort(this.f3126d);
        jda.writeShort(this.f3127e);
        jda.writeShort(this.f3128f);
        jda.writeShort(this.f3129g);
        jda.writeShort(this.f3130h);
        jda.writeShort(this.f3131i);
        jda.writeShort(this.f3132j);
        jda.writeShort(this.f3133k);
        jda.writeShort(this.f3134l);
        jda.writeShort(this.f3135m);
        jda.writeShort(this.f3136n);
        jda.writeShort(this.f3137o);
        jda.writeShort(this.f3138p);
        jda.writeShort(this.f3139q);
        jda.writeShort(this.f3140r);
        jda.writeShort(this.f3141s);
        jda.writeShort(this.f3142t);
        jda.writeShort(this.f3144v.length());
        jda.writeShort(this.f3143u.length());
        qda.m3374b(jda, this.f3144v);
        qda.m3374b(jda, this.f3143u);
    }

    /* renamed from: e */
    public short mo34e() {
        return 176;
    }

    /* renamed from: g */
    public int mo36g() {
        return qda.m3367a(this.f3144v) + 40 + qda.m3367a(this.f3143u);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SXVIEW]\n");
        stringBuffer.append("    .rwFirst      =");
        stringBuffer.append(Yca.m1602c(this.f3123a));
        stringBuffer.append(10);
        stringBuffer.append("    .rwLast       =");
        stringBuffer.append(Yca.m1602c(this.f3124b));
        stringBuffer.append(10);
        stringBuffer.append("    .colFirst     =");
        stringBuffer.append(Yca.m1602c(this.f3125c));
        stringBuffer.append(10);
        stringBuffer.append("    .colLast      =");
        stringBuffer.append(Yca.m1602c(this.f3126d));
        stringBuffer.append(10);
        stringBuffer.append("    .rwFirstHead  =");
        stringBuffer.append(Yca.m1602c(this.f3127e));
        stringBuffer.append(10);
        stringBuffer.append("    .rwFirstData  =");
        stringBuffer.append(Yca.m1602c(this.f3128f));
        stringBuffer.append(10);
        stringBuffer.append("    .colFirstData =");
        stringBuffer.append(Yca.m1602c(this.f3129g));
        stringBuffer.append(10);
        stringBuffer.append("    .iCache       =");
        stringBuffer.append(Yca.m1602c(this.f3130h));
        stringBuffer.append(10);
        stringBuffer.append("    .reserved     =");
        stringBuffer.append(Yca.m1602c(this.f3131i));
        stringBuffer.append(10);
        stringBuffer.append("    .sxaxis4Data  =");
        stringBuffer.append(Yca.m1602c(this.f3132j));
        stringBuffer.append(10);
        stringBuffer.append("    .ipos4Data    =");
        stringBuffer.append(Yca.m1602c(this.f3133k));
        stringBuffer.append(10);
        stringBuffer.append("    .cDim         =");
        stringBuffer.append(Yca.m1602c(this.f3134l));
        stringBuffer.append(10);
        stringBuffer.append("    .cDimRw       =");
        stringBuffer.append(Yca.m1602c(this.f3135m));
        stringBuffer.append(10);
        stringBuffer.append("    .cDimCol      =");
        stringBuffer.append(Yca.m1602c(this.f3136n));
        stringBuffer.append(10);
        stringBuffer.append("    .cDimPg       =");
        stringBuffer.append(Yca.m1602c(this.f3137o));
        stringBuffer.append(10);
        stringBuffer.append("    .cDimData     =");
        stringBuffer.append(Yca.m1602c(this.f3138p));
        stringBuffer.append(10);
        stringBuffer.append("    .cRw          =");
        stringBuffer.append(Yca.m1602c(this.f3139q));
        stringBuffer.append(10);
        stringBuffer.append("    .cCol         =");
        stringBuffer.append(Yca.m1602c(this.f3140r));
        stringBuffer.append(10);
        stringBuffer.append("    .grbit        =");
        stringBuffer.append(Yca.m1602c(this.f3141s));
        stringBuffer.append(10);
        stringBuffer.append("    .itblAutoFmt  =");
        stringBuffer.append(Yca.m1602c(this.f3142t));
        stringBuffer.append(10);
        stringBuffer.append("    .name         =");
        stringBuffer.append(this.f3144v);
        stringBuffer.append(10);
        stringBuffer.append("    .dataField    =");
        stringBuffer.append(this.f3143u);
        stringBuffer.append(10);
        stringBuffer.append("[/SXVIEW]\n");
        return stringBuffer.toString();
    }
}
