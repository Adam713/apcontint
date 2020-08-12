package p000;

import java.util.Map;
import java.util.Set;

/* renamed from: OV */
public class C0313OV {

    /* renamed from: a */
    public final char[] f895a;

    /* renamed from: b */
    public final int f896b;

    /* renamed from: c */
    public final Map<String, C0584_U> f897c;

    /* renamed from: d */
    public final Map<String, C1146wV> f898d;

    /* renamed from: e */
    public final Set<String> f899e;

    /* renamed from: f */
    public int f900f = 0;

    /* renamed from: g */
    public C0289NV f901g;

    public C0313OV(String str, Map<String, C0584_U> map, Map<String, C1146wV> map2, Set<String> set) {
        this.f895a = str.trim().toCharArray();
        this.f896b = this.f895a.length;
        this.f897c = map;
        this.f898d = map2;
        this.f899e = set;
    }

    /* renamed from: a */
    public static boolean m944a(char c, boolean z) {
        return Character.isDigit(c) || c == '.' || c == 'e' || c == 'E' || (z && (c == '-' || c == '+'));
    }

    /* renamed from: a */
    public static boolean m945a(int i) {
        return Character.isLetter(i);
    }

    /* renamed from: a */
    public final C0289NV mo988a(boolean z) {
        this.f901g = z ? new C0249LV() : new C0177IV();
        this.f900f++;
        return this.f901g;
    }

    /* renamed from: a */
    public final C0584_U mo989a(String str) {
        Map<String, C0584_U> map = this.f897c;
        C0584_U _u = map != null ? (C0584_U) map.get(str) : null;
        return _u == null ? C1119vV.m3563a(str) : _u;
    }

    /* renamed from: a */
    public boolean mo990a() {
        return this.f895a.length > this.f900f;
    }

    /* renamed from: a */
    public final boolean mo991a(char c) {
        return c == ',';
    }

    /* renamed from: b */
    public C0289NV mo992b() {
        char c = this.f895a[this.f900f];
        while (Character.isWhitespace(c)) {
            char[] cArr = this.f895a;
            int i = this.f900f + 1;
            this.f900f = i;
            c = cArr[i];
        }
        String str = "]";
        String str2 = ") at [";
        String str3 = "' (Code:";
        String str4 = "Unable to parse char '";
        if (Character.isDigit(c) || c == '.') {
            C0289NV nv = this.f901g;
            if (nv != null) {
                if (nv.mo936a() == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(c);
                    sb.append(str3);
                    sb.append(c);
                    sb.append(str2);
                    sb.append(this.f900f);
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                } else if (!(this.f901g.mo936a() == 2 || this.f901g.mo936a() == 4 || this.f901g.mo936a() == 3 || this.f901g.mo936a() == 7)) {
                    this.f901g = new C0269MV(C0115FV.m227a('*', 2));
                    return this.f901g;
                }
            }
            return mo999e(c);
        } else if (mo991a(c)) {
            return mo998d(c);
        } else {
            if (mo997c(c)) {
                C0289NV nv2 = this.f901g;
                if (nv2 == null || nv2.mo936a() == 2 || this.f901g.mo936a() == 4 || this.f901g.mo936a() == 3 || this.f901g.mo936a() == 7) {
                    return mo988a(true);
                }
                this.f901g = new C0269MV(C0115FV.m227a('*', 2));
                return this.f901g;
            } else if (mo994b(c)) {
                return mo988a(false);
            } else {
                if (C1146wV.m3691a(c)) {
                    return mo1000f(c);
                }
                if (m945a((int) c) || c == '_') {
                    C0289NV nv3 = this.f901g;
                    if (nv3 == null || nv3.mo936a() == 2 || this.f901g.mo936a() == 4 || this.f901g.mo936a() == 3 || this.f901g.mo936a() == 7) {
                        return mo996c();
                    }
                    this.f901g = new C0269MV(C0115FV.m227a('*', 2));
                    return this.f901g;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(c);
                sb2.append(str3);
                sb2.append(c);
                sb2.append(str2);
                sb2.append(this.f900f);
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: b */
    public final C1146wV mo993b(String str) {
        Map<String, C1146wV> map = this.f898d;
        C1146wV wVVar = map != null ? (C1146wV) map.get(str) : null;
        if (wVVar != null || str.length() != 1) {
            return wVVar;
        }
        C0289NV nv = this.f901g;
        int i = 2;
        if (nv == null || nv.mo936a() == 2 || this.f901g.mo936a() == 4 || this.f901g.mo936a() == 7) {
            i = 1;
        }
        return C0115FV.m227a(str.charAt(0), i);
    }

    /* renamed from: b */
    public final boolean mo994b(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    /* renamed from: b */
    public final boolean mo995b(int i) {
        return this.f896b <= i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final C0289NV mo996c() {
        /*
            r7 = this;
            int r0 = r7.f900f
            boolean r1 = r7.mo995b(r0)
            r2 = 1
            if (r1 == 0) goto L_0x000e
            int r1 = r7.f900f
            int r1 = r1 + r2
            r7.f900f = r1
        L_0x000e:
            r1 = 0
            r3 = r1
            r1 = 1
            r4 = 1
        L_0x0012:
            int r5 = r0 + r1
            int r5 = r5 - r2
            boolean r6 = r7.mo995b(r5)
            if (r6 != 0) goto L_0x005d
            char[] r6 = r7.f895a
            char r6 = r6[r5]
            boolean r6 = m945a(r6)
            if (r6 != 0) goto L_0x0037
            char[] r6 = r7.f895a
            char r6 = r6[r5]
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 != 0) goto L_0x0037
            char[] r6 = r7.f895a
            char r5 = r6[r5]
            r6 = 95
            if (r5 != r6) goto L_0x005d
        L_0x0037:
            java.lang.String r5 = new java.lang.String
            char[] r6 = r7.f895a
            r5.<init>(r6, r0, r1)
            java.util.Set<java.lang.String> r6 = r7.f899e
            if (r6 == 0) goto L_0x004e
            boolean r6 = r6.contains(r5)
            if (r6 == 0) goto L_0x004e
            PV r3 = new PV
            r3.<init>(r5)
            goto L_0x0059
        L_0x004e:
            _U r5 = r7.mo989a(r5)
            if (r5 == 0) goto L_0x005a
            JV r3 = new JV
            r3.<init>(r5)
        L_0x0059:
            r4 = r1
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x0012
        L_0x005d:
            if (r3 == 0) goto L_0x0069
            int r0 = r7.f900f
            int r0 = r0 + r4
            r7.f900f = r0
            r7.f901g = r3
            NV r0 = r7.f901g
            return r0
        L_0x0069:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to parse setVariable or function starting at pos "
            r1.append(r2)
            int r2 = r7.f900f
            r1.append(r2)
            java.lang.String r2 = " in expression '"
            r1.append(r2)
            java.lang.String r2 = new java.lang.String
            char[] r3 = r7.f895a
            r2.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x0097
        L_0x0096:
            throw r0
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0313OV.mo996c():NV");
    }

    /* renamed from: c */
    public final boolean mo997c(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    /* renamed from: d */
    public final C0289NV mo998d(char c) {
        this.f900f++;
        this.f901g = new C0157HV();
        return this.f901g;
    }

    /* renamed from: e */
    public final C0289NV mo999e(char c) {
        int i;
        int i2 = this.f900f;
        this.f900f = i2 + 1;
        if (mo995b(i2 + 1)) {
            this.f901g = new C0222KV(Double.parseDouble(String.valueOf(c)));
        } else {
            int i3 = 1;
            while (true) {
                i = i2 + i3;
                if (mo995b(i)) {
                    break;
                }
                char[] cArr = this.f895a;
                int i4 = i - 1;
                if (!m944a(cArr[i], cArr[i4] == 'e' || cArr[i4] == 'E')) {
                    break;
                }
                i3++;
                this.f900f++;
            }
            char[] cArr2 = this.f895a;
            int i5 = i - 1;
            if (cArr2[i5] == 'e' || cArr2[i5] == 'E') {
                i3--;
                this.f900f--;
            }
            this.f901g = new C0222KV(this.f895a, i2, i3);
        }
        return this.f901g;
    }

    /* renamed from: f */
    public final C0289NV mo1000f(char c) {
        C1146wV wVVar;
        int i = this.f900f;
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        int i2 = 1;
        while (true) {
            int i3 = i + i2;
            if (!mo995b(i3) && C1146wV.m3691a(this.f895a[i3])) {
                i2++;
                sb.append(this.f895a[i3]);
            }
        }
        while (true) {
            if (sb.length() <= 0) {
                wVVar = null;
                break;
            }
            wVVar = mo993b(sb.toString());
            if (wVVar != null) {
                break;
            }
            sb.setLength(sb.length() - 1);
        }
        this.f900f += sb.length();
        this.f901g = new C0269MV(wVVar);
        return this.f901g;
    }
}
