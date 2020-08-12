package p000;

/* renamed from: yX */
public final class C1189yX extends C0400SW {

    /* renamed from: d */
    public static int f4166d = 14;

    /* renamed from: e */
    public static final Tca f4167e = Uca.m1284a(1);

    /* renamed from: f */
    public static final Tca f4168f = Uca.m1284a(2);

    /* renamed from: g */
    public static final Tca f4169g = Uca.m1284a(8);

    /* renamed from: h */
    public double f4170h;

    /* renamed from: i */
    public short f4171i;

    /* renamed from: j */
    public int f4172j;

    /* renamed from: k */
    public C1256oca f4173k = C1256oca.m3285a(Haa.f368a);

    /* renamed from: l */
    public C1190a f4174l;

    /* renamed from: yX$a */
    private static final class C1190a {

        /* renamed from: a */
        public final byte[] f4175a;

        public C1190a(byte[] bArr) {
            this.f4175a = bArr;
        }

        /* renamed from: a */
        public static C1190a m3888a() {
            return m3890a(3, 0);
        }

        /* renamed from: a */
        public static C1190a m3889a(int i) {
            return m3890a(2, i);
        }

        /* renamed from: a */
        public static C1190a m3890a(int i, int i2) {
            return new C1190a(new byte[]{(byte) i, 0, (byte) i2, 0, 0, 0});
        }

        /* renamed from: b */
        public static C1190a m3891b() {
            return m3890a(0, 0);
        }

        /* renamed from: a */
        public void mo5507a(jda jda) {
            jda.write(this.f4175a);
            jda.writeShort(65535);
        }

        /* renamed from: c */
        public String mo5508c() {
            StringBuilder sb = new StringBuilder();
            sb.append(mo5509d());
            sb.append(' ');
            sb.append(Yca.m1594a(this.f4175a));
            return sb.toString();
        }

        /* renamed from: d */
        public final String mo5509d() {
            int h = mo5513h();
            if (h == 0) {
                return "<string>";
            }
            if (h == 1) {
                return mo5511f() == 0 ? "FALSE" : "TRUE";
            } else if (h == 2) {
                return Zaa.m1638a(mo5511f());
            } else {
                if (h == 3) {
                    return "<empty>";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("#error(type=");
                sb.append(h);
                sb.append(")#");
                return sb.toString();
            }
        }

        /* renamed from: e */
        public boolean mo5510e() {
            if (mo5513h() == 1) {
                return mo5511f() != 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Not a boolean cached value - ");
            sb.append(mo5509d());
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: f */
        public final int mo5511f() {
            return this.f4175a[2];
        }

        /* renamed from: g */
        public int mo5512g() {
            if (mo5513h() == 2) {
                return mo5511f();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Not an error cached value - ");
            sb.append(mo5509d());
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: h */
        public int mo5513h() {
            return this.f4175a[0];
        }

        /* renamed from: i */
        public int mo5514i() {
            int h = mo5513h();
            if (h == 0) {
                return 1;
            }
            if (h == 1) {
                return 4;
            }
            if (h == 2) {
                return 5;
            }
            if (h == 3) {
                return 1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected type id (");
            sb.append(h);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            stringBuffer.append(C1190a.class.getName());
            stringBuffer.append('[');
            stringBuffer.append(mo5509d());
            stringBuffer.append(']');
            return stringBuffer.toString();
        }
    }

    /* renamed from: a */
    public void mo5490a(double d) {
        this.f4170h = d;
        this.f4174l = null;
    }

    /* renamed from: a */
    public void mo382a(StringBuilder sb) {
        sb.append("  .value\t = ");
        C1190a aVar = this.f4174l;
        String str = "\n";
        if (aVar == null) {
            sb.append(this.f4170h);
        } else {
            sb.append(aVar.mo5508c());
        }
        sb.append(str);
        sb.append("  .options   = ");
        sb.append(Yca.m1602c((int) mo5498n()));
        sb.append(str);
        sb.append("    .alwaysCalc= ");
        sb.append(mo5502r());
        sb.append(str);
        sb.append("    .calcOnLoad= ");
        sb.append(mo5503s());
        sb.append(str);
        sb.append("    .shared    = ");
        sb.append(mo5504t());
        sb.append(str);
        sb.append("  .zero      = ");
        sb.append(Yca.m1598b(this.f4172j));
        Haa[] e = this.f4173k.mo4981e();
        for (int i = 0; i < e.length; i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append("    Ptg[");
            sb.append(i);
            sb.append("]=");
            Haa haa = e[i];
            sb.append(haa.toString());
            sb.append(haa.mo358b());
        }
    }

    /* renamed from: a */
    public void mo5491a(boolean z) {
        this.f4171i = f4169g.mo1252a(this.f4171i, z);
    }

    /* renamed from: a */
    public void mo5492a(Haa[] haaArr) {
        this.f4173k = C1256oca.m3285a(haaArr);
    }

    /* renamed from: b */
    public void mo5493b(int i) {
        this.f4174l = C1190a.m3889a(i);
    }

    /* renamed from: b */
    public void mo384b(jda jda) {
        C1190a aVar = this.f4174l;
        if (aVar == null) {
            jda.writeDouble(this.f4170h);
        } else {
            aVar.mo5507a(jda);
        }
        jda.writeShort(mo5498n());
        jda.writeInt(this.f4172j);
        this.f4173k.mo4975a(jda);
    }

    public Object clone() {
        C1189yX yXVar = new C1189yX();
        mo1205a((C0400SW) yXVar);
        yXVar.f4170h = this.f4170h;
        yXVar.f4171i = this.f4171i;
        yXVar.f4172j = this.f4172j;
        yXVar.f4173k = this.f4173k;
        yXVar.f4174l = this.f4174l;
        return yXVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 6;
    }

    /* renamed from: h */
    public String mo385h() {
        return "FORMULA";
    }

    /* renamed from: i */
    public int mo386i() {
        return f4166d + this.f4173k.mo4976b();
    }

    /* renamed from: j */
    public boolean mo5494j() {
        return this.f4174l.mo5510e();
    }

    /* renamed from: k */
    public int mo5495k() {
        return this.f4174l.mo5512g();
    }

    /* renamed from: l */
    public int mo5496l() {
        C1190a aVar = this.f4174l;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo5514i();
    }

    /* renamed from: m */
    public C1256oca mo5497m() {
        return this.f4173k;
    }

    /* renamed from: n */
    public short mo5498n() {
        return this.f4171i;
    }

    /* renamed from: o */
    public Haa[] mo5499o() {
        return this.f4173k.mo4981e();
    }

    /* renamed from: p */
    public double mo5500p() {
        return this.f4170h;
    }

    /* renamed from: q */
    public boolean mo5501q() {
        C1190a aVar = this.f4174l;
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (aVar.mo5513h() == 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: r */
    public boolean mo5502r() {
        return f4167e.mo1258d(this.f4171i);
    }

    /* renamed from: s */
    public boolean mo5503s() {
        return f4168f.mo1258d(this.f4171i);
    }

    /* renamed from: t */
    public boolean mo5504t() {
        return f4169g.mo1258d(this.f4171i);
    }

    /* renamed from: u */
    public void mo5505u() {
        this.f4174l = C1190a.m3888a();
    }

    /* renamed from: v */
    public void mo5506v() {
        this.f4174l = C1190a.m3891b();
    }
}
