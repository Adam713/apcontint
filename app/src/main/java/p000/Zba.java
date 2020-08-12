package p000;

import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: Zba */
public final class Zba extends _ba {

    /* renamed from: b */
    public cda[] f1702b;

    /* renamed from: c */
    public byte[] f1703c;

    public Zba(Bba bba) {
        super(bba);
        int a = bba.mo83a();
        this.f1703c = new byte[bba.mo84b()];
        Arrays.fill(this.f1703c, -1);
        this.f1702b = new cda[a];
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            this.f1702b[i2] = new cda(i);
            i += 4;
        }
    }

    public Zba(Bba bba, int[] iArr, int i, int i2) {
        this(bba);
        for (int i3 = i; i3 < i2; i3++) {
            this.f1702b[i3 - i].mo2005a(iArr[i3], this.f1703c);
        }
    }

    /* renamed from: a */
    public static int m1639a(Bba bba, int i) {
        int a = bba.mo83a();
        return ((i + a) - 1) / a;
    }

    /* renamed from: a */
    public static Zba[] m1640a(Bba bba, int[] iArr) {
        Zba[] zbaArr = new Zba[m1639a(bba, iArr.length)];
        int length = iArr.length;
        int a = bba.mo83a();
        int i = 0;
        int i2 = length;
        int i3 = 0;
        while (i < iArr.length) {
            int i4 = i3 + 1;
            zbaArr[i3] = new Zba(bba, iArr, i, i2 > a ? i + a : iArr.length);
            i2 -= a;
            i += a;
            i3 = i4;
        }
        return zbaArr;
    }

    /* renamed from: a */
    public static Zba[] m1641a(Bba bba, int[] iArr, int i) {
        int b = m1642b(bba, iArr.length);
        Zba[] zbaArr = new Zba[b];
        int length = iArr.length;
        int e = bba.mo87e();
        if (b != 0) {
            int i2 = 0;
            int i3 = length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < iArr.length) {
                int i6 = i5 + 1;
                zbaArr[i5] = new Zba(bba, iArr, i4, i3 > e ? i4 + e : iArr.length);
                i3 -= e;
                i4 += e;
                i5 = i6;
            }
            while (i2 < zbaArr.length - 1) {
                zbaArr[i2].mo1705c(bba, i + i2 + 1);
                i2++;
            }
            zbaArr[i2].mo1705c(bba, -2);
        }
        return zbaArr;
    }

    /* renamed from: b */
    public static int m1642b(Bba bba, int i) {
        int e = bba.mo87e();
        return ((i + e) - 1) / e;
    }

    /* renamed from: b */
    public void mo1704b(OutputStream outputStream) {
        mo1821a(outputStream, this.f1703c);
    }

    /* renamed from: c */
    public final void mo1705c(Bba bba, int i) {
        this.f1702b[bba.mo87e()].mo2005a(i, this.f1703c);
    }
}
