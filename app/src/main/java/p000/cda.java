package p000;

/* renamed from: cda */
public class cda implements Xca {

    /* renamed from: a */
    public int f1973a;

    /* renamed from: b */
    public final int f1974b;

    public cda(int i) {
        if (i >= 0) {
            this.f1974b = i;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("negative offset");
    }

    public cda(int i, int i2, byte[] bArr) {
        this(i);
        mo2005a(i2, bArr);
    }

    /* renamed from: a */
    public int mo2004a() {
        return this.f1973a;
    }

    /* renamed from: a */
    public void mo2005a(int i, byte[] bArr) {
        this.f1973a = i;
        mo2006a(bArr);
    }

    /* renamed from: a */
    public void mo2006a(byte[] bArr) {
        dda.m2597a(bArr, this.f1974b, this.f1973a);
    }

    public String toString() {
        return String.valueOf(this.f1973a);
    }
}
