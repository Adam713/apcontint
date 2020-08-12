package p000;

/* renamed from: Tca */
public class Tca {

    /* renamed from: a */
    public final int f1205a;

    /* renamed from: b */
    public final int f1206b;

    public Tca(int i) {
        this.f1205a = i;
        int i2 = 0;
        if (i != 0) {
            while ((i & 1) == 0) {
                i2++;
                i >>= 1;
            }
        }
        this.f1206b = i2;
    }

    /* renamed from: a */
    public byte mo1246a(byte b) {
        return (byte) mo1247a((int) b);
    }

    /* renamed from: a */
    public int mo1247a(int i) {
        return i & (this.f1205a ^ -1);
    }

    /* renamed from: a */
    public int mo1248a(int i, int i2) {
        int i3 = this.f1205a;
        return (i & (i3 ^ -1)) | ((i2 << this.f1206b) & i3);
    }

    /* renamed from: a */
    public int mo1249a(int i, boolean z) {
        return z ? mo1259e(i) : mo1247a(i);
    }

    /* renamed from: a */
    public short mo1250a(short s) {
        return (short) mo1247a((int) s);
    }

    /* renamed from: a */
    public short mo1251a(short s, short s2) {
        return (short) mo1248a((int) s, (int) s2);
    }

    /* renamed from: a */
    public short mo1252a(short s, boolean z) {
        return z ? mo1257c(s) : mo1250a(s);
    }

    /* renamed from: b */
    public byte mo1253b(byte b) {
        return (byte) mo1259e(b);
    }

    /* renamed from: b */
    public int mo1254b(int i) {
        return i & this.f1205a;
    }

    /* renamed from: b */
    public short mo1255b(short s) {
        return (short) mo1256c((int) s);
    }

    /* renamed from: c */
    public int mo1256c(int i) {
        return mo1254b(i) >> this.f1206b;
    }

    /* renamed from: c */
    public short mo1257c(short s) {
        return (short) mo1259e(s);
    }

    /* renamed from: d */
    public boolean mo1258d(int i) {
        return (i & this.f1205a) != 0;
    }

    /* renamed from: e */
    public int mo1259e(int i) {
        return i | this.f1205a;
    }
}
