package p000;

/* renamed from: vX */
public final class C1121vX extends C0080DY {

    /* renamed from: a */
    public static final Tca f3886a = Uca.m1284a(2);

    /* renamed from: b */
    public static final Tca f3887b = Uca.m1284a(8);

    /* renamed from: c */
    public static final Tca f3888c = Uca.m1284a(16);

    /* renamed from: d */
    public static final Tca f3889d = Uca.m1284a(32);

    /* renamed from: e */
    public short f3890e;

    /* renamed from: f */
    public short f3891f;

    /* renamed from: g */
    public short f3892g;

    /* renamed from: h */
    public short f3893h;

    /* renamed from: i */
    public short f3894i;

    /* renamed from: j */
    public byte f3895j;

    /* renamed from: k */
    public byte f3896k;

    /* renamed from: l */
    public byte f3897l;

    /* renamed from: m */
    public byte f3898m = 0;

    /* renamed from: n */
    public String f3899n;

    /* renamed from: a */
    public void mo5233a(String str) {
        this.f3899n = str;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo5244m());
        jda.writeShort(mo5238h());
        jda.writeShort(mo5242k());
        jda.writeShort(mo5240i());
        jda.writeShort(mo5246o());
        jda.writeByte(mo5247p());
        jda.writeByte(mo5243l());
        jda.writeByte(mo5241j());
        jda.writeByte(this.f3898m);
        int length = this.f3899n.length();
        jda.writeByte(length);
        boolean b = qda.m3375b(this.f3899n);
        jda.writeByte(b ? 1 : 0);
        if (length <= 0) {
            return;
        }
        if (b) {
            qda.m3373b(this.f3899n, jda);
        } else {
            qda.m3370a(this.f3899n, jda);
        }
    }

    /* renamed from: b */
    public void mo5234b(short s) {
        this.f3891f = s;
    }

    /* renamed from: c */
    public void mo5235c(short s) {
        this.f3893h = s;
    }

    /* renamed from: d */
    public void mo5236d(short s) {
        this.f3892g = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 49;
    }

    /* renamed from: e */
    public void mo5237e(short s) {
        this.f3890e = s;
    }

    /* renamed from: g */
    public int mo36g() {
        int length = this.f3899n.length();
        int i = 1;
        if (length < 1) {
            return 16;
        }
        if (qda.m3375b(this.f3899n)) {
            i = 2;
        }
        return (length * i) + 16;
    }

    /* renamed from: h */
    public short mo5238h() {
        return this.f3891f;
    }

    public int hashCode() {
        String str = this.f3899n;
        return (((((((((((((((((((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f3890e) * 31) + this.f3891f) * 31) + this.f3892g) * 31) + this.f3893h) * 31) + this.f3894i) * 31) + this.f3895j) * 31) + this.f3896k) * 31) + this.f3897l) * 31) + this.f3898m;
    }

    /* renamed from: i */
    public short mo5240i() {
        return this.f3893h;
    }

    /* renamed from: j */
    public byte mo5241j() {
        return this.f3897l;
    }

    /* renamed from: k */
    public short mo5242k() {
        return this.f3892g;
    }

    /* renamed from: l */
    public byte mo5243l() {
        return this.f3896k;
    }

    /* renamed from: m */
    public short mo5244m() {
        return this.f3890e;
    }

    /* renamed from: n */
    public String mo5245n() {
        return this.f3899n;
    }

    /* renamed from: o */
    public short mo5246o() {
        return this.f3894i;
    }

    /* renamed from: p */
    public byte mo5247p() {
        return this.f3895j;
    }

    /* renamed from: q */
    public boolean mo5248q() {
        return f3886a.mo1258d(this.f3891f);
    }

    /* renamed from: r */
    public boolean mo5249r() {
        return f3888c.mo1258d(this.f3891f);
    }

    /* renamed from: s */
    public boolean mo5250s() {
        return f3889d.mo1258d(this.f3891f);
    }

    /* renamed from: t */
    public boolean mo5251t() {
        return f3887b.mo1258d(this.f3891f);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[FONT]\n");
        stringBuffer.append("    .fontheight    = ");
        stringBuffer.append(Yca.m1602c((int) mo5244m()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .attributes    = ");
        stringBuffer.append(Yca.m1602c((int) mo5238h()));
        stringBuffer.append(str);
        stringBuffer.append("       .italic     = ");
        stringBuffer.append(mo5248q());
        stringBuffer.append(str);
        stringBuffer.append("       .strikout   = ");
        stringBuffer.append(mo5251t());
        stringBuffer.append(str);
        stringBuffer.append("       .macoutlined= ");
        stringBuffer.append(mo5249r());
        stringBuffer.append(str);
        stringBuffer.append("       .macshadowed= ");
        stringBuffer.append(mo5250s());
        stringBuffer.append(str);
        stringBuffer.append("    .colorpalette  = ");
        stringBuffer.append(Yca.m1602c((int) mo5242k()));
        stringBuffer.append(str);
        stringBuffer.append("    .boldweight    = ");
        stringBuffer.append(Yca.m1602c((int) mo5240i()));
        stringBuffer.append(str);
        stringBuffer.append("    .supersubscript= ");
        stringBuffer.append(Yca.m1602c((int) mo5246o()));
        stringBuffer.append(str);
        stringBuffer.append("    .underline     = ");
        stringBuffer.append(Yca.m1596a((int) mo5247p()));
        stringBuffer.append(str);
        stringBuffer.append("    .family        = ");
        stringBuffer.append(Yca.m1596a((int) mo5243l()));
        stringBuffer.append(str);
        stringBuffer.append("    .charset       = ");
        stringBuffer.append(Yca.m1596a((int) mo5241j()));
        stringBuffer.append(str);
        stringBuffer.append("    .fontname      = ");
        stringBuffer.append(mo5245n());
        stringBuffer.append(str);
        stringBuffer.append("[/FONT]\n");
        return stringBuffer.toString();
    }
}
