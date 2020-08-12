package p000;

/* renamed from: LZ */
public final class C0253LZ implements jda {

    /* renamed from: a */
    public static final jda f697a = new C0226KZ();

    /* renamed from: b */
    public final jda f698b;

    /* renamed from: c */
    public C0273MZ f699c;

    /* renamed from: d */
    public int f700d = 0;

    public C0253LZ(jda jda, int i) {
        this.f699c = new C0273MZ(jda, i);
        this.f698b = jda;
    }

    /* renamed from: a */
    public static C0253LZ m814a() {
        return new C0253LZ(f697a, -777);
    }

    /* renamed from: a */
    public void mo861a(String str) {
        int i;
        int i2;
        boolean b = qda.m3375b(str);
        if (b) {
            i2 = 1;
            i = 3;
        } else {
            i = 2;
            i2 = 0;
        }
        mo865b(i);
        writeByte(i2);
        mo863a(str, b);
    }

    /* renamed from: a */
    public void mo862a(String str, int i, int i2) {
        int i3;
        int i4;
        boolean b = qda.m3375b(str);
        if (b) {
            i4 = 1;
            i3 = 5;
        } else {
            i3 = 4;
            i4 = 0;
        }
        if (i > 0) {
            i4 |= 8;
            i3 += 2;
        }
        if (i2 > 0) {
            i4 |= 4;
            i3 += 4;
        }
        mo865b(i3);
        writeShort(str.length());
        writeByte(i4);
        if (i > 0) {
            writeShort(i);
        }
        if (i2 > 0) {
            writeInt(i2);
        }
        mo863a(str, b);
    }

    /* renamed from: a */
    public final void mo863a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        if (z) {
            while (true) {
                int min = Math.min(length - i, this.f699c.mo906a() / 2);
                while (min > 0) {
                    int i2 = i + 1;
                    this.f699c.writeShort(str.charAt(i));
                    min--;
                    i = i2;
                }
                if (i < length) {
                    mo868e();
                    writeByte(1);
                } else {
                    return;
                }
            }
        } else {
            int i3 = 0;
            while (true) {
                int min2 = Math.min(length - i3, this.f699c.mo906a() / 1);
                while (min2 > 0) {
                    int i4 = i3 + 1;
                    this.f699c.writeByte(str.charAt(i3));
                    min2--;
                    i3 = i4;
                }
                if (i3 < length) {
                    mo868e();
                    writeByte(0);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public int mo864b() {
        return this.f699c.mo906a();
    }

    /* renamed from: b */
    public void mo865b(int i) {
        if (this.f699c.mo906a() < i) {
            mo868e();
        }
    }

    /* renamed from: c */
    public int mo866c() {
        return this.f700d + this.f699c.mo907b();
    }

    /* renamed from: d */
    public void mo867d() {
        this.f699c.mo908c();
    }

    /* renamed from: e */
    public void mo868e() {
        this.f699c.mo908c();
        this.f700d += this.f699c.mo907b();
        this.f699c = new C0273MZ(this.f698b, 60);
    }

    public void write(byte[] bArr) {
        mo865b(bArr.length);
        this.f699c.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        mo865b(i2);
        this.f699c.write(bArr, i, i2);
    }

    public void writeByte(int i) {
        mo865b(1);
        this.f699c.writeByte(i);
    }

    public void writeDouble(double d) {
        mo865b(8);
        this.f699c.writeDouble(d);
    }

    public void writeInt(int i) {
        mo865b(4);
        this.f699c.writeInt(i);
    }

    public void writeLong(long j) {
        mo865b(8);
        this.f699c.writeLong(j);
    }

    public void writeShort(int i) {
        mo865b(2);
        this.f699c.writeShort(i);
    }
}
