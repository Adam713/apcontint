package p000;

/* renamed from: hba reason: case insensitive filesystem */
public final class C1234hba extends C0080DY {

    /* renamed from: a */
    public int f3088a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3088a);
    }

    /* renamed from: e */
    public short mo34e() {
        return 213;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SXIDSTM]\n");
        stringBuffer.append("    .idstm      =");
        stringBuffer.append(Yca.m1602c(this.f3088a));
        stringBuffer.append(10);
        stringBuffer.append("[/SXIDSTM]\n");
        return stringBuffer.toString();
    }
}
