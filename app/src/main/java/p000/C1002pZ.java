package p000;

/* renamed from: pZ */
public final class C1002pZ extends C0080DY {

    /* renamed from: a */
    public short f3591a;

    /* renamed from: b */
    public short f3592b;

    /* renamed from: c */
    public short f3593c;

    /* renamed from: d */
    public byte[] f3594d;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3591a);
        jda.writeShort(this.f3592b);
        jda.writeShort(this.f3593c);
        jda.write(this.f3594d);
    }

    public C1002pZ clone() {
        C1002pZ pZVar = new C1002pZ();
        pZVar.f3591a = this.f3591a;
        pZVar.f3592b = this.f3592b;
        pZVar.f3593c = this.f3593c;
        pZVar.f3594d = (byte[]) this.f3594d.clone();
        return pZVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 2131;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f3594d.length + 6;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ENDBLOCK]\n");
        stringBuffer.append("    .rt         =");
        stringBuffer.append(Yca.m1602c((int) this.f3591a));
        stringBuffer.append(10);
        stringBuffer.append("    .grbitFrt   =");
        stringBuffer.append(Yca.m1602c((int) this.f3592b));
        stringBuffer.append(10);
        stringBuffer.append("    .iObjectKind=");
        stringBuffer.append(Yca.m1602c((int) this.f3593c));
        stringBuffer.append(10);
        stringBuffer.append("    .unused     =");
        stringBuffer.append(Yca.m1594a(this.f3594d));
        stringBuffer.append(10);
        stringBuffer.append("[/ENDBLOCK]\n");
        return stringBuffer.toString();
    }
}
