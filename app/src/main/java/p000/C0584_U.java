package p000;

/* renamed from: _U */
public abstract class C0584_U {

    /* renamed from: a */
    public final String f1774a;

    /* renamed from: b */
    public final int f1775b;

    public C0584_U(String str) {
        this(str, 1);
    }

    public C0584_U(String str, int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("The number of function arguments can not be less than 0 for '");
            sb.append(str);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        } else if (m1704a(str)) {
            this.f1774a = str;
            this.f1775b = i;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The function name '");
            sb2.append(str);
            sb2.append("' is invalid");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public static boolean m1704a(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt) && charAt != '_' && (!Character.isDigit(charAt) || i <= 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public abstract double mo1795a(double... dArr);

    /* renamed from: a */
    public int mo1796a() {
        return this.f1775b;
    }
}
