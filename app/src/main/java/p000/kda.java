package p000;

/* renamed from: kda */
public class kda implements Xca {

    /* renamed from: a */
    public long f3239a;

    /* renamed from: b */
    public final int f3240b;

    public kda(int i) {
        if (i >= 0) {
            this.f3240b = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal offset: ");
        sb.append(i);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public kda(int i, long j, byte[] bArr) {
        this(i);
        mo4592a(j, bArr);
    }

    /* renamed from: a */
    public void mo4592a(long j, byte[] bArr) {
        this.f3239a = j;
        mo4593a(bArr);
    }

    /* renamed from: a */
    public void mo4593a(byte[] bArr) {
        dda.m2598a(bArr, this.f3240b, this.f3239a);
    }

    public String toString() {
        return String.valueOf(this.f3239a);
    }
}
