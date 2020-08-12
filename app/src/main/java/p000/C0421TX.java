package p000;

/* renamed from: TX */
public final class C0421TX extends C0080DY {

    /* renamed from: a */
    public int f1195a;

    /* renamed from: b */
    public short f1196b;

    /* renamed from: c */
    public C0422a[] f1197c;

    /* renamed from: d */
    public short f1198d;

    /* renamed from: TX$a */
    private static final class C0422a {

        /* renamed from: a */
        public final short f1199a;

        /* renamed from: b */
        public final int f1200b;
    }

    /* renamed from: a */
    public double mo1230a(int i) {
        return Aba.m48a(this.f1197c[i].f1200b);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        throw new C1001pY("Sorry, you can't serialize MulRK in this release");
    }

    /* renamed from: b */
    public short mo1231b(int i) {
        return this.f1197c[i].f1199a;
    }

    /* renamed from: e */
    public short mo34e() {
        return 189;
    }

    /* renamed from: g */
    public int mo36g() {
        throw new C1001pY("Sorry, you can't serialize MulRK in this release");
    }

    public int getRow() {
        return this.f1195a;
    }

    /* renamed from: h */
    public short mo1233h() {
        return this.f1196b;
    }

    /* renamed from: i */
    public short mo1234i() {
        return this.f1198d;
    }

    /* renamed from: j */
    public int mo1235j() {
        return (this.f1198d - this.f1196b) + 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[MULRK]\n");
        stringBuffer.append("\t.row\t = ");
        stringBuffer.append(Yca.m1602c(getRow()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("\t.firstcol= ");
        stringBuffer.append(Yca.m1602c((int) mo1233h()));
        stringBuffer.append(str);
        stringBuffer.append("\t.lastcol = ");
        stringBuffer.append(Yca.m1602c((int) mo1234i()));
        stringBuffer.append(str);
        for (int i = 0; i < mo1235j(); i++) {
            stringBuffer.append("\txf[");
            stringBuffer.append(i);
            String str2 = "] = ";
            stringBuffer.append(str2);
            stringBuffer.append(Yca.m1602c((int) mo1231b(i)));
            stringBuffer.append(str);
            stringBuffer.append("\trk[");
            stringBuffer.append(i);
            stringBuffer.append(str2);
            stringBuffer.append(mo1230a(i));
            stringBuffer.append(str);
        }
        stringBuffer.append("[/MULRK]\n");
        return stringBuffer.toString();
    }
}
