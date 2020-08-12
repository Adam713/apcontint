package p000;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: Pca */
public final class Pca {

    /* renamed from: a */
    public static final BigDecimal f990a = new BigDecimal(BigInteger.ONE.shiftLeft(24));

    /* renamed from: b */
    public final int f991b;

    /* renamed from: c */
    public final long f992c;

    /* renamed from: d */
    public final int f993d;

    public Pca(long j, int i, int i2) {
        this.f992c = j;
        this.f993d = i;
        this.f991b = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        if (r1.mo1024c() != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r1.mo1023b() != false) goto L_0x0066;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Pca m1028a(BigInteger r2, int r3) {
        /*
            r0 = 49
            if (r3 > r0) goto L_0x000b
            r0 = 46
            if (r3 >= r0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = 0
            goto L_0x0019
        L_0x000b:
            r0 = 15204352(0xe80000, float:2.1305835E-38)
            r1 = 315653(0x4d105, float:4.42324E-40)
            int r1 = r1 * r3
            int r0 = r0 - r1
            r1 = 524288(0x80000, float:7.34684E-40)
            int r0 = r0 + r1
            int r0 = r0 >> 20
            int r0 = -r0
        L_0x0019:
            Oca r1 = new Oca
            r1.<init>(r2, r3)
            if (r0 == 0) goto L_0x0024
            int r2 = -r0
            r1.mo1022b(r2)
        L_0x0024:
            int r2 = r1.mo1019a()
            switch(r2) {
                case 44: goto L_0x0060;
                case 45: goto L_0x0060;
                case 46: goto L_0x0059;
                case 47: goto L_0x0066;
                case 48: goto L_0x0066;
                case 49: goto L_0x004b;
                case 50: goto L_0x0052;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Bad binary exp "
            r3.append(r0)
            int r0 = r1.mo1019a()
            r3.append(r0)
            java.lang.String r0 = "."
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x004b:
            boolean r2 = r1.mo1024c()
            if (r2 == 0) goto L_0x0052
            goto L_0x0066
        L_0x0052:
            r2 = -1
            r1.mo1022b(r2)
            int r0 = r0 + 1
            goto L_0x0066
        L_0x0059:
            boolean r2 = r1.mo1023b()
            if (r2 == 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            r2 = 1
            r1.mo1022b(r2)
            int r0 = r0 + -1
        L_0x0066:
            r1.mo1025d()
            Pca r2 = r1.mo1020a(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Pca.m1028a(java.math.BigInteger, int):Pca");
    }

    /* renamed from: a */
    public int mo1070a() {
        return this.f991b + 14;
    }

    /* renamed from: b */
    public final String mo1071b() {
        return this.f993d == 0 ? "0" : mo1072c().toString().substring(2);
    }

    /* renamed from: c */
    public BigDecimal mo1072c() {
        return new BigDecimal(this.f993d).divide(f990a);
    }

    /* renamed from: d */
    public String mo1073d() {
        return Long.toString(this.f992c);
    }

    /* renamed from: e */
    public String mo1074e() {
        long j = this.f992c + 5;
        StringBuilder sb = new StringBuilder(24);
        sb.append(j);
        sb.setCharAt(sb.length() - 1, '0');
        return sb.toString();
    }

    /* renamed from: f */
    public Pca mo1075f() {
        long j = this.f992c;
        if (this.f993d >= 8388608) {
            j++;
        }
        int i = this.f991b;
        return j < 1000000000000000L ? new Pca(j, 0, i) : new Pca(j / 10, 0, i + 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pca.class.getName());
        sb.append(" [");
        String valueOf = String.valueOf(this.f992c);
        sb.append(valueOf.charAt(0));
        sb.append('.');
        sb.append(valueOf.substring(1));
        sb.append(' ');
        sb.append(mo1071b());
        sb.append("E");
        sb.append(mo1070a());
        sb.append("]");
        return sb.toString();
    }
}
