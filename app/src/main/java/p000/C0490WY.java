package p000;

/* renamed from: WY */
public final class C0490WY extends C0080DY {

    /* renamed from: a */
    public static final Tca f1407a = Uca.m1284a(1);

    /* renamed from: b */
    public int f1408b;

    public C0490WY(int i) {
        this.f1408b = i;
    }

    public C0490WY(boolean z) {
        this(0);
        mo1421a(z);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1408b);
    }

    /* renamed from: a */
    public void mo1421a(boolean z) {
        this.f1408b = f1407a.mo1249a(this.f1408b, z);
    }

    public Object clone() {
        return new C0490WY(this.f1408b);
    }

    /* renamed from: e */
    public short mo34e() {
        return 25;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[WINDOWPROTECT]\n");
        stringBuffer.append("    .options = ");
        stringBuffer.append(Yca.m1602c(this.f1408b));
        stringBuffer.append("\n");
        stringBuffer.append("[/WINDOWPROTECT]\n");
        return stringBuffer.toString();
    }
}
