package p000;

/* renamed from: JY */
public final class C0200JY extends C0061CY {

    /* renamed from: b */
    public static final Tca f487b = Uca.m1284a(1);

    /* renamed from: c */
    public static final Tca f488c = Uca.m1284a(2);

    /* renamed from: d */
    public static final Tca f489d = Uca.m1284a(4);

    /* renamed from: e */
    public static final Tca f490e = Uca.m1284a(8);

    /* renamed from: f */
    public static final Tca f491f = Uca.m1284a(16);

    /* renamed from: g */
    public static final Tca f492g = Uca.m1284a(32);

    /* renamed from: h */
    public int f493h;

    /* renamed from: i */
    public int f494i;

    /* renamed from: j */
    public int f495j;

    /* renamed from: k */
    public int f496k;

    /* renamed from: l */
    public int f497l;

    /* renamed from: m */
    public int f498m;

    /* renamed from: c */
    public static C1285yba m632c(int i, int i2) {
        int i3 = i2 & 255;
        boolean z = true;
        boolean z2 = (32768 & i2) == 0;
        if ((i2 & 16384) != 0) {
            z = false;
        }
        return new C1285yba(i, i3, z2, z);
    }

    /* renamed from: b */
    public void mo71b(jda jda) {
        jda.writeByte(this.f493h);
        jda.writeByte(this.f494i);
        jda.writeShort(this.f495j);
        jda.writeShort(this.f496k);
        jda.writeShort(this.f497l);
        jda.writeShort(this.f498m);
    }

    /* renamed from: e */
    public short mo34e() {
        return 566;
    }

    /* renamed from: h */
    public int mo72h() {
        return 10;
    }

    /* renamed from: n */
    public boolean mo643n() {
        return f487b.mo1258d(this.f493h);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[TABLE]\n");
        stringBuffer.append("    .range    = ");
        stringBuffer.append(mo118m().toString());
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .flags    = ");
        stringBuffer.append(Yca.m1596a(this.f493h));
        stringBuffer.append(str);
        stringBuffer.append("    .alwaysClc= ");
        stringBuffer.append(mo643n());
        stringBuffer.append(str);
        stringBuffer.append("    .reserved = ");
        stringBuffer.append(Yca.m1598b(this.f494i));
        stringBuffer.append(str);
        C1285yba c = m632c(this.f495j, this.f496k);
        C1285yba c2 = m632c(this.f497l, this.f498m);
        stringBuffer.append("    .rowInput = ");
        stringBuffer.append(c.mo910a());
        stringBuffer.append(str);
        stringBuffer.append("    .colInput = ");
        stringBuffer.append(c2.mo910a());
        stringBuffer.append(str);
        stringBuffer.append("[/TABLE]\n");
        return stringBuffer.toString();
    }
}
