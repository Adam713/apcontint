package p000;

import com.itextpdf.xmp.impl.Base64;
import java.io.InputStream;

/* renamed from: qY */
public final class C1020qY implements hda {

    /* renamed from: a */
    public static final byte[] f3630a = new byte[0];

    /* renamed from: b */
    public final C0116FW f3631b;

    /* renamed from: c */
    public final hda f3632c;

    /* renamed from: d */
    public int f3633d;

    /* renamed from: e */
    public int f3634e;

    /* renamed from: f */
    public int f3635f;

    /* renamed from: g */
    public int f3636g;

    /* renamed from: qY$a */
    public static final class C1021a extends RuntimeException {
        public C1021a(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Initialisation of record 0x");
            sb.append(Integer.toHexString(i).toUpperCase());
            sb.append(" left ");
            sb.append(i2);
            sb.append(" bytes remaining still to be read.");
            super(sb.toString());
        }
    }

    /* renamed from: qY$b */
    private static final class C1022b implements C0116FW {

        /* renamed from: a */
        public final hda f3637a;

        public C1022b(InputStream inputStream) {
            this.f3637a = C1020qY.m3340a(inputStream);
        }

        public int available() {
            return this.f3637a.available();
        }

        /* renamed from: c */
        public int mo245c() {
            return this.f3637a.mo401a();
        }

        /* renamed from: d */
        public int mo246d() {
            return this.f3637a.mo401a();
        }
    }

    public C1020qY(InputStream inputStream) {
        this(inputStream, null, 0);
    }

    public C1020qY(InputStream inputStream, C0317OZ oz, int i) {
        if (oz == null) {
            this.f3632c = m3340a(inputStream);
            this.f3631b = new C1022b(inputStream);
            this.f3635f = mo5038g();
            return;
        }
        new C0293NZ(inputStream, i, oz);
        throw null;
    }

    /* renamed from: a */
    public static hda m3340a(InputStream inputStream) {
        return inputStream instanceof hda ? (hda) inputStream : new ida(inputStream);
    }

    /* renamed from: a */
    public int mo401a() {
        mo5032a(2);
        this.f3636g += 2;
        return this.f3632c.mo401a();
    }

    /* renamed from: a */
    public final void mo5032a(int i) {
        int i2 = mo5040i();
        if (i2 < i) {
            if (i2 != 0 || !mo5036e()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Not enough data (");
                sb.append(i2);
                sb.append(") to read requested (");
                sb.append(i);
                sb.append(") bytes");
                throw new C1001pY(sb.toString());
            }
            mo5037f();
        }
    }

    /* renamed from: a */
    public void mo5033a(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    public int available() {
        return mo5040i();
    }

    /* renamed from: b */
    public int mo404b() {
        return readByte() & Base64.INVALID;
    }

    /* renamed from: c */
    public short mo5034c() {
        return (short) this.f3633d;
    }

    /* renamed from: d */
    public boolean mo5035d() {
        int i = this.f3634e;
        if (i == -1 || i == this.f3636g) {
            if (this.f3634e != -1) {
                this.f3635f = mo5038g();
            }
            return this.f3635f != -1;
        }
        throw new C1021a(this.f3633d, mo5040i());
    }

    /* renamed from: e */
    public final boolean mo5036e() {
        int i = this.f3634e;
        if (i == -1 || this.f3636g == i) {
            boolean z = false;
            if (!mo5035d()) {
                return false;
            }
            if (this.f3635f == 60) {
                z = true;
            }
            return z;
        }
        throw new IllegalStateException("Should never be called before end of current record");
    }

    /* renamed from: f */
    public void mo5037f() {
        int i = this.f3635f;
        if (i == -1) {
            throw new IllegalStateException("EOF - next record not available");
        } else if (this.f3634e == -1) {
            this.f3633d = i;
            this.f3636g = 0;
            this.f3634e = this.f3631b.mo245c();
            if (this.f3634e > 8224) {
                throw new C1001pY("The content of an excel record cannot exceed 8224 bytes");
            }
        } else {
            throw new IllegalStateException("Cannot call nextRecord() without checking hasNextRecord() first");
        }
    }

    /* renamed from: g */
    public final int mo5038g() {
        if (this.f3631b.available() < 4) {
            return -1;
        }
        int d = this.f3631b.mo246d();
        if (d != -1) {
            this.f3634e = -1;
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Found invalid sid (");
        sb.append(d);
        sb.append(")");
        throw new C1001pY(sb.toString());
    }

    /* renamed from: h */
    public byte[] mo5039h() {
        int i = mo5040i();
        if (i == 0) {
            return f3630a;
        }
        byte[] bArr = new byte[i];
        mo5033a(bArr);
        return bArr;
    }

    /* renamed from: i */
    public int mo5040i() {
        int i = this.f3634e;
        if (i == -1) {
            return 0;
        }
        return i - this.f3636g;
    }

    public byte readByte() {
        mo5032a(1);
        this.f3636g++;
        return this.f3632c.readByte();
    }

    public double readDouble() {
        double longBitsToDouble = Double.longBitsToDouble(readLong());
        if (!Double.isNaN(longBitsToDouble)) {
            return longBitsToDouble;
        }
        throw new RuntimeException("Did not expect to read NaN");
    }

    public void readFully(byte[] bArr, int i, int i2) {
        mo5032a(i2);
        this.f3632c.readFully(bArr, i, i2);
        this.f3636g += i2;
    }

    public int readInt() {
        mo5032a(4);
        this.f3636g += 4;
        return this.f3632c.readInt();
    }

    public long readLong() {
        mo5032a(8);
        this.f3636g += 8;
        return this.f3632c.readLong();
    }

    public short readShort() {
        mo5032a(2);
        this.f3636g += 2;
        return this.f3632c.readShort();
    }
}
