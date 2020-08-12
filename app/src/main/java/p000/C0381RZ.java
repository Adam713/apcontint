package p000;

/* renamed from: RZ */
public abstract class C0381RZ extends Daa {

    /* renamed from: c */
    public final byte f1095c;

    /* renamed from: d */
    public final byte[] f1096d;

    /* renamed from: e */
    public final byte f1097e;

    /* renamed from: f */
    public final short f1098f;

    public C0381RZ(int i, int i2, byte[] bArr, int i3) {
        this.f1097e = (byte) i3;
        this.f1098f = (short) i;
        this.f1095c = (byte) i2;
        this.f1096d = bArr;
    }

    /* renamed from: a */
    public static short m1094a(String str) {
        short b = C1222dba.m2585b(str.toUpperCase());
        if (b < 0) {
            return 255;
        }
        return b;
    }

    /* renamed from: a */
    public static void m1095a(StringBuilder sb, int i, String[] strArr) {
        sb.append('(');
        for (int i2 = i; i2 < strArr.length; i2++) {
            if (i2 > i) {
                sb.append(',');
            }
            sb.append(strArr[i2]);
        }
        sb.append(")");
    }

    /* renamed from: a */
    public final String mo1150a(short s) {
        if (s == 255) {
            return "#external#";
        }
        C1216bba a = C1222dba.m2583a((int) s);
        if (a != null) {
            return a.mo1952c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bad function index (");
        sb.append(s);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public String mo52a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        if (mo1153i()) {
            sb.append(strArr[0]);
            m1095a(sb, 1, strArr);
        } else {
            sb.append(mo1152h());
            m1095a(sb, 0, strArr);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public final boolean mo120d() {
        return false;
    }

    /* renamed from: e */
    public final String mo81e() {
        return mo1152h();
    }

    /* renamed from: f */
    public final int mo53f() {
        return this.f1097e;
    }

    /* renamed from: g */
    public final short mo1151g() {
        return this.f1098f;
    }

    /* renamed from: h */
    public final String mo1152h() {
        return mo1150a(this.f1098f);
    }

    /* renamed from: i */
    public final boolean mo1153i() {
        return this.f1098f == 255;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getName());
        sb.append(" [");
        sb.append(mo1150a(this.f1098f));
        sb.append(" nArgs=");
        sb.append(this.f1097e);
        sb.append("]");
        return sb.toString();
    }
}
