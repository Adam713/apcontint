package p000;

/* renamed from: cY */
public final class C0655cY extends C0080DY {

    /* renamed from: a */
    public int f1961a;

    public C0655cY(int i) {
        this.f1961a = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1961a);
    }

    public Object clone() {
        return new C0655cY(this.f1961a);
    }

    /* renamed from: e */
    public short mo34e() {
        return 19;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PASSWORD]\n");
        stringBuffer.append("    .password = ");
        stringBuffer.append(Yca.m1602c(this.f1961a));
        stringBuffer.append("\n");
        stringBuffer.append("[/PASSWORD]\n");
        return stringBuffer.toString();
    }
}
