package p000;

import java.io.InputStream;

/* renamed from: _ca */
public final class _ca {
    /* renamed from: a */
    public static int m1748a(InputStream inputStream, byte[] bArr) {
        return m1749a(inputStream, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static int m1749a(InputStream inputStream, byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                if (i3 == 0) {
                    i3 = -1;
                }
                return i3;
            }
            i3 += read;
        } while (i3 != i2);
        return i3;
    }
}
