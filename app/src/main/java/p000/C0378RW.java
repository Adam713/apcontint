package p000;

/* renamed from: RW */
public final class C0378RW extends C0080DY {

    /* renamed from: a */
    public short f1090a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1148h());
    }

    /* renamed from: b */
    public void mo1147b(short s) {
        this.f1090a = s;
    }

    public Object clone() {
        C0378RW rw = new C0378RW();
        rw.f1090a = this.f1090a;
        return rw;
    }

    /* renamed from: e */
    public short mo34e() {
        return 13;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo1148h() {
        return this.f1090a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CALCMODE]\n");
        stringBuffer.append("    .calcmode       = ");
        stringBuffer.append(Integer.toHexString(mo1148h()));
        stringBuffer.append("\n");
        stringBuffer.append("[/CALCMODE]\n");
        return stringBuffer.toString();
    }
}
