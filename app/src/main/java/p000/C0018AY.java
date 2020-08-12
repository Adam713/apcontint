package p000;

/* renamed from: AY */
public final class C0018AY extends C0080DY {

    /* renamed from: a */
    public byte f31a = 3;

    /* renamed from: b */
    public int f32b;

    /* renamed from: c */
    public int f33c;

    /* renamed from: d */
    public int f34d;

    /* renamed from: e */
    public C1282xba[] f35e;

    public C0018AY(int i, int i2) {
        this.f32b = i;
        this.f33c = i2;
        this.f34d = 0;
        this.f35e = new C1282xba[]{new C1282xba(i, i, i2, i2)};
    }

    /* renamed from: a */
    public void mo41a(byte b) {
        this.f31a = b;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeByte(mo45k());
        jda.writeShort(mo44j());
        jda.writeShort(mo42h());
        jda.writeShort(mo43i());
        jda.writeShort(this.f35e.length);
        int i = 0;
        while (true) {
            C1282xba[] xbaArr = this.f35e;
            if (i < xbaArr.length) {
                xbaArr[i].mo5455a(jda);
                i++;
            } else {
                return;
            }
        }
    }

    public Object clone() {
        C0018AY ay = new C0018AY(this.f32b, this.f33c);
        ay.f31a = this.f31a;
        ay.f34d = this.f34d;
        ay.f35e = this.f35e;
        return ay;
    }

    /* renamed from: e */
    public short mo34e() {
        return 29;
    }

    /* renamed from: g */
    public int mo36g() {
        return C1282xba.m3841a(this.f35e.length) + 9;
    }

    /* renamed from: h */
    public int mo42h() {
        return this.f33c;
    }

    /* renamed from: i */
    public int mo43i() {
        return this.f34d;
    }

    /* renamed from: j */
    public int mo44j() {
        return this.f32b;
    }

    /* renamed from: k */
    public byte mo45k() {
        return this.f31a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SELECTION]\n");
        stringBuffer.append("    .pane            = ");
        stringBuffer.append(Yca.m1596a((int) mo45k()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .activecellrow   = ");
        stringBuffer.append(Yca.m1602c(mo44j()));
        stringBuffer.append(str);
        stringBuffer.append("    .activecellcol   = ");
        stringBuffer.append(Yca.m1602c(mo42h()));
        stringBuffer.append(str);
        stringBuffer.append("    .activecellref   = ");
        stringBuffer.append(Yca.m1602c(mo43i()));
        stringBuffer.append(str);
        stringBuffer.append("    .numrefs         = ");
        stringBuffer.append(Yca.m1602c(this.f35e.length));
        stringBuffer.append(str);
        stringBuffer.append("[/SELECTION]\n");
        return stringBuffer.toString();
    }
}
