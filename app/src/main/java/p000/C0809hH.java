package p000;

/* renamed from: hH */
public enum C0809hH {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: e */
    public final int f3040e;

    /* access modifiers changed from: public */
    C0809hH(int i) {
        this.f3040e = i;
    }

    /* renamed from: a */
    public static boolean m2751a(int i) {
        return (i & OFFLINE.f3040e) != 0;
    }

    /* renamed from: b */
    public static boolean m2752b(int i) {
        return (i & NO_CACHE.f3040e) == 0;
    }

    /* renamed from: c */
    public static boolean m2753c(int i) {
        return (i & NO_STORE.f3040e) == 0;
    }
}
