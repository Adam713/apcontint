package p000;

/* renamed from: Yca */
public class Yca {

    /* renamed from: a */
    public static final String f1640a = System.getProperty("line.separator");

    /* renamed from: b */
    public static final char[] f1641b = "0123456789ABCDEF".toCharArray();

    /* renamed from: c */
    public static final int[] f1642c = {60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0};

    /* renamed from: a */
    public static String m1590a(byte b) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.setLength(0);
        for (int i = 0; i < 2; i++) {
            stringBuffer.append(f1641b[(b >> f1642c[i + 6]) & 15]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m1591a(long j) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.setLength(0);
        for (int i = 0; i < 8; i++) {
            char[] cArr = f1641b;
            int[] iArr = f1642c;
            stringBuffer.append(cArr[((int) (j >> iArr[(iArr.length + i) - 8])) & 15]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m1592a(long j, int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(f1641b[(int) ((j >> f1642c[(16 - i) + i2]) & 15)]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m1593a(short s) {
        return m1592a((long) s, 4);
    }

    /* renamed from: a */
    public static String m1594a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(m1597b(bArr[i]));
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m1595a(byte[] bArr, long j, int i) {
        if (i < 0 || i >= bArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("illegal index: ");
            sb.append(i);
            sb.append(" into array of length ");
            sb.append(bArr.length);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        long j2 = j + ((long) i);
        StringBuffer stringBuffer = new StringBuffer(74);
        while (i < bArr.length) {
            int length = bArr.length - i;
            if (length > 16) {
                length = 16;
            }
            stringBuffer.append(m1591a(j2));
            stringBuffer.append(' ');
            int i2 = 0;
            while (i2 < 16) {
                stringBuffer.append(i2 < length ? m1590a(bArr[i2 + i]) : "  ");
                stringBuffer.append(' ');
                i2++;
            }
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = i3 + i;
                stringBuffer.append((bArr[i4] < 32 || bArr[i4] >= Byte.MAX_VALUE) ? '.' : (char) bArr[i4]);
            }
            stringBuffer.append(f1640a);
            j2 += (long) length;
            i += 16;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static char[] m1596a(int i) {
        return m1600b((long) i, 1);
    }

    /* renamed from: b */
    public static String m1597b(byte b) {
        return m1592a((long) b, 2);
    }

    /* renamed from: b */
    public static char[] m1598b(int i) {
        return m1600b((long) i, 4);
    }

    /* renamed from: b */
    public static char[] m1599b(long j) {
        return m1600b(j, 8);
    }

    /* renamed from: b */
    public static char[] m1600b(long j, int i) {
        int i2 = (i * 2) + 2;
        char[] cArr = new char[i2];
        do {
            i2--;
            cArr[i2] = f1641b[(int) (15 & j)];
            j >>>= 4;
        } while (i2 > 1);
        cArr[0] = '0';
        cArr[1] = 'x';
        return cArr;
    }

    /* renamed from: c */
    public static String m1601c(long j) {
        return m1592a(j, 16);
    }

    /* renamed from: c */
    public static char[] m1602c(int i) {
        return m1600b((long) i, 2);
    }

    /* renamed from: d */
    public static String m1603d(int i) {
        return m1592a((long) i, 8);
    }
}
