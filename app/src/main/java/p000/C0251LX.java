package p000;

/* renamed from: LX */
public final class C0251LX extends C0080DY {

    /* renamed from: a */
    public static final Tca f682a = Uca.m1284a(1);

    /* renamed from: b */
    public int f683b;

    public C0251LX(boolean z) {
        this.f683b = f682a.mo1249a(0, z);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f683b);
    }

    public Object clone() {
        return new C0251LX(mo853h());
    }

    /* renamed from: e */
    public short mo34e() {
        return 17;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo853h() {
        return f682a.mo1258d(this.f683b);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ITERATION]\n");
        stringBuffer.append("    .flags      = ");
        stringBuffer.append(Yca.m1602c(this.f683b));
        stringBuffer.append("\n");
        stringBuffer.append("[/ITERATION]\n");
        return stringBuffer.toString();
    }
}
