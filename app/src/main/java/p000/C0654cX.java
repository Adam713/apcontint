package p000;

/* renamed from: cX */
public final class C0654cX extends C0080DY {

    /* renamed from: a */
    public int f1960a;

    /* renamed from: a */
    public void mo1990a(int i) {
        this.f1960a = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1991h());
    }

    public Object clone() {
        C0654cX cXVar = new C0654cX();
        cXVar.f1960a = this.f1960a;
        return cXVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 85;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public int mo1991h() {
        return this.f1960a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DEFAULTCOLWIDTH]\n");
        stringBuffer.append("    .colwidth      = ");
        stringBuffer.append(Integer.toHexString(mo1991h()));
        stringBuffer.append("\n");
        stringBuffer.append("[/DEFAULTCOLWIDTH]\n");
        return stringBuffer.toString();
    }
}
