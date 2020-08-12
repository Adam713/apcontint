package p000;

/* renamed from: BY */
public final class C0037BY extends C0061CY {

    /* renamed from: b */
    public int f62b;

    /* renamed from: c */
    public C1256oca f63c;

    public C0037BY() {
        this(new C1282xba(0, 0, 0, 0));
    }

    public C0037BY(C1282xba xba) {
        super(xba);
        this.f63c = C1256oca.m3285a(Haa.f368a);
    }

    /* renamed from: a */
    public static int m61a(int i, int i2, boolean z) {
        return z ? (i2 + i) & 255 : i2;
    }

    /* renamed from: a */
    public static Haa[] m62a(Haa[] haaArr, int i, int i2) {
        Object obj;
        Object[] objArr = haaArr;
        int i3 = i;
        int i4 = i2;
        Haa[] haaArr2 = new Haa[objArr.length];
        int i5 = 0;
        Object[] objArr2 = objArr;
        while (i5 < objArr2.length) {
            Haa haa = objArr2[i5];
            byte b = -1;
            if (!haa.mo120d()) {
                b = haa.mo356a();
            }
            if (haa instanceof Oaa) {
                Oaa oaa = (Oaa) haa;
                Haa naa = new Naa(m63b(i3, oaa.mo1011i(), oaa.mo1013k()), m61a(i4, oaa.mo1010h(), oaa.mo1012j()), oaa.mo1013k(), oaa.mo1012j());
                naa.mo357a(b);
                obj = naa;
            } else if (haa instanceof C0560ZZ) {
                C0560ZZ zz = (C0560ZZ) haa;
                Haa haa2 = r7;
                C0539YZ yz = new C0539YZ(m63b(i3, zz.mo1696i(), zz.mo1700m()), m63b(i3, zz.mo1698k(), zz.mo1702o()), m61a(i4, zz.mo1695h(), zz.mo1699l()), m61a(i4, zz.mo1697j(), zz.mo1701n()), zz.mo1700m(), zz.mo1702o(), zz.mo1699l(), zz.mo1701n());
                haa2.mo357a(b);
                obj = haa2;
            } else {
                obj = haa instanceof Caa ? ((Caa) haa).mo121f() : haa;
            }
            haaArr2[i5] = obj;
            i5++;
            objArr2 = haaArr;
        }
        return haaArr2;
    }

    /* renamed from: b */
    public static int m63b(int i, int i2, boolean z) {
        return z ? 65535 & (i2 + i) : i2;
    }

    /* renamed from: a */
    public Haa[] mo76a(C1189yX yXVar) {
        int row = yXVar.getRow();
        short b = yXVar.mo280b();
        if (mo113b(row, b)) {
            return m62a(this.f63c.mo4981e(), row, (int) b);
        }
        throw new RuntimeException("Shared Formula Conversion: Coding Error");
    }

    /* renamed from: b */
    public void mo71b(jda jda) {
        jda.writeShort(this.f62b);
        this.f63c.mo4975a(jda);
    }

    public Object clone() {
        C0037BY by = new C0037BY(mo118m());
        by.f62b = this.f62b;
        C1256oca oca = this.f63c;
        oca.mo4974a();
        by.f63c = oca;
        return by;
    }

    /* renamed from: e */
    public short mo34e() {
        return 1212;
    }

    /* renamed from: h */
    public int mo72h() {
        return this.f63c.mo4976b() + 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SHARED FORMULA (");
        stringBuffer.append(Yca.m1598b(1212));
        stringBuffer.append("]\n");
        stringBuffer.append("    .range      = ");
        stringBuffer.append(mo118m().toString());
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .reserved    = ");
        stringBuffer.append(Yca.m1602c(this.f62b));
        stringBuffer.append(str);
        Haa[] e = this.f63c.mo4981e();
        for (int i = 0; i < e.length; i++) {
            stringBuffer.append("Formula[");
            stringBuffer.append(i);
            stringBuffer.append("]");
            Haa haa = e[i];
            stringBuffer.append(haa.toString());
            stringBuffer.append(haa.mo358b());
            stringBuffer.append(str);
        }
        stringBuffer.append("[/SHARED FORMULA]\n");
        return stringBuffer.toString();
    }
}
