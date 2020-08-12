package p000;

/* renamed from: eY */
public final class C0764eY extends C0080DY {

    /* renamed from: a */
    public short f2921a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f2921a);
    }

    /* renamed from: a */
    public void mo4337a(boolean z) {
        if (z) {
            this.f2921a = 1;
        } else {
            this.f2921a = 0;
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 14;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo4338h() {
        return this.f2921a == 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PRECISION]\n");
        stringBuffer.append("    .precision       = ");
        stringBuffer.append(mo4338h());
        stringBuffer.append("\n");
        stringBuffer.append("[/PRECISION]\n");
        return stringBuffer.toString();
    }
}
