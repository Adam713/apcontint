package p000;

/* renamed from: tX */
public final class C1081tX extends C0080DY {

    /* renamed from: a */
    public short f3792a;

    /* renamed from: b */
    public short f3793b;

    /* renamed from: c */
    public byte f3794c;

    /* renamed from: d */
    public String f3795d;

    /* renamed from: a */
    public void mo5141a(String str) {
        this.f3795d = str;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo5145i());
        jda.writeShort(mo5144h());
        jda.writeShort(this.f3795d.length());
        if (this.f3795d.length() > 0) {
            jda.writeByte(this.f3794c);
            qda.m3370a(mo5146j(), jda);
        }
    }

    /* renamed from: b */
    public void mo5142b(short s) {
        this.f3793b = s;
    }

    /* renamed from: c */
    public void mo5143c(short s) {
        this.f3792a = s;
    }

    public Object clone() {
        C1081tX tXVar = new C1081tX();
        tXVar.mo5143c(this.f3792a);
        tXVar.mo5142b(this.f3793b);
        tXVar.mo5141a(this.f3795d);
        return tXVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 91;
    }

    /* renamed from: g */
    public int mo36g() {
        int length = this.f3795d.length();
        if (length < 1) {
            return 6;
        }
        return length + 7;
    }

    /* renamed from: h */
    public short mo5144h() {
        return this.f3793b;
    }

    /* renamed from: i */
    public short mo5145i() {
        return this.f3792a;
    }

    /* renamed from: j */
    public String mo5146j() {
        return this.f3795d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[FILESHARING]\n");
        stringBuffer.append("    .readonly       = ");
        stringBuffer.append(mo5145i() == 1 ? "true" : "false");
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .password       = ");
        stringBuffer.append(Integer.toHexString(mo5144h()));
        stringBuffer.append(str);
        stringBuffer.append("    .username       = ");
        stringBuffer.append(mo5146j());
        stringBuffer.append(str);
        stringBuffer.append("[/FILESHARING]\n");
        return stringBuffer.toString();
    }
}
