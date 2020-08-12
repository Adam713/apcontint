package p000;

/* renamed from: CW */
public final class C0059CW extends C0080DY {

    /* renamed from: a */
    public short f103a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f103a);
    }

    public Object clone() {
        return mo4774d();
    }

    /* renamed from: e */
    public short mo34e() {
        return 157;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[AUTOFILTERINFO]\n");
        stringBuffer.append("    .numEntries          = ");
        stringBuffer.append(this.f103a);
        stringBuffer.append("\n");
        stringBuffer.append("[/AUTOFILTERINFO]\n");
        return stringBuffer.toString();
    }
}
