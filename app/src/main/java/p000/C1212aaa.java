package p000;

/* renamed from: aaa reason: case insensitive filesystem */
public final class C1212aaa extends C1221daa {

    /* renamed from: c */
    public static final Tca f1874c = Uca.m1284a(1);

    /* renamed from: d */
    public static final Tca f1875d = Uca.m1284a(2);

    /* renamed from: e */
    public static final Tca f1876e = Uca.m1284a(4);

    /* renamed from: f */
    public static final Tca f1877f = Uca.m1284a(8);

    /* renamed from: g */
    public static final Tca f1878g = Uca.m1284a(16);

    /* renamed from: h */
    public static final Tca f1879h = Uca.m1284a(32);

    /* renamed from: i */
    public static final Tca f1880i = Uca.m1284a(64);

    /* renamed from: j */
    public static final C1212aaa f1881j = new C1212aaa(16, 0, null, -1);

    /* renamed from: k */
    public final byte f1882k;

    /* renamed from: l */
    public final short f1883l;

    /* renamed from: m */
    public final int[] f1884m;

    /* renamed from: n */
    public final int f1885n;

    public C1212aaa(int i, int i2, int[] iArr, int i3) {
        this.f1882k = (byte) i;
        this.f1883l = (short) i2;
        this.f1884m = iArr;
        this.f1885n = i3;
    }

    public C1212aaa(hda hda) {
        int i;
        this.f1882k = hda.readByte();
        this.f1883l = hda.readShort();
        if (mo1873h()) {
            int[] iArr = new int[this.f1883l];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr[i2] = hda.mo401a();
            }
            this.f1884m = iArr;
            i = hda.mo401a();
        } else {
            this.f1884m = null;
            i = -1;
        }
        this.f1885n = i;
    }

    /* renamed from: a */
    public String mo1870a(String[] strArr) {
        StringBuilder sb;
        String str;
        if (f1880i.mo1258d(this.f1882k)) {
            return strArr[0];
        }
        String str2 = ")";
        String str3 = "(";
        if (f1875d.mo1258d(this.f1882k)) {
            sb = new StringBuilder();
            sb.append(mo81e());
            sb.append(str3);
            str = strArr[0];
        } else if (f1877f.mo1258d(this.f1882k)) {
            sb = new StringBuilder();
            sb.append(mo81e());
            sb.append(strArr[0]);
            return sb.toString();
        } else {
            sb = new StringBuilder();
            sb.append(mo81e());
            sb.append(str3);
            str = strArr[0];
        }
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 25);
        jda.writeByte(this.f1882k);
        jda.writeShort(this.f1883l);
        int[] iArr = this.f1884m;
        if (iArr != null) {
            for (int writeShort : iArr) {
                jda.writeShort(writeShort);
            }
            jda.writeShort(this.f1885n);
        }
    }

    /* renamed from: c */
    public int mo80c() {
        int[] iArr = this.f1884m;
        if (iArr != null) {
            return ((iArr.length + 1) * 2) + 4;
        }
        return 4;
    }

    /* renamed from: e */
    public String mo81e() {
        if (f1874c.mo1258d(this.f1882k)) {
            return "ATTR(semiVolatile)";
        }
        if (f1875d.mo1258d(this.f1882k)) {
            return "IF";
        }
        if (f1876e.mo1258d(this.f1882k)) {
            return "CHOOSE";
        }
        String str = "";
        return f1877f.mo1258d(this.f1882k) ? str : f1878g.mo1258d(this.f1882k) ? "SUM" : f1879h.mo1258d(this.f1882k) ? "ATTR(baxcel)" : f1880i.mo1258d(this.f1882k) ? str : "UNKNOWN ATTRIBUTE";
    }

    /* renamed from: f */
    public int mo1871f() {
        return 1;
    }

    /* renamed from: g */
    public final boolean mo1872g() {
        return f1879h.mo1258d(this.f1882k);
    }

    /* renamed from: h */
    public boolean mo1873h() {
        return f1876e.mo1258d(this.f1882k);
    }

    /* renamed from: i */
    public boolean mo1874i() {
        return f1875d.mo1258d(this.f1882k);
    }

    /* renamed from: j */
    public boolean mo1875j() {
        return f1874c.mo1258d(this.f1882k);
    }

    /* renamed from: k */
    public boolean mo1876k() {
        return f1877f.mo1258d(this.f1882k);
    }

    /* renamed from: l */
    public boolean mo1877l() {
        return f1880i.mo1258d(this.f1882k);
    }

    /* renamed from: m */
    public boolean mo1878m() {
        return f1878g.mo1258d(this.f1882k);
    }

    public String toString() {
        String str;
        String str2;
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(C1212aaa.class.getName());
        stringBuffer.append(" [");
        if (mo1875j()) {
            stringBuffer.append("volatile ");
        }
        if (mo1877l()) {
            stringBuffer.append("space count=");
            stringBuffer.append((this.f1883l >> 8) & 255);
            stringBuffer.append(" type=");
            stringBuffer.append(this.f1883l & 255);
            stringBuffer.append(" ");
        }
        if (mo1874i()) {
            str2 = "if dist=";
        } else if (mo1873h()) {
            str2 = "choose nCases=";
        } else if (mo1876k()) {
            str2 = "skip dist=";
        } else {
            if (mo1878m()) {
                str = "sum ";
            } else {
                if (mo1872g()) {
                    str = "assign ";
                }
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
            stringBuffer.append(str);
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
        stringBuffer.append(str2);
        stringBuffer.append(this.f1883l);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
