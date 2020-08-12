package p000;

/* renamed from: fda */
public final class fda implements jda, Wca {

    /* renamed from: a */
    public final byte[] f3004a;

    /* renamed from: b */
    public final int f3005b;

    /* renamed from: c */
    public int f3006c;

    public fda(byte[] bArr, int i) {
        this(bArr, i, bArr.length - i);
    }

    public fda(byte[] bArr, int i, int i2) {
        String str = ")";
        if (i < 0 || i > bArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Specified startOffset (");
            sb.append(i);
            sb.append(") is out of allowable range (0..");
            sb.append(bArr.length);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f3004a = bArr;
        this.f3006c = i;
        this.f3005b = i2 + i;
        int i3 = this.f3005b;
        if (i3 < i || i3 > bArr.length) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("calculated end index (");
            sb2.append(this.f3005b);
            sb2.append(") is out of allowable range (");
            sb2.append(this.f3006c);
            sb2.append("..");
            sb2.append(bArr.length);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public int mo4400a() {
        return this.f3006c;
    }

    /* renamed from: a */
    public jda mo734a(int i) {
        mo4401b(i);
        fda fda = new fda(this.f3004a, this.f3006c, i);
        this.f3006c += i;
        return fda;
    }

    /* renamed from: b */
    public final void mo4401b(int i) {
        if (i > this.f3005b - this.f3006c) {
            throw new RuntimeException("Buffer overrun");
        }
    }

    public void write(byte[] bArr) {
        int length = bArr.length;
        mo4401b(length);
        System.arraycopy(bArr, 0, this.f3004a, this.f3006c, length);
        this.f3006c += length;
    }

    public void write(byte[] bArr, int i, int i2) {
        mo4401b(i2);
        System.arraycopy(bArr, i, this.f3004a, this.f3006c, i2);
        this.f3006c += i2;
    }

    public void writeByte(int i) {
        mo4401b(1);
        byte[] bArr = this.f3004a;
        int i2 = this.f3006c;
        this.f3006c = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void writeDouble(double d) {
        writeLong(Double.doubleToLongBits(d));
    }

    public void writeInt(int i) {
        mo4401b(4);
        int i2 = this.f3006c;
        byte[] bArr = this.f3004a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 0) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i >>> 24) & 255);
        this.f3006c = i6;
    }

    public void writeLong(long j) {
        writeInt((int) (j >> 0));
        writeInt((int) (j >> 32));
    }

    public void writeShort(int i) {
        mo4401b(2);
        int i2 = this.f3006c;
        byte[] bArr = this.f3004a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 0) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        this.f3006c = i4;
    }
}
