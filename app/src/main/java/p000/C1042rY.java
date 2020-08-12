package p000;

/* renamed from: rY */
public final class C1042rY extends C0080DY {

    /* renamed from: a */
    public short f3707a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo5075h());
    }

    /* renamed from: b */
    public void mo5074b(short s) {
        this.f3707a = s;
    }

    public Object clone() {
        C1042rY rYVar = new C1042rY();
        rYVar.f3707a = this.f3707a;
        return rYVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 15;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo5075h() {
        return this.f3707a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[REFMODE]\n");
        stringBuffer.append("    .mode           = ");
        stringBuffer.append(Integer.toHexString(mo5075h()));
        stringBuffer.append("\n");
        stringBuffer.append("[/REFMODE]\n");
        return stringBuffer.toString();
    }
}
