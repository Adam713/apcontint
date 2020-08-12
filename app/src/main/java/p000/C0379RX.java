package p000;

/* renamed from: RX */
public final class C0379RX extends C0080DY {

    /* renamed from: a */
    public Jca[] f1091a;

    /* renamed from: b */
    public final int f1092b;

    /* renamed from: c */
    public final int f1093c;

    public C0379RX(Jca[] jcaArr, int i, int i2) {
        this.f1091a = jcaArr;
        this.f1092b = i;
        this.f1093c = i2;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1093c);
        for (int i = 0; i < this.f1093c; i++) {
            this.f1091a[this.f1092b + i].mo647a(jda);
        }
    }

    public Object clone() {
        int i = this.f1093c;
        Jca[] jcaArr = new Jca[i];
        for (int i2 = 0; i2 < jcaArr.length; i2++) {
            jcaArr[i2] = this.f1091a[this.f1092b + i2].mo648f();
        }
        return new C0379RX(jcaArr, 0, i);
    }

    /* renamed from: e */
    public short mo34e() {
        return 229;
    }

    /* renamed from: g */
    public int mo36g() {
        return Lca.m828b(this.f1093c);
    }

    /* renamed from: h */
    public short mo1149h() {
        return (short) this.f1093c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = "[MERGEDCELLS]";
        stringBuffer.append(str);
        String str2 = "\n";
        stringBuffer.append(str2);
        stringBuffer.append("     .numregions =");
        stringBuffer.append(mo1149h());
        stringBuffer.append(str2);
        for (int i = 0; i < this.f1093c; i++) {
            Jca jca = this.f1091a[this.f1092b + i];
            stringBuffer.append("     .rowfrom =");
            stringBuffer.append(jca.mo754b());
            stringBuffer.append(str2);
            stringBuffer.append("     .rowto   =");
            stringBuffer.append(jca.mo756d());
            stringBuffer.append(str2);
            stringBuffer.append("     .colfrom =");
            stringBuffer.append(jca.mo751a());
            stringBuffer.append(str2);
            stringBuffer.append("     .colto   =");
            stringBuffer.append(jca.mo755c());
            stringBuffer.append(str2);
        }
        stringBuffer.append(str);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }
}
