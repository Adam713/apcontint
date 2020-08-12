package p000;

/* renamed from: zca reason: case insensitive filesystem */
public class C1289zca {
    /* renamed from: a */
    public static final String m3976a(int i) {
        if (i == 0) {
            return "#NULL!";
        }
        if (i == 7) {
            return "#DIV/0!";
        }
        if (i == 15) {
            return "#VALUE!";
        }
        if (i == 23) {
            return "#REF!";
        }
        if (i == 29) {
            return "#NAME?";
        }
        if (i == 36) {
            return "#NUM!";
        }
        if (i == 42) {
            return "#N/A";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad error code (");
        sb.append(i);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static final boolean m3977b(int i) {
        return i == 0 || i == 7 || i == 15 || i == 23 || i == 29 || i == 36 || i == 42;
    }
}
