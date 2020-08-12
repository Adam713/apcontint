package p000;

import java.io.OutputStream;

/* renamed from: mW */
public class C0930mW {
    /* renamed from: a */
    public static int m3081a(OutputStream outputStream, double d) {
        byte[] bArr = new byte[8];
        dda.m2596a(bArr, 0, d);
        outputStream.write(bArr, 0, 8);
        return 8;
    }

    /* renamed from: a */
    public static int m3082a(OutputStream outputStream, int i) {
        byte[] bArr = new byte[4];
        dda.m2597a(bArr, 0, i);
        outputStream.write(bArr, 0, 4);
        return 4;
    }

    /* renamed from: a */
    public static int m3083a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8];
        dda.m2598a(bArr, 0, j);
        outputStream.write(bArr, 0, 8);
        return 8;
    }

    /* renamed from: a */
    public static int m3084a(OutputStream outputStream, C0446UV uv) {
        byte[] bArr = new byte[16];
        uv.mo1312b(bArr, 0);
        outputStream.write(bArr, 0, bArr.length);
        return bArr.length;
    }

    /* renamed from: a */
    public static int m3085a(OutputStream outputStream, short s) {
        byte[] bArr = new byte[2];
        dda.m2599a(bArr, 0, s);
        outputStream.write(bArr, 0, 2);
        return 2;
    }

    /* renamed from: b */
    public static int m3086b(OutputStream outputStream, long j) {
        long j2 = j & -4294967296L;
        if (j2 == 0 || j2 == -4294967296L) {
            return m3082a(outputStream, (int) j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Value ");
        sb.append(j);
        sb.append(" cannot be represented by 4 bytes.");
        throw new C0534YV(sb.toString());
    }
}
