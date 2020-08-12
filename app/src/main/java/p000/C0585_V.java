package p000;

import java.io.OutputStream;

/* renamed from: _V */
public class C0585_V extends C0785fW {
    public C0585_V() {
    }

    public C0585_V(C0785fW fWVar) {
        mo1798a(fWVar.mo4365a());
        mo1800b(fWVar.mo4368b());
        mo1799a(fWVar.mo4369c());
    }

    /* renamed from: a */
    public int mo1797a(OutputStream outputStream, int i) {
        long b = mo4368b();
        if (i == 1200 && b == 30) {
            b = 31;
        }
        return 0 + C0930mW.m3086b(outputStream, b) + C1040rW.m3390a(outputStream, b, mo4369c(), i);
    }

    /* renamed from: a */
    public void mo1798a(long j) {
        this.f2972a = j;
    }

    /* renamed from: a */
    public void mo1799a(Object obj) {
        this.f2974c = obj;
    }

    /* renamed from: b */
    public void mo1800b(long j) {
        this.f2973b = j;
    }
}
