package p000;

/* renamed from: dY */
public final class C0744dY extends C0080DY {

    /* renamed from: a */
    public int f2869a;

    public C0744dY(int i) {
        this.f2869a = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f2869a);
    }

    /* renamed from: e */
    public short mo34e() {
        return 444;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PROT4REVPASSWORD]\n");
        stringBuffer.append("    .password = ");
        stringBuffer.append(Yca.m1602c(this.f2869a));
        stringBuffer.append("\n");
        stringBuffer.append("[/PROT4REVPASSWORD]\n");
        return stringBuffer.toString();
    }
}
