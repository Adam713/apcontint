package p000;

/* renamed from: FX */
public final class C0117FX extends C0080DY {

    /* renamed from: a */
    public short f258a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo248h());
    }

    /* renamed from: b */
    public void mo247b(short s) {
        this.f258a = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 141;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo248h() {
        return this.f258a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[HIDEOBJ]\n");
        stringBuffer.append("    .hideobj         = ");
        stringBuffer.append(Integer.toHexString(mo248h()));
        stringBuffer.append("\n");
        stringBuffer.append("[/HIDEOBJ]\n");
        return stringBuffer.toString();
    }
}
