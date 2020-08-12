package p000;

import java.util.Collection;
import java.util.Date;

/* renamed from: pW */
public class C0999pW {
    /* renamed from: a */
    public static long m3300a(Date date) {
        return (date.getTime() + 11644473600000L) * 10000;
    }

    /* renamed from: a */
    public static Date m3301a(int i, int i2) {
        return m3302a((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* renamed from: a */
    public static Date m3302a(long j) {
        return new Date((j / 10000) - 11644473600000L);
    }

    /* renamed from: a */
    public static boolean m3303a(Collection<?> collection, Collection<?> collection2) {
        return m3309b(collection.toArray(), collection2.toArray());
    }

    /* renamed from: a */
    public static boolean m3304a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m3305a(Object[] objArr, Object[] objArr2) {
        return m3309b((Object[]) objArr.clone(), (Object[]) objArr2.clone());
    }

    /* renamed from: a */
    public static byte[] m3306a(byte[] bArr) {
        int length = bArr.length % 4;
        if (length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[(bArr.length + (4 - length))];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public static char[] m3307a(String str) {
        return m3308a(str.toCharArray());
    }

    /* renamed from: a */
    public static char[] m3308a(char[] cArr) {
        int length = cArr.length % 4;
        if (length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[(cArr.length + (4 - length))];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    /* renamed from: b */
    public static boolean m3309b(Object[] objArr, Object[] objArr2) {
        for (Object obj : objArr) {
            boolean z = false;
            int i = 0;
            while (!z && i < objArr.length) {
                if (obj.equals(objArr2[i])) {
                    objArr2[i] = null;
                    z = true;
                }
                i++;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
