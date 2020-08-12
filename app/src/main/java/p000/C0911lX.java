package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: lX */
public final class C0911lX extends C0016AW {

    /* renamed from: d */
    public static nda f3299d = mda.m3128a(C0911lX.class);

    /* renamed from: e */
    public C1264rba f3300e;

    /* renamed from: f */
    public Map<C0377RV, C0933mY> f3301f;

    /* renamed from: g */
    public List f3302g;

    /* renamed from: a */
    public int mo162a(int i, byte[] bArr) {
        mo4628k();
        List<C0377RV> h = mo26h();
        byte[] bArr2 = new byte[mo4627a(h)];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (C0377RV a : h) {
            i2 += a.mo1145a(i2, bArr2, new C0886kX(this, arrayList, arrayList2));
        }
        arrayList2.add(0, null);
        arrayList.add(0, null);
        int i3 = i;
        int i4 = 1;
        while (i4 < arrayList2.size()) {
            int intValue = ((Integer) arrayList.get(i4)).intValue() - 1;
            int intValue2 = i4 == 1 ? 0 : ((Integer) arrayList.get(i4 - 1)).intValue();
            C0825hX hXVar = new C0825hX();
            byte[] bArr3 = new byte[((intValue - intValue2) + 1)];
            System.arraycopy(bArr2, intValue2, bArr3, 0, bArr3.length);
            hXVar.mo4459a(bArr3);
            int a2 = i3 + hXVar.mo162a(i3, bArr);
            i3 = a2 + ((C0933mY) this.f3301f.get(arrayList2.get(i4))).mo162a(a2, bArr);
            i4++;
        }
        for (int i5 = 0; i5 < this.f3302g.size(); i5++) {
            i3 += ((C0933mY) this.f3302g.get(i5)).mo162a(i3, bArr);
        }
        int i6 = i3 - i;
        if (i6 == mo163c()) {
            return i6;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i6);
        sb.append(" bytes written but getRecordSize() reports ");
        sb.append(mo163c());
        throw new C1001pY(sb.toString());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<RV>, for r3v0, types: [java.util.List, java.util.List<RV>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4627a(List<C0377RV> r3) {
        /*
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L_0x0005:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0017
            java.lang.Object r1 = r3.next()
            RV r1 = (p000.C0377RV) r1
            int r1 = r1.mo1144a()
            int r0 = r0 + r1
            goto L_0x0005
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0911lX.mo4627a(java.util.List):int");
    }

    /* renamed from: c */
    public int mo163c() {
        mo4628k();
        int a = mo4627a(mo26h()) + (this.f3301f.size() * 4);
        int i = 0;
        int i2 = 0;
        for (C0933mY c : this.f3301f.values()) {
            i2 += c.mo163c();
        }
        for (C0933mY c2 : this.f3302g) {
            i += c2.mo163c();
        }
        return a + i2 + i;
    }

    /* renamed from: e */
    public short mo34e() {
        return 9876;
    }

    /* renamed from: j */
    public String mo28j() {
        return "ESCHERAGGREGATE";
    }

    /* renamed from: k */
    public final void mo4628k() {
        if (this.f3300e != null) {
            this.f3301f.clear();
            this.f3302g.clear();
            mo25g();
            this.f3300e.mo5077a();
            throw null;
        }
    }

    public String toString() {
        String property = System.getProperty("line.separtor");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        stringBuffer.append(mo28j());
        StringBuilder sb = new StringBuilder();
        sb.append(']');
        sb.append(property);
        stringBuffer.append(sb.toString());
        for (C0377RV obj : mo26h()) {
            stringBuffer.append(obj.toString());
        }
        stringBuffer.append("[/");
        stringBuffer.append(mo28j());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(']');
        sb2.append(property);
        stringBuffer.append(sb2.toString());
        return stringBuffer.toString();
    }
}
