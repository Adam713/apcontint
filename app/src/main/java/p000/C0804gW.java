package p000;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: gW */
public class C0804gW {

    /* renamed from: a */
    public static final byte[] f3026a = {-2, -1};

    /* renamed from: b */
    public static final byte[] f3027b = {0, 0};

    /* renamed from: c */
    public int f3028c;

    /* renamed from: d */
    public int f3029d;

    /* renamed from: e */
    public int f3030e;

    /* renamed from: f */
    public C0446UV f3031f;

    /* renamed from: g */
    public List f3032g;

    public C0804gW() {
    }

    public C0804gW(InputStream inputStream) {
        if (m2717a(inputStream)) {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr, 0, bArr.length);
            mo4423a(bArr, 0, bArr.length);
            return;
        }
        throw new C0762eW();
    }

    /* renamed from: a */
    public static boolean m2717a(InputStream inputStream) {
        if (inputStream.markSupported()) {
            inputStream.mark(50);
            byte[] bArr = new byte[50];
            boolean b = m2718b(bArr, 0, inputStream.read(bArr, 0, Math.min(bArr.length, inputStream.available())));
            inputStream.reset();
            return b;
        }
        throw new C0556ZV(inputStream.getClass().getName());
    }

    /* renamed from: b */
    public static boolean m2718b(byte[] bArr, int i, int i2) {
        int f = dda.m2605f(bArr, i);
        int i3 = i + 2;
        byte[] bArr2 = new byte[2];
        dda.m2600a(bArr2, (short) f);
        if (!C0999pW.m3304a(bArr2, f3026a)) {
            return false;
        }
        int f2 = dda.m2605f(bArr, i3);
        int i4 = i3 + 2;
        byte[] bArr3 = new byte[2];
        dda.m2600a(bArr3, (short) f2);
        return C0999pW.m3304a(bArr3, f3027b) && dda.m2604e(bArr, (i4 + 4) + 16) >= 0;
    }

    /* renamed from: a */
    public int mo4422a() {
        return this.f3028c;
    }

    /* renamed from: a */
    public final void mo4423a(byte[] bArr, int i, int i2) {
        this.f3028c = dda.m2605f(bArr, i);
        int i3 = i + 2;
        this.f3029d = dda.m2605f(bArr, i3);
        int i4 = i3 + 2;
        this.f3030e = (int) dda.m2604e(bArr, i4);
        int i5 = i4 + 4;
        this.f3031f = new C0446UV(bArr, i5);
        int i6 = i5 + 16;
        int b = dda.m2601b(bArr, i6);
        int i7 = i6 + 4;
        if (b >= 0) {
            this.f3032g = new ArrayList(b);
            for (int i8 = 0; i8 < b; i8++) {
                C0865jW jWVar = new C0865jW(bArr, i7);
                i7 += 20;
                this.f3032g.add(jWVar);
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Section count ");
        sb.append(b);
        sb.append(" is negative.");
        throw new C0508XV(sb.toString());
    }

    /* renamed from: b */
    public C0446UV mo4424b() {
        return this.f3031f;
    }

    /* renamed from: c */
    public int mo4425c() {
        return this.f3029d;
    }

    /* renamed from: d */
    public int mo4426d() {
        return this.f3030e;
    }

    /* renamed from: e */
    public int mo4427e() {
        return this.f3032g.size();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0804gW)) {
            C0804gW gWVar = (C0804gW) obj;
            int a = gWVar.mo4422a();
            int a2 = mo4422a();
            C0446UV b = gWVar.mo4424b();
            C0446UV b2 = mo4424b();
            int c = gWVar.mo4425c();
            int c2 = mo4425c();
            int d = gWVar.mo4426d();
            int d2 = mo4426d();
            int e = gWVar.mo4427e();
            int e2 = mo4427e();
            if (a == a2 && b.equals(b2) && c == c2 && d == d2 && e == e2) {
                return C0999pW.m3303a((Collection<?>) mo4429f(), (Collection<?>) gWVar.mo4429f());
            }
        }
        return false;
    }

    /* renamed from: f */
    public List mo4429f() {
        return this.f3032g;
    }

    /* renamed from: g */
    public boolean mo4430g() {
        if (this.f3032g.size() <= 0) {
            return false;
        }
        return C0999pW.m3304a(((C0865jW) this.f3032g.get(0)).mo4550c().mo1310a(), C1100uW.f3838b[0]);
    }

    /* renamed from: h */
    public boolean mo4431h() {
        if (this.f3032g.size() <= 0) {
            return false;
        }
        return C0999pW.m3304a(((C0865jW) this.f3032g.get(0)).mo4550c().mo1310a(), C1100uW.f3837a);
    }

    public int hashCode() {
        throw new UnsupportedOperationException("FIXME: Not yet implemented.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int e = mo4427e();
        stringBuffer.append(getClass().getName());
        stringBuffer.append('[');
        stringBuffer.append("byteOrder: ");
        stringBuffer.append(mo4422a());
        stringBuffer.append(", classID: ");
        stringBuffer.append(mo4424b());
        stringBuffer.append(", format: ");
        stringBuffer.append(mo4425c());
        stringBuffer.append(", OSVersion: ");
        stringBuffer.append(mo4426d());
        stringBuffer.append(", sectionCount: ");
        stringBuffer.append(e);
        stringBuffer.append(", sections: [\n");
        List f = mo4429f();
        for (int i = 0; i < e; i++) {
            stringBuffer.append(((C0865jW) f.get(i)).toString());
        }
        stringBuffer.append(']');
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
