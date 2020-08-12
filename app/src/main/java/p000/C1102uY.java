package p000;

/* renamed from: uY */
public final class C1102uY extends C0080DY {

    /* renamed from: a */
    public static final Tca f3840a = Uca.m1284a(7);

    /* renamed from: b */
    public static final Tca f3841b = Uca.m1284a(16);

    /* renamed from: c */
    public static final Tca f3842c = Uca.m1284a(32);

    /* renamed from: d */
    public static final Tca f3843d = Uca.m1284a(64);

    /* renamed from: e */
    public static final Tca f3844e = Uca.m1284a(128);

    /* renamed from: f */
    public int f3845f;

    /* renamed from: g */
    public int f3846g;

    /* renamed from: h */
    public int f3847h;

    /* renamed from: i */
    public short f3848i = 255;

    /* renamed from: j */
    public short f3849j = 0;

    /* renamed from: k */
    public short f3850k = 0;

    /* renamed from: l */
    public int f3851l = 256;

    /* renamed from: m */
    public short f3852m = 15;

    public C1102uY(int i) {
        this.f3845f = i;
        mo5202t();
    }

    /* renamed from: a */
    public short mo5186a() {
        return this.f3852m;
    }

    /* renamed from: a */
    public void mo5187a(int i) {
        this.f3846g = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo5199q());
        int i = 0;
        jda.writeShort(mo5192j() == -1 ? 0 : mo5192j());
        if (mo5195m() != -1) {
            i = mo5195m();
        }
        jda.writeShort(i);
        jda.writeShort(mo5194l());
        jda.writeShort(mo5196n());
        jda.writeShort(this.f3850k);
        jda.writeShort(mo5197o());
        jda.writeShort(mo5186a());
    }

    /* renamed from: b */
    public void mo5188b(int i) {
        this.f3847h = i;
    }

    /* renamed from: c */
    public void mo5189c(int i) {
        this.f3845f = i;
    }

    public Object clone() {
        C1102uY uYVar = new C1102uY(this.f3845f);
        uYVar.f3846g = this.f3846g;
        uYVar.f3847h = this.f3847h;
        uYVar.f3848i = this.f3848i;
        uYVar.f3849j = this.f3849j;
        uYVar.f3850k = this.f3850k;
        uYVar.f3851l = this.f3851l;
        uYVar.f3852m = this.f3852m;
        return uYVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 520;
    }

    /* renamed from: g */
    public int mo36g() {
        return 16;
    }

    /* renamed from: h */
    public boolean mo5190h() {
        return f3843d.mo1258d(this.f3851l);
    }

    /* renamed from: i */
    public boolean mo5191i() {
        return f3841b.mo1258d(this.f3851l);
    }

    /* renamed from: j */
    public int mo5192j() {
        return this.f3846g;
    }

    /* renamed from: k */
    public boolean mo5193k() {
        return f3844e.mo1258d(this.f3851l);
    }

    /* renamed from: l */
    public short mo5194l() {
        return this.f3848i;
    }

    /* renamed from: m */
    public int mo5195m() {
        return this.f3847h;
    }

    /* renamed from: n */
    public short mo5196n() {
        return this.f3849j;
    }

    /* renamed from: o */
    public short mo5197o() {
        return (short) this.f3851l;
    }

    /* renamed from: p */
    public short mo5198p() {
        return (short) f3840a.mo1256c(this.f3851l);
    }

    /* renamed from: q */
    public int mo5199q() {
        return this.f3845f;
    }

    /* renamed from: r */
    public boolean mo5200r() {
        return f3842c.mo1258d(this.f3851l);
    }

    /* renamed from: s */
    public boolean mo5201s() {
        return (this.f3846g | this.f3847h) == 0;
    }

    /* renamed from: t */
    public void mo5202t() {
        this.f3846g = 0;
        this.f3847h = 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ROW]\n");
        stringBuffer.append("    .rownumber      = ");
        stringBuffer.append(Integer.toHexString(mo5199q()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .firstcol       = ");
        stringBuffer.append(Yca.m1602c(mo5192j()));
        stringBuffer.append(str);
        stringBuffer.append("    .lastcol        = ");
        stringBuffer.append(Yca.m1602c(mo5195m()));
        stringBuffer.append(str);
        stringBuffer.append("    .height         = ");
        stringBuffer.append(Yca.m1602c((int) mo5194l()));
        stringBuffer.append(str);
        stringBuffer.append("    .optimize       = ");
        stringBuffer.append(Yca.m1602c((int) mo5196n()));
        stringBuffer.append(str);
        stringBuffer.append("    .reserved       = ");
        stringBuffer.append(Yca.m1602c((int) this.f3850k));
        stringBuffer.append(str);
        stringBuffer.append("    .optionflags    = ");
        stringBuffer.append(Yca.m1602c((int) mo5197o()));
        stringBuffer.append(str);
        stringBuffer.append("        .outlinelvl = ");
        stringBuffer.append(Integer.toHexString(mo5198p()));
        stringBuffer.append(str);
        stringBuffer.append("        .colapsed   = ");
        stringBuffer.append(mo5191i());
        stringBuffer.append(str);
        stringBuffer.append("        .zeroheight = ");
        stringBuffer.append(mo5200r());
        stringBuffer.append(str);
        stringBuffer.append("        .badfontheig= ");
        stringBuffer.append(mo5190h());
        stringBuffer.append(str);
        stringBuffer.append("        .formatted  = ");
        stringBuffer.append(mo5193k());
        stringBuffer.append(str);
        stringBuffer.append("    .xfindex        = ");
        stringBuffer.append(Integer.toHexString(mo5186a()));
        stringBuffer.append(str);
        stringBuffer.append("[/ROW]\n");
        return stringBuffer.toString();
    }
}
