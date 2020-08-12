package p000;

import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: lba reason: case insensitive filesystem */
public class C1246lba implements C1274uca {

    /* renamed from: a */
    public static nda f3314a = mda.m3128a(C1246lba.class);

    /* renamed from: b */
    public static final int f3315b = C1247lca.EXCEL97.mo4695a();

    /* renamed from: c */
    public static final String f3316c = C1247lca.EXCEL97.mo4696b();

    /* renamed from: d */
    public final C1279wba f3317d;

    /* renamed from: e */
    public final C1276vba f3318e;

    /* renamed from: f */
    public int f3319f = -1;

    /* renamed from: g */
    public C1267sba f3320g = null;

    /* renamed from: h */
    public C0420TW f3321h;

    public C1246lba(C1279wba wba, C1276vba vba, int i, short s, int i2) {
        m3009a((int) s);
        this.f3317d = wba;
        this.f3318e = vba;
        mo4674a(i2, false, i, s, vba.mo5262c().mo5376c(s));
    }

    /* renamed from: a */
    public static RuntimeException m3008a(int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot get a ");
        sb.append(m3011b(i));
        sb.append(" value from a ");
        sb.append(m3011b(i2));
        sb.append(" ");
        sb.append(z ? "formula " : "");
        sb.append("cell");
        return new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static void m3009a(int i) {
        if (i < 0 || i > f3315b) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid column index (");
            sb.append(i);
            sb.append(").  Allowable column range for ");
            sb.append("BIFF8");
            sb.append(" is (0..");
            sb.append(f3315b);
            sb.append(") or ('A'..'");
            sb.append(f3316c);
            sb.append("')");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m3010a(int i, C1189yX yXVar) {
        int l = yXVar.mo5496l();
        if (l != i) {
            throw m3008a(i, l, true);
        }
    }

    /* renamed from: b */
    public static String m3011b(int i) {
        if (i == 0) {
            return "numeric";
        }
        if (i == 1) {
            return "text";
        }
        if (i == 2) {
            return "formula";
        }
        if (i == 3) {
            return "blank";
        }
        if (i == 4) {
            return "boolean";
        }
        if (i == 5) {
            return "error";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("#unknown cell type (");
        sb.append(i);
        sb.append(")#");
        return sb.toString();
    }

    /* renamed from: a */
    public int mo4671a() {
        return this.f3321h.mo280b() & 65535;
    }

    /* renamed from: a */
    public void mo4672a(byte b) {
        int row = this.f3321h.getRow();
        short b2 = this.f3321h.mo280b();
        short a = this.f3321h.mo277a();
        int i = this.f3319f;
        if (i != 2) {
            if (i != 5) {
                mo4674a(5, false, row, b2, a);
            }
            ((C0178IW) this.f3321h).mo381a(b);
            return;
        }
        ((C0637bZ) this.f3321h).mo1938a((int) b);
    }

    /* renamed from: a */
    public void mo4673a(double d) {
        Bca bca;
        if (Double.isInfinite(d)) {
            bca = Bca.DIV0;
        } else if (Double.isNaN(d)) {
            bca = Bca.NUM;
        } else {
            int row = this.f3321h.getRow();
            short b = this.f3321h.mo280b();
            short a = this.f3321h.mo277a();
            int i = this.f3319f;
            if (i != 0) {
                if (i != 2) {
                    mo4674a(0, false, row, b, a);
                } else {
                    ((C0637bZ) this.f3321h).mo1937a(d);
                    return;
                }
            }
            ((C0510XX) this.f3321h).mo1474a(d);
            return;
        }
        mo4672a(bca.mo88a());
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [TW, SW] */
    /* JADX WARNING: type inference failed for: r0v3, types: [XX, SW] */
    /* JADX WARNING: type inference failed for: r0v5, types: [XX] */
    /* JADX WARNING: type inference failed for: r0v6, types: [XX] */
    /* JADX WARNING: type inference failed for: r6v3, types: [TW] */
    /* JADX WARNING: type inference failed for: r6v4, types: [NX] */
    /* JADX WARNING: type inference failed for: r0v8, types: [SW, NX] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v7, types: [NX] */
    /* JADX WARNING: type inference failed for: r6v8, types: [bZ] */
    /* JADX WARNING: type inference failed for: r0v12, types: [bZ] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10, types: [bZ] */
    /* JADX WARNING: type inference failed for: r0v17, types: [SW, IW] */
    /* JADX WARNING: type inference failed for: r0v19, types: [IW] */
    /* JADX WARNING: type inference failed for: r0v20, types: [IW] */
    /* JADX WARNING: type inference failed for: r0v22, types: [SW, IW] */
    /* JADX WARNING: type inference failed for: r0v24, types: [IW] */
    /* JADX WARNING: type inference failed for: r0v25, types: [IW] */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: type inference failed for: r0v31 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [XX, SW]
      assigns: []
      uses: [SW, XX, TW, IW]
      mth insns count: 106
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 16 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4674a(int r4, boolean r5, int r6, short r7, short r8) {
        /*
            r3 = this;
            r0 = 5
            if (r4 > r0) goto L_0x0115
            if (r4 == 0) goto L_0x00de
            r1 = 1
            if (r4 == r1) goto L_0x0095
            r1 = 2
            if (r4 == r1) goto L_0x0066
            r1 = 3
            if (r4 == r1) goto L_0x004b
            r1 = 4
            if (r4 == r1) goto L_0x002f
            if (r4 == r0) goto L_0x0015
            goto L_0x0100
        L_0x0015:
            int r0 = r3.f3319f
            if (r4 == r0) goto L_0x001f
            IW r0 = new IW
            r0.<init>()
            goto L_0x0023
        L_0x001f:
            TW r0 = r3.f3321h
            IW r0 = (p000.C0178IW) r0
        L_0x0023:
            r0.mo1206b(r7)
            if (r5 == 0) goto L_0x00f8
            r5 = 15
            r0.mo381a(r5)
            goto L_0x00f8
        L_0x002f:
            int r0 = r3.f3319f
            if (r4 == r0) goto L_0x0039
            IW r0 = new IW
            r0.<init>()
            goto L_0x003d
        L_0x0039:
            TW r0 = r3.f3321h
            IW r0 = (p000.C0178IW) r0
        L_0x003d:
            r0.mo1206b(r7)
            if (r5 == 0) goto L_0x00f8
            boolean r5 = r3.mo4682e()
            r0.mo383a(r5)
            goto L_0x00f8
        L_0x004b:
            int r5 = r3.f3319f
            if (r4 == r5) goto L_0x0055
            GW r5 = new GW
            r5.<init>()
            goto L_0x0059
        L_0x0055:
            TW r5 = r3.f3321h
            GW r5 = (p000.C0136GW) r5
        L_0x0059:
            r5.mo281b(r7)
            r5.mo279a(r8)
            r5.mo278a(r6)
            r3.f3321h = r5
            goto L_0x0100
        L_0x0066:
            int r0 = r3.f3319f
            if (r4 == r0) goto L_0x0079
            vba r0 = r3.f3318e
            wW r0 = r0.mo5262c()
            fZ r0 = r0.mo5379u()
            bZ r6 = r0.mo4385a(r6, r7)
            goto L_0x0084
        L_0x0079:
            TW r0 = r3.f3321h
            bZ r0 = (p000.C0637bZ) r0
            r0.mo1940b(r6)
            r0.mo1941b(r7)
            r6 = r0
        L_0x0084:
            if (r5 == 0) goto L_0x0091
            yX r5 = r6.mo1943e()
            double r0 = r3.mo4679b()
            r5.mo5490a(r0)
        L_0x0091:
            r6.mo279a(r8)
            goto L_0x00db
        L_0x0095:
            int r0 = r3.f3319f
            if (r4 != r0) goto L_0x009e
            TW r6 = r3.f3321h
            NX r6 = (p000.C0291NX) r6
            goto L_0x00ad
        L_0x009e:
            NX r0 = new NX
            r0.<init>()
            r0.mo1206b(r7)
            r0.mo1204a(r6)
            r0.mo279a(r8)
            r6 = r0
        L_0x00ad:
            if (r5 == 0) goto L_0x00db
            java.lang.String r5 = r3.mo4683f()
            wba r7 = r3.f3317d
            xW r7 = r7.mo5399k()
            GZ r8 = new GZ
            r8.<init>(r5)
            int r5 = r7.mo5433a(r8)
            r6.mo942b(r5)
            wba r7 = r3.f3317d
            xW r7 = r7.mo5399k()
            GZ r5 = r7.mo5446l(r5)
            sba r7 = new sba
            r7.<init>()
            r3.f3320g = r7
            sba r7 = r3.f3320g
            r7.mo5110a(r5)
        L_0x00db:
            r3.f3321h = r6
            goto L_0x0100
        L_0x00de:
            int r0 = r3.f3319f
            if (r4 == r0) goto L_0x00e8
            XX r0 = new XX
            r0.<init>()
            goto L_0x00ec
        L_0x00e8:
            TW r0 = r3.f3321h
            XX r0 = (p000.C0510XX) r0
        L_0x00ec:
            r0.mo1206b(r7)
            if (r5 == 0) goto L_0x00f8
            double r1 = r3.mo4679b()
            r0.mo1474a(r1)
        L_0x00f8:
            r0.mo279a(r8)
            r0.mo1204a(r6)
            r3.f3321h = r0
        L_0x0100:
            int r5 = r3.f3319f
            if (r4 == r5) goto L_0x0112
            r6 = -1
            if (r5 == r6) goto L_0x0112
            vba r5 = r3.f3318e
            wW r5 = r5.mo5262c()
            TW r6 = r3.f3321h
            r5.mo5371a(r6)
        L_0x0112:
            r3.f3319f = r4
            return
        L_0x0115:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "I have no idea what type that is!"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1246lba.mo4674a(int, boolean, int, short, short):void");
    }

    /* renamed from: a */
    public void mo4675a(Dca dca) {
        C1267sba sba = (C1267sba) dca;
        int row = this.f3321h.getRow();
        short b = this.f3321h.mo280b();
        short a = this.f3321h.mo277a();
        if (sba == null) {
            mo4693p();
            mo4674a(3, false, row, b, a);
        } else if (sba.mo5114c() <= C1247lca.EXCEL97.mo4699e()) {
            int i = this.f3319f;
            if (i == 2) {
                ((C0637bZ) this.f3321h).mo1939a(sba.getString());
                this.f3320g = new C1267sba(dca.getString());
                return;
            }
            if (i != 1) {
                mo4674a(1, false, row, b, a);
            }
            int a2 = this.f3317d.mo5399k().mo5433a(sba.mo5113b());
            ((C0291NX) this.f3321h).mo942b(a2);
            this.f3320g = sba;
            this.f3320g.mo5111a(this.f3317d.mo5399k(), (C0291NX) this.f3321h);
            this.f3320g.mo5110a(this.f3317d.mo5399k().mo5446l(a2));
        } else {
            throw new IllegalArgumentException("The maximum length of cell contents (text) is 32,767 characters");
        }
    }

    /* renamed from: a */
    public void mo4676a(String str) {
        mo4675a(str == null ? null : new C1267sba(str));
    }

    /* renamed from: a */
    public void mo4677a(C1249mba mba) {
        mba.mo4786a(this.f3317d);
        this.f3321h.mo279a(mba.mo4792d());
    }

    /* renamed from: a */
    public void mo4678a(C1277vca vca) {
        mo4677a((C1249mba) vca);
    }

    /* renamed from: b */
    public double mo4679b() {
        int i = this.f3319f;
        if (i == 0) {
            return ((C0510XX) this.f3321h).mo1475j();
        }
        if (i == 2) {
            C1189yX e = ((C0637bZ) this.f3321h).mo1943e();
            m3010a(0, e);
            return e.mo5500p();
        } else if (i == 3) {
            return 0.0d;
        } else {
            throw m3008a(0, i, false);
        }
    }

    /* renamed from: c */
    public C1249mba m3022c() {
        short a = this.f3321h.mo277a();
        return new C1249mba(a, this.f3317d.mo5399k().mo5442h(a), this.f3317d);
    }

    /* renamed from: d */
    public int mo4681d() {
        return this.f3321h.getRow();
    }

    /* renamed from: e */
    public final boolean mo4682e() {
        int i = this.f3319f;
        boolean z = false;
        if (i == 0) {
            if (((C0510XX) this.f3321h).mo1475j() != 0.0d) {
                z = true;
            }
            return z;
        } else if (i == 1) {
            return Boolean.valueOf(this.f3317d.mo5399k().mo5446l(((C0291NX) this.f3321h).mo943j()).mo297e()).booleanValue();
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return ((C0178IW) this.f3321h).mo387j();
                }
                if (i != 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected cell type (");
                    sb.append(this.f3319f);
                    sb.append(")");
                    throw new RuntimeException(sb.toString());
                }
            }
            return false;
        } else {
            C1189yX e = ((C0637bZ) this.f3321h).mo1943e();
            m3010a(4, e);
            return e.mo5494j();
        }
    }

    /* renamed from: f */
    public final String mo4683f() {
        int i = this.f3319f;
        if (i == 0) {
            return Qca.m1073a(((C0510XX) this.f3321h).mo1475j());
        }
        if (i != 1) {
            String str = "TRUE";
            String str2 = "FALSE";
            String str3 = ")";
            if (i == 2) {
                C0637bZ bZVar = (C0637bZ) this.f3321h;
                C1189yX e = bZVar.mo1943e();
                int l = e.mo5496l();
                if (l == 0) {
                    return Qca.m1073a(e.mo5500p());
                }
                if (l == 1) {
                    return bZVar.mo1945g();
                }
                if (l == 4) {
                    if (!e.mo5494j()) {
                        str = str2;
                    }
                    return str;
                } else if (l == 5) {
                    return C1289zca.m3976a(e.mo5495k());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected formula result type (");
                    sb.append(this.f3319f);
                    sb.append(str3);
                    throw new IllegalStateException(sb.toString());
                }
            } else if (i == 3) {
                return "";
            } else {
                if (i == 4) {
                    if (!((C0178IW) this.f3321h).mo387j()) {
                        str = str2;
                    }
                    return str;
                } else if (i == 5) {
                    return C1289zca.m3976a(((C0178IW) this.f3321h).mo388k());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unexpected cell type (");
                    sb2.append(this.f3319f);
                    sb2.append(str3);
                    throw new IllegalStateException(sb2.toString());
                }
            }
        } else {
            return this.f3317d.mo5399k().mo5446l(((C0291NX) this.f3321h).mo943j()).mo297e();
        }
    }

    /* renamed from: g */
    public Jca mo4684g() {
        if (this.f3319f == 2) {
            return ((C0637bZ) this.f3321h).mo1942d();
        }
        String a = new Mca(this).mo910a();
        StringBuilder sb = new StringBuilder();
        sb.append("Cell ");
        sb.append(a);
        sb.append(" is not part of an array formula.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: h */
    public boolean mo4685h() {
        int i = this.f3319f;
        if (i == 2) {
            C1189yX e = ((C0637bZ) this.f3321h).mo1943e();
            m3010a(4, e);
            return e.mo5494j();
        } else if (i == 3) {
            return false;
        } else {
            if (i == 4) {
                return ((C0178IW) this.f3321h).mo387j();
            }
            throw m3008a(4, i, false);
        }
    }

    /* renamed from: i */
    public String mo4686i() {
        C0420TW tw = this.f3321h;
        if (tw instanceof C0637bZ) {
            return C1120vW.m3564a(this.f3317d, ((C0637bZ) tw).mo1944f());
        }
        throw m3008a(2, this.f3319f, true);
    }

    /* renamed from: j */
    public int mo4687j() {
        return this.f3319f;
    }

    /* renamed from: k */
    public C0420TW mo4688k() {
        return this.f3321h;
    }

    /* renamed from: l */
    public Date mo4689l() {
        if (this.f3319f == 3) {
            return null;
        }
        return C1283xca.m3843a(mo4679b(), this.f3317d.mo5399k().mo5431J());
    }

    /* renamed from: m */
    public C1267sba mo4690m() {
        int i = this.f3319f;
        if (i == 1) {
            return this.f3320g;
        }
        String str = "";
        if (i == 2) {
            C0637bZ bZVar = (C0637bZ) this.f3321h;
            m3010a(1, bZVar.mo1943e());
            String g = bZVar.mo1945g();
            if (g == null) {
                g = str;
            }
            return new C1267sba(g);
        } else if (i == 3) {
            return new C1267sba(str);
        } else {
            throw m3008a(1, i, false);
        }
    }

    /* renamed from: n */
    public String mo4691n() {
        return mo4690m().getString();
    }

    /* renamed from: o */
    public boolean mo4692o() {
        if (this.f3319f != 2) {
            return false;
        }
        return ((C0637bZ) this.f3321h).mo1946h();
    }

    /* renamed from: p */
    public final void mo4693p() {
        C0420TW tw = this.f3321h;
        if (tw instanceof C0637bZ) {
            ((C0637bZ) tw).mo1947i();
        }
    }

    public String toString() {
        int j = mo4687j();
        if (j == 0) {
            return C1283xca.m3848a((C1274uca) this) ? new SimpleDateFormat("dd-MMM-yyyy").format(mo4689l()) : String.valueOf(mo4679b());
        }
        if (j == 1) {
            return mo4691n();
        }
        if (j == 2) {
            return mo4686i();
        }
        if (j == 3) {
            return "";
        }
        if (j == 4) {
            return mo4685h() ? "TRUE" : "FALSE";
        } else if (j == 5) {
            return Zaa.m1638a(((C0178IW) this.f3321h).mo388k());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown Cell Type: ");
            sb.append(mo4687j());
            return sb.toString();
        }
    }
}
