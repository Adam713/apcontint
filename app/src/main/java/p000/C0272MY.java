package p000;

/* renamed from: MY */
public final class C0272MY extends C0080DY implements C0359QX {

    /* renamed from: a */
    public double f739a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeDouble(this.f739a);
    }

    public Object clone() {
        C0272MY my = new C0272MY();
        my.f739a = this.f739a;
        return my;
    }

    /* renamed from: e */
    public short mo34e() {
        return 40;
    }

    /* renamed from: g */
    public int mo36g() {
        return 8;
    }

    /* renamed from: h */
    public double mo905h() {
        return this.f739a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[TopMargin]\n");
        stringBuffer.append("    .margin               = ");
        stringBuffer.append(" (");
        stringBuffer.append(mo905h());
        stringBuffer.append(" )\n");
        stringBuffer.append("[/TopMargin]\n");
        return stringBuffer.toString();
    }
}
