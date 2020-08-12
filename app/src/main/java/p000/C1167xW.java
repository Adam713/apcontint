package p000;

import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: xW */
public final class C1167xW {

    /* renamed from: a */
    public static final nda f4106a = mda.m3128a(C1167xW.class);

    /* renamed from: b */
    public static final int f4107b = nda.f3486a;

    /* renamed from: c */
    public final C1208zW f4108c = new C1208zW();

    /* renamed from: d */
    public C1149wY f4109d;

    /* renamed from: e */
    public C1186yW f4110e;

    /* renamed from: f */
    public final List<C0250LW> f4111f = new ArrayList();

    /* renamed from: g */
    public final List<C1168xX> f4112g = new ArrayList();

    /* renamed from: h */
    public final List<C0159HX> f4113h = new ArrayList();

    /* renamed from: i */
    public int f4114i = 0;

    /* renamed from: j */
    public int f4115j = 0;

    /* renamed from: k */
    public int f4116k = -1;

    /* renamed from: l */
    public boolean f4117l = false;

    /* renamed from: m */
    public List<Object> f4118m = new ArrayList();

    /* renamed from: n */
    public C0469VY f4119n;

    /* renamed from: o */
    public final Map<String, C0448UX> f4120o = new LinkedHashMap();

    /* renamed from: A */
    public static C0538YY m3770A() {
        C0538YY yy = new C0538YY();
        try {
            yy.mo1646a(System.getProperty("user.name"));
        } catch (AccessControlException unused) {
            yy.mo1646a("POI");
        }
        return yy;
    }

    /* renamed from: a */
    public static C0078DW m3771a() {
        C0078DW dw = new C0078DW();
        dw.mo154f(1536);
        dw.mo153e(5);
        dw.mo149a(4307);
        dw.mo150b(1996);
        dw.mo151c(65);
        dw.mo152d(6);
        return dw;
    }

    /* renamed from: b */
    public static C0097EW m3772b() {
        C0097EW ew = new C0097EW();
        ew.mo216b(0);
        return ew;
    }

    /* renamed from: b */
    public static C0250LW m3773b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Sheet");
        sb.append(i + 1);
        return new C0250LW(sb.toString());
    }

    /* renamed from: c */
    public static C0158HW m3774c() {
        C0158HW hw = new C0158HW();
        hw.mo341b(0);
        return hw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        r0.mo4876q(r12);
        r0.mo4866l(-11);
        r0.mo4852e(32);
        r0.mo4878r(-2048);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
        r0.mo4876q(0);
        r0.mo4866l(-11);
        r0.mo4852e(32);
        r0.mo4878r(-3072);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        r0.mo4852e(32);
        r0.mo4878r(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        r0.mo4857h(0);
        r0.mo4882t(0);
        r0.mo4849c(0);
        r0.mo4872o(8384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        r0.mo4876q(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        r0.mo4866l(1);
        r0.mo4852e(32);
        r0.mo4878r(23552);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static C0952nX m3775c(int r12) {
        /*
            nX r0 = new nX
            r0.<init>()
            r1 = 8
            r2 = 6
            r3 = 2
            r4 = 23552(0x5c00, float:3.3003E-41)
            r5 = -2048(0xfffffffffffff800, float:NaN)
            r6 = 1
            r7 = -3072(0xfffffffffffff400, float:NaN)
            r8 = -11
            r9 = 8384(0x20c0, float:1.1748E-41)
            r10 = 32
            r11 = 0
            switch(r12) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x0090;
                case 2: goto L_0x0090;
                case 3: goto L_0x008c;
                case 4: goto L_0x008c;
                case 5: goto L_0x0088;
                case 6: goto L_0x0088;
                case 7: goto L_0x0088;
                case 8: goto L_0x0088;
                case 9: goto L_0x0088;
                case 10: goto L_0x0088;
                case 11: goto L_0x0088;
                case 12: goto L_0x0088;
                case 13: goto L_0x0088;
                case 14: goto L_0x0088;
                case 15: goto L_0x007e;
                case 16: goto L_0x006c;
                case 17: goto L_0x0066;
                case 18: goto L_0x0060;
                case 19: goto L_0x005a;
                case 20: goto L_0x0054;
                case 21: goto L_0x0041;
                case 22: goto L_0x0030;
                case 23: goto L_0x0027;
                case 24: goto L_0x0020;
                case 25: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x00bb
        L_0x001c:
            r0.mo4874p(r2)
            goto L_0x0023
        L_0x0020:
            r0.mo4874p(r11)
        L_0x0023:
            r0.mo4876q(r1)
            goto L_0x0036
        L_0x0027:
            r0.mo4874p(r11)
            r12 = 49
            r0.mo4876q(r12)
            goto L_0x0036
        L_0x0030:
            r0.mo4874p(r2)
            r0.mo4876q(r11)
        L_0x0036:
            r0.mo4866l(r6)
            r0.mo4852e(r10)
            r0.mo4878r(r4)
            goto L_0x00af
        L_0x0041:
            r12 = 5
            r0.mo4874p(r12)
            r0.mo4876q(r11)
            r0.mo4866l(r6)
            r0.mo4852e(r10)
            r12 = 2048(0x800, float:2.87E-42)
            r0.mo4878r(r12)
            goto L_0x00af
        L_0x0054:
            r0.mo4874p(r6)
            r12 = 9
            goto L_0x0071
        L_0x005a:
            r0.mo4874p(r6)
            r12 = 42
            goto L_0x0071
        L_0x0060:
            r0.mo4874p(r6)
            r12 = 44
            goto L_0x0071
        L_0x0066:
            r0.mo4874p(r6)
            r12 = 41
            goto L_0x0071
        L_0x006c:
            r0.mo4874p(r6)
            r12 = 43
        L_0x0071:
            r0.mo4876q(r12)
            r0.mo4866l(r8)
            r0.mo4852e(r10)
            r0.mo4878r(r5)
            goto L_0x00af
        L_0x007e:
            r0.mo4874p(r11)
            r0.mo4876q(r11)
            r0.mo4866l(r6)
            goto L_0x00a9
        L_0x0088:
            r0.mo4874p(r11)
            goto L_0x0093
        L_0x008c:
            r0.mo4874p(r3)
            goto L_0x0093
        L_0x0090:
            r0.mo4874p(r6)
        L_0x0093:
            r0.mo4876q(r11)
            r0.mo4866l(r8)
            r0.mo4852e(r10)
            r0.mo4878r(r7)
            goto L_0x00af
        L_0x00a0:
            r0.mo4874p(r11)
            r0.mo4876q(r11)
            r0.mo4866l(r8)
        L_0x00a9:
            r0.mo4852e(r10)
            r0.mo4878r(r11)
        L_0x00af:
            r0.mo4857h(r11)
            r0.mo4882t(r11)
            r0.mo4849c(r11)
            r0.mo4872o(r9)
        L_0x00bb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1167xW.m3775c(int):nX");
    }

    /* renamed from: d */
    public static C1168xX m3776d(int i) {
        switch (i) {
            case 0:
                return new C1168xX(5, "\"$\"#,##0_);\\(\"$\"#,##0\\)");
            case 1:
                return new C1168xX(6, "\"$\"#,##0_);[Red]\\(\"$\"#,##0\\)");
            case 2:
                return new C1168xX(7, "\"$\"#,##0.00_);\\(\"$\"#,##0.00\\)");
            case 3:
                return new C1168xX(8, "\"$\"#,##0.00_);[Red]\\(\"$\"#,##0.00\\)");
            case 4:
                return new C1168xX(42, "_(\"$\"* #,##0_);_(\"$\"* \\(#,##0\\);_(\"$\"* \"-\"_);_(@_)");
            case 5:
                return new C1168xX(41, "_(* #,##0_);_(* \\(#,##0\\);_(* \"-\"_);_(@_)");
            case 6:
                return new C1168xX(44, "_(\"$\"* #,##0.00_);_(\"$\"* \\(#,##0.00\\);_(\"$\"* \"-\"??_);_(@_)");
            case 7:
                return new C1168xX(43, "_(* #,##0.00_);_(* \\(#,##0.00\\);_(* \"-\"??_);_(@_)");
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected id ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e */
    public static C0118FY m3777e(int i) {
        int i2;
        int i3;
        C0118FY fy = new C0118FY();
        int i4 = 3;
        if (i != 0) {
            if (i == 1) {
                fy.mo252c(17);
                i3 = 6;
            } else if (i == 2) {
                fy.mo252c(18);
                fy.mo250a(4);
                fy.mo251b(-1);
                return fy;
            } else if (i == 3) {
                fy.mo252c(19);
                i3 = 7;
            } else if (i != 4) {
                i4 = 5;
                if (i == 5) {
                    i2 = 20;
                }
                return fy;
            } else {
                i3 = 0;
                fy.mo252c(0);
            }
            fy.mo250a(i3);
            fy.mo251b(-1);
            return fy;
        }
        i2 = 16;
        fy.mo252c(i2);
        fy.mo250a(i4);
        fy.mo251b(-1);
        return fy;
    }

    /* renamed from: e */
    public static C0447UW m3778e() {
        C0447UW uw = new C0447UW();
        uw.mo1316b(1200);
        return uw;
    }

    /* renamed from: f */
    public static C0509XW m3779f() {
        C0509XW xw = new C0509XW();
        short s = 1;
        xw.mo1471c(1);
        if (Locale.getDefault().toString().equals("ru_RU")) {
            s = 7;
        }
        xw.mo1470b(s);
        return xw;
    }

    /* renamed from: g */
    public static C0557ZW m3780g() {
        return new C0557ZW(false);
    }

    /* renamed from: h */
    public static C0635bX m3781h() {
        C0635bX bXVar = new C0635bX();
        bXVar.mo1925b(0);
        return bXVar;
    }

    /* renamed from: i */
    public static C0952nX m3782i() {
        C0952nX nXVar = new C0952nX();
        nXVar.mo4874p(0);
        nXVar.mo4876q(0);
        nXVar.mo4866l(1);
        nXVar.mo4852e(32);
        nXVar.mo4878r(0);
        nXVar.mo4857h(0);
        nXVar.mo4882t(0);
        nXVar.mo4849c(0);
        nXVar.mo4872o(8384);
        nXVar.mo4886v(8);
        nXVar.mo4864k(8);
        nXVar.mo4880s(8);
        nXVar.mo4884u(8);
        return nXVar;
    }

    /* renamed from: j */
    public static C0931mX m3783j() {
        C0931mX mXVar = new C0931mX();
        mXVar.mo4770b(8);
        return mXVar;
    }

    /* renamed from: k */
    public static C1101uX m3784k() {
        C1101uX uXVar = new C1101uX();
        uXVar.mo5184b(14);
        return uXVar;
    }

    /* renamed from: l */
    public static C1121vX m3785l() {
        C1121vX vXVar = new C1121vX();
        vXVar.mo5237e(200);
        vXVar.mo5234b(0);
        vXVar.mo5236d(Short.MAX_VALUE);
        vXVar.mo5235c(400);
        vXVar.mo5233a("Arial");
        return vXVar;
    }

    /* renamed from: m */
    public static C0117FX m3786m() {
        C0117FX fx = new C0117FX();
        fx.mo247b(0);
        return fx;
    }

    /* renamed from: n */
    public static C0337PX m3787n() {
        C0337PX px = new C0337PX();
        px.mo1053a(0);
        px.mo1054b(0);
        return px;
    }

    /* renamed from: p */
    public static C0655cY m3788p() {
        return new C0655cY(0);
    }

    /* renamed from: q */
    public static C0744dY m3789q() {
        return new C0744dY(0);
    }

    /* renamed from: r */
    public static C0764eY m3790r() {
        C0764eY eYVar = new C0764eY();
        eYVar.mo4337a(true);
        return eYVar;
    }

    /* renamed from: s */
    public static C0848iY m3791s() {
        return new C0848iY(false);
    }

    /* renamed from: t */
    public static C0868jY m3792t() {
        return new C0868jY(false);
    }

    /* renamed from: u */
    public static C1062sY m3793u() {
        return new C1062sY(false);
    }

    /* renamed from: v */
    public static C0180IY m3794v() {
        return new C0180IY();
    }

    /* renamed from: w */
    public static C0338PY m3795w() {
        return new C0338PY(false);
    }

    /* renamed from: x */
    public static C0469VY m3796x() {
        C0469VY vy = new C0469VY();
        vy.mo1373c(360);
        vy.mo1377g(270);
        vy.mo1379h(14940);
        vy.mo1372b(9150);
        vy.mo1375e(56);
        vy.mo1370a(0);
        vy.mo1371b(0);
        vy.mo1374d(1);
        vy.mo1376f(600);
        return vy;
    }

    /* renamed from: y */
    public static C0490WY m3797y() {
        return new C0490WY(false);
    }

    /* renamed from: z */
    public static C1167xW m3798z() {
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4700a(f4107b, "creating new workbook from scratch");
        }
        C1167xW xWVar = new C1167xW();
        ArrayList arrayList = new ArrayList(30);
        xWVar.f4108c.mo5559a(arrayList);
        List<C1168xX> list = xWVar.f4112g;
        arrayList.add(m3771a());
        arrayList.add(new C0224KX(1200));
        arrayList.add(m3787n());
        arrayList.add(C0199JX.f486a);
        arrayList.add(m3770A());
        arrayList.add(m3778e());
        arrayList.add(m3780g());
        arrayList.add(m3794v());
        xWVar.f4108c.mo5580k(arrayList.size() - 1);
        arrayList.add(m3784k());
        arrayList.add(m3797y());
        arrayList.add(m3791s());
        xWVar.f4108c.mo5575i(arrayList.size() - 1);
        arrayList.add(m3788p());
        arrayList.add(m3792t());
        arrayList.add(m3789q());
        xWVar.f4119n = m3796x();
        arrayList.add(xWVar.f4119n);
        arrayList.add(m3772b());
        xWVar.f4108c.mo5562c(arrayList.size() - 1);
        arrayList.add(m3786m());
        arrayList.add(m3781h());
        arrayList.add(m3790r());
        arrayList.add(m3793u());
        arrayList.add(m3774c());
        arrayList.add(m3785l());
        arrayList.add(m3785l());
        arrayList.add(m3785l());
        arrayList.add(m3785l());
        xWVar.f4108c.mo5568f(arrayList.size() - 1);
        xWVar.f4115j = 4;
        for (int i = 0; i <= 7; i++) {
            C1168xX d = m3776d(i);
            xWVar.f4116k = xWVar.f4116k >= d.mo5450i() ? xWVar.f4116k : d.mo5450i();
            list.add(d);
            arrayList.add(d);
        }
        for (int i2 = 0; i2 < 21; i2++) {
            arrayList.add(m3775c(i2));
            xWVar.f4114i++;
        }
        xWVar.f4108c.mo5581l(arrayList.size() - 1);
        for (int i3 = 0; i3 < 6; i3++) {
            arrayList.add(m3777e(i3));
        }
        arrayList.add(m3795w());
        for (int i4 = 0; i4 < 1; i4++) {
            C0250LW b = m3773b(i4);
            arrayList.add(b);
            xWVar.f4111f.add(b);
            xWVar.f4108c.mo5564d(arrayList.size() - 1);
        }
        arrayList.add(m3779f());
        for (int i5 = 0; i5 < 1; i5++) {
            xWVar.mo5428G().mo5482a(i5);
        }
        xWVar.f4109d = new C1149wY();
        arrayList.add(xWVar.f4109d);
        arrayList.add(m3783j());
        arrayList.add(C0867jX.f3179a);
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4700a(f4107b, "exit create new workbook from scratch");
        }
        return xWVar;
    }

    /* renamed from: B */
    public final void mo5423B() {
        C1208zW zWVar = this.f4108c;
        C0180IY iy = (C0180IY) zWVar.get(zWVar.mo5577j());
        short[] sArr = new short[this.f4111f.size()];
        for (short s = 0; s < sArr.length; s = (short) (s + 1)) {
            sArr[s] = s;
        }
        iy.mo397a(sArr);
    }

    /* renamed from: C */
    public List<C1168xX> mo5424C() {
        return this.f4112g;
    }

    /* renamed from: D */
    public int mo5425D() {
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4701a(f4107b, (Object) "getXF=", (Object) Integer.valueOf(this.f4114i));
        }
        return this.f4114i;
    }

    /* renamed from: E */
    public int mo5426E() {
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4701a(f4107b, (Object) "getNumSheets=", (Object) Integer.valueOf(this.f4111f.size()));
        }
        return this.f4111f.size();
    }

    /* renamed from: F */
    public int mo5427F() {
        return this.f4115j;
    }

    /* renamed from: G */
    public final C1186yW mo5428G() {
        if (this.f4110e == null) {
            this.f4110e = new C1186yW((short) mo5426E(), this.f4108c);
        }
        return this.f4110e;
    }

    /* renamed from: H */
    public int mo5429H() {
        C1149wY wYVar = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f4108c.size(); i2++) {
            C0933mY mYVar = this.f4108c.get(i2);
            if (mYVar.mo34e() != 449 || ((C0912lY) mYVar).mo4629h()) {
                if (mYVar instanceof C1149wY) {
                    wYVar = (C1149wY) mYVar;
                }
                i += (mYVar.mo34e() != 255 || wYVar == null) ? mYVar.mo163c() : wYVar.mo5385g();
            }
        }
        return i;
    }

    /* renamed from: I */
    public void mo5430I() {
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4700a(f4107b, "creating new SST via insertSST!");
        }
        this.f4109d = new C1149wY();
        C1208zW zWVar = this.f4108c;
        zWVar.mo5558a(zWVar.size() - 1, m3783j());
        C1208zW zWVar2 = this.f4108c;
        zWVar2.mo5558a(zWVar2.size() - 2, this.f4109d);
    }

    /* renamed from: J */
    public boolean mo5431J() {
        return this.f4117l;
    }

    /* renamed from: a */
    public int mo5432a(int i, byte[] bArr) {
        int i2;
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4700a(f4107b, "Serializing Workbook with offsets");
        }
        C1149wY wYVar = null;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        for (int i5 = 0; i5 < this.f4108c.size(); i5++) {
            C0933mY mYVar = this.f4108c.get(i5);
            if (mYVar.mo34e() != 449 || ((C0912lY) mYVar).mo4629h()) {
                if (mYVar instanceof C1149wY) {
                    wYVar = (C1149wY) mYVar;
                    i4 = i3;
                }
                if (mYVar.mo34e() == 255 && wYVar != null) {
                    mYVar = wYVar.mo5383a(i4 + i);
                }
                if (!(mYVar instanceof C0250LW)) {
                    i2 = mYVar.mo162a(i3 + i, bArr);
                } else if (!z) {
                    i2 = 0;
                    for (int i6 = 0; i6 < this.f4111f.size(); i6++) {
                        i2 += mo5441g(i6).mo162a(i3 + i + i2, bArr);
                    }
                    z = true;
                } else {
                    i2 = 0;
                }
                i3 += i2;
            }
        }
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4700a(f4107b, "Exiting serialize workbook");
        }
        return i3;
    }

    /* renamed from: a */
    public int mo5433a(C0139GZ gz) {
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4701a(f4107b, (Object) "insert to sst string='", (Object) gz);
        }
        if (this.f4109d == null) {
            mo5430I();
        }
        return this.f4109d.mo5382a(gz);
    }

    /* renamed from: a */
    public String mo5434a(int i, int i2) {
        return this.f4110e.mo5484a(i, i2);
    }

    /* renamed from: a */
    public final void mo5435a(int i) {
        if (this.f4111f.size() <= i) {
            if (this.f4111f.size() + 1 > i) {
                C0250LW b = m3773b(i);
                C1208zW zWVar = this.f4108c;
                zWVar.mo5558a(zWVar.mo5561c() + 1, b);
                C1208zW zWVar2 = this.f4108c;
                zWVar2.mo5564d(zWVar2.mo5561c() + 1);
                this.f4111f.add(b);
                mo5428G().mo5482a(i);
            } else {
                throw new RuntimeException("Sheet number out of bounds!");
            }
        } else if (this.f4108c.mo5577j() > 0) {
            C1208zW zWVar3 = this.f4108c;
            if (((C0180IY) zWVar3.get(zWVar3.mo5577j())).f399b.length >= this.f4111f.size()) {
                return;
            }
        } else {
            return;
        }
        mo5423B();
    }

    /* renamed from: a */
    public void mo5436a(int i, String str) {
        mo5435a(i);
        ((C0250LW) this.f4111f.get(i)).mo849a(str);
    }

    /* renamed from: a */
    public boolean mo5437a(String str, int i) {
        if (str.length() > 31) {
            str = str.substring(0, 31);
        }
        for (int i2 = 0; i2 < this.f4111f.size(); i2++) {
            C0250LW g = mo5441g(i2);
            if (i != i2) {
                String i3 = g.mo851i();
                if (i3.length() > 31) {
                    i3 = i3.substring(0, 31);
                }
                if (str.equalsIgnoreCase(i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo5438b(int i, int i2) {
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4702a(f4107b, "setting bof for sheetnum =", Integer.valueOf(i), " at pos=", Integer.valueOf(i2));
        }
        mo5435a(i);
        mo5441g(i).mo848a(i2);
    }

    /* renamed from: d */
    public C0952nX mo5439d() {
        C0952nX i = m3782i();
        C1208zW zWVar = this.f4108c;
        zWVar.mo5558a(zWVar.mo5579k() + 1, i);
        C1208zW zWVar2 = this.f4108c;
        zWVar2.mo5581l(zWVar2.mo5579k() + 1);
        this.f4114i++;
        return i;
    }

    /* renamed from: f */
    public String mo5440f(int i) {
        int c = this.f4110e.mo5486c(i);
        String str = "";
        return (c >= 0 && c < this.f4111f.size()) ? mo5447m(c) : str;
    }

    /* renamed from: g */
    public final C0250LW mo5441g(int i) {
        return (C0250LW) this.f4111f.get(i);
    }

    /* renamed from: h */
    public C0952nX mo5442h(int i) {
        return (C0952nX) this.f4108c.get((this.f4108c.mo5579k() - (this.f4114i - 1)) + i);
    }

    /* renamed from: i */
    public C0935a mo5443i(int i) {
        String[] b = this.f4110e.mo5485b(i);
        if (b == null) {
            return null;
        }
        return new C0935a(b[0], b[1]);
    }

    /* renamed from: j */
    public C1121vX mo5444j(int i) {
        int i2 = i > 4 ? i - 1 : i;
        if (i2 <= this.f4115j - 1) {
            C1208zW zWVar = this.f4108c;
            return (C1121vX) zWVar.get((zWVar.mo5565e() - (this.f4115j - 1)) + i2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("There are only ");
        sb.append(this.f4115j);
        sb.append(" font records, you asked for ");
        sb.append(i);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: k */
    public C0468VX mo5445k(int i) {
        return this.f4110e.mo5487d(i);
    }

    /* renamed from: l */
    public C0139GZ mo5446l(int i) {
        if (this.f4109d == null) {
            mo5430I();
        }
        C0139GZ b = this.f4109d.mo5384b(i);
        if (f4106a.mo4705a(nda.f3486a)) {
            f4106a.mo4702a(f4107b, "Returning SST for index=", Integer.valueOf(i), " String= ", b);
        }
        return b;
    }

    /* renamed from: m */
    public String mo5447m(int i) {
        return mo5441g(i).mo851i();
    }

    /* renamed from: o */
    public C1121vX mo5448o() {
        C1121vX l = m3785l();
        C1208zW zWVar = this.f4108c;
        zWVar.mo5558a(zWVar.mo5565e() + 1, l);
        C1208zW zWVar2 = this.f4108c;
        zWVar2.mo5568f(zWVar2.mo5565e() + 1);
        this.f4115j++;
        return l;
    }
}
