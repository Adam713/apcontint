package p000;

/* renamed from: OW */
public final class C0314OW extends C0080DY {

    /* renamed from: a */
    public int f902a;

    /* renamed from: b */
    public int f903b;

    public C0314OW() {
        throw new RuntimeException("incomplete code");
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort((short) this.f902a);
        jda.writeShort((short) this.f903b);
    }

    /* renamed from: e */
    public short mo34e() {
        return 89;
    }

    /* renamed from: g */
    public int mo36g() {
        return 4;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C0314OW.class.getName());
        stringBuffer.append(" [XCT");
        stringBuffer.append(" nCRNs=");
        stringBuffer.append(this.f902a);
        stringBuffer.append(" sheetIx=");
        stringBuffer.append(this.f903b);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
