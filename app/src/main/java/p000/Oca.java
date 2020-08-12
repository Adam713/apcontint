package p000;

import java.math.BigInteger;

/* renamed from: Oca */
public final class Oca {

    /* renamed from: a */
    public static final BigInteger f915a = new BigInteger("0B5E620F47FFFE666", 16);

    /* renamed from: b */
    public static final BigInteger f916b = new BigInteger("0E35FA9319FFFE000", 16);

    /* renamed from: c */
    public BigInteger f917c;

    /* renamed from: d */
    public int f918d;

    /* renamed from: Oca$a */
    private static final class C0318a {

        /* renamed from: a */
        public static final BigInteger[] f919a;

        static {
            BigInteger[] bigIntegerArr = new BigInteger[33];
            long j = 1;
            for (int i = 1; i < bigIntegerArr.length; i++) {
                bigIntegerArr[i] = BigInteger.valueOf(j);
                j <<= 1;
            }
            f919a = bigIntegerArr;
        }

        /* renamed from: a */
        public static BigInteger m992a(BigInteger bigInteger, int i) {
            return i < 1 ? bigInteger : bigInteger.add(f919a[i]);
        }
    }

    /* renamed from: Oca$b */
    private static final class C0319b {

        /* renamed from: a */
        public static final BigInteger f920a = new BigInteger("5");

        /* renamed from: b */
        public static final C0319b[] f921b = new C0319b[350];

        /* renamed from: c */
        public final BigInteger f922c;

        /* renamed from: d */
        public final BigInteger f923d;

        /* renamed from: e */
        public final int f924e;

        /* renamed from: f */
        public final int f925f;

        public C0319b(int i) {
            BigInteger pow = f920a.pow(i);
            int bitLength = pow.bitLength();
            BigInteger divide = BigInteger.ONE.shiftLeft(bitLength + 80).divide(pow);
            int bitLength2 = divide.bitLength() - 80;
            this.f923d = divide.shiftRight(bitLength2);
            this.f924e = -((bitLength - bitLength2) + i + 80);
            int bitLength3 = pow.bitLength() - 68;
            if (bitLength3 > 0) {
                this.f925f = i + bitLength3;
                this.f922c = pow.shiftRight(bitLength3);
                return;
            }
            this.f925f = i;
            this.f922c = pow;
        }

        /* renamed from: a */
        public static C0319b m993a(int i) {
            C0319b bVar = f921b[i];
            if (bVar != null) {
                return bVar;
            }
            C0319b bVar2 = new C0319b(i);
            f921b[i] = bVar2;
            return bVar2;
        }
    }

    public Oca(BigInteger bigInteger, int i) {
        this.f917c = bigInteger;
        this.f918d = i;
    }

    /* renamed from: a */
    public int mo1019a() {
        return (this.f918d + this.f917c.bitLength()) - 64;
    }

    /* renamed from: a */
    public Pca mo1020a(int i) {
        return new Pca(this.f917c.shiftRight((64 - this.f918d) - 1).longValue(), (this.f917c.intValue() << (this.f918d - 39)) & 16777088, i);
    }

    /* renamed from: a */
    public final void mo1021a(BigInteger bigInteger, int i) {
        this.f917c = this.f917c.multiply(bigInteger);
        this.f918d += i;
        int bitLength = (this.f917c.bitLength() - 72) & -32;
        if (bitLength > 0) {
            this.f917c = this.f917c.shiftRight(bitLength);
            this.f918d += bitLength;
        }
    }

    /* renamed from: b */
    public void mo1022b(int i) {
        BigInteger bigInteger;
        int i2;
        C0319b a = C0319b.m993a(Math.abs(i));
        if (i < 0) {
            bigInteger = a.f923d;
            i2 = a.f924e;
        } else {
            bigInteger = a.f922c;
            i2 = a.f925f;
        }
        mo1021a(bigInteger, i2);
    }

    /* renamed from: b */
    public boolean mo1023b() {
        return this.f917c.compareTo(f915a.shiftLeft(this.f917c.bitLength() + -64)) > 0;
    }

    /* renamed from: c */
    public boolean mo1024c() {
        return this.f917c.compareTo(f916b.shiftLeft(this.f917c.bitLength() + -64)) < 0;
    }

    /* renamed from: d */
    public void mo1025d() {
        int bitLength = this.f917c.bitLength();
        int i = bitLength - 64;
        if (i != 0) {
            if (i >= 0) {
                this.f918d += i;
                if (i > 32) {
                    int i2 = (i - 1) & 16777184;
                    this.f917c = this.f917c.shiftRight(i2);
                    i -= i2;
                    bitLength -= i2;
                }
                if (i >= 1) {
                    this.f917c = C0318a.m992a(this.f917c, i);
                    if (this.f917c.bitLength() > bitLength) {
                        i++;
                        this.f918d++;
                    }
                    this.f917c = this.f917c.shiftRight(i);
                    return;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException("Not enough precision");
        }
    }
}
