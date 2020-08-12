package p000;

/* renamed from: vV */
public class C1119vV {

    /* renamed from: a */
    public static final C0584_U[] f3885a = new C0584_U[21];

    static {
        f3885a[0] = new C0884kV("sin");
        f3885a[1] = new C0950nV("cos");
        f3885a[2] = new C0974oV("tan");
        f3885a[3] = new C0998pV("log");
        f3885a[20] = new C1017qV("log2");
        f3885a[19] = new C1039rV("log10");
        f3885a[4] = new C1059sV("log1p");
        f3885a[5] = new C1079tV("abs");
        f3885a[6] = new C1099uV("acos");
        f3885a[7] = new C0613aV("asin");
        f3885a[8] = new C0633bV("atan");
        f3885a[9] = new C0652cV("cbrt");
        f3885a[11] = new C0741dV("floor");
        f3885a[12] = new C0761eV("sinh");
        f3885a[13] = new C0784fV("sqrt");
        f3885a[14] = new C0803gV("tanh");
        f3885a[15] = new C0823hV("cosh");
        f3885a[10] = new C0844iV("ceil");
        f3885a[16] = new C0864jV("pow", 2);
        f3885a[17] = new C0909lV("exp", 1);
        f3885a[18] = new C0929mV("expm1", 1);
    }

    /* renamed from: a */
    public static C0584_U m3563a(String str) {
        if (str.equals("sin")) {
            return f3885a[0];
        }
        if (str.equals("cos")) {
            return f3885a[1];
        }
        if (str.equals("tan")) {
            return f3885a[2];
        }
        if (str.equals("asin")) {
            return f3885a[7];
        }
        if (str.equals("acos")) {
            return f3885a[6];
        }
        if (str.equals("atan")) {
            return f3885a[8];
        }
        if (str.equals("sinh")) {
            return f3885a[12];
        }
        if (str.equals("cosh")) {
            return f3885a[15];
        }
        if (str.equals("tanh")) {
            return f3885a[14];
        }
        if (str.equals("abs")) {
            return f3885a[5];
        }
        if (str.equals("log")) {
            return f3885a[3];
        }
        if (str.equals("log10")) {
            return f3885a[19];
        }
        if (str.equals("log2")) {
            return f3885a[20];
        }
        if (str.equals("log1p")) {
            return f3885a[4];
        }
        if (str.equals("ceil")) {
            return f3885a[10];
        }
        if (str.equals("floor")) {
            return f3885a[11];
        }
        if (str.equals("sqrt")) {
            return f3885a[13];
        }
        if (str.equals("cbrt")) {
            return f3885a[9];
        }
        if (str.equals("pow")) {
            return f3885a[16];
        }
        if (str.equals("exp")) {
            return f3885a[17];
        }
        if (str.equals("expm1")) {
            return f3885a[18];
        }
        return null;
    }
}
