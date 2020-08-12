package p000;

import java.util.regex.Pattern;

/* renamed from: Mca */
public class Mca {

    /* renamed from: a */
    public static final Pattern f747a = Pattern.compile("\\$?([A-Za-z]+)\\$?([0-9]+)");

    /* renamed from: b */
    public static final Pattern f748b = Pattern.compile("\\$?([A-Za-z]+)");

    /* renamed from: c */
    public static final Pattern f749c = Pattern.compile("\\$?([0-9]+)");

    /* renamed from: d */
    public static final Pattern f750d = Pattern.compile("[_A-Za-z][_.A-Za-z0-9]*");

    /* renamed from: e */
    public final int f751e;

    /* renamed from: f */
    public final int f752f;

    /* renamed from: g */
    public final String f753g;

    /* renamed from: h */
    public final boolean f754h;

    /* renamed from: i */
    public final boolean f755i;

    public Mca(int i, int i2) {
        this(i, i2, false, false);
    }

    public Mca(int i, int i2, boolean z, boolean z2) {
        this(null, i, i2, z, z2);
    }

    public Mca(String str, int i, int i2, boolean z, boolean z2) {
        if (i < -1) {
            throw new IllegalArgumentException("row index may not be negative");
        } else if (i2 >= -1) {
            this.f753g = str;
            this.f751e = i;
            this.f752f = i2;
            this.f754h = z;
            this.f755i = z2;
        } else {
            throw new IllegalArgumentException("column index may not be negative");
        }
    }

    public Mca(C1274uca uca) {
        this(uca.mo4681d(), uca.mo4671a(), false, false);
    }

    /* renamed from: a */
    public static String m877a(int i) {
        int i2 = i + 1;
        String str = "";
        while (i2 > 0) {
            int i3 = i2 % 26;
            if (i3 == 0) {
                i3 = 26;
            }
            i2 = (i2 - i3) / 26;
            char c = (char) (i3 + 64);
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(str);
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m878a(String str, String str2, C1247lca lca) {
        if (!m879a(str, lca)) {
            return false;
        }
        return m880b(str2, lca);
    }

    /* renamed from: a */
    public static boolean m879a(String str, C1247lca lca) {
        String b = lca.mo4696b();
        int length = b.length();
        int length2 = str.length();
        if (length2 > length) {
            return false;
        }
        return length2 != length || str.toUpperCase().compareTo(b) <= 0;
    }

    /* renamed from: b */
    public static boolean m880b(String str, C1247lca lca) {
        int parseInt = Integer.parseInt(str);
        if (parseInt >= 0) {
            boolean z = false;
            if (parseInt == 0) {
                return false;
            }
            if (parseInt <= lca.mo4698d()) {
                z = true;
            }
            return z;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid rowStr '");
        sb.append(str);
        sb.append("'.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public String mo910a() {
        StringBuffer stringBuffer = new StringBuffer(32);
        String str = this.f753g;
        if (str != null) {
            Qaa.m1069b(stringBuffer, str);
            stringBuffer.append('!');
        }
        mo911a(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo911a(StringBuffer stringBuffer) {
        if (this.f755i) {
            stringBuffer.append('$');
        }
        stringBuffer.append(m877a(this.f752f));
        if (this.f754h) {
            stringBuffer.append('$');
        }
        stringBuffer.append(this.f751e + 1);
    }

    /* renamed from: b */
    public short mo912b() {
        return (short) this.f752f;
    }

    /* renamed from: c */
    public int mo913c() {
        return this.f751e;
    }

    /* renamed from: d */
    public String mo914d() {
        return this.f753g;
    }

    /* renamed from: e */
    public boolean mo915e() {
        return this.f755i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Mca)) {
            return false;
        }
        Mca mca = (Mca) obj;
        if (this.f751e == mca.f751e && this.f752f == mca.f752f) {
            boolean z2 = this.f754h;
            boolean z3 = mca.f755i;
            if (z2 == z3 && this.f755i == z3) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo917f() {
        return this.f754h;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [");
        stringBuffer.append(mo910a());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
