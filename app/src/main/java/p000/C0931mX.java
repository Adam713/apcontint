package p000;

/* renamed from: mX */
public final class C0931mX extends C0080DY {

    /* renamed from: a */
    public short f3398a = 8;

    /* renamed from: b */
    public C0932a[] f3399b = new C0932a[0];

    /* renamed from: mX$a */
    private static final class C0932a {

        /* renamed from: a */
        public int f3400a;

        /* renamed from: b */
        public int f3401b;

        /* renamed from: c */
        public short f3402c;

        public C0932a(int i, int i2) {
            this.f3400a = i;
            this.f3401b = i2;
        }

        /* renamed from: a */
        public int mo4771a() {
            return this.f3401b;
        }

        /* renamed from: a */
        public void mo4772a(jda jda) {
            jda.writeInt(this.f3400a);
            jda.writeShort(this.f3401b);
            jda.writeShort(this.f3402c);
        }

        /* renamed from: b */
        public int mo4773b() {
            return this.f3400a;
        }
    }

    /* renamed from: a */
    public static final int m3087a(int i) {
        int i2 = i / 8;
        if (i % 8 != 0) {
            i2++;
        }
        if (i2 > 128) {
            return 128;
        }
        return i2;
    }

    /* renamed from: b */
    public static final int m3088b(int i) {
        return (m3087a(i) * 8) + 6;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3398a);
        int i = 0;
        while (true) {
            C0932a[] aVarArr = this.f3399b;
            if (i < aVarArr.length) {
                aVarArr[i].mo4772a(jda);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo4769a(int[] iArr, int[] iArr2) {
        this.f3399b = new C0932a[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f3399b[i] = new C0932a(iArr[i], iArr2[i]);
        }
    }

    /* renamed from: b */
    public void mo4770b(short s) {
        this.f3398a = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 255;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f3399b.length * 8) + 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[EXTSST]\n");
        stringBuffer.append("    .dsst           = ");
        stringBuffer.append(Integer.toHexString(this.f3398a));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .numInfoRecords = ");
        stringBuffer.append(this.f3399b.length);
        stringBuffer.append(str);
        for (int i = 0; i < this.f3399b.length; i++) {
            stringBuffer.append("    .inforecord     = ");
            stringBuffer.append(i);
            stringBuffer.append(str);
            stringBuffer.append("    .streampos      = ");
            stringBuffer.append(Integer.toHexString(this.f3399b[i].mo4773b()));
            stringBuffer.append(str);
            stringBuffer.append("    .sstoffset      = ");
            stringBuffer.append(Integer.toHexString(this.f3399b[i].mo4771a()));
            stringBuffer.append(str);
        }
        stringBuffer.append("[/EXTSST]\n");
        return stringBuffer.toString();
    }
}
