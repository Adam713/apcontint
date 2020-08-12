package p000;

/* renamed from: SX */
public final class C0401SX extends C0080DY {

    /* renamed from: a */
    public final int f1169a;

    /* renamed from: b */
    public final int f1170b;

    /* renamed from: c */
    public final short[] f1171c;

    /* renamed from: d */
    public final int f1172d;

    public C0401SX(int i, int i2, short[] sArr) {
        this.f1169a = i;
        this.f1170b = i2;
        this.f1171c = sArr;
        this.f1172d = (i2 + sArr.length) - 1;
    }

    /* renamed from: a */
    public short mo1207a(int i) {
        return this.f1171c[i];
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1169a);
        jda.writeShort(this.f1170b);
        for (short writeShort : this.f1171c) {
            jda.writeShort(writeShort);
        }
        jda.writeShort(this.f1172d);
    }

    public Object clone() {
        return this;
    }

    /* renamed from: e */
    public short mo34e() {
        return 190;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f1171c.length * 2) + 6;
    }

    public int getRow() {
        return this.f1169a;
    }

    /* renamed from: h */
    public int mo1209h() {
        return this.f1170b;
    }

    /* renamed from: i */
    public int mo1210i() {
        return (this.f1172d - this.f1170b) + 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[MULBLANK]\n");
        stringBuffer.append("row  = ");
        stringBuffer.append(Integer.toHexString(getRow()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("firstcol  = ");
        stringBuffer.append(Integer.toHexString(mo1209h()));
        stringBuffer.append(str);
        stringBuffer.append(" lastcol  = ");
        stringBuffer.append(Integer.toHexString(this.f1172d));
        stringBuffer.append(str);
        for (int i = 0; i < mo1210i(); i++) {
            stringBuffer.append("xf");
            stringBuffer.append(i);
            stringBuffer.append("\t\t= ");
            stringBuffer.append(Integer.toHexString(mo1207a(i)));
            stringBuffer.append(str);
        }
        stringBuffer.append("[/MULBLANK]\n");
        return stringBuffer.toString();
    }
}
