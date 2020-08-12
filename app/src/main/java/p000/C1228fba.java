package p000;

/* renamed from: fba reason: case insensitive filesystem */
public final class C1228fba extends C0080DY {

    /* renamed from: a */
    public int f2989a;

    /* renamed from: b */
    public int f2990b;

    /* renamed from: c */
    public int f2991c;

    /* renamed from: d */
    public int f2992d;

    /* renamed from: e */
    public int f2993e;

    /* renamed from: f */
    public int f2994f;

    /* renamed from: g */
    public int f2995g;

    /* renamed from: h */
    public String f2996h;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeInt(this.f2989a);
        jda.writeByte(this.f2990b);
        jda.writeByte(this.f2991c);
        jda.writeShort(this.f2992d);
        jda.writeShort(this.f2993e);
        String str = this.f2996h;
        jda.writeShort(str == null ? 65535 : str.length());
        jda.writeInt(this.f2994f);
        jda.writeInt(this.f2995g);
        String str2 = this.f2996h;
        if (str2 != null) {
            qda.m3373b(str2, jda);
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 256;
    }

    /* renamed from: g */
    public int mo36g() {
        String str = this.f2996h;
        return (str == null ? 0 : str.length() * 2) + 20;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SXVDEX]\n");
        stringBuffer.append("    .grbit1 =");
        stringBuffer.append(Yca.m1598b(this.f2989a));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .grbit2 =");
        stringBuffer.append(Yca.m1596a(this.f2990b));
        stringBuffer.append(str);
        stringBuffer.append("    .citmShow =");
        stringBuffer.append(Yca.m1596a(this.f2991c));
        stringBuffer.append(str);
        stringBuffer.append("    .isxdiSort =");
        stringBuffer.append(Yca.m1602c(this.f2992d));
        stringBuffer.append(str);
        stringBuffer.append("    .isxdiShow =");
        stringBuffer.append(Yca.m1602c(this.f2993e));
        stringBuffer.append(str);
        stringBuffer.append("    .subtotalName =");
        stringBuffer.append(this.f2996h);
        stringBuffer.append(str);
        stringBuffer.append("[/SXVDEX]\n");
        return stringBuffer.toString();
    }
}
