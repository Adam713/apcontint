package p000;

/* renamed from: eba reason: case insensitive filesystem */
public final class C1225eba extends C0080DY {

    /* renamed from: a */
    public int f2928a;

    /* renamed from: b */
    public int f2929b;

    /* renamed from: c */
    public int f2930c;

    /* renamed from: d */
    public int f2931d;

    /* renamed from: e */
    public int f2932e;

    /* renamed from: f */
    public int f2933f;

    /* renamed from: g */
    public String f2934g;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f2928a);
        jda.writeShort(this.f2929b);
        jda.writeShort(this.f2930c);
        jda.writeShort(this.f2931d);
        jda.writeShort(this.f2932e);
        jda.writeShort(this.f2933f);
        qda.m3371a(jda, this.f2934g);
    }

    /* renamed from: e */
    public short mo34e() {
        return 197;
    }

    /* renamed from: g */
    public int mo36g() {
        return qda.m3367a(this.f2934g) + 12;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SXDI]\n");
        stringBuffer.append("  .isxvdData = ");
        stringBuffer.append(Yca.m1602c(this.f2928a));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("  .iiftab = ");
        stringBuffer.append(Yca.m1602c(this.f2929b));
        stringBuffer.append(str);
        stringBuffer.append("  .df = ");
        stringBuffer.append(Yca.m1602c(this.f2930c));
        stringBuffer.append(str);
        stringBuffer.append("  .isxvd = ");
        stringBuffer.append(Yca.m1602c(this.f2931d));
        stringBuffer.append(str);
        stringBuffer.append("  .isxvi = ");
        stringBuffer.append(Yca.m1602c(this.f2932e));
        stringBuffer.append(str);
        stringBuffer.append("  .ifmt = ");
        stringBuffer.append(Yca.m1602c(this.f2933f));
        stringBuffer.append(str);
        stringBuffer.append("[/SXDI]\n");
        return stringBuffer.toString();
    }
}
