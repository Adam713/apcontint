package p000;

/* renamed from: tY */
public final class C1082tY extends C0080DY implements C0359QX {

    /* renamed from: a */
    public double f3796a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeDouble(this.f3796a);
    }

    public Object clone() {
        C1082tY tYVar = new C1082tY();
        tYVar.f3796a = this.f3796a;
        return tYVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 39;
    }

    /* renamed from: g */
    public int mo36g() {
        return 8;
    }

    /* renamed from: h */
    public double mo5147h() {
        return this.f3796a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[RightMargin]\n");
        stringBuffer.append("    .margin               = ");
        stringBuffer.append(" (");
        stringBuffer.append(mo5147h());
        stringBuffer.append(" )\n");
        stringBuffer.append("[/RightMargin]\n");
        return stringBuffer.toString();
    }
}
