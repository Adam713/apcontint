package p000;

/* renamed from: tZ */
public final class C1083tZ extends C0080DY {

    /* renamed from: a */
    public short f3797a;

    /* renamed from: b */
    public short f3798b;

    /* renamed from: c */
    public short f3799c;

    /* renamed from: d */
    public short f3800d;

    /* renamed from: e */
    public short f3801e;

    /* renamed from: f */
    public short f3802f;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3797a);
        jda.writeShort(this.f3798b);
        jda.writeShort(this.f3799c);
        jda.writeShort(this.f3800d);
        jda.writeShort(this.f3801e);
        jda.writeShort(this.f3802f);
    }

    public C1083tZ clone() {
        C1083tZ tZVar = new C1083tZ();
        tZVar.f3797a = this.f3797a;
        tZVar.f3798b = this.f3798b;
        tZVar.f3799c = this.f3799c;
        tZVar.f3800d = this.f3800d;
        tZVar.f3801e = this.f3801e;
        tZVar.f3802f = this.f3802f;
        return tZVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 2130;
    }

    /* renamed from: g */
    public int mo36g() {
        return 12;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[STARTBLOCK]\n");
        stringBuffer.append("    .rt              =");
        stringBuffer.append(Yca.m1602c((int) this.f3797a));
        stringBuffer.append(10);
        stringBuffer.append("    .grbitFrt        =");
        stringBuffer.append(Yca.m1602c((int) this.f3798b));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectKind     =");
        stringBuffer.append(Yca.m1602c((int) this.f3799c));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectContext  =");
        stringBuffer.append(Yca.m1602c((int) this.f3800d));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectInstance1=");
        stringBuffer.append(Yca.m1602c((int) this.f3801e));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectInstance2=");
        stringBuffer.append(Yca.m1602c((int) this.f3802f));
        stringBuffer.append(10);
        stringBuffer.append("[/STARTBLOCK]\n");
        return stringBuffer.toString();
    }
}
