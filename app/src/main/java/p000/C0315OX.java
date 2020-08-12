package p000;

/* renamed from: OX */
public final class C0315OX extends C0080DY implements C0359QX {

    /* renamed from: a */
    public double f904a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeDouble(this.f904a);
    }

    public Object clone() {
        C0315OX ox = new C0315OX();
        ox.f904a = this.f904a;
        return ox;
    }

    /* renamed from: e */
    public short mo34e() {
        return 38;
    }

    /* renamed from: g */
    public int mo36g() {
        return 8;
    }

    /* renamed from: h */
    public double mo1001h() {
        return this.f904a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LeftMargin]\n");
        stringBuffer.append("    .margin               = ");
        stringBuffer.append(" (");
        stringBuffer.append(mo1001h());
        stringBuffer.append(" )\n");
        stringBuffer.append("[/LeftMargin]\n");
        return stringBuffer.toString();
    }
}
