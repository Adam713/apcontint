package p000;

/* renamed from: oZ */
public final class C0982oZ extends C0080DY {

    /* renamed from: a */
    public short f3558a;

    /* renamed from: b */
    public short f3559b;

    /* renamed from: c */
    public short f3560c;

    /* renamed from: d */
    public short f3561d;

    /* renamed from: e */
    public short f3562e;

    /* renamed from: f */
    public Short f3563f;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3558a);
        jda.writeShort(this.f3559b);
        jda.writeShort(this.f3560c);
        jda.writeShort(this.f3561d);
        jda.writeShort(this.f3562e);
        Short sh = this.f3563f;
        if (sh != null) {
            jda.writeShort(sh.shortValue());
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 2134;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f3563f == null ? 0 : 2) + 10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CATLAB]\n");
        stringBuffer.append("    .rt      =");
        stringBuffer.append(Yca.m1602c((int) this.f3558a));
        stringBuffer.append(10);
        stringBuffer.append("    .grbitFrt=");
        stringBuffer.append(Yca.m1602c((int) this.f3559b));
        stringBuffer.append(10);
        stringBuffer.append("    .wOffset =");
        stringBuffer.append(Yca.m1602c((int) this.f3560c));
        stringBuffer.append(10);
        stringBuffer.append("    .at      =");
        stringBuffer.append(Yca.m1602c((int) this.f3561d));
        stringBuffer.append(10);
        stringBuffer.append("    .grbit   =");
        stringBuffer.append(Yca.m1602c((int) this.f3562e));
        stringBuffer.append(10);
        stringBuffer.append("    .unused  =");
        stringBuffer.append(Yca.m1602c((int) this.f3563f.shortValue()));
        stringBuffer.append(10);
        stringBuffer.append("[/CATLAB]\n");
        return stringBuffer.toString();
    }
}
