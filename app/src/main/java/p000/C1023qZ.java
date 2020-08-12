package p000;

/* renamed from: qZ */
public final class C1023qZ extends C0080DY {

    /* renamed from: a */
    public short f3638a;

    /* renamed from: b */
    public short f3639b;

    /* renamed from: c */
    public short f3640c;

    /* renamed from: d */
    public byte[] f3641d;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3638a);
        jda.writeShort(this.f3639b);
        jda.writeShort(this.f3640c);
        jda.write(this.f3641d);
    }

    /* renamed from: e */
    public short mo34e() {
        return 2133;
    }

    /* renamed from: g */
    public int mo36g() {
        return 12;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ENDOBJECT]\n");
        stringBuffer.append("    .rt         =");
        stringBuffer.append(Yca.m1602c((int) this.f3638a));
        stringBuffer.append(10);
        stringBuffer.append("    .grbitFrt   =");
        stringBuffer.append(Yca.m1602c((int) this.f3639b));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectKind=");
        stringBuffer.append(Yca.m1602c((int) this.f3640c));
        stringBuffer.append(10);
        stringBuffer.append("    .unused     =");
        stringBuffer.append(Yca.m1594a(this.f3641d));
        stringBuffer.append(10);
        stringBuffer.append("[/ENDOBJECT]\n");
        return stringBuffer.toString();
    }
}
