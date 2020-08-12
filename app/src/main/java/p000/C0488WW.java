package p000;

/* renamed from: WW */
public final class C0488WW extends C0080DY {

    /* renamed from: a */
    public byte[] f1397a;

    public C0488WW(byte[] bArr) {
        this.f1397a = bArr;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.write(this.f1397a);
    }

    public Object clone() {
        return new C0488WW(this.f1397a);
    }

    /* renamed from: e */
    public short mo34e() {
        return 60;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f1397a.length;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CONTINUE RECORD]\n");
        stringBuffer.append("    .data = ");
        stringBuffer.append(Yca.m1594a(this.f1397a));
        stringBuffer.append("\n");
        stringBuffer.append("[/CONTINUE RECORD]\n");
        return stringBuffer.toString();
    }
}
