package p000;

/* renamed from: iY */
public final class C0848iY extends C0080DY {

    /* renamed from: a */
    public static final Tca f3109a = Uca.m1284a(1);

    /* renamed from: b */
    public int f3110b;

    public C0848iY(int i) {
        this.f3110b = i;
    }

    public C0848iY(boolean z) {
        this(0);
        mo4520a(z);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3110b);
    }

    /* renamed from: a */
    public void mo4520a(boolean z) {
        this.f3110b = f3109a.mo1249a(this.f3110b, z);
    }

    public Object clone() {
        return new C0848iY(this.f3110b);
    }

    /* renamed from: e */
    public short mo34e() {
        return 18;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PROTECT]\n");
        stringBuffer.append("    .options = ");
        stringBuffer.append(Yca.m1602c(this.f3110b));
        stringBuffer.append("\n");
        stringBuffer.append("[/PROTECT]\n");
        return stringBuffer.toString();
    }
}
