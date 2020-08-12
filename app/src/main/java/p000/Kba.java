package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: Kba */
public final class Kba extends OutputStream {

    /* renamed from: a */
    public final OutputStream f591a;

    /* renamed from: b */
    public final int f592b;

    /* renamed from: c */
    public int f593c = 0;

    public Kba(OutputStream outputStream, int i) {
        this.f591a = outputStream;
        this.f592b = i;
    }

    /* renamed from: a */
    public final void mo744a(int i) {
        int i2 = this.f593c;
        if (i2 + i <= this.f592b) {
            this.f593c = i2 + i;
            return;
        }
        throw new IOException("tried to write too much data");
    }

    /* renamed from: a */
    public void mo745a(int i, byte b) {
        int i2 = this.f593c;
        if (i > i2) {
            byte[] bArr = new byte[(i - i2)];
            Arrays.fill(bArr, b);
            this.f591a.write(bArr);
        }
    }

    public void close() {
    }

    public void flush() {
        this.f591a.flush();
    }

    public void write(int i) {
        mo744a(1);
        this.f591a.write(i);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        mo744a(i2);
        this.f591a.write(bArr, i, i2);
    }
}
