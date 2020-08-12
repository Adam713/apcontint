package p000;

/* renamed from: wV */
public abstract class C1146wV {

    /* renamed from: a */
    public static final char[] f4022a = {'+', '-', '*', '/', '%', '^', '!', '#', 167, '$', '&', ';', ':', '~', '<', '>', '|', '='};

    /* renamed from: b */
    public final int f4023b;

    /* renamed from: c */
    public final boolean f4024c;

    /* renamed from: d */
    public final String f4025d;

    /* renamed from: e */
    public final int f4026e;

    public C1146wV(String str, int i, boolean z, int i2) {
        this.f4023b = i;
        this.f4024c = z;
        this.f4025d = str;
        this.f4026e = i2;
    }

    /* renamed from: a */
    public static boolean m3691a(char c) {
        for (char c2 : f4022a) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract double mo23a(double... dArr);

    /* renamed from: a */
    public int mo5364a() {
        return this.f4023b;
    }

    /* renamed from: b */
    public int mo5365b() {
        return this.f4026e;
    }

    /* renamed from: c */
    public boolean mo5366c() {
        return this.f4024c;
    }
}
