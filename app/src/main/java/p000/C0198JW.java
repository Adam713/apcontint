package p000;

/* renamed from: JW */
public final class C0198JW extends C0080DY implements C0359QX {

    /* renamed from: a */
    public double f485a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeDouble(this.f485a);
    }

    public Object clone() {
        C0198JW jw = new C0198JW();
        jw.f485a = this.f485a;
        return jw;
    }

    /* renamed from: e */
    public short mo34e() {
        return 41;
    }

    /* renamed from: g */
    public int mo36g() {
        return 8;
    }

    /* renamed from: h */
    public double mo642h() {
        return this.f485a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[BottomMargin]\n");
        stringBuffer.append("    .margin               = ");
        stringBuffer.append(" (");
        stringBuffer.append(mo642h());
        stringBuffer.append(" )\n");
        stringBuffer.append("[/BottomMargin]\n");
        return stringBuffer.toString();
    }
}
