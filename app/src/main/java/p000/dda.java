package p000;

import com.itextpdf.xmp.impl.Base64;

/* renamed from: dda */
public class dda implements gda {
    /* renamed from: a */
    public static double m2594a(byte[] bArr, int i) {
        return Double.longBitsToDouble(m2602c(bArr, i));
    }

    /* renamed from: a */
    public static int m2595a(byte[] bArr) {
        return m2605f(bArr, 0);
    }

    /* renamed from: a */
    public static void m2596a(byte[] bArr, int i, double d) {
        m2598a(bArr, i, Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public static void m2597a(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) ((i2 >>> 0) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        bArr[i5] = (byte) ((i2 >>> 24) & 255);
    }

    /* renamed from: a */
    public static void m2598a(byte[] bArr, int i, long j) {
        int i2 = i + 8;
        while (i < i2) {
            bArr[i] = (byte) ((int) (255 & j));
            j >>= 8;
            i++;
        }
    }

    /* renamed from: a */
    public static void m2599a(byte[] bArr, int i, short s) {
        int i2 = i + 1;
        bArr[i] = (byte) ((s >>> 0) & 255);
        bArr[i2] = (byte) ((s >>> 8) & 255);
    }

    /* renamed from: a */
    public static void m2600a(byte[] bArr, short s) {
        m2599a(bArr, 0, s);
    }

    /* renamed from: b */
    public static int m2601b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((bArr[i3 + 1] & Base64.INVALID) << 24) + ((bArr[i3] & Base64.INVALID) << 16) + ((bArr[i2] & Base64.INVALID) << 8) + ((bArr[i] & Base64.INVALID) << 0);
    }

    /* renamed from: c */
    public static long m2602c(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = (i + 8) - 1; i2 >= i; i2--) {
            j = (j << 8) | ((long) (bArr[i2] & Base64.INVALID));
        }
        return j;
    }

    /* renamed from: d */
    public static short m2603d(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & Base64.INVALID) << 8) + ((bArr[i] & Base64.INVALID) << 0));
    }

    /* renamed from: e */
    public static long m2604e(byte[] bArr, int i) {
        return ((long) m2601b(bArr, i)) & -1;
    }

    /* renamed from: f */
    public static int m2605f(byte[] bArr, int i) {
        return ((bArr[i + 1] & Base64.INVALID) << 8) + ((bArr[i] & Base64.INVALID) << 0);
    }
}
