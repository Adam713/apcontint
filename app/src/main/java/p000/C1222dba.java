package p000;

import java.util.Map;

/* renamed from: dba reason: case insensitive filesystem */
public final class C1222dba {

    /* renamed from: a */
    public static C1222dba f2889a;

    /* renamed from: b */
    public final C1216bba[] f2890b;

    /* renamed from: c */
    public final Map<String, C1216bba> f2891c;

    public C1222dba(C1216bba[] bbaArr, Map<String, C1216bba> map) {
        this.f2890b = bbaArr;
        this.f2891c = map;
    }

    /* renamed from: a */
    public static C1216bba m2583a(int i) {
        return m2584a().mo4299b(i);
    }

    /* renamed from: a */
    public static C1222dba m2584a() {
        if (f2889a == null) {
            f2889a = C1219cba.m1910a();
        }
        return f2889a;
    }

    /* renamed from: b */
    public static short m2585b(String str) {
        C1216bba a = m2584a().mo4298a(str);
        if (a == null) {
            return -1;
        }
        return (short) a.mo1950a();
    }

    /* renamed from: a */
    public final C1216bba mo4298a(String str) {
        return (C1216bba) this.f2891c.get(str);
    }

    /* renamed from: b */
    public final C1216bba mo4299b(int i) {
        return this.f2890b[i];
    }
}
