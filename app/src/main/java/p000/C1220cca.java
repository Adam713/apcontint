package p000;

import com.itextpdf.xmp.impl.Base64;

/* renamed from: cca reason: case insensitive filesystem */
public final class C1220cca {

    /* renamed from: a */
    public final byte[] f1970a;

    /* renamed from: b */
    public int f1971b;

    /* renamed from: c */
    public int f1972c = this.f1970a.length;

    public C1220cca(byte[] bArr, int i) {
        this.f1970a = bArr;
        this.f1971b = i;
    }

    /* renamed from: a */
    public int mo1994a() {
        return this.f1972c - this.f1971b;
    }

    /* renamed from: a */
    public int mo1995a(C1220cca cca) {
        byte[] bArr = cca.f1970a;
        byte b = bArr[bArr.length - 1] & Base64.INVALID;
        byte[] bArr2 = this.f1970a;
        int i = this.f1971b;
        this.f1971b = i + 1;
        return ((bArr2[i] & Base64.INVALID) << 8) + (b << 0);
    }

    /* renamed from: a */
    public int mo1996a(C1220cca cca, int i) {
        byte[] bArr = new byte[4];
        mo1997a(cca, i, bArr);
        return ((bArr[3] & Base64.INVALID) << 24) + ((bArr[2] & Base64.INVALID) << 16) + ((bArr[1] & Base64.INVALID) << 8) + ((bArr[0] & Base64.INVALID) << 0);
    }

    /* renamed from: a */
    public final void mo1997a(C1220cca cca, int i, byte[] bArr) {
        System.arraycopy(cca.f1970a, cca.f1971b, bArr, 0, i);
        int length = bArr.length - i;
        System.arraycopy(this.f1970a, 0, bArr, i, length);
        this.f1971b = length;
    }

    /* renamed from: a */
    public void mo1998a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f1970a, this.f1971b, bArr, i, i2);
        this.f1971b += i2;
    }

    /* renamed from: b */
    public int mo1999b() {
        int i = this.f1971b;
        byte[] bArr = this.f1970a;
        int i2 = i + 1;
        byte b = bArr[i] & Base64.INVALID;
        int i3 = i2 + 1;
        byte b2 = bArr[i2] & Base64.INVALID;
        int i4 = i3 + 1;
        byte b3 = bArr[i3] & Base64.INVALID;
        byte b4 = bArr[i4] & Base64.INVALID;
        this.f1971b = i4 + 1;
        return (b4 << 24) + (b3 << 16) + (b2 << 8) + (b << 0);
    }

    /* renamed from: b */
    public long mo2000b(C1220cca cca, int i) {
        byte[] bArr = new byte[8];
        mo1997a(cca, i, bArr);
        return (((long) (bArr[7] & Base64.INVALID)) << 56) + (((long) (bArr[6] & Base64.INVALID)) << 48) + (((long) (bArr[5] & Base64.INVALID)) << 40) + (((long) (bArr[4] & Base64.INVALID)) << 32) + (((long) (bArr[3] & Base64.INVALID)) << 24) + ((long) ((bArr[2] & Base64.INVALID) << 16)) + ((long) ((bArr[1] & Base64.INVALID) << 8)) + ((long) ((bArr[0] & Base64.INVALID) << 0));
    }

    /* renamed from: c */
    public long mo2001c() {
        int i = this.f1971b;
        byte[] bArr = this.f1970a;
        int i2 = i + 1;
        byte b = bArr[i] & Base64.INVALID;
        int i3 = i2 + 1;
        byte b2 = bArr[i2] & Base64.INVALID;
        int i4 = i3 + 1;
        byte b3 = bArr[i3] & Base64.INVALID;
        int i5 = i4 + 1;
        byte b4 = bArr[i4] & Base64.INVALID;
        int i6 = i5 + 1;
        byte b5 = bArr[i5] & Base64.INVALID;
        int i7 = i6 + 1;
        byte b6 = bArr[i6] & Base64.INVALID;
        int i8 = i7 + 1;
        byte b7 = bArr[i7] & Base64.INVALID;
        byte b8 = bArr[i8] & Base64.INVALID;
        this.f1971b = i8 + 1;
        return (((long) b8) << 56) + (((long) b7) << 48) + (((long) b6) << 40) + (((long) b5) << 32) + (((long) b4) << 24) + ((long) (b3 << 16)) + ((long) (b2 << 8)) + ((long) (b << 0));
    }

    /* renamed from: d */
    public int mo2002d() {
        byte[] bArr = this.f1970a;
        int i = this.f1971b;
        this.f1971b = i + 1;
        return bArr[i] & Base64.INVALID;
    }

    /* renamed from: e */
    public int mo2003e() {
        int i = this.f1971b;
        byte[] bArr = this.f1970a;
        int i2 = i + 1;
        byte b = bArr[i] & Base64.INVALID;
        byte b2 = bArr[i2] & Base64.INVALID;
        this.f1971b = i2 + 1;
        return (b2 << 8) + (b << 0);
    }
}
