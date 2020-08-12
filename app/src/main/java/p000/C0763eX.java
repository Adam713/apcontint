package p000;

/* renamed from: eX */
public final class C0763eX extends C0080DY {

    /* renamed from: a */
    public double f2920a;

    public C0763eX(double d) {
        this.f2920a = d;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeDouble(mo4336h());
    }

    public Object clone() {
        return this;
    }

    /* renamed from: e */
    public short mo34e() {
        return 16;
    }

    /* renamed from: g */
    public int mo36g() {
        return 8;
    }

    /* renamed from: h */
    public double mo4336h() {
        return this.f2920a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DELTA]\n");
        stringBuffer.append("    .maxchange = ");
        stringBuffer.append(mo4336h());
        stringBuffer.append("\n");
        stringBuffer.append("[/DELTA]\n");
        return stringBuffer.toString();
    }
}
