package p000;

/* renamed from: kba reason: case insensitive filesystem */
public final class C1243kba extends C0080DY {

    /* renamed from: a */
    public int f3235a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3235a);
    }

    /* renamed from: e */
    public short mo34e() {
        return 227;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SXVS]\n");
        stringBuffer.append("    .vs      =");
        stringBuffer.append(Yca.m1602c(this.f3235a));
        stringBuffer.append(10);
        stringBuffer.append("[/SXVS]\n");
        return stringBuffer.toString();
    }
}
