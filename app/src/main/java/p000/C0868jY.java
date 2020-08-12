package p000;

/* renamed from: jY */
public final class C0868jY extends C0080DY {

    /* renamed from: a */
    public static final Tca f3180a = Uca.m1284a(1);

    /* renamed from: b */
    public int f3181b;

    public C0868jY(int i) {
        this.f3181b = i;
    }

    public C0868jY(boolean z) {
        this(0);
        mo4558a(z);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3181b);
    }

    /* renamed from: a */
    public void mo4558a(boolean z) {
        this.f3181b = f3180a.mo1249a(this.f3181b, z);
    }

    /* renamed from: e */
    public short mo34e() {
        return 431;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PROT4REV]\n");
        stringBuffer.append("    .options = ");
        stringBuffer.append(Yca.m1602c(this.f3181b));
        stringBuffer.append("\n");
        stringBuffer.append("[/PROT4REV]\n");
        return stringBuffer.toString();
    }
}
