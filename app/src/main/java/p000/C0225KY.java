package p000;

/* renamed from: KY */
public final class C0225KY extends C0080DY {

    /* renamed from: a */
    public int f584a;

    /* renamed from: b */
    public int f585b;

    /* renamed from: c */
    public byte[] f586c;

    /* renamed from: d */
    public int f587d;

    /* renamed from: e */
    public String f588e;

    /* renamed from: f */
    public String f589f;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f584a);
        jda.writeShort(this.f585b);
        jda.write(this.f586c);
        jda.writeInt(this.f587d);
        jda.writeShort(this.f588e.length());
        jda.writeShort(this.f589f.length());
        qda.m3373b(this.f588e, jda);
        qda.m3373b(this.f589f, jda);
    }

    /* renamed from: e */
    public short mo34e() {
        return 2190;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f588e.length() * 2) + 20 + (this.f589f.length() * 2);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[TABLESTYLES]\n");
        stringBuffer.append("    .rt      =");
        stringBuffer.append(Yca.m1602c(this.f584a));
        stringBuffer.append(10);
        stringBuffer.append("    .grbitFrt=");
        stringBuffer.append(Yca.m1602c(this.f585b));
        stringBuffer.append(10);
        stringBuffer.append("    .unused  =");
        stringBuffer.append(Yca.m1594a(this.f586c));
        stringBuffer.append(10);
        stringBuffer.append("    .cts=");
        stringBuffer.append(Yca.m1598b(this.f587d));
        stringBuffer.append(10);
        stringBuffer.append("    .rgchDefListStyle=");
        stringBuffer.append(this.f588e);
        stringBuffer.append(10);
        stringBuffer.append("    .rgchDefPivotStyle=");
        stringBuffer.append(this.f589f);
        stringBuffer.append(10);
        stringBuffer.append("[/TABLESTYLES]\n");
        return stringBuffer.toString();
    }
}
