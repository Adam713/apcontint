package p000;

/* renamed from: gH */
public enum C0789gH {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: d */
    public final int f3010d;

    /* access modifiers changed from: public */
    C0789gH(int i) {
        this.f3010d = i;
    }

    /* renamed from: a */
    public static boolean m2710a(int i) {
        return (i & NO_CACHE.f3010d) == 0;
    }

    /* renamed from: b */
    public static boolean m2711b(int i) {
        return (i & NO_STORE.f3010d) == 0;
    }
}
