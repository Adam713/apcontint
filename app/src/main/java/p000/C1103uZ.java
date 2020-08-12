package p000;

/* renamed from: uZ */
public final class C1103uZ extends C0080DY {

    /* renamed from: a */
    public short f3853a;

    /* renamed from: b */
    public short f3854b;

    /* renamed from: c */
    public short f3855c;

    /* renamed from: d */
    public short f3856d;

    /* renamed from: e */
    public short f3857e;

    /* renamed from: f */
    public short f3858f;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3853a);
        jda.writeShort(this.f3854b);
        jda.writeShort(this.f3855c);
        jda.writeShort(this.f3856d);
        jda.writeShort(this.f3857e);
        jda.writeShort(this.f3858f);
    }

    /* renamed from: e */
    public short mo34e() {
        return 2132;
    }

    /* renamed from: g */
    public int mo36g() {
        return 12;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[STARTOBJECT]\n");
        stringBuffer.append("    .rt              =");
        stringBuffer.append(Yca.m1602c((int) this.f3853a));
        stringBuffer.append(10);
        stringBuffer.append("    .grbitFrt        =");
        stringBuffer.append(Yca.m1602c((int) this.f3854b));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectKind     =");
        stringBuffer.append(Yca.m1602c((int) this.f3855c));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectContext  =");
        stringBuffer.append(Yca.m1602c((int) this.f3856d));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectInstance1=");
        stringBuffer.append(Yca.m1602c((int) this.f3857e));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectInstance2=");
        stringBuffer.append(Yca.m1602c((int) this.f3858f));
        stringBuffer.append(10);
        stringBuffer.append("[/STARTOBJECT]\n");
        return stringBuffer.toString();
    }
}
