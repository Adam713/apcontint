package p000;

/* renamed from: KX */
public final class C0224KX extends C0080DY {

    /* renamed from: a */
    public final int f583a;

    public C0224KX(int i) {
        this.f583a = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f583a);
    }

    /* renamed from: e */
    public short mo34e() {
        return 225;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[INTERFACEHDR]\n");
        stringBuffer.append("    .codepage = ");
        stringBuffer.append(Yca.m1602c(this.f583a));
        stringBuffer.append("\n");
        stringBuffer.append("[/INTERFACEHDR]\n");
        return stringBuffer.toString();
    }
}
