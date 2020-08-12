package p000;

/* renamed from: AX */
public final class C0017AX extends C0080DY {

    /* renamed from: a */
    public short f27a;

    /* renamed from: b */
    public short f28b;

    /* renamed from: c */
    public short f29c;

    /* renamed from: d */
    public short f30d;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo38i());
        jda.writeShort(mo40k());
        jda.writeShort(mo39j());
        jda.writeShort(mo37h());
    }

    /* renamed from: b */
    public void mo31b(short s) {
        this.f30d = s;
    }

    /* renamed from: c */
    public void mo32c(short s) {
        this.f27a = s;
    }

    public Object clone() {
        C0017AX ax = new C0017AX();
        ax.f27a = this.f27a;
        ax.f28b = this.f28b;
        ax.f29c = this.f29c;
        ax.f30d = this.f30d;
        return ax;
    }

    /* renamed from: d */
    public void mo33d(short s) {
        this.f29c = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 128;
    }

    /* renamed from: e */
    public void mo35e(short s) {
        this.f28b = s;
    }

    /* renamed from: g */
    public int mo36g() {
        return 8;
    }

    /* renamed from: h */
    public short mo37h() {
        return this.f30d;
    }

    /* renamed from: i */
    public short mo38i() {
        return this.f27a;
    }

    /* renamed from: j */
    public short mo39j() {
        return this.f29c;
    }

    /* renamed from: k */
    public short mo40k() {
        return this.f28b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[GUTS]\n");
        stringBuffer.append("    .leftgutter     = ");
        stringBuffer.append(Integer.toHexString(mo38i()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .topgutter      = ");
        stringBuffer.append(Integer.toHexString(mo40k()));
        stringBuffer.append(str);
        stringBuffer.append("    .rowlevelmax    = ");
        stringBuffer.append(Integer.toHexString(mo39j()));
        stringBuffer.append(str);
        stringBuffer.append("    .collevelmax    = ");
        stringBuffer.append(Integer.toHexString(mo37h()));
        stringBuffer.append(str);
        stringBuffer.append("[/GUTS]\n");
        return stringBuffer.toString();
    }
}
