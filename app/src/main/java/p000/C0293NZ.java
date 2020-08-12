package p000;

import java.io.InputStream;

/* renamed from: NZ */
public final class C0293NZ implements C0116FW, hda {

    /* renamed from: a */
    public final hda f822a;

    /* renamed from: b */
    public final C0339PZ f823b;

    public C0293NZ(InputStream inputStream, int i, C0317OZ oz) {
        new C0339PZ(i, oz);
        throw null;
    }

    /* renamed from: a */
    public int mo401a() {
        this.f823b.mo1063c(this.f822a.mo401a());
        throw null;
    }

    public int available() {
        return this.f822a.available();
    }

    /* renamed from: b */
    public int mo404b() {
        this.f823b.mo1058a(this.f822a.mo404b());
        throw null;
    }

    /* renamed from: c */
    public int mo245c() {
        this.f822a.mo401a();
        this.f823b.mo1064c();
        throw null;
    }

    /* renamed from: d */
    public int mo246d() {
        this.f822a.mo401a();
        this.f823b.mo1064c();
        throw null;
    }

    public byte readByte() {
        this.f823b.mo1058a(this.f822a.mo404b());
        throw null;
    }

    public double readDouble() {
        readLong();
        throw null;
    }

    public void readFully(byte[] bArr, int i, int i2) {
        this.f822a.readFully(bArr, i, i2);
        this.f823b.mo1060a(bArr, i, i2);
        throw null;
    }

    public int readInt() {
        this.f823b.mo1061b(this.f822a.readInt());
        throw null;
    }

    public long readLong() {
        this.f823b.mo1059a(this.f822a.readLong());
        throw null;
    }

    public short readShort() {
        this.f823b.mo1063c(this.f822a.mo401a());
        throw null;
    }
}
