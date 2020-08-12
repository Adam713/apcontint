package p000;

/* renamed from: EY */
public final class C0099EY extends C0201JZ {

    /* renamed from: a */
    public boolean f232a;

    /* renamed from: b */
    public String f233b;

    /* renamed from: a */
    public void mo218a(C0253LZ lz) {
        lz.writeShort(this.f233b.length());
        lz.mo861a(this.f233b);
    }

    /* renamed from: a */
    public void mo219a(String str) {
        this.f233b = str;
        this.f232a = qda.m3375b(str);
    }

    public Object clone() {
        C0099EY ey = new C0099EY();
        ey.f232a = this.f232a;
        ey.f233b = this.f233b;
        return ey;
    }

    /* renamed from: e */
    public short mo34e() {
        return 519;
    }

    /* renamed from: g */
    public String mo220g() {
        return this.f233b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[STRING]\n");
        stringBuffer.append("    .string            = ");
        stringBuffer.append(this.f233b);
        stringBuffer.append("\n");
        stringBuffer.append("[/STRING]\n");
        return stringBuffer.toString();
    }
}
