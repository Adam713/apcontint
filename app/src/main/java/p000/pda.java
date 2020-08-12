package p000;

/* renamed from: pda */
public class pda implements Xca {

    /* renamed from: a */
    public short f3598a;

    /* renamed from: b */
    public final int f3599b;

    public pda(int i) {
        if (i >= 0) {
            this.f3599b = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal offset: ");
        sb.append(i);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public pda(int i, short s, byte[] bArr) {
        this(i);
        mo5012a(s, bArr);
    }

    /* renamed from: a */
    public void mo5012a(short s, byte[] bArr) {
        this.f3598a = s;
        mo5013a(bArr);
    }

    /* renamed from: a */
    public void mo5013a(byte[] bArr) {
        dda.m2599a(bArr, this.f3599b, this.f3598a);
    }

    public String toString() {
        return String.valueOf(this.f3598a);
    }
}
