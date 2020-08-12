package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: fZ */
public final class C0788fZ extends C0765eZ {

    /* renamed from: a */
    public int f2981a;

    /* renamed from: b */
    public int f2982b;

    /* renamed from: c */
    public final Map<Integer, C1102uY> f2983c;

    /* renamed from: d */
    public final C0849iZ f2984d;

    /* renamed from: e */
    public final List<C0933mY> f2985e;

    /* renamed from: f */
    public final C0827hZ f2986f;

    public C0788fZ() {
        this(C0827hZ.m2796a());
    }

    public C0788fZ(C0827hZ hZVar) {
        this.f2981a = -1;
        this.f2982b = -1;
        if (hZVar != null) {
            this.f2983c = new TreeMap();
            this.f2984d = new C0849iZ();
            this.f2985e = new ArrayList();
            this.f2986f = hZVar;
            return;
        }
        throw new IllegalArgumentException("SharedValueManager must be provided.");
    }

    /* renamed from: a */
    public final int mo4383a(int i) {
        int i2 = ((i + 1) * 32) - 1;
        if (i2 >= this.f2983c.size()) {
            i2 = this.f2983c.size() - 1;
        }
        Iterator it = this.f2983c.values().iterator();
        C1102uY uYVar = null;
        for (int i3 = 0; i3 <= i2; i3++) {
            uYVar = (C1102uY) it.next();
        }
        if (uYVar != null) {
            return uYVar.mo5199q();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Did not find start row for block ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public final int mo4384a(int i, C0768c cVar) {
        int i2 = i * 32;
        int i3 = i2 + 32;
        Iterator it = this.f2983c.values().iterator();
        int i4 = 0;
        int i5 = 0;
        while (i5 < i2) {
            it.next();
            i5++;
        }
        while (it.hasNext()) {
            int i6 = i5 + 1;
            if (i5 >= i3) {
                break;
            }
            C0933mY mYVar = (C0933mY) it.next();
            i4 += mYVar.mo163c();
            cVar.mo4341a(mYVar);
            i5 = i6;
        }
        return i4;
    }

    /* renamed from: a */
    public C0637bZ mo4385a(int i, int i2) {
        C1189yX yXVar = new C1189yX();
        yXVar.mo1204a(i);
        yXVar.mo1206b((short) i2);
        return new C0637bZ(yXVar, null, this.f2986f);
    }

    /* renamed from: a */
    public void mo4386a(C0420TW tw) {
        this.f2984d.mo4525a(tw);
    }

    /* renamed from: a */
    public void mo1812a(C0768c cVar) {
        C0766a aVar = new C0766a(cVar, 0);
        int d = mo4393d();
        for (int i = 0; i < d; i++) {
            int a = mo4384a(i, cVar);
            int i2 = a + 0;
            int a2 = mo4383a(i);
            C0536a aVar2 = new C0536a();
            int i3 = a - 20;
            for (int e = mo4395e(i); e <= a2; e++) {
                if (this.f2984d.mo4527b(e)) {
                    aVar.mo4340a(0);
                    this.f2984d.mo4524a(e, (C0768c) aVar);
                    int a3 = aVar.mo4339a();
                    i2 += a3;
                    aVar2.mo1643a(i3);
                    i3 = a3;
                }
            }
            cVar.mo4341a(aVar2.mo1644b(i2));
        }
        for (int i4 = 0; i4 < this.f2985e.size(); i4++) {
            cVar.mo4341a((C0933mY) this.f2985e.get(i4));
        }
    }

    /* renamed from: a */
    public void mo4387a(C1102uY uYVar) {
        this.f2983c.put(Integer.valueOf(uYVar.mo5199q()), uYVar);
        int q = uYVar.mo5199q();
        int i = this.f2981a;
        if (q < i || i == -1) {
            this.f2981a = uYVar.mo5199q();
        }
        int q2 = uYVar.mo5199q();
        int i2 = this.f2982b;
        if (q2 > i2 || i2 == -1) {
            this.f2982b = uYVar.mo5199q();
        }
    }

    /* renamed from: b */
    public C0179IX mo4388b(int i, int i2) {
        C0179IX ix = new C0179IX();
        ix.mo392d(this.f2981a);
        ix.mo393e(this.f2982b + 1);
        int d = mo4393d();
        int c = i + C0179IX.m369c(d) + i2;
        for (int i3 = 0; i3 < d; i3++) {
            int c2 = c + mo4392c(i3) + this.f2984d.mo4521a(mo4395e(i3), mo4383a(i3));
            ix.mo390a(c2);
            c = c2 + (mo4394d(i3) * 2) + 8;
        }
        return ix;
    }

    /* renamed from: b */
    public C1102uY mo4389b(int i) {
        int c = C1247lca.EXCEL97.mo4697c();
        if (i >= 0 && i <= c) {
            return (C1102uY) this.f2983c.get(Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The row number must be between 0 and ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo4390b(C0420TW tw) {
        if (tw instanceof C0637bZ) {
            ((C0637bZ) tw).mo1947i();
        }
        this.f2984d.mo4526b(tw);
    }

    /* renamed from: b */
    public void mo4391b(C1102uY uYVar) {
        int q = uYVar.mo5199q();
        this.f2984d.mo4523a(q);
        Integer valueOf = Integer.valueOf(q);
        C1102uY uYVar2 = (C1102uY) this.f2983c.remove(valueOf);
        if (uYVar2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid row index (");
            sb.append(valueOf.intValue());
            sb.append(")");
            throw new RuntimeException(sb.toString());
        } else if (uYVar != uYVar2) {
            this.f2983c.put(valueOf, uYVar2);
            throw new RuntimeException("Attempt to remove row that does not belong to this sheet");
        }
    }

    /* renamed from: c */
    public final int mo4392c(int i) {
        return mo4394d(i) * 20;
    }

    /* renamed from: d */
    public int mo4393d() {
        int size = this.f2983c.size() / 32;
        return this.f2983c.size() % 32 != 0 ? size + 1 : size;
    }

    /* renamed from: d */
    public int mo4394d(int i) {
        int i2 = i * 32;
        int i3 = (i2 + 32) - 1;
        if (i3 >= this.f2983c.size()) {
            i3 = this.f2983c.size() - 1;
        }
        return (i3 - i2) + 1;
    }

    /* renamed from: e */
    public final int mo4395e(int i) {
        int i2 = i * 32;
        Iterator it = this.f2983c.values().iterator();
        C1102uY uYVar = null;
        for (int i3 = 0; i3 <= i2; i3++) {
            uYVar = (C1102uY) it.next();
        }
        if (uYVar != null) {
            return uYVar.mo5199q();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Did not find start row for block ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }
}
