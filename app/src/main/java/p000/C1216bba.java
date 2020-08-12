package p000;

/* renamed from: bba reason: case insensitive filesystem */
public final class C1216bba {

    /* renamed from: a */
    public final int f1924a;

    /* renamed from: b */
    public final String f1925b;

    /* renamed from: c */
    public final int f1926c;

    /* renamed from: d */
    public final int f1927d;

    /* renamed from: e */
    public final byte f1928e;

    /* renamed from: f */
    public final byte[] f1929f;

    public C1216bba(int i, String str, int i2, int i3, byte b, byte[] bArr) {
        this.f1924a = i;
        this.f1925b = str;
        this.f1926c = i2;
        this.f1927d = i3;
        this.f1928e = b;
        this.f1929f = bArr;
    }

    /* renamed from: a */
    public int mo1950a() {
        return this.f1924a;
    }

    /* renamed from: b */
    public int mo1951b() {
        return this.f1926c;
    }

    /* renamed from: c */
    public String mo1952c() {
        return this.f1925b;
    }

    /* renamed from: d */
    public byte[] mo1953d() {
        return (byte[]) this.f1929f.clone();
    }

    /* renamed from: e */
    public byte mo1954e() {
        return this.f1928e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(C1216bba.class.getName());
        stringBuffer.append(" [");
        stringBuffer.append(this.f1924a);
        stringBuffer.append(" ");
        stringBuffer.append(this.f1925b);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
