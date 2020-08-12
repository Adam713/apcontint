package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: fW */
public class C0785fW {

    /* renamed from: a */
    public long f2972a;

    /* renamed from: b */
    public long f2973b;

    /* renamed from: c */
    public Object f2974c;

    public C0785fW() {
    }

    public C0785fW(long j, long j2, Object obj) {
        this.f2972a = j;
        this.f2973b = j2;
        this.f2974c = obj;
    }

    public C0785fW(long j, byte[] bArr, long j2, int i, int i2) {
        this.f2972a = j;
        if (j == 0) {
            this.f2974c = mo4366a(bArr, j2, i, i2);
            return;
        }
        int i3 = (int) j2;
        this.f2973b = dda.m2604e(bArr, i3);
        try {
            this.f2974c = C1040rW.m3391a(bArr, i3 + 4, i, (long) ((int) this.f2973b), i2);
        } catch (C0975oW e) {
            C1040rW.m3393a(e);
            this.f2974c = e.mo5100a();
        }
    }

    /* renamed from: a */
    public long mo4365a() {
        return this.f2972a;
    }

    /* renamed from: a */
    public Map mo4366a(byte[] bArr, long j, int i, int i2) {
        long j2;
        long j3;
        byte[] bArr2 = bArr;
        long j4 = j;
        int i3 = i2;
        if (j4 < 0 || j4 > ((long) bArr2.length)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal offset ");
            sb.append(j4);
            sb.append(" while HPSF stream contains ");
            sb.append(i);
            sb.append(" bytes.");
            throw new C0508XV(sb.toString());
        }
        int i4 = (int) j4;
        long e = dda.m2604e(bArr2, i4);
        int i5 = i4 + 4;
        HashMap hashMap = new HashMap((int) e, 1.0f);
        int i6 = i5;
        int i7 = 0;
        while (((long) i7) < e) {
            try {
                Long valueOf = Long.valueOf(dda.m2604e(bArr2, i6));
                int i8 = i6 + 4;
                long e2 = dda.m2604e(bArr2, i8);
                int i9 = i8 + 4;
                StringBuffer stringBuffer = new StringBuffer();
                if (i3 == -1) {
                    j2 = e;
                    stringBuffer.append(new String(bArr2, i9, (int) e2));
                } else if (i3 != 1200) {
                    stringBuffer.append(new String(bArr2, i9, (int) e2, C1040rW.m3392a(i2)));
                    j2 = e;
                } else {
                    j2 = e;
                    int i10 = (int) (e2 * 2);
                    byte[] bArr3 = new byte[i10];
                    for (int i11 = 0; i11 < i10; i11 += 2) {
                        int i12 = i9 + i11;
                        bArr3[i11] = bArr2[i12 + 1];
                        bArr3[i11 + 1] = bArr2[i12];
                    }
                    stringBuffer.append(new String(bArr3, 0, i10, C1040rW.m3392a(i2)));
                }
                while (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) == 0) {
                    stringBuffer.setLength(stringBuffer.length() - 1);
                }
                if (i3 == 1200) {
                    if (e2 % 2 == 1) {
                        e2++;
                    }
                    j3 = (long) i9;
                    e2 += e2;
                } else {
                    j3 = (long) i9;
                }
                i6 = (int) (j3 + e2);
                hashMap.put(valueOf, stringBuffer.toString());
                i7++;
                e = j2;
            } catch (RuntimeException e3) {
                nda a = mda.m3128a(getClass());
                int i13 = nda.f3488c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("The property set's dictionary contains bogus data. All dictionary entries starting with the one with ID ");
                sb2.append(this.f2972a);
                sb2.append(" will be ignored.");
                a.mo4703a(i13, (Object) sb2.toString(), (Throwable) e3);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final boolean mo4367a(long j, long j2) {
        return j == j2 || (j == 30 && j2 == 31) || (j2 == 30 && j == 31);
    }

    /* renamed from: b */
    public long mo4368b() {
        return this.f2973b;
    }

    /* renamed from: c */
    public Object mo4369c() {
        return this.f2974c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0785fW)) {
            return false;
        }
        C0785fW fWVar = (C0785fW) obj;
        Object c = fWVar.mo4369c();
        long a = fWVar.mo4365a();
        long j = this.f2972a;
        if (j == a && (j == 0 || mo4367a(this.f2973b, fWVar.mo4368b()))) {
            if (this.f2974c == null && c == null) {
                return true;
            }
            Object obj2 = this.f2974c;
            if (!(obj2 == null || c == null)) {
                Class cls = obj2.getClass();
                Class cls2 = c.getClass();
                if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                    return false;
                }
                Object obj3 = this.f2974c;
                return obj3 instanceof byte[] ? C0999pW.m3304a((byte[]) obj3, (byte[]) c) : obj3.equals(c);
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f2972a + 0 + this.f2973b;
        Object obj = this.f2974c;
        if (obj != null) {
            j += (long) obj.hashCode();
        }
        return (int) (j & 4294967295L);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append('[');
        stringBuffer.append("id: ");
        stringBuffer.append(mo4365a());
        stringBuffer.append(", type: ");
        stringBuffer.append(mo4368b());
        Object c = mo4369c();
        stringBuffer.append(", value: ");
        stringBuffer.append(c.toString());
        if (c instanceof String) {
            String str = (String) c;
            int length = str.length();
            byte[] bArr = new byte[(length * 2)];
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                byte b = (byte) ((charAt & 255) >> 0);
                int i2 = i * 2;
                bArr[i2] = (byte) ((65280 & charAt) >> 8);
                bArr[i2 + 1] = b;
            }
            String a = Yca.m1595a(bArr, 0, 0);
            stringBuffer.append(" [");
            stringBuffer.append(a);
            stringBuffer.append("]");
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
