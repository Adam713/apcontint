package p000;

/* renamed from: qX */
public final class C1019qX extends C0080DY {

    /* renamed from: a */
    public C0100EZ f3625a = new C0100EZ();

    /* renamed from: b */
    public int f3626b;

    /* renamed from: c */
    public byte f3627c;

    /* renamed from: d */
    public long f3628d;

    /* renamed from: e */
    public byte[] f3629e;

    public C1019qX() {
        this.f3625a.mo222a(2151);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        this.f3625a.mo221a(jda);
        jda.writeShort(this.f3626b);
        jda.writeByte(this.f3627c);
        jda.writeInt((int) this.f3628d);
        jda.write(this.f3629e);
    }

    public Object clone() {
        return mo4774d();
    }

    /* renamed from: e */
    public short mo34e() {
        return 2151;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f3629e.length + 19;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[FEATURE HEADER]\n");
        stringBuffer.append("[/FEATURE HEADER]\n");
        return stringBuffer.toString();
    }
}
