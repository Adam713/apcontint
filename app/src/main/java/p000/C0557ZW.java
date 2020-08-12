package p000;

/* renamed from: ZW */
public final class C0557ZW extends C0080DY {

    /* renamed from: a */
    public static final Tca f1682a = Uca.m1284a(1);

    /* renamed from: b */
    public int f1683b;

    public C0557ZW(int i) {
        this.f1683b = i;
    }

    public C0557ZW(boolean z) {
        this(0);
        this.f1683b = f1682a.mo1249a(0, z);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1683b);
    }

    /* renamed from: e */
    public short mo34e() {
        return 353;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DSF]\n");
        stringBuffer.append("    .options = ");
        stringBuffer.append(Yca.m1602c(this.f1683b));
        stringBuffer.append("\n");
        stringBuffer.append("[/DSF]\n");
        return stringBuffer.toString();
    }
}
