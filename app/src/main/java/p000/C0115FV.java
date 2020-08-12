package p000;

import com.itextpdf.tool.xml.css.CSS.Value;

/* renamed from: FV */
public abstract class C0115FV {

    /* renamed from: a */
    public static final C1146wV[] f257a = new C1146wV[8];

    static {
        String str = "+";
        f257a[0] = new C1166xV(str, 2, true, 500);
        String str2 = "-";
        f257a[1] = new C1185yV(str2, 2, true, 500);
        f257a[6] = new C1207zV(str2, 1, false, 5000);
        f257a[7] = new C0015AV(str, 1, false, 5000);
        f257a[2] = new C0034BV("*", 2, true, 1000);
        f257a[3] = new C0058CV("/", 2, true, 1000);
        f257a[4] = new C0077DV("^", 2, false, 10000);
        f257a[5] = new C0096EV(Value.PERCENTAGE, 2, true, 1000);
    }

    /* renamed from: a */
    public static C1146wV m227a(char c, int i) {
        if (c == '%') {
            return f257a[5];
        }
        if (c == '-') {
            return i != 1 ? f257a[1] : f257a[6];
        }
        if (c == '/') {
            return f257a[3];
        }
        if (c == '^') {
            return f257a[4];
        }
        if (c == '*') {
            return f257a[2];
        }
        if (c != '+') {
            return null;
        }
        return i != 1 ? f257a[0] : f257a[7];
    }
}
