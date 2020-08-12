package p000;

/* renamed from: Zaa */
public final class Zaa implements _aa {

    /* renamed from: a */
    public static final C1255oba f1692a = null;

    /* renamed from: b */
    public static final Zaa f1693b = new Zaa(0);

    /* renamed from: c */
    public static final Zaa f1694c = new Zaa(7);

    /* renamed from: d */
    public static final Zaa f1695d = new Zaa(15);

    /* renamed from: e */
    public static final Zaa f1696e = new Zaa(23);

    /* renamed from: f */
    public static final Zaa f1697f = new Zaa(29);

    /* renamed from: g */
    public static final Zaa f1698g = new Zaa(36);

    /* renamed from: h */
    public static final Zaa f1699h = new Zaa(42);

    /* renamed from: i */
    public static final Zaa f1700i = new Zaa(-60);

    /* renamed from: j */
    public int f1701j;

    static {
        C1255oba oba = f1692a;
        C1255oba oba2 = f1692a;
        C1255oba oba3 = f1692a;
        C1255oba oba4 = f1692a;
        C1255oba oba5 = f1692a;
        C1255oba oba6 = f1692a;
        C1255oba oba7 = f1692a;
    }

    public Zaa(int i) {
        this.f1701j = i;
    }

    /* renamed from: a */
    public static String m1638a(int i) {
        if (C1289zca.m3977b(i)) {
            return C1289zca.m3976a(i);
        }
        if (i == -60) {
            return "~CIRCULAR~REF~";
        }
        if (i == -30) {
            return "~FUNCTION~NOT~IMPLEMENTED~";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("~non~std~err(");
        sb.append(i);
        sb.append(")~");
        return sb.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(Zaa.class.getName());
        stringBuffer.append(" [");
        stringBuffer.append(m1638a(this.f1701j));
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
