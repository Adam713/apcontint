package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: jW */
public class C0865jW {

    /* renamed from: a */
    public Map<Long, String> f3169a;

    /* renamed from: b */
    public C0446UV f3170b;

    /* renamed from: c */
    public long f3171c;

    /* renamed from: d */
    public int f3172d;

    /* renamed from: e */
    public C0785fW[] f3173e;

    /* renamed from: f */
    public boolean f3174f;

    /* renamed from: jW$a */
    class C0866a implements Comparable<C0866a> {

        /* renamed from: a */
        public int f3175a;

        /* renamed from: b */
        public int f3176b;

        /* renamed from: c */
        public int f3177c;

        public C0866a() {
        }

        /* renamed from: a */
        public int compareTo(C0866a aVar) {
            int i = aVar.f3176b;
            int i2 = this.f3176b;
            if (i2 < i) {
                return -1;
            }
            return i2 == i ? 0 : 1;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0866a.class.getName());
            stringBuffer.append("[id=");
            stringBuffer.append(this.f3175a);
            stringBuffer.append(", offset=");
            stringBuffer.append(this.f3176b);
            stringBuffer.append(", length=");
            stringBuffer.append(this.f3177c);
            stringBuffer.append(']');
            return stringBuffer.toString();
        }
    }

    public C0865jW() {
    }

    public C0865jW(byte[] bArr, int i) {
        int i2;
        this.f3170b = new C0446UV(bArr, i);
        this.f3171c = dda.m2604e(bArr, i + 16);
        int i3 = (int) this.f3171c;
        this.f3172d = (int) dda.m2604e(bArr, i3);
        int i4 = i3 + 4;
        int e = (int) dda.m2604e(bArr, i4);
        int i5 = i4 + 4;
        this.f3173e = new C0785fW[e];
        ArrayList<C0866a> arrayList = new ArrayList<>(e);
        int i6 = 0;
        int i7 = i5;
        for (int i8 = 0; i8 < this.f3173e.length; i8++) {
            C0866a aVar = new C0866a();
            aVar.f3175a = (int) dda.m2604e(bArr, i7);
            int i9 = i7 + 4;
            aVar.f3176b = (int) dda.m2604e(bArr, i9);
            i7 = i9 + 4;
            arrayList.add(aVar);
        }
        Collections.sort(arrayList);
        int i10 = 0;
        while (true) {
            i2 = e - 1;
            if (i10 >= i2) {
                break;
            }
            C0866a aVar2 = (C0866a) arrayList.get(i10);
            i10++;
            aVar2.f3177c = ((C0866a) arrayList.get(i10)).f3176b - aVar2.f3176b;
        }
        if (e > 0) {
            C0866a aVar3 = (C0866a) arrayList.get(i2);
            aVar3.f3177c = this.f3172d - aVar3.f3176b;
        }
        Iterator it = arrayList.iterator();
        int i11 = -1;
        while (i11 == -1 && it.hasNext()) {
            C0866a aVar4 = (C0866a) it.next();
            if (aVar4.f3175a == 1) {
                int i12 = (int) (this.f3171c + ((long) aVar4.f3176b));
                long e2 = dda.m2604e(bArr, i12);
                int i13 = i12 + 4;
                if (e2 == 2) {
                    i11 = dda.m2605f(bArr, i13);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Value type of property ID 1 is not VT_I2 but ");
                    sb.append(e2);
                    sb.append(".");
                    throw new C0508XV(sb.toString());
                }
            }
        }
        for (C0866a aVar5 : arrayList) {
            C0785fW fWVar = new C0785fW((long) aVar5.f3175a, bArr, ((long) aVar5.f3176b) + this.f3171c, aVar5.f3177c, i11);
            C0785fW fWVar2 = fWVar.mo4365a() == 1 ? new C0785fW(fWVar.mo4365a(), fWVar.mo4368b(), Integer.valueOf(i11)) : fWVar;
            int i14 = i6 + 1;
            this.f3173e[i6] = fWVar2;
            i6 = i14;
        }
        this.f3169a = (Map) mo1979a(0);
    }

    /* renamed from: a */
    public int mo4547a() {
        Integer num = (Integer) mo1979a(1);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public Object mo1979a(long j) {
        int i = 0;
        this.f3174f = false;
        while (true) {
            C0785fW[] fWVarArr = this.f3173e;
            if (i >= fWVarArr.length) {
                this.f3174f = true;
                return null;
            } else if (j == fWVarArr[i].mo4365a()) {
                return this.f3173e[i].mo4369c();
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    public final C0785fW[] mo4548a(C0785fW[] fWVarArr, int i) {
        C0785fW[] fWVarArr2 = new C0785fW[(fWVarArr.length - 1)];
        if (i > 0) {
            System.arraycopy(fWVarArr, 0, fWVarArr2, 0, i);
        }
        System.arraycopy(fWVarArr, i + 1, fWVarArr2, i, fWVarArr2.length - i);
        return fWVarArr2;
    }

    /* renamed from: b */
    public Map<Long, String> mo4549b() {
        return this.f3169a;
    }

    /* renamed from: c */
    public C0446UV mo4550c() {
        return this.f3170b;
    }

    /* renamed from: d */
    public long mo4551d() {
        return this.f3171c;
    }

    /* renamed from: e */
    public C0785fW[] mo1986e() {
        return this.f3173e;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0865jW)) {
            C0865jW jWVar = (C0865jW) obj;
            if (!jWVar.mo4550c().equals(mo4550c())) {
                return false;
            }
            C0785fW[] fWVarArr = new C0785fW[mo1986e().length];
            C0785fW[] fWVarArr2 = new C0785fW[jWVar.mo1986e().length];
            System.arraycopy(mo1986e(), 0, fWVarArr, 0, fWVarArr.length);
            System.arraycopy(jWVar.mo1986e(), 0, fWVarArr2, 0, fWVarArr2.length);
            C0785fW fWVar = null;
            C0785fW[] fWVarArr3 = fWVarArr;
            int i = 0;
            while (i < fWVarArr3.length) {
                long a = fWVarArr3[i].mo4365a();
                if (a == 0) {
                    fWVar = fWVarArr3[i];
                    fWVarArr3 = mo4548a(fWVarArr3, i);
                    i--;
                }
                if (a == 1) {
                    fWVarArr3 = mo4548a(fWVarArr3, i);
                    i--;
                }
                i++;
            }
            C0785fW fWVar2 = null;
            int i2 = 0;
            while (i2 < fWVarArr2.length) {
                long a2 = fWVarArr2[i2].mo4365a();
                if (a2 == 0) {
                    fWVar2 = fWVarArr2[i2];
                    fWVarArr2 = mo4548a(fWVarArr2, i2);
                    i2--;
                }
                if (a2 == 1) {
                    fWVarArr2 = mo4548a(fWVarArr2, i2);
                    i2--;
                }
                i2++;
            }
            if (fWVarArr3.length != fWVarArr2.length) {
                return false;
            }
            boolean z = (fWVar == null || fWVar2 == null) ? fWVar == null && fWVar2 == null : fWVar.mo4369c().equals(fWVar2.mo4369c());
            if (z) {
                return C0999pW.m3305a((Object[]) fWVarArr3, (Object[]) fWVarArr2);
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo1987f() {
        return this.f3173e.length;
    }

    /* renamed from: g */
    public int mo1988g() {
        return this.f3172d;
    }

    public int hashCode() {
        long hashCode = ((long) mo4550c().hashCode()) + 0;
        for (C0785fW hashCode2 : mo1986e()) {
            hashCode += (long) hashCode2.hashCode();
        }
        return (int) (hashCode & 4294967295L);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        C0785fW[] e = mo1986e();
        stringBuffer.append(getClass().getName());
        stringBuffer.append('[');
        stringBuffer.append("formatID: ");
        stringBuffer.append(mo4550c());
        stringBuffer.append(", offset: ");
        stringBuffer.append(mo4551d());
        stringBuffer.append(", propertyCount: ");
        stringBuffer.append(mo1987f());
        stringBuffer.append(", size: ");
        stringBuffer.append(mo1988g());
        stringBuffer.append(", properties: [\n");
        for (C0785fW fWVar : e) {
            stringBuffer.append(fWVar.toString());
            stringBuffer.append(",\n");
        }
        stringBuffer.append(']');
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
