package p000;

/* renamed from: Vca */
public class Vca implements Xca {

    /* renamed from: a */
    public byte f1364a;

    /* renamed from: b */
    public final int f1365b;

    public Vca(int i) {
        this(i, 0);
    }

    public Vca(int i, byte b) {
        if (i >= 0) {
            this.f1365b = i;
            mo1393a(b);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("offset cannot be negative");
    }

    /* renamed from: a */
    public void mo1393a(byte b) {
        this.f1364a = b;
    }

    /* renamed from: a */
    public void mo1394a(byte b, byte[] bArr) {
        mo1393a(b);
        mo1395a(bArr);
    }

    /* renamed from: a */
    public void mo1395a(byte[] bArr) {
        bArr[this.f1365b] = this.f1364a;
    }

    public String toString() {
        return String.valueOf(this.f1364a);
    }
}
