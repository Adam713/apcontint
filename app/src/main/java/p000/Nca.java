package p000;

import java.math.BigInteger;

/* renamed from: Nca */
public final class Nca {

    /* renamed from: a */
    public static final BigInteger f843a = BigInteger.valueOf(4503599627370495L);

    /* renamed from: b */
    public static final BigInteger f844b = BigInteger.valueOf(4503599627370496L);

    /* renamed from: c */
    public final BigInteger f845c;

    /* renamed from: d */
    public final int f846d;

    public Nca(long j) {
        int i;
        int i2 = (int) (j >> 52);
        if (i2 == 0) {
            BigInteger and = BigInteger.valueOf(j).and(f843a);
            int bitLength = 64 - and.bitLength();
            this.f845c = and.shiftLeft(bitLength);
            i = ((i2 & 2047) - 1023) - bitLength;
        } else {
            this.f845c = m934a(j);
            i = (i2 & 2047) - 1023;
        }
        this.f846d = i;
    }

    /* renamed from: a */
    public static BigInteger m934a(long j) {
        return BigInteger.valueOf(j).and(f843a).or(f844b).shiftLeft(11);
    }

    /* renamed from: a */
    public int mo954a() {
        return this.f846d;
    }

    /* renamed from: b */
    public Pca mo955b() {
        return Pca.m1028a(this.f845c, this.f846d);
    }
}
