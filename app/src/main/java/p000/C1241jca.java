package p000;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jca reason: case insensitive filesystem */
public class C1241jca implements C1217bca, Eba {

    /* renamed from: a */
    public C1214aca f3193a;

    /* renamed from: b */
    public List f3194b = new ArrayList();

    /* renamed from: c */
    public int f3195c;

    /* renamed from: d */
    public Yba f3196d;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<Nba>, for r5v0, types: [java.util.List, java.util.List<Nba>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1241jca(p000.Bba r4, List<p000.Nba> r5, p000.Yba r6) {
        /*
            r3 = this;
            r3.<init>()
            aca r0 = new aca
            r0.<init>(r4)
            r3.f3193a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f3194b = r0
            r3.f3196d = r6
            java.util.Iterator r5 = r5.iterator()
        L_0x0017:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0047
            java.lang.Object r6 = r5.next()
            Nba r6 = (p000.Nba) r6
            bca[] r0 = r6.mo947c()
            int r1 = r0.length
            if (r1 == 0) goto L_0x0042
            aca r1 = r3.f3193a
            int r2 = r0.length
            int r1 = r1.mo1882b(r2)
            r6.mo225a(r1)
            r6 = 0
        L_0x0035:
            int r1 = r0.length
            if (r6 >= r1) goto L_0x0017
            java.util.List r1 = r3.f3194b
            r2 = r0[r6]
            r1.add(r2)
            int r6 = r6 + 1
            goto L_0x0035
        L_0x0042:
            r0 = -2
            r6.mo225a(r0)
            goto L_0x0017
        L_0x0047:
            aca r5 = r3.f3193a
            r5.mo1884d()
            Yba r5 = r3.f3196d
            java.util.List r6 = r3.f3194b
            int r6 = r6.size()
            r5.mo1435d(r6)
            java.util.List r5 = r3.f3194b
            int r4 = p000.C1244kca.m2926a(r4, r5)
            r3.f3195c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1241jca.<init>(Bba, java.util.List, Yba):void");
    }

    /* renamed from: a */
    public int mo224a() {
        return this.f3195c;
    }

    /* renamed from: a */
    public void mo225a(int i) {
        this.f3196d.mo1436e(i);
    }

    /* renamed from: a */
    public void mo944a(OutputStream outputStream) {
        for (C1217bca a : this.f3194b) {
            a.mo944a(outputStream);
        }
    }

    /* renamed from: b */
    public C1214aca mo4561b() {
        return this.f3193a;
    }

    /* renamed from: c */
    public int mo4562c() {
        return (this.f3195c + 15) / 16;
    }
}
