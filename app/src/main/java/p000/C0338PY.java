package p000;

/* renamed from: PY */
public final class C0338PY extends C0080DY {

    /* renamed from: a */
    public static final Tca f978a = Uca.m1284a(1);

    /* renamed from: b */
    public int f979b;

    public C0338PY(int i) {
        this.f979b = i;
    }

    public C0338PY(boolean z) {
        this(0);
        this.f979b = f978a.mo1249a(this.f979b, z);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f979b);
    }

    public Object clone() {
        return new C0338PY(this.f979b);
    }

    /* renamed from: e */
    public short mo34e() {
        return 352;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[USESELFS]\n");
        stringBuffer.append("    .options = ");
        stringBuffer.append(Yca.m1602c(this.f979b));
        stringBuffer.append("\n");
        stringBuffer.append("[/USESELFS]\n");
        return stringBuffer.toString();
    }
}
