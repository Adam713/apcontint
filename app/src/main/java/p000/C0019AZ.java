package p000;

/* renamed from: AZ */
public final class C0019AZ extends C0080DY {

    /* renamed from: a */
    public short f36a;

    /* renamed from: b */
    public short f37b;

    /* renamed from: c */
    public short f38c;

    /* renamed from: d */
    public short f39d;

    /* renamed from: e */
    public short f40e;

    /* renamed from: f */
    public short f41f;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f36a);
        jda.writeShort(this.f37b);
        jda.writeShort(this.f38c);
        jda.writeShort(this.f39d);
        jda.writeShort(this.f40e);
        jda.writeShort(this.f41f);
    }

    public Object clone() {
        C0019AZ az = new C0019AZ();
        az.f36a = this.f36a;
        az.f37b = this.f37b;
        az.f38c = this.f38c;
        az.f39d = this.f39d;
        az.f40e = this.f40e;
        az.f41f = this.f41f;
        return az;
    }

    /* renamed from: e */
    public short mo34e() {
        return 4099;
    }

    /* renamed from: g */
    public int mo36g() {
        return 12;
    }

    /* renamed from: h */
    public short mo46h() {
        return this.f40e;
    }

    /* renamed from: i */
    public short mo47i() {
        return this.f36a;
    }

    /* renamed from: j */
    public short mo48j() {
        return this.f41f;
    }

    /* renamed from: k */
    public short mo49k() {
        return this.f38c;
    }

    /* renamed from: l */
    public short mo50l() {
        return this.f39d;
    }

    /* renamed from: m */
    public short mo51m() {
        return this.f37b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SERIES]\n");
        stringBuffer.append("    .categoryDataType     = ");
        String str = "0x";
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo47i()));
        String str2 = " (";
        stringBuffer.append(str2);
        stringBuffer.append(mo47i());
        String str3 = " )";
        stringBuffer.append(str3);
        String str4 = "line.separator";
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .valuesDataType       = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo51m()));
        stringBuffer.append(str2);
        stringBuffer.append(mo51m());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .numCategories        = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo49k()));
        stringBuffer.append(str2);
        stringBuffer.append(mo49k());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .numValues            = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo50l()));
        stringBuffer.append(str2);
        stringBuffer.append(mo50l());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .bubbleSeriesType     = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo46h()));
        stringBuffer.append(str2);
        stringBuffer.append(mo46h());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .numBubbleValues      = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo48j()));
        stringBuffer.append(str2);
        stringBuffer.append(mo48j());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("[/SERIES]\n");
        return stringBuffer.toString();
    }
}
