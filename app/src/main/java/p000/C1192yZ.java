package p000;

/* renamed from: yZ */
public final class C1192yZ extends C0080DY {

    /* renamed from: a */
    public static final Tca f4177a = Uca.m1284a(1);

    /* renamed from: b */
    public static final Tca f4178b = Uca.m1284a(2);

    /* renamed from: c */
    public static final Tca f4179c = Uca.m1284a(4);

    /* renamed from: d */
    public static final Tca f4180d = Uca.m1284a(8);

    /* renamed from: e */
    public static final Tca f4181e = Uca.m1284a(16);

    /* renamed from: f */
    public static final Tca f4182f = Uca.m1284a(32);

    /* renamed from: g */
    public int f4183g;

    /* renamed from: h */
    public int f4184h;

    /* renamed from: i */
    public int f4185i;

    /* renamed from: j */
    public int f4186j;

    /* renamed from: k */
    public byte f4187k;

    /* renamed from: l */
    public byte f4188l;

    /* renamed from: m */
    public short f4189m;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeInt(this.f4183g);
        jda.writeInt(this.f4184h);
        jda.writeInt(this.f4185i);
        jda.writeInt(this.f4186j);
        jda.writeByte(this.f4187k);
        jda.writeByte(this.f4188l);
        jda.writeShort(this.f4189m);
    }

    public Object clone() {
        C1192yZ yZVar = new C1192yZ();
        yZVar.f4183g = this.f4183g;
        yZVar.f4184h = this.f4184h;
        yZVar.f4185i = this.f4185i;
        yZVar.f4186j = this.f4186j;
        yZVar.f4187k = this.f4187k;
        yZVar.f4188l = this.f4188l;
        yZVar.f4189m = this.f4189m;
        return yZVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 4117;
    }

    /* renamed from: g */
    public int mo36g() {
        return 20;
    }

    /* renamed from: h */
    public short mo5518h() {
        return this.f4189m;
    }

    /* renamed from: i */
    public byte mo5519i() {
        return this.f4188l;
    }

    /* renamed from: j */
    public byte mo5520j() {
        return this.f4187k;
    }

    /* renamed from: k */
    public int mo5521k() {
        return this.f4183g;
    }

    /* renamed from: l */
    public int mo5522l() {
        return this.f4185i;
    }

    /* renamed from: m */
    public int mo5523m() {
        return this.f4184h;
    }

    /* renamed from: n */
    public int mo5524n() {
        return this.f4186j;
    }

    /* renamed from: o */
    public boolean mo5525o() {
        return f4177a.mo1258d(this.f4189m);
    }

    /* renamed from: p */
    public boolean mo5526p() {
        return f4178b.mo1258d(this.f4189m);
    }

    /* renamed from: q */
    public boolean mo5527q() {
        return f4179c.mo1258d(this.f4189m);
    }

    /* renamed from: r */
    public boolean mo5528r() {
        return f4180d.mo1258d(this.f4189m);
    }

    /* renamed from: s */
    public boolean mo5529s() {
        return f4182f.mo1258d(this.f4189m);
    }

    /* renamed from: t */
    public boolean mo5530t() {
        return f4181e.mo1258d(this.f4189m);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LEGEND]\n");
        stringBuffer.append("    .xAxisUpperLeft       = ");
        String str = "0x";
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1603d(mo5521k()));
        String str2 = " (";
        stringBuffer.append(str2);
        stringBuffer.append(mo5521k());
        String str3 = " )";
        stringBuffer.append(str3);
        String str4 = "line.separator";
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .yAxisUpperLeft       = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1603d(mo5523m()));
        stringBuffer.append(str2);
        stringBuffer.append(mo5523m());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .xSize                = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1603d(mo5522l()));
        stringBuffer.append(str2);
        stringBuffer.append(mo5522l());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .ySize                = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1603d(mo5524n()));
        stringBuffer.append(str2);
        stringBuffer.append(mo5524n());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .type                 = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1597b(mo5520j()));
        stringBuffer.append(str2);
        stringBuffer.append(mo5520j());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .spacing              = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1597b(mo5519i()));
        stringBuffer.append(str2);
        stringBuffer.append(mo5519i());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .options              = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo5518h()));
        stringBuffer.append(str2);
        stringBuffer.append(mo5518h());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("         .autoPosition             = ");
        stringBuffer.append(mo5525o());
        stringBuffer.append(10);
        stringBuffer.append("         .autoSeries               = ");
        stringBuffer.append(mo5526p());
        stringBuffer.append(10);
        stringBuffer.append("         .autoXPositioning         = ");
        stringBuffer.append(mo5527q());
        stringBuffer.append(10);
        stringBuffer.append("         .autoYPositioning         = ");
        stringBuffer.append(mo5528r());
        stringBuffer.append(10);
        stringBuffer.append("         .vertical                 = ");
        stringBuffer.append(mo5530t());
        stringBuffer.append(10);
        stringBuffer.append("         .dataTable                = ");
        stringBuffer.append(mo5529s());
        stringBuffer.append(10);
        stringBuffer.append("[/LEGEND]\n");
        return stringBuffer.toString();
    }
}
