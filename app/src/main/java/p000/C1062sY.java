package p000;

/* renamed from: sY */
public final class C1062sY extends C0080DY {

    /* renamed from: a */
    public static final Tca f3757a = Uca.m1284a(1);

    /* renamed from: b */
    public int f3758b;

    public C1062sY(int i) {
        this.f3758b = i;
    }

    public C1062sY(boolean z) {
        this(0);
        mo5102a(z);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3758b);
    }

    /* renamed from: a */
    public void mo5102a(boolean z) {
        this.f3758b = f3757a.mo1249a(this.f3758b, z);
    }

    public Object clone() {
        return new C1062sY(this.f3758b);
    }

    /* renamed from: e */
    public short mo34e() {
        return 439;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[REFRESHALL]\n");
        stringBuffer.append("    .options      = ");
        stringBuffer.append(Yca.m1602c(this.f3758b));
        stringBuffer.append("\n");
        stringBuffer.append("[/REFRESHALL]\n");
        return stringBuffer.toString();
    }
}
