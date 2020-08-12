package p000;

/* renamed from: QW */
public final class C0358QW extends C0080DY {

    /* renamed from: a */
    public short f1060a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1125h());
    }

    /* renamed from: b */
    public void mo1124b(short s) {
        this.f1060a = s;
    }

    public Object clone() {
        C0358QW qw = new C0358QW();
        qw.f1060a = this.f1060a;
        return qw;
    }

    /* renamed from: e */
    public short mo34e() {
        return 12;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo1125h() {
        return this.f1060a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CALCCOUNT]\n");
        stringBuffer.append("    .iterations     = ");
        stringBuffer.append(Integer.toHexString(mo1125h()));
        stringBuffer.append("\n");
        stringBuffer.append("[/CALCCOUNT]\n");
        return stringBuffer.toString();
    }
}
