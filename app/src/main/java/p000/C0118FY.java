package p000;

/* renamed from: FY */
public final class C0118FY extends C0080DY {

    /* renamed from: a */
    public static final Tca f259a = Uca.m1284a(4095);

    /* renamed from: b */
    public static final Tca f260b = Uca.m1284a(32768);

    /* renamed from: c */
    public int f261c = f260b.mo1259e(this.f261c);

    /* renamed from: d */
    public int f262d;

    /* renamed from: e */
    public int f263e;

    /* renamed from: f */
    public boolean f264f;

    /* renamed from: g */
    public String f265g;

    /* renamed from: a */
    public int mo249a() {
        return f259a.mo1256c(this.f261c);
    }

    /* renamed from: a */
    public void mo250a(int i) {
        this.f261c = f260b.mo1259e(this.f261c);
        this.f262d = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f261c);
        if (mo254i()) {
            jda.writeByte(this.f262d);
            jda.writeByte(this.f263e);
            return;
        }
        jda.writeShort(this.f265g.length());
        jda.writeByte(this.f264f ? 1 : 0);
        if (this.f264f) {
            qda.m3373b(mo253h(), jda);
        } else {
            qda.m3370a(mo253h(), jda);
        }
    }

    /* renamed from: b */
    public void mo251b(int i) {
        this.f263e = i & 255;
    }

    /* renamed from: c */
    public void mo252c(int i) {
        this.f261c = f259a.mo1248a(this.f261c, i);
    }

    /* renamed from: e */
    public short mo34e() {
        return 659;
    }

    /* renamed from: g */
    public int mo36g() {
        if (mo254i()) {
            return 4;
        }
        return (this.f265g.length() * (this.f264f ? 2 : 1)) + 5;
    }

    /* renamed from: h */
    public String mo253h() {
        return this.f265g;
    }

    /* renamed from: i */
    public boolean mo254i() {
        return f260b.mo1258d(this.f261c);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[STYLE]\n");
        stringBuffer.append("    .xf_index_raw =");
        stringBuffer.append(Yca.m1602c(this.f261c));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("        .type     =");
        stringBuffer.append(mo254i() ? "built-in" : "user-defined");
        stringBuffer.append(str);
        stringBuffer.append("        .xf_index =");
        stringBuffer.append(Yca.m1602c(mo249a()));
        stringBuffer.append(str);
        if (mo254i()) {
            stringBuffer.append("    .builtin_style=");
            stringBuffer.append(Yca.m1596a(this.f262d));
            stringBuffer.append(str);
            stringBuffer.append("    .outline_level=");
            stringBuffer.append(Yca.m1596a(this.f263e));
        } else {
            stringBuffer.append("    .name        =");
            stringBuffer.append(mo253h());
        }
        stringBuffer.append(str);
        stringBuffer.append("[/STYLE]\n");
        return stringBuffer.toString();
    }
}
