package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hZ */
public final class C0827hZ {

    /* renamed from: a */
    public static final Comparator<C0828a> f3078a = new C0807gZ();

    /* renamed from: b */
    public final List<C0035BW> f3079b;

    /* renamed from: c */
    public final C0200JY[] f3080c;

    /* renamed from: d */
    public final Map<C0037BY, C0828a> f3081d;

    /* renamed from: e */
    public C0828a[] f3082e;

    /* renamed from: hZ$a */
    private static final class C0828a {

        /* renamed from: a */
        public final C0037BY f3083a;

        /* renamed from: b */
        public final C0637bZ[] f3084b;

        /* renamed from: c */
        public int f3085c;

        /* renamed from: d */
        public final Mca f3086d;

        public C0828a(C0037BY by, Mca mca) {
            if (by.mo113b(mca.mo913c(), mca.mo912b())) {
                this.f3083a = by;
                this.f3086d = mca;
                this.f3084b = new C0637bZ[(((by.mo116k() - by.mo114i()) + 1) * ((by.mo117l() - by.mo115j()) + 1))];
                this.f3085c = 0;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("First formula cell ");
            sb.append(mca.mo910a());
            sb.append(" is not shared formula range ");
            sb.append(by.mo118m().toString());
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C0037BY mo4495a() {
            return this.f3083a;
        }

        /* renamed from: a */
        public void mo4496a(C0637bZ bZVar) {
            if (this.f3085c != 0 || (this.f3086d.mo913c() == bZVar.getRow() && this.f3086d.mo912b() == bZVar.mo280b())) {
                int i = this.f3085c;
                C0637bZ[] bZVarArr = this.f3084b;
                if (i < bZVarArr.length) {
                    this.f3085c = i + 1;
                    bZVarArr[i] = bZVar;
                    return;
                }
                throw new RuntimeException("Too many formula records for shared formula group");
            }
            throw new IllegalStateException("shared formula coding error");
        }

        /* renamed from: a */
        public boolean mo4497a(int i, int i2) {
            return this.f3086d.mo913c() == i && this.f3086d.mo912b() == i2;
        }

        /* renamed from: b */
        public void mo4498b() {
            for (int i = 0; i < this.f3085c; i++) {
                this.f3084b[i].mo1948j();
            }
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            stringBuffer.append(C0828a.class.getName());
            stringBuffer.append(" [");
            stringBuffer.append(this.f3083a.mo118m().toString());
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
    }

    public C0827hZ(C0037BY[] byArr, Mca[] mcaArr, C0035BW[] bwArr, C0200JY[] jyArr) {
        int length = byArr.length;
        if (length == mcaArr.length) {
            this.f3079b = m2797a((Z[]) bwArr);
            this.f3080c = jyArr;
            HashMap hashMap = new HashMap((length * 3) / 2);
            for (int i = 0; i < length; i++) {
                C0037BY by = byArr[i];
                hashMap.put(by, new C0828a(by, mcaArr[i]));
            }
            this.f3081d = hashMap;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("array sizes don't match: ");
        sb.append(length);
        sb.append("!=");
        sb.append(mcaArr.length);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static C0828a m2795a(C0828a[] aVarArr, Mca mca) {
        int c = mca.mo913c();
        short b = mca.mo912b();
        for (C0828a aVar : aVarArr) {
            if (aVar.mo4497a(c, b)) {
                return aVar;
            }
        }
        throw new RuntimeException("Failed to find a matching shared formula record");
    }

    /* renamed from: a */
    public static C0827hZ m2796a() {
        return new C0827hZ(new C0037BY[0], new Mca[0], new C0035BW[0], new C0200JY[0]);
    }

    /* renamed from: a */
    public static <Z> List<Z> m2797a(Z[] zArr) {
        ArrayList arrayList = new ArrayList(zArr.length);
        for (Z add : zArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public C0035BW mo4490a(int i, int i2) {
        for (C0035BW bw : this.f3079b) {
            if (bw.mo112a(i, i2)) {
                return bw;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0037BY mo4491a(Mca mca, C0637bZ bZVar) {
        C0828a a = m2795a(mo4494b(), mca);
        a.mo4496a(bZVar);
        return a.mo4495a();
    }

    /* renamed from: a */
    public C0061CY mo4492a(C0637bZ bZVar) {
        C0200JY[] jyArr;
        C1285yba d = bZVar.mo1943e().mo5497m().mo4980d();
        if (d == null) {
            return null;
        }
        int c = d.mo913c();
        short b = d.mo912b();
        if (bZVar.getRow() == c && bZVar.mo280b() == b) {
            C0828a[] b2 = mo4494b();
            for (C0828a aVar : b2) {
                if (aVar.mo4497a(c, b)) {
                    return aVar.mo4495a();
                }
            }
            for (C0200JY jy : this.f3080c) {
                if (jy.mo112a(c, b)) {
                    return jy;
                }
            }
            for (C0035BW bw : this.f3079b) {
                if (bw.mo112a(c, b)) {
                    return bw;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo4493a(C0037BY by) {
        C0828a aVar = (C0828a) this.f3081d.remove(by);
        if (aVar != null) {
            this.f3082e = null;
            aVar.mo4498b();
            return;
        }
        throw new IllegalStateException("Failed to find formulas for shared formula");
    }

    /* renamed from: b */
    public final C0828a[] mo4494b() {
        if (this.f3082e == null) {
            C0828a[] aVarArr = new C0828a[this.f3081d.size()];
            this.f3081d.values().toArray(aVarArr);
            Arrays.sort(aVarArr, f3078a);
            this.f3082e = aVarArr;
        }
        return this.f3082e;
    }
}
