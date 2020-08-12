package p000;

/* renamed from: iaa reason: case insensitive filesystem */
public final class C1236iaa extends Paa {

    /* renamed from: c */
    public static final C1255oba f3114c = null;

    /* renamed from: d */
    public static final C1236iaa f3115d = new C1236iaa(0);

    /* renamed from: e */
    public static final C1236iaa f3116e = new C1236iaa(7);

    /* renamed from: f */
    public static final C1236iaa f3117f = new C1236iaa(15);

    /* renamed from: g */
    public static final C1236iaa f3118g = new C1236iaa(23);

    /* renamed from: h */
    public static final C1236iaa f3119h = new C1236iaa(29);

    /* renamed from: i */
    public static final C1236iaa f3120i = new C1236iaa(36);

    /* renamed from: j */
    public static final C1236iaa f3121j = new C1236iaa(42);

    /* renamed from: k */
    public final int f3122k;

    static {
        C1255oba oba = f3114c;
        C1255oba oba2 = f3114c;
        C1255oba oba3 = f3114c;
        C1255oba oba4 = f3114c;
        C1255oba oba5 = f3114c;
        C1255oba oba6 = f3114c;
        C1255oba oba7 = f3114c;
    }

    public C1236iaa(int i) {
        if (C1289zca.m3977b(i)) {
            this.f3122k = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid error code (");
        sb.append(i);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static C1236iaa m2841a(int i) {
        if (i == 0) {
            return f3115d;
        }
        if (i == 7) {
            return f3116e;
        }
        if (i == 15) {
            return f3117f;
        }
        if (i == 23) {
            return f3118g;
        }
        if (i == 29) {
            return f3119h;
        }
        if (i == 36) {
            return f3120i;
        }
        if (i == 42) {
            return f3121j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected error code (");
        sb.append(i);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: b */
    public static C1236iaa m2842b(hda hda) {
        return m2841a((int) hda.readByte());
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 28);
        jda.writeByte(this.f3122k);
    }

    /* renamed from: c */
    public int mo80c() {
        return 2;
    }

    /* renamed from: e */
    public String mo81e() {
        return C1289zca.m3976a(this.f3122k);
    }
}
