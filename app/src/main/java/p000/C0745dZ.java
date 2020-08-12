package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dZ */
public final class C0745dZ extends C0765eZ {

    /* renamed from: a */
    public C0587_X f2870a = new C0137GX();

    /* renamed from: b */
    public C0587_X f2871b = new C0423TY();

    /* renamed from: c */
    public C0098EX f2872c;

    /* renamed from: d */
    public C1148wX f2873d;

    /* renamed from: e */
    public C0036BX f2874e;

    /* renamed from: f */
    public C0402SY f2875f;

    /* renamed from: g */
    public C0315OX f2876g;

    /* renamed from: h */
    public C1082tY f2877h;

    /* renamed from: i */
    public C0272MY f2878i;

    /* renamed from: j */
    public C0198JW f2879j;

    /* renamed from: k */
    public final List<C0746a> f2880k = new ArrayList();

    /* renamed from: l */
    public C0826hY f2881l;

    /* renamed from: m */
    public C0933mY f2882m;

    /* renamed from: n */
    public C0079DX f2883n;

    /* renamed from: o */
    public List<C0079DX> f2884o = new ArrayList();

    /* renamed from: p */
    public C0933mY f2885p;

    /* renamed from: dZ$a */
    private static final class C0746a extends C0765eZ {

        /* renamed from: a */
        public static final C0488WW[] f2886a = new C0488WW[0];

        /* renamed from: b */
        public final C0933mY f2887b;

        /* renamed from: c */
        public C0488WW[] f2888c;

        /* renamed from: a */
        public void mo1812a(C0768c cVar) {
            cVar.mo4341a(this.f2887b);
            int i = 0;
            while (true) {
                C0488WW[] wwArr = this.f2888c;
                if (i < wwArr.length) {
                    cVar.mo4341a(wwArr[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public C0745dZ() {
        String str = "";
        this.f2872c = new C0098EX(str);
        this.f2873d = new C1148wX(str);
        this.f2874e = m2577d();
        this.f2875f = m2579f();
        this.f2881l = m2578e();
    }

    /* renamed from: a */
    public static void m2575a(C0587_X _x, C0768c cVar) {
        if (_x != null && !_x.mo1809j()) {
            cVar.mo4341a(_x);
        }
    }

    /* renamed from: a */
    public static void m2576a(C0933mY mYVar, C0768c cVar) {
        if (mYVar != null) {
            cVar.mo4341a(mYVar);
        }
    }

    /* renamed from: d */
    public static C0036BX m2577d() {
        C0036BX bx = new C0036BX();
        bx.mo74a(false);
        return bx;
    }

    /* renamed from: e */
    public static C0826hY m2578e() {
        C0826hY hYVar = new C0826hY();
        hYVar.mo4469h(1);
        hYVar.mo4470i(100);
        hYVar.mo4467g(1);
        hYVar.mo4464d(1);
        hYVar.mo4463c(1);
        hYVar.mo4466f(2);
        hYVar.mo4465e(300);
        hYVar.mo4473j(300);
        hYVar.mo4461b(0.5d);
        hYVar.mo4460a(0.5d);
        hYVar.mo4462b(1);
        return hYVar;
    }

    /* renamed from: f */
    public static C0402SY m2579f() {
        C0402SY sy = new C0402SY();
        sy.mo1211a(false);
        return sy;
    }

    /* renamed from: a */
    public void mo1812a(C0768c cVar) {
        m2575a(this.f2870a, cVar);
        m2575a(this.f2871b, cVar);
        C0098EX ex = this.f2872c;
        String str = "";
        if (ex == null) {
            ex = new C0098EX(str);
        }
        cVar.mo4341a(ex);
        C1148wX wXVar = this.f2873d;
        if (wXVar == null) {
            wXVar = new C1148wX(str);
        }
        cVar.mo4341a(wXVar);
        m2576a((C0933mY) this.f2874e, cVar);
        m2576a((C0933mY) this.f2875f, cVar);
        m2576a((C0933mY) this.f2876g, cVar);
        m2576a((C0933mY) this.f2877h, cVar);
        m2576a((C0933mY) this.f2878i, cVar);
        m2576a((C0933mY) this.f2879j, cVar);
        for (C0746a a : this.f2880k) {
            a.mo1812a(cVar);
        }
        m2576a((C0933mY) this.f2881l, cVar);
        m2576a(this.f2882m, cVar);
        m2576a(this.f2885p, cVar);
        m2576a((C0933mY) this.f2883n, cVar);
    }
}
