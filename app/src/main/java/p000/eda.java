package p000;

import com.itextpdf.xmp.impl.Base64;

/* renamed from: eda */
public final class eda implements hda {

    /* renamed from: a */
    public final byte[] f2935a;

    /* renamed from: b */
    public final int f2936b;

    /* renamed from: c */
    public int f2937c;

    public eda(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public eda(byte[] bArr, int i, int i2) {
        this.f2935a = bArr;
        this.f2937c = i;
        this.f2936b = i + i2;
    }

    /* renamed from: a */
    public int mo401a() {
        mo4343a(2);
        int i = this.f2937c;
        byte[] bArr = this.f2935a;
        int i2 = i + 1;
        byte b = bArr[i] & Base64.INVALID;
        byte b2 = bArr[i2] & Base64.INVALID;
        this.f2937c = i2 + 1;
        return (b2 << 8) + (b << 0);
    }

    /* renamed from: a */
    public final void mo4343a(int i) {
        if (i > this.f2936b - this.f2937c) {
            throw new RuntimeException("Buffer overrun");
        }
    }

    public int available() {
        return this.f2936b - this.f2937c;
    }

    /* renamed from: b */
    public int mo404b() {
        mo4343a(1);
        byte[] bArr = this.f2935a;
        int i = this.f2937c;
        this.f2937c = i + 1;
        return bArr[i] & Base64.INVALID;
    }

    public byte readByte() {
        mo4343a(1);
        byte[] bArr = this.f2935a;
        int i = this.f2937c;
        this.f2937c = i + 1;
        return bArr[i];
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public void readFully(byte[] bArr, int i, int i2) {
        mo4343a(i2);
        System.arraycopy(this.f2935a, this.f2937c, bArr, i, i2);
        this.f2937c += i2;
    }

    public int readInt() {
        mo4343a(4);
        int i = this.f2937c;
        byte[] bArr = this.f2935a;
        int i2 = i + 1;
        byte b = bArr[i] & Base64.INVALID;
        int i3 = i2 + 1;
        byte b2 = bArr[i2] & Base64.INVALID;
        int i4 = i3 + 1;
        byte b3 = bArr[i3] & Base64.INVALID;
        byte b4 = bArr[i4] & Base64.INVALID;
        this.f2937c = i4 + 1;
        return (b4 << 24) + (b3 << 16) + (b2 << 8) + (b << 0);
    }

    public long readLong() {
        mo4343a(8);
        int i = this.f2937c;
        byte[] bArr = this.f2935a;
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
        this.f2937c = i8 + 1;
        return (((long) b8) << 56) + (((long) b7) << 48) + (((long) b6) << 40) + (((long) b5) << 32) + (((long) b4) << 24) + ((long) (b3 << 16)) + ((long) (b2 << 8)) + ((long) (b << 0));
    }

    public short readShort() {
        return (short) mo401a();
    }
}
