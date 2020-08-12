package p000;

/* renamed from: XY */
public final class C0511XY extends C0080DY {

    /* renamed from: a */
    public static final Tca f1458a = Uca.m1284a(1);

    /* renamed from: b */
    public static final Tca f1459b = Uca.m1284a(2);

    /* renamed from: c */
    public static final Tca f1460c = Uca.m1284a(4);

    /* renamed from: d */
    public static final Tca f1461d = Uca.m1284a(8);

    /* renamed from: e */
    public static final Tca f1462e = Uca.m1284a(16);

    /* renamed from: f */
    public static final Tca f1463f = Uca.m1284a(32);

    /* renamed from: g */
    public static final Tca f1464g = Uca.m1284a(64);

    /* renamed from: h */
    public static final Tca f1465h = Uca.m1284a(128);

    /* renamed from: i */
    public static final Tca f1466i = Uca.m1284a(256);

    /* renamed from: j */
    public static final Tca f1467j = Uca.m1284a(512);

    /* renamed from: k */
    public static final Tca f1468k = Uca.m1284a(1024);

    /* renamed from: l */
    public static final Tca f1469l = Uca.m1284a(2048);

    /* renamed from: m */
    public short f1470m;

    /* renamed from: n */
    public short f1471n;

    /* renamed from: o */
    public short f1472o;

    /* renamed from: p */
    public int f1473p;

    /* renamed from: q */
    public short f1474q;

    /* renamed from: r */
    public short f1475r;

    /* renamed from: s */
    public int f1476s;

    /* renamed from: a */
    public void mo1476a(int i) {
        this.f1473p = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1498t());
        jda.writeShort(mo1503y());
        jda.writeShort(mo1496r());
        jda.writeInt(mo1495q());
        jda.writeShort(mo1499u());
        jda.writeShort(mo1497s());
        jda.writeInt(mo1500v());
    }

    /* renamed from: a */
    public void mo1477a(boolean z) {
        this.f1470m = f1468k.mo1252a(this.f1470m, z);
    }

    /* renamed from: b */
    public void mo1478b(short s) {
        this.f1472o = s;
    }

    /* renamed from: b */
    public void mo1479b(boolean z) {
        this.f1470m = f1461d.mo1252a(this.f1470m, z);
    }

    /* renamed from: c */
    public void mo1480c(short s) {
        this.f1475r = s;
    }

    /* renamed from: c */
    public void mo1481c(boolean z) {
        this.f1470m = f1466i.mo1252a(this.f1470m, z);
    }

    public Object clone() {
        C0511XY xy = new C0511XY();
        xy.f1470m = this.f1470m;
        xy.f1471n = this.f1471n;
        xy.f1472o = this.f1472o;
        xy.f1473p = this.f1473p;
        xy.f1474q = this.f1474q;
        xy.f1475r = this.f1475r;
        xy.f1476s = this.f1476s;
        return xy;
    }

    /* renamed from: d */
    public void mo1482d(short s) {
        this.f1470m = s;
    }

    /* renamed from: d */
    public void mo1483d(boolean z) {
        this.f1470m = f1467j.mo1252a(this.f1470m, z);
    }

    /* renamed from: e */
    public short mo34e() {
        return 574;
    }

    /* renamed from: e */
    public void mo1484e(short s) {
        this.f1474q = s;
    }

    /* renamed from: f */
    public void mo1485f(short s) {
        this.f1471n = s;
    }

    /* renamed from: g */
    public int mo36g() {
        return 18;
    }

    /* renamed from: h */
    public boolean mo1486h() {
        return f1464g.mo1258d(this.f1470m);
    }

    /* renamed from: i */
    public boolean mo1487i() {
        return f1463f.mo1258d(this.f1470m);
    }

    /* renamed from: j */
    public boolean mo1488j() {
        return f1458a.mo1258d(this.f1470m);
    }

    /* renamed from: k */
    public boolean mo1489k() {
        return f1459b.mo1258d(this.f1470m);
    }

    /* renamed from: l */
    public boolean mo1490l() {
        return f1465h.mo1258d(this.f1470m);
    }

    /* renamed from: m */
    public boolean mo1491m() {
        return f1460c.mo1258d(this.f1470m);
    }

    /* renamed from: n */
    public boolean mo1492n() {
        return f1462e.mo1258d(this.f1470m);
    }

    /* renamed from: o */
    public boolean mo1493o() {
        return f1461d.mo1258d(this.f1470m);
    }

    /* renamed from: p */
    public boolean mo1494p() {
        return f1466i.mo1258d(this.f1470m);
    }

    /* renamed from: q */
    public int mo1495q() {
        return this.f1473p;
    }

    /* renamed from: r */
    public short mo1496r() {
        return this.f1472o;
    }

    /* renamed from: s */
    public short mo1497s() {
        return this.f1475r;
    }

    /* renamed from: t */
    public short mo1498t() {
        return this.f1470m;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[WINDOW2]\n");
        stringBuffer.append("    .options        = ");
        stringBuffer.append(Integer.toHexString(mo1498t()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("       .dispformulas= ");
        stringBuffer.append(mo1488j());
        stringBuffer.append(str);
        stringBuffer.append("       .dispgridlins= ");
        stringBuffer.append(mo1489k());
        stringBuffer.append(str);
        stringBuffer.append("       .disprcheadin= ");
        stringBuffer.append(mo1491m());
        stringBuffer.append(str);
        stringBuffer.append("       .freezepanes = ");
        stringBuffer.append(mo1493o());
        stringBuffer.append(str);
        stringBuffer.append("       .displayzeros= ");
        stringBuffer.append(mo1492n());
        stringBuffer.append(str);
        stringBuffer.append("       .defaultheadr= ");
        stringBuffer.append(mo1487i());
        stringBuffer.append(str);
        stringBuffer.append("       .arabic      = ");
        stringBuffer.append(mo1486h());
        stringBuffer.append(str);
        stringBuffer.append("       .displayguts = ");
        stringBuffer.append(mo1490l());
        stringBuffer.append(str);
        stringBuffer.append("       .frzpnsnosplt= ");
        stringBuffer.append(mo1494p());
        stringBuffer.append(str);
        stringBuffer.append("       .selected    = ");
        stringBuffer.append(mo1502x());
        stringBuffer.append(str);
        stringBuffer.append("       .active       = ");
        stringBuffer.append(mo1504z());
        stringBuffer.append(str);
        stringBuffer.append("       .svdinpgbrkpv= ");
        stringBuffer.append(mo1501w());
        stringBuffer.append(str);
        stringBuffer.append("    .toprow         = ");
        stringBuffer.append(Integer.toHexString(mo1503y()));
        stringBuffer.append(str);
        stringBuffer.append("    .leftcol        = ");
        stringBuffer.append(Integer.toHexString(mo1496r()));
        stringBuffer.append(str);
        stringBuffer.append("    .headercolor    = ");
        stringBuffer.append(Integer.toHexString(mo1495q()));
        stringBuffer.append(str);
        stringBuffer.append("    .pagebreakzoom  = ");
        stringBuffer.append(Integer.toHexString(mo1499u()));
        stringBuffer.append(str);
        stringBuffer.append("    .normalzoom     = ");
        stringBuffer.append(Integer.toHexString(mo1497s()));
        stringBuffer.append(str);
        stringBuffer.append("    .reserved       = ");
        stringBuffer.append(Integer.toHexString(mo1500v()));
        stringBuffer.append(str);
        stringBuffer.append("[/WINDOW2]\n");
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public short mo1499u() {
        return this.f1474q;
    }

    /* renamed from: v */
    public int mo1500v() {
        return this.f1476s;
    }

    /* renamed from: w */
    public boolean mo1501w() {
        return f1469l.mo1258d(this.f1470m);
    }

    /* renamed from: x */
    public boolean mo1502x() {
        return f1467j.mo1258d(this.f1470m);
    }

    /* renamed from: y */
    public short mo1503y() {
        return this.f1471n;
    }

    /* renamed from: z */
    public boolean mo1504z() {
        return f1468k.mo1258d(this.f1470m);
    }
}
