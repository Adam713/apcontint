package p000;

/* renamed from: YW */
public final class C0535YW extends C0080DY {

    /* renamed from: a */
    public final int f1630a;

    /* renamed from: b */
    public final short[] f1631b;

    /* renamed from: YW$a */
    public static final class C0536a {

        /* renamed from: a */
        public short[] f1632a = new short[4];

        /* renamed from: b */
        public int f1633b;

        /* renamed from: a */
        public void mo1643a(int i) {
            short[] sArr = this.f1632a;
            int length = sArr.length;
            int i2 = this.f1633b;
            if (length <= i2) {
                short[] sArr2 = new short[(i2 * 2)];
                System.arraycopy(sArr, 0, sArr2, 0, i2);
                this.f1632a = sArr2;
            }
            short[] sArr3 = this.f1632a;
            int i3 = this.f1633b;
            sArr3[i3] = (short) i;
            this.f1633b = i3 + 1;
        }

        /* renamed from: b */
        public C0535YW mo1644b(int i) {
            int i2 = this.f1633b;
            short[] sArr = new short[i2];
            System.arraycopy(this.f1632a, 0, sArr, 0, i2);
            return new C0535YW(i, sArr);
        }
    }

    public C0535YW(int i, short[] sArr) {
        this.f1630a = i;
        this.f1631b = sArr;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeInt(this.f1630a);
        int i = 0;
        while (true) {
            short[] sArr = this.f1631b;
            if (i < sArr.length) {
                jda.writeShort(sArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public Object clone() {
        return this;
    }

    /* renamed from: e */
    public short mo34e() {
        return 215;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f1631b.length * 2) + 4;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DBCELL]\n");
        stringBuffer.append("    .rowoffset = ");
        stringBuffer.append(Yca.m1598b(this.f1630a));
        String str = "\n";
        stringBuffer.append(str);
        for (int i = 0; i < this.f1631b.length; i++) {
            stringBuffer.append("    .cell_");
            stringBuffer.append(i);
            stringBuffer.append(" = ");
            stringBuffer.append(Yca.m1602c((int) this.f1631b[i]));
            stringBuffer.append(str);
        }
        stringBuffer.append("[/DBCELL]\n");
        return stringBuffer.toString();
    }
}
