package p000;

/* renamed from: hX */
public final class C0825hX extends C0080DY {

    /* renamed from: a */
    public static final byte[] f3056a = new byte[0];

    /* renamed from: b */
    public byte[] f3057b = f3056a;

    /* renamed from: c */
    public byte[] f3058c;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.write(this.f3057b);
    }

    /* renamed from: a */
    public void mo4459a(byte[] bArr) {
        if (bArr != null) {
            this.f3057b = bArr;
            return;
        }
        throw new IllegalArgumentException("data must not be null");
    }

    public Object clone() {
        C0825hX hXVar = new C0825hX();
        hXVar.f3057b = (byte[]) this.f3057b.clone();
        byte[] bArr = this.f3058c;
        if (bArr != null) {
            hXVar.f3058c = (byte[]) bArr.clone();
        }
        return hXVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 236;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f3057b.length;
    }
}
