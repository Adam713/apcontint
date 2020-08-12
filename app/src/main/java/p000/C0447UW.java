package p000;

/* renamed from: UW */
public final class C0447UW extends C0080DY {

    /* renamed from: a */
    public short f1284a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1317h());
    }

    /* renamed from: b */
    public void mo1316b(short s) {
        this.f1284a = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 66;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo1317h() {
        return this.f1284a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CODEPAGE]\n");
        stringBuffer.append("    .codepage        = ");
        stringBuffer.append(Integer.toHexString(mo1317h()));
        stringBuffer.append("\n");
        stringBuffer.append("[/CODEPAGE]\n");
        return stringBuffer.toString();
    }
}
