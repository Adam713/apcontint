package p000;

/* renamed from: fX */
public final class C0786fX extends C0080DY {

    /* renamed from: a */
    public int f2975a;

    /* renamed from: b */
    public int f2976b;

    /* renamed from: c */
    public short f2977c;

    /* renamed from: d */
    public short f2978d;

    /* renamed from: e */
    public short f2979e;

    /* renamed from: a */
    public void mo4373a(int i) {
        this.f2975a = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeInt(mo4378i());
        jda.writeInt(mo4380k());
        jda.writeShort(mo4377h());
        jda.writeShort(mo4379j());
        jda.writeShort(0);
    }

    /* renamed from: b */
    public void mo4374b(int i) {
        this.f2976b = i;
    }

    /* renamed from: b */
    public void mo4375b(short s) {
        this.f2977c = s;
    }

    /* renamed from: c */
    public void mo4376c(short s) {
        this.f2978d = s;
    }

    public Object clone() {
        C0786fX fXVar = new C0786fX();
        fXVar.f2975a = this.f2975a;
        fXVar.f2976b = this.f2976b;
        fXVar.f2977c = this.f2977c;
        fXVar.f2978d = this.f2978d;
        fXVar.f2979e = this.f2979e;
        return fXVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 512;
    }

    /* renamed from: g */
    public int mo36g() {
        return 14;
    }

    /* renamed from: h */
    public short mo4377h() {
        return this.f2977c;
    }

    /* renamed from: i */
    public int mo4378i() {
        return this.f2975a;
    }

    /* renamed from: j */
    public short mo4379j() {
        return this.f2978d;
    }

    /* renamed from: k */
    public int mo4380k() {
        return this.f2976b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DIMENSIONS]\n");
        stringBuffer.append("    .firstrow       = ");
        stringBuffer.append(Integer.toHexString(mo4378i()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .lastrow        = ");
        stringBuffer.append(Integer.toHexString(mo4380k()));
        stringBuffer.append(str);
        stringBuffer.append("    .firstcol       = ");
        stringBuffer.append(Integer.toHexString(mo4377h()));
        stringBuffer.append(str);
        stringBuffer.append("    .lastcol        = ");
        stringBuffer.append(Integer.toHexString(mo4379j()));
        stringBuffer.append(str);
        stringBuffer.append("    .zero           = ");
        stringBuffer.append(Integer.toHexString(this.f2979e));
        stringBuffer.append(str);
        stringBuffer.append("[/DIMENSIONS]\n");
        return stringBuffer.toString();
    }
}
