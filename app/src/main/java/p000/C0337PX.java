package p000;

/* renamed from: PX */
public final class C0337PX extends C0080DY {

    /* renamed from: a */
    public byte f976a;

    /* renamed from: b */
    public byte f977b;

    /* renamed from: a */
    public void mo1053a(byte b) {
        this.f976a = b;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeByte(mo1055h());
        jda.writeByte(mo1056i());
    }

    /* renamed from: b */
    public void mo1054b(byte b) {
        this.f977b = b;
    }

    /* renamed from: e */
    public short mo34e() {
        return 193;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public byte mo1055h() {
        return this.f976a;
    }

    /* renamed from: i */
    public byte mo1056i() {
        return this.f977b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[MMS]\n");
        stringBuffer.append("    .addMenu        = ");
        stringBuffer.append(Integer.toHexString(mo1055h()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .delMenu        = ");
        stringBuffer.append(Integer.toHexString(mo1056i()));
        stringBuffer.append(str);
        stringBuffer.append("[/MMS]\n");
        return stringBuffer.toString();
    }
}
