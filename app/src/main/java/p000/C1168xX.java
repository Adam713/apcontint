package p000;

/* renamed from: xX */
public final class C1168xX extends C0080DY {

    /* renamed from: a */
    public final int f4121a;

    /* renamed from: b */
    public final boolean f4122b;

    /* renamed from: c */
    public final String f4123c;

    public C1168xX(int i, String str) {
        this.f4121a = i;
        this.f4123c = str;
        this.f4122b = qda.m3375b(str);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        String h = mo5449h();
        jda.writeShort(mo5450i());
        jda.writeShort(h.length());
        jda.writeByte(this.f4122b ? 1 : 0);
        if (this.f4122b) {
            qda.m3373b(h, jda);
        } else {
            qda.m3370a(h, jda);
        }
    }

    public Object clone() {
        return this;
    }

    /* renamed from: e */
    public short mo34e() {
        return 1054;
    }

    /* renamed from: g */
    public int mo36g() {
        return (mo5449h().length() * (this.f4122b ? 2 : 1)) + 5;
    }

    /* renamed from: h */
    public String mo5449h() {
        return this.f4123c;
    }

    /* renamed from: i */
    public int mo5450i() {
        return this.f4121a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[FORMAT]\n");
        stringBuffer.append("    .indexcode       = ");
        stringBuffer.append(Yca.m1602c(mo5450i()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .isUnicode       = ");
        stringBuffer.append(this.f4122b);
        stringBuffer.append(str);
        stringBuffer.append("    .formatstring    = ");
        stringBuffer.append(mo5449h());
        stringBuffer.append(str);
        stringBuffer.append("[/FORMAT]\n");
        return stringBuffer.toString();
    }
}
