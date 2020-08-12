package p000;

/* renamed from: ada */
public class ada {

    /* renamed from: a */
    public int[] f1894a;

    /* renamed from: b */
    public int f1895b;

    /* renamed from: c */
    public int f1896c;

    public ada() {
        this(128);
    }

    public ada(int i) {
        this(i, 0);
    }

    public ada(int i, int i2) {
        this.f1896c = 0;
        this.f1894a = new int[i];
        if (this.f1896c != 0) {
            this.f1896c = i2;
            mo1886a(this.f1896c, this.f1894a, 0);
        }
        this.f1895b = 0;
    }

    /* renamed from: a */
    public int mo1885a() {
        return this.f1895b;
    }

    /* renamed from: a */
    public final void mo1886a(int i, int[] iArr, int i2) {
        while (i2 < iArr.length) {
            iArr[i2] = i;
            i2++;
        }
    }

    /* renamed from: a */
    public boolean mo1887a(int i) {
        int i2 = this.f1895b;
        if (i2 == this.f1894a.length) {
            mo1891c(i2 * 2);
        }
        int[] iArr = this.f1894a;
        int i3 = this.f1895b;
        this.f1895b = i3 + 1;
        iArr[i3] = i;
        return true;
    }

    /* renamed from: a */
    public boolean mo1888a(ada ada) {
        int i = ada.f1895b;
        if (i != 0) {
            int i2 = this.f1895b;
            if (i2 + i > this.f1894a.length) {
                mo1891c(i2 + i);
            }
            System.arraycopy(ada.f1894a, 0, this.f1894a, this.f1895b, ada.f1895b);
            this.f1895b += ada.f1895b;
        }
        return true;
    }

    /* renamed from: b */
    public int mo1889b(int i) {
        if (i < this.f1895b) {
            return this.f1894a[i];
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public int[] mo1890b() {
        int i = this.f1895b;
        int[] iArr = new int[i];
        System.arraycopy(this.f1894a, 0, iArr, 0, i);
        return iArr;
    }

    /* renamed from: c */
    public final void mo1891c(int i) {
        if (i == this.f1894a.length) {
            i++;
        }
        int[] iArr = new int[i];
        int i2 = this.f1896c;
        if (i2 != 0) {
            mo1886a(i2, iArr, this.f1894a.length);
        }
        System.arraycopy(this.f1894a, 0, iArr, 0, this.f1895b);
        this.f1894a = iArr;
    }

    public boolean equals(Object obj) {
        boolean z = this == obj;
        if (!z && obj != null && obj.getClass() == ada.class) {
            ada ada = (ada) obj;
            if (ada.f1895b == this.f1895b) {
                boolean z2 = true;
                int i = 0;
                while (z && i < this.f1895b) {
                    z2 = this.f1894a[i] == ada.f1894a[i];
                    i++;
                }
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f1895b; i2++) {
            i = (i * 31) + this.f1894a[i2];
        }
        return i;
    }
}
