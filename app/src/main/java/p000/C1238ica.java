package p000;

import java.io.OutputStream;
import java.util.List;

/* renamed from: ica reason: case insensitive filesystem */
public final class C1238ica extends _ba {

    /* renamed from: b */
    public Wba[] f3145b;

    public C1238ica(Bba bba, Wba[] wbaArr, int i) {
        super(bba);
        this.f3145b = new Wba[bba.mo86d()];
        int i2 = 0;
        while (true) {
            Wba[] wbaArr2 = this.f3145b;
            if (i2 < wbaArr2.length) {
                wbaArr2[i2] = wbaArr[i2 + i];
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static C1217bca[] m2849a(Bba bba, List list) {
        int d = bba.mo86d();
        int size = ((list.size() + d) - 1) / d;
        Wba[] wbaArr = new Wba[(size * d)];
        System.arraycopy(list.toArray(new Wba[0]), 0, wbaArr, 0, list.size());
        for (int size2 = list.size(); size2 < wbaArr.length; size2++) {
            wbaArr[size2] = new C1235hca();
        }
        C1217bca[] bcaArr = new C1217bca[size];
        for (int i = 0; i < size; i++) {
            bcaArr[i] = new C1238ica(bba, wbaArr, i * d);
        }
        return bcaArr;
    }

    /* renamed from: b */
    public void mo1704b(OutputStream outputStream) {
        int d = this.f1798a.mo86d();
        for (int i = 0; i < d; i++) {
            this.f3145b[i].mo1426a(outputStream);
        }
    }
}
