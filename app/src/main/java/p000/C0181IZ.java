package p000;

import java.io.PrintStream;

/* renamed from: IZ */
public class C0181IZ {

    /* renamed from: a */
    public static final C1255oba f400a = null;

    /* renamed from: b */
    public static final C0181IZ f401b = new C0181IZ(0);

    /* renamed from: c */
    public static final C0181IZ f402c = new C0181IZ(7);

    /* renamed from: d */
    public static final C0181IZ f403d = new C0181IZ(15);

    /* renamed from: e */
    public static final C0181IZ f404e = new C0181IZ(23);

    /* renamed from: f */
    public static final C0181IZ f405f = new C0181IZ(29);

    /* renamed from: g */
    public static final C0181IZ f406g = new C0181IZ(36);

    /* renamed from: h */
    public static final C0181IZ f407h = new C0181IZ(42);

    /* renamed from: i */
    public final int f408i;

    static {
        C1255oba oba = f400a;
        C1255oba oba2 = f400a;
        C1255oba oba3 = f400a;
        C1255oba oba4 = f400a;
        C1255oba oba5 = f400a;
        C1255oba oba6 = f400a;
        C1255oba oba7 = f400a;
    }

    public C0181IZ(int i) {
        this.f408i = i;
    }

    /* renamed from: a */
    public static C0181IZ m384a(int i) {
        if (i == 0) {
            return f401b;
        }
        if (i == 7) {
            return f402c;
        }
        if (i == 15) {
            return f403d;
        }
        if (i == 23) {
            return f404e;
        }
        if (i == 29) {
            return f405f;
        }
        if (i == 36) {
            return f406g;
        }
        if (i == 42) {
            return f407h;
        }
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder();
        sb.append("Warning - unexpected error code (");
        sb.append(i);
        sb.append(")");
        printStream.println(sb.toString());
        return new C0181IZ(i);
    }

    /* renamed from: a */
    public int mo398a() {
        return this.f408i;
    }

    /* renamed from: b */
    public String mo399b() {
        if (C1289zca.m3977b(this.f408i)) {
            return C1289zca.m3976a(this.f408i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown error code (");
        sb.append(this.f408i);
        sb.append(")");
        return sb.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(C0181IZ.class.getName());
        stringBuffer.append(" [");
        stringBuffer.append(mo399b());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
