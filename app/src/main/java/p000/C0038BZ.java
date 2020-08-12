package p000;

/* renamed from: BZ */
public final class C0038BZ extends C0080DY {

    /* renamed from: a */
    public int f64a;

    /* renamed from: b */
    public boolean f65b = false;

    /* renamed from: c */
    public String f66c = "";

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f64a);
        jda.writeByte(this.f66c.length());
        if (this.f65b) {
            jda.writeByte(1);
            qda.m3373b(this.f66c, jda);
            return;
        }
        jda.writeByte(0);
        qda.m3370a(this.f66c, jda);
    }

    public Object clone() {
        C0038BZ bz = new C0038BZ();
        bz.f64a = this.f64a;
        bz.f65b = this.f65b;
        bz.f66c = this.f66c;
        return bz;
    }

    /* renamed from: e */
    public short mo34e() {
        return 4109;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f66c.length() * (this.f65b ? 2 : 1)) + 4;
    }

    /* renamed from: h */
    public int mo77h() {
        return this.f64a;
    }

    /* renamed from: i */
    public String mo78i() {
        return this.f66c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SERIESTEXT]\n");
        stringBuffer.append("  .id     =");
        stringBuffer.append(Yca.m1602c(mo77h()));
        stringBuffer.append(10);
        stringBuffer.append("  .textLen=");
        stringBuffer.append(this.f66c.length());
        stringBuffer.append(10);
        stringBuffer.append("  .is16bit=");
        stringBuffer.append(this.f65b);
        stringBuffer.append(10);
        stringBuffer.append("  .text   =");
        stringBuffer.append(" (");
        stringBuffer.append(mo78i());
        stringBuffer.append(" )");
        stringBuffer.append(10);
        stringBuffer.append("[/SERIESTEXT]\n");
        return stringBuffer.toString();
    }
}
