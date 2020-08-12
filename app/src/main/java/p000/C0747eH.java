package p000;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: eH */
public final class C0747eH extends InputStream {

    /* renamed from: a */
    public final InputStream f2894a;

    /* renamed from: b */
    public long f2895b;

    /* renamed from: c */
    public long f2896c;

    /* renamed from: d */
    public long f2897d;

    /* renamed from: e */
    public long f2898e;

    public C0747eH(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public C0747eH(InputStream inputStream, int i) {
        this.f2898e = -1;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, i);
        }
        this.f2894a = inputStream;
    }

    /* renamed from: a */
    public long mo4302a(int i) {
        long j = this.f2895b + ((long) i);
        if (this.f2897d < j) {
            mo4306b(j);
        }
        return this.f2895b;
    }

    /* renamed from: a */
    public void mo4303a(long j) {
        if (this.f2895b > this.f2897d || j < this.f2896c) {
            throw new IOException("Cannot reset");
        }
        this.f2894a.reset();
        mo4304a(this.f2896c, j);
        this.f2895b = j;
    }

    /* renamed from: a */
    public final void mo4304a(long j, long j2) {
        while (j < j2) {
            long skip = this.f2894a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public int available() {
        return this.f2894a.available();
    }

    /* renamed from: b */
    public final void mo4306b(long j) {
        try {
            if (this.f2896c >= this.f2895b || this.f2895b > this.f2897d) {
                this.f2896c = this.f2895b;
                this.f2894a.mark((int) (j - this.f2895b));
            } else {
                this.f2894a.reset();
                this.f2894a.mark((int) (j - this.f2896c));
                mo4304a(this.f2896c, this.f2895b);
            }
            this.f2897d = j;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to mark: ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void close() {
        this.f2894a.close();
    }

    public void mark(int i) {
        this.f2898e = mo4302a(i);
    }

    public boolean markSupported() {
        return this.f2894a.markSupported();
    }

    public int read() {
        int read = this.f2894a.read();
        if (read != -1) {
            this.f2895b++;
        }
        return read;
    }

    public int read(byte[] bArr) {
        int read = this.f2894a.read(bArr);
        if (read != -1) {
            this.f2895b += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.f2894a.read(bArr, i, i2);
        if (read != -1) {
            this.f2895b += (long) read;
        }
        return read;
    }

    public void reset() {
        mo4303a(this.f2898e);
    }

    public long skip(long j) {
        long skip = this.f2894a.skip(j);
        this.f2895b += skip;
        return skip;
    }
}
