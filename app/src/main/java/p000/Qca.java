package p000;

/* renamed from: Qca */
public final class Qca {
    /* renamed from: a */
    public static int m1072a(String str) {
        int length = str.length() - 1;
        while (str.charAt(length) == '0') {
            length--;
            if (length < 0) {
                throw new RuntimeException("No non-zero digits found");
            }
        }
        return length + 1;
    }

    /* renamed from: a */
    public static String m1073a(double d) {
        return m1074a(Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public static String m1074a(long j) {
        boolean z = false;
        boolean z2 = j < 0;
        if (z2) {
            j &= Long.MAX_VALUE;
        }
        String str = "-0";
        String str2 = "0";
        if (j == 0) {
            if (!z2) {
                str = str2;
            }
            return str;
        }
        Nca nca = new Nca(j);
        if (nca.mo954a() < -1022) {
            if (!z2) {
                str = str2;
            }
            return str;
        }
        if (nca.mo954a() != 1024) {
            z = z2;
        } else if (j == -276939487313920L) {
            return "3.484840871308E+308";
        }
        Pca b = nca.mo955b();
        StringBuilder sb = new StringBuilder(21);
        if (z) {
            sb.append('-');
        }
        m1076a(sb, b);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m1075a(StringBuilder sb, int i) {
        if (i < 10) {
            sb.append('0');
            sb.append((char) (i + 48));
            return;
        }
        sb.append(i);
    }

    /* renamed from: a */
    public static void m1076a(StringBuilder sb, Pca pca) {
        String str;
        Pca f = pca.mo1075f();
        int a = f.mo1070a();
        if (Math.abs(a) > 98) {
            str = f.mo1074e();
            if (str.length() == 16) {
                a++;
            }
        } else {
            str = f.mo1073d();
        }
        int a2 = m1072a(str);
        if (a < 0) {
            m1079b(sb, str, a, a2);
        } else {
            m1077a(sb, str, a, a2);
        }
    }

    /* renamed from: a */
    public static void m1077a(StringBuilder sb, String str, int i, int i2) {
        if (i > 19) {
            sb.append(str.charAt(0));
            if (i2 > 1) {
                sb.append('.');
                sb.append(str.subSequence(1, i2));
            }
            sb.append("E+");
            m1075a(sb, i);
            return;
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            int i4 = i + 1;
            sb.append(str.subSequence(0, i4));
            sb.append('.');
            sb.append(str.subSequence(i4, i2));
            return;
        }
        sb.append(str.subSequence(0, i2));
        for (int i5 = -i3; i5 > 0; i5--) {
            sb.append('0');
        }
    }

    /* renamed from: a */
    public static boolean m1078a(int i) {
        return i > 20;
    }

    /* renamed from: b */
    public static void m1079b(StringBuilder sb, String str, int i, int i2) {
        int i3 = -i;
        int i4 = i3 - 1;
        if (m1078a(i4 + 2 + i2)) {
            sb.append(str.charAt(0));
            if (i2 > 1) {
                sb.append('.');
                sb.append(str.subSequence(1, i2));
            }
            sb.append("E-");
            m1075a(sb, i3);
            return;
        }
        sb.append("0.");
        while (i4 > 0) {
            sb.append('0');
            i4--;
        }
        sb.append(str.subSequence(0, i2));
    }
}
