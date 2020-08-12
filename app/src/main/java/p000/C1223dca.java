package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: dca reason: case insensitive filesystem */
public final class C1223dca extends _ba {

    /* renamed from: b */
    public byte[] f2892b;

    /* renamed from: c */
    public int f2893c;

    public C1223dca(Bba bba) {
        super(bba);
        this.f2892b = new byte[bba.mo84b()];
        Arrays.fill(this.f2892b, -1);
    }

    public C1223dca(InputStream inputStream, Bba bba) {
        this(bba);
        int a = _ca.m1748a(inputStream, this.f2892b);
        if (a == -1) {
            a = 0;
        }
        this.f2893c = a;
    }

    /* renamed from: a */
    public static byte m2588a() {
        return -1;
    }

    /* renamed from: a */
    public static C1220cca m2589a(C1223dca[] dcaArr, int i) {
        if (dcaArr == null || dcaArr.length == 0) {
            return null;
        }
        Bba bba = dcaArr[0].f1798a;
        int c = i >> bba.mo85c();
        return new C1220cca(dcaArr[c].f2892b, i & (bba.mo84b() - 1));
    }

    /* renamed from: a */
    public static C1223dca[] m2590a(Bba bba, byte[] bArr, int i) {
        C1223dca[] dcaArr = new C1223dca[(((i + bba.mo84b()) - 1) / bba.mo84b())];
        int i2 = 0;
        for (int i3 = 0; i3 < dcaArr.length; i3++) {
            dcaArr[i3] = new C1223dca(bba);
            if (i2 < bArr.length) {
                int min = Math.min(bba.mo84b(), bArr.length - i2);
                System.arraycopy(bArr, i2, dcaArr[i3].f2892b, 0, min);
                if (min != bba.mo84b()) {
                    Arrays.fill(dcaArr[i3].f2892b, min, bba.mo84b(), -1);
                }
            } else {
                Arrays.fill(dcaArr[i3].f2892b, -1);
            }
            i2 += bba.mo84b();
        }
        return dcaArr;
    }

    /* renamed from: b */
    public void mo1704b(OutputStream outputStream) {
        mo1821a(outputStream, this.f2892b);
    }

    /* renamed from: b */
    public boolean mo4300b() {
        return this.f2893c != this.f1798a.mo84b();
    }

    /* renamed from: c */
    public int mo4301c() {
        return this.f2893c;
    }
}
