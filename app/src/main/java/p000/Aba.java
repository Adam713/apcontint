package p000;

/* renamed from: Aba */
public final class Aba {
    /* renamed from: a */
    public static double m48a(int i) {
        long j = ((long) i) >> 2;
        double longBitsToDouble = (i & 2) == 2 ? (double) j : Double.longBitsToDouble(j << 34);
        return (i & 1) == 1 ? longBitsToDouble / 100.0d : longBitsToDouble;
    }
}
