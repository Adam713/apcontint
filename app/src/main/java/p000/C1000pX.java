package p000;

/* renamed from: pX */
public final class C1000pX extends C0080DY {

    /* renamed from: a */
    public short f3583a;

    /* renamed from: b */
    public short f3584b;

    /* renamed from: c */
    public short f3585c;

    /* renamed from: d */
    public String f3586d;

    /* renamed from: e */
    public C1256oca f3587e;

    /* renamed from: f */
    public Object[] f3588f;

    /* renamed from: g */
    public int f3589g;

    /* renamed from: h */
    public int f3590h;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3583a);
        jda.writeShort(this.f3584b);
        jda.writeShort(this.f3585c);
        jda.writeByte(this.f3586d.length());
        qda.m3374b(jda, this.f3586d);
        if (!mo5005j() && !mo5006k()) {
            if (mo5004i()) {
                jda.writeByte(this.f3589g - 1);
                jda.writeShort(this.f3590h - 1);
                C0162HZ.m334a(jda, this.f3588f);
                return;
            }
            this.f3587e.mo4975a(jda);
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 35;
    }

    /* renamed from: g */
    public int mo36g() {
        int i;
        int a = (qda.m3367a(this.f3586d) - 1) + 6;
        if (mo5005j() || mo5006k()) {
            return a;
        }
        if (mo5004i()) {
            a += 3;
            i = C0162HZ.m331a(this.f3588f);
        } else {
            i = this.f3587e.mo4976b();
        }
        return a + i;
    }

    /* renamed from: h */
    public String mo5003h() {
        return this.f3586d;
    }

    /* renamed from: i */
    public boolean mo5004i() {
        return (this.f3583a & 2) != 0;
    }

    /* renamed from: j */
    public boolean mo5005j() {
        return (this.f3583a & 16) != 0;
    }

    /* renamed from: k */
    public boolean mo5006k() {
        return (this.f3583a & 8) != 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[EXTERNALNAME]\n");
        stringBuffer.append("    .ix      = ");
        stringBuffer.append(this.f3584b);
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .name    = ");
        stringBuffer.append(this.f3586d);
        stringBuffer.append(str);
        if (this.f3587e != null) {
            stringBuffer.append("    .formula = ");
            stringBuffer.append(this.f3587e);
            stringBuffer.append(str);
        }
        stringBuffer.append("[/EXTERNALNAME]\n");
        return stringBuffer.toString();
    }
}
