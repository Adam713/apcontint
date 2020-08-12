package p000;

/* renamed from: bX */
public final class C0635bX extends C0080DY {

    /* renamed from: a */
    public short f1911a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1926h());
    }

    /* renamed from: b */
    public void mo1925b(short s) {
        this.f1911a = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 34;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo1926h() {
        return this.f1911a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[1904]\n");
        stringBuffer.append("    .is1904          = ");
        stringBuffer.append(Integer.toHexString(mo1926h()));
        stringBuffer.append("\n");
        stringBuffer.append("[/1904]\n");
        return stringBuffer.toString();
    }
}
