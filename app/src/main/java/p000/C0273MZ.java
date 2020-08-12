package p000;

/* renamed from: MZ */
public final class C0273MZ implements jda {

    /* renamed from: a */
    public final jda f740a;

    /* renamed from: b */
    public final jda f741b;

    /* renamed from: c */
    public final byte[] f742c;

    /* renamed from: d */
    public jda f743d;

    /* renamed from: e */
    public int f744e;

    public C0273MZ(jda jda, int i) {
        this.f740a = jda;
        jda.writeShort(i);
        if (jda instanceof Wca) {
            this.f741b = ((Wca) jda).mo734a(2);
            this.f742c = null;
        } else {
            this.f741b = jda;
            this.f742c = new byte[8224];
            jda = new fda(this.f742c, 0);
        }
        this.f743d = jda;
    }

    /* renamed from: a */
    public int mo906a() {
        if (this.f743d != null) {
            return 8224 - this.f744e;
        }
        throw new IllegalStateException("Record already terminated");
    }

    /* renamed from: b */
    public int mo907b() {
        return this.f744e + 4;
    }

    /* renamed from: c */
    public void mo908c() {
        if (this.f743d != null) {
            this.f741b.writeShort(this.f744e);
            byte[] bArr = this.f742c;
            if (bArr != null) {
                this.f740a.write(bArr, 0, this.f744e);
                this.f743d = null;
                return;
            }
            this.f743d = null;
            return;
        }
        throw new IllegalStateException("Record already terminated");
    }

    public void write(byte[] bArr) {
        this.f743d.write(bArr);
        this.f744e += bArr.length;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f743d.write(bArr, i, i2);
        this.f744e += i2;
    }

    public void writeByte(int i) {
        this.f743d.writeByte(i);
        this.f744e++;
    }

    public void writeDouble(double d) {
        this.f743d.writeDouble(d);
        this.f744e += 8;
    }

    public void writeInt(int i) {
        this.f743d.writeInt(i);
        this.f744e += 4;
    }

    public void writeLong(long j) {
        this.f743d.writeLong(j);
        this.f744e += 8;
    }

    public void writeShort(int i) {
        this.f743d.writeShort(i);
        this.f744e += 2;
    }
}
