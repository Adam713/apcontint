package p000;

import java.util.List;

/* renamed from: gX */
public final class C0805gX extends C0016AW {
    /* renamed from: a */
    public static int m2728a(int i) {
        return i + ((((i - 1) / 8224) + 1) * 4);
    }

    /* renamed from: a */
    public int mo162a(int i, byte[] bArr) {
        byte[] i2 = mo27i();
        if (mo26h().size() == 0 && i2 != null) {
            return mo4434a(i, bArr, i2);
        }
        byte[] bArr2 = new byte[mo4437k()];
        int i3 = 0;
        for (C0377RV a : mo26h()) {
            i3 += a.mo1145a(i3, bArr2, new C0419TV());
        }
        return mo4434a(i, bArr, bArr2);
    }

    /* renamed from: a */
    public final int mo4434a(int i, byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i2 < bArr2.length) {
            int min = Math.min(bArr2.length - i2, 8224);
            if (i2 / 8224 >= 2) {
                mo4435a(bArr, i3, min);
            } else {
                mo4436b(bArr, i3, min);
            }
            int i5 = i4 + 4;
            int i6 = i3 + 4;
            Sca.m1169a(bArr2, i2, bArr, i6, min);
            i3 = i6 + min;
            i2 += min;
            i4 = i5 + min;
        }
        return i4;
    }

    /* renamed from: a */
    public final void mo4435a(byte[] bArr, int i, int i2) {
        dda.m2599a(bArr, i + 0, 60);
        dda.m2599a(bArr, i + 2, (short) i2);
    }

    /* renamed from: b */
    public final void mo4436b(byte[] bArr, int i, int i2) {
        dda.m2599a(bArr, i + 0, mo34e());
        dda.m2599a(bArr, i + 2, (short) i2);
    }

    /* renamed from: c */
    public int mo163c() {
        return m2728a(mo4437k());
    }

    /* renamed from: e */
    public short mo34e() {
        return 235;
    }

    /* renamed from: j */
    public String mo28j() {
        return "MSODRAWINGGROUP";
    }

    /* renamed from: k */
    public final int mo4437k() {
        List<C0377RV> h = mo26h();
        byte[] i = mo27i();
        if (h.size() == 0 && i != null) {
            return i.length;
        }
        int i2 = 0;
        for (C0377RV a : h) {
            i2 += a.mo1144a();
        }
        return i2;
    }
}
