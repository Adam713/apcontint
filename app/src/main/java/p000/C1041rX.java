package p000;

/* renamed from: rX */
public final class C1041rX extends C0080DY {

    /* renamed from: a */
    public C0100EZ f3699a = new C0100EZ();

    /* renamed from: b */
    public int f3700b;

    /* renamed from: c */
    public byte f3701c;

    /* renamed from: d */
    public long f3702d;

    /* renamed from: e */
    public long f3703e;

    /* renamed from: f */
    public int f3704f;

    /* renamed from: g */
    public Jca[] f3705g;

    /* renamed from: h */
    public C0119FZ f3706h;

    public C1041rX() {
        this.f3699a.mo222a(2152);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        this.f3699a.mo221a(jda);
        jda.writeShort(this.f3700b);
        jda.writeByte(this.f3701c);
        jda.writeInt((int) this.f3702d);
        jda.writeShort(this.f3705g.length);
        jda.writeInt((int) this.f3703e);
        jda.writeShort(this.f3704f);
        int i = 0;
        while (true) {
            Jca[] jcaArr = this.f3705g;
            if (i < jcaArr.length) {
                jcaArr[i].mo647a(jda);
                i++;
            } else {
                this.f3706h.mo256a(jda);
                return;
            }
        }
    }

    public Object clone() {
        return mo4774d();
    }

    /* renamed from: e */
    public short mo34e() {
        return 2152;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f3705g.length * 8) + 27 + this.f3706h.mo255a();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SHARED FEATURE]\n");
        stringBuffer.append("[/SHARED FEATURE]\n");
        return stringBuffer.toString();
    }
}
