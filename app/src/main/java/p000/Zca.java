package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Zca */
public class Zca {
    /* renamed from: a */
    public static void m1645a(InputStream inputStream) {
        int read;
        do {
            read = inputStream.read();
            if (read == -1 || read == 10) {
                return;
            }
        } while (read != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0009, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m1646a(InputStream r8, int r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            r3 = 0
            r4 = 0
        L_0x0009:
            if (r2 != 0) goto L_0x0050
            int r5 = r8.read()
            r6 = 97
            if (r5 != r9) goto L_0x0014
            goto L_0x0050
        L_0x0014:
            r7 = -1
            if (r5 == r7) goto L_0x004e
            r7 = 35
            if (r5 == r7) goto L_0x004a
            r7 = 2
            switch(r5) {
                case 48: goto L_0x003d;
                case 49: goto L_0x003d;
                case 50: goto L_0x003d;
                case 51: goto L_0x003d;
                case 52: goto L_0x003d;
                case 53: goto L_0x003d;
                case 54: goto L_0x003d;
                case 55: goto L_0x003d;
                case 56: goto L_0x003d;
                case 57: goto L_0x003d;
                default: goto L_0x001f;
            }
        L_0x001f:
            switch(r5) {
                case 65: goto L_0x0026;
                case 66: goto L_0x0026;
                case 67: goto L_0x0026;
                case 68: goto L_0x0026;
                case 69: goto L_0x0026;
                case 70: goto L_0x0026;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r5) {
                case 97: goto L_0x0028;
                case 98: goto L_0x0028;
                case 99: goto L_0x0028;
                case 100: goto L_0x0028;
                case 101: goto L_0x0028;
                case 102: goto L_0x0028;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0009
        L_0x0026:
            r6 = 65
        L_0x0028:
            int r3 = r3 << 4
            byte r3 = (byte) r3
            int r5 = r5 + 10
            int r5 = r5 - r6
            byte r5 = (byte) r5
            int r3 = r3 + r5
            byte r3 = (byte) r3
            int r4 = r4 + 1
            if (r4 != r7) goto L_0x0009
        L_0x0035:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r0.add(r3)
            goto L_0x0007
        L_0x003d:
            int r3 = r3 << 4
            byte r3 = (byte) r3
            int r5 = r5 + -48
            byte r5 = (byte) r5
            int r3 = r3 + r5
            byte r3 = (byte) r3
            int r4 = r4 + 1
            if (r4 != r7) goto L_0x0009
            goto L_0x0035
        L_0x004a:
            m1645a(r8)
            goto L_0x0009
        L_0x004e:
            r2 = 1
            goto L_0x0009
        L_0x0050:
            java.lang.Byte[] r8 = new java.lang.Byte[r1]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.Byte[] r8 = (java.lang.Byte[]) r8
            int r9 = r8.length
            byte[] r9 = new byte[r9]
        L_0x005b:
            int r0 = r8.length
            if (r1 >= r0) goto L_0x0069
            r0 = r8[r1]
            byte r0 = r0.byteValue()
            r9[r1] = r0
            int r1 = r1 + 1
            goto L_0x005b
        L_0x0069:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Zca.m1646a(java.io.InputStream, int):byte[]");
    }

    /* renamed from: a */
    public static byte[] m1647a(String str) {
        try {
            return m1646a(new ByteArrayInputStream(str.getBytes()), -1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
