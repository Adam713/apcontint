package p000;

/* renamed from: LY */
public final class C0252LY extends C0201JZ {

    /* renamed from: a */
    public static final Tca f684a = Uca.m1284a(14);

    /* renamed from: b */
    public static final Tca f685b = Uca.m1284a(C0776fN.AppCompatTheme_windowActionBarOverlay);

    /* renamed from: c */
    public static final Tca f686c = Uca.m1284a(512);

    /* renamed from: d */
    public int f687d;

    /* renamed from: e */
    public int f688e;

    /* renamed from: f */
    public int f689f;

    /* renamed from: g */
    public int f690g;

    /* renamed from: h */
    public int f691h;

    /* renamed from: i */
    public int f692i;

    /* renamed from: j */
    public C1267sba f693j;

    /* renamed from: k */
    public int f694k;

    /* renamed from: l */
    public Caa f695l;

    /* renamed from: m */
    public Byte f696m;

    /* renamed from: a */
    public static void m804a(C0253LZ lz, C1267sba sba) {
        int d = sba.mo5116d();
        for (int i = 0; i < d; i++) {
            lz.writeShort(sba.mo5112b(i));
            short a = sba.mo5109a(i);
            if (a == 0) {
                a = 0;
            }
            lz.writeShort(a);
            lz.writeInt(0);
        }
        lz.writeShort(sba.mo5114c());
        lz.writeShort(0);
        lz.writeInt(0);
    }

    /* renamed from: a */
    public void mo218a(C0253LZ lz) {
        mo854b(lz);
        if (this.f693j.getString().length() > 0) {
            mo855c(lz);
        }
    }

    /* renamed from: b */
    public final void mo854b(C0253LZ lz) {
        lz.writeShort(this.f687d);
        lz.writeShort(this.f688e);
        lz.writeShort(this.f689f);
        lz.writeShort(this.f690g);
        lz.writeShort(this.f691h);
        lz.writeShort(this.f693j.mo5114c());
        lz.writeShort(mo856g());
        lz.writeInt(this.f692i);
        Caa caa = this.f695l;
        if (caa != null) {
            lz.writeShort(caa.mo80c());
            lz.writeInt(this.f694k);
            this.f695l.mo79a((jda) lz);
            Byte b = this.f696m;
            if (b != null) {
                lz.writeByte(b.byteValue());
            }
        }
    }

    /* renamed from: c */
    public final void mo855c(C0253LZ lz) {
        lz.mo868e();
        lz.mo861a(this.f693j.getString());
        lz.mo868e();
        m804a(lz, this.f693j);
    }

    public Object clone() {
        C0252LY ly = new C0252LY();
        ly.f693j = this.f693j;
        ly.f687d = this.f687d;
        ly.f688e = this.f688e;
        ly.f689f = this.f689f;
        ly.f690g = this.f690g;
        ly.f691h = this.f691h;
        ly.f692i = this.f692i;
        ly.f693j = this.f693j;
        Caa caa = this.f695l;
        if (caa != null) {
            ly.f694k = this.f694k;
            ly.f695l = caa.mo121f();
            ly.f696m = this.f696m;
        }
        return ly;
    }

    /* renamed from: e */
    public short mo34e() {
        return 438;
    }

    /* renamed from: g */
    public final int mo856g() {
        if (this.f693j.mo5114c() < 1) {
            return 0;
        }
        return (this.f693j.mo5116d() + 1) * 8;
    }

    /* renamed from: h */
    public int mo857h() {
        return f684a.mo1256c(this.f687d);
    }

    /* renamed from: i */
    public int mo858i() {
        return this.f688e;
    }

    /* renamed from: j */
    public int mo859j() {
        return f685b.mo1256c(this.f687d);
    }

    /* renamed from: k */
    public boolean mo860k() {
        return f686c.mo1258d(this.f687d);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[TXO]\n");
        stringBuffer.append("    .options        = ");
        stringBuffer.append(Yca.m1602c(this.f687d));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("         .isHorizontal = ");
        stringBuffer.append(mo857h());
        stringBuffer.append(10);
        stringBuffer.append("         .isVertical   = ");
        stringBuffer.append(mo859j());
        stringBuffer.append(10);
        stringBuffer.append("         .textLocked   = ");
        stringBuffer.append(mo860k());
        stringBuffer.append(10);
        stringBuffer.append("    .textOrientation= ");
        stringBuffer.append(Yca.m1602c(mo858i()));
        stringBuffer.append(str);
        stringBuffer.append("    .reserved4      = ");
        stringBuffer.append(Yca.m1602c(this.f689f));
        stringBuffer.append(str);
        stringBuffer.append("    .reserved5      = ");
        stringBuffer.append(Yca.m1602c(this.f690g));
        stringBuffer.append(str);
        stringBuffer.append("    .reserved6      = ");
        stringBuffer.append(Yca.m1602c(this.f691h));
        stringBuffer.append(str);
        stringBuffer.append("    .textLength     = ");
        stringBuffer.append(Yca.m1602c(this.f693j.mo5114c()));
        stringBuffer.append(str);
        stringBuffer.append("    .reserved7      = ");
        stringBuffer.append(Yca.m1598b(this.f692i));
        stringBuffer.append(str);
        stringBuffer.append("    .string = ");
        stringBuffer.append(this.f693j);
        stringBuffer.append(10);
        for (int i = 0; i < this.f693j.mo5116d(); i++) {
            stringBuffer.append("    .textrun = ");
            stringBuffer.append(this.f693j.mo5109a(i));
            stringBuffer.append(10);
        }
        stringBuffer.append("[/TXO]\n");
        return stringBuffer.toString();
    }
}
