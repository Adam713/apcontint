package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: Iba */
public final class Iba extends InputStream implements hda {

    /* renamed from: a */
    public int f410a;

    /* renamed from: b */
    public int f411b;

    /* renamed from: c */
    public int f412c;

    /* renamed from: d */
    public boolean f413d;

    /* renamed from: e */
    public Nba f414e;

    /* renamed from: f */
    public C1220cca f415f;

    public Iba(Hba hba) {
        if (hba instanceof Jba) {
            this.f410a = 0;
            this.f411b = 0;
            this.f412c = hba.mo360d();
            this.f413d = false;
            this.f414e = ((Jba) hba).mo646f();
            this.f415f = mo405b(0);
            return;
        }
        throw new IOException("Cannot open internal document storage");
    }

    /* renamed from: a */
    public int mo401a() {
        int i;
        mo402a(2);
        int a = this.f415f.mo1994a();
        if (a > 2) {
            i = this.f415f.mo2003e();
        } else {
            C1220cca b = mo405b(this.f410a + a);
            i = a == 2 ? this.f415f.mo2003e() : b.mo1995a(this.f415f);
            this.f415f = b;
        }
        this.f410a += 2;
        return i;
    }

    /* renamed from: a */
    public final void mo402a(int i) {
        if (this.f413d) {
            throw new IllegalStateException("cannot perform requested operation on a closed stream");
        } else if (i > this.f412c - this.f410a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Buffer underrun - requested ");
            sb.append(i);
            sb.append(" bytes but ");
            sb.append(this.f412c - this.f410a);
            sb.append(" was available");
            throw new RuntimeException(sb.toString());
        }
    }

    public int available() {
        if (!this.f413d) {
            return this.f412c - this.f410a;
        }
        throw new IllegalStateException("cannot perform requested operation on a closed stream");
    }

    /* renamed from: b */
    public int mo404b() {
        mo402a(1);
        int d = this.f415f.mo2002d();
        this.f410a++;
        if (this.f415f.mo1994a() < 1) {
            this.f415f = mo405b(this.f410a);
        }
        return d;
    }

    /* renamed from: b */
    public final C1220cca mo405b(int i) {
        return this.f414e.mo946b(i);
    }

    /* renamed from: c */
    public final boolean mo406c() {
        return this.f410a == this.f412c;
    }

    public void close() {
        this.f413d = true;
    }

    /* renamed from: d */
    public final void mo408d() {
        if (this.f413d) {
            throw new IOException("cannot perform requested operation on a closed stream");
        }
    }

    public void mark(int i) {
        this.f411b = this.f410a;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        mo408d();
        if (mo406c()) {
            return -1;
        }
        int d = this.f415f.mo2002d();
        this.f410a++;
        if (this.f415f.mo1994a() < 1) {
            this.f415f = mo405b(this.f410a);
        }
        return d;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        mo408d();
        if (bArr == null) {
            throw new IllegalArgumentException("buffer must not be null");
        } else if (i < 0 || i2 < 0 || bArr.length < i + i2) {
            throw new IndexOutOfBoundsException("can't read past buffer boundaries");
        } else if (i2 == 0) {
            return 0;
        } else {
            if (mo406c()) {
                return -1;
            }
            int min = Math.min(available(), i2);
            readFully(bArr, i, min);
            return min;
        }
    }

    public byte readByte() {
        return (byte) mo404b();
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public void readFully(byte[] bArr, int i, int i2) {
        mo402a(i2);
        int a = this.f415f.mo1994a();
        if (a > i2) {
            this.f415f.mo1998a(bArr, i, i2);
            this.f410a += i2;
            return;
        }
        while (true) {
            if (i2 <= 0) {
                break;
            }
            boolean z = i2 >= a;
            int i3 = z ? a : i2;
            this.f415f.mo1998a(bArr, i, i3);
            i2 -= i3;
            i += i3;
            this.f410a += i3;
            if (z) {
                int i4 = this.f410a;
                if (i4 != this.f412c) {
                    this.f415f = mo405b(i4);
                    a = this.f415f.mo1994a();
                } else if (i2 <= 0) {
                    this.f415f = null;
                } else {
                    throw new IllegalStateException("reached end of document stream unexpectedly");
                }
            }
        }
    }

    public int readInt() {
        int i;
        mo402a(4);
        int a = this.f415f.mo1994a();
        if (a > 4) {
            i = this.f415f.mo1999b();
        } else {
            C1220cca b = mo405b(this.f410a + a);
            i = a == 4 ? this.f415f.mo1999b() : b.mo1996a(this.f415f, a);
            this.f415f = b;
        }
        this.f410a += 4;
        return i;
    }

    public long readLong() {
        long j;
        mo402a(8);
        int a = this.f415f.mo1994a();
        if (a > 8) {
            j = this.f415f.mo2001c();
        } else {
            C1220cca b = mo405b(this.f410a + a);
            long c = a == 8 ? this.f415f.mo2001c() : b.mo2000b(this.f415f, a);
            this.f415f = b;
            j = c;
        }
        this.f410a += 8;
        return j;
    }

    public short readShort() {
        return (short) mo401a();
    }

    public void reset() {
        this.f410a = this.f411b;
        this.f415f = mo405b(this.f410a);
    }

    public long skip(long j) {
        mo408d();
        if (j < 0) {
            return 0;
        }
        int i = this.f410a;
        int i2 = ((int) j) + i;
        if (i2 < i) {
            i2 = this.f412c;
        } else {
            int i3 = this.f412c;
            if (i2 > i3) {
                i2 = i3;
            }
        }
        long j2 = (long) (i2 - this.f410a);
        this.f410a = i2;
        this.f415f = mo405b(this.f410a);
        return j2;
    }
}
