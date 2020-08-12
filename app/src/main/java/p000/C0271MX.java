package p000;

/* renamed from: MX */
public final class C0271MX extends C0933mY implements C0420TW {

    /* renamed from: a */
    public int f733a;

    /* renamed from: b */
    public short f734b;

    /* renamed from: c */
    public short f735c;

    /* renamed from: d */
    public short f736d;

    /* renamed from: e */
    public byte f737e;

    /* renamed from: f */
    public String f738f;

    /* renamed from: a */
    public int mo162a(int i, byte[] bArr) {
        throw new C1001pY("Label Records are supported READ ONLY...convert to LabelSST");
    }

    /* renamed from: a */
    public short mo277a() {
        return this.f735c;
    }

    /* renamed from: a */
    public void mo279a(short s) {
    }

    /* renamed from: b */
    public short mo280b() {
        return this.f734b;
    }

    /* renamed from: c */
    public int mo163c() {
        throw new C1001pY("Label Records are supported READ ONLY...convert to LabelSST");
    }

    public Object clone() {
        C0271MX mx = new C0271MX();
        mx.f733a = this.f733a;
        mx.f734b = this.f734b;
        mx.f735c = this.f735c;
        mx.f736d = this.f736d;
        mx.f737e = this.f737e;
        mx.f738f = this.f738f;
        return mx;
    }

    /* renamed from: e */
    public short mo34e() {
        return 516;
    }

    /* renamed from: g */
    public String mo904g() {
        return this.f738f;
    }

    public int getRow() {
        return this.f733a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LABEL]\n");
        stringBuffer.append("    .row       = ");
        stringBuffer.append(Yca.m1602c(getRow()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .column    = ");
        stringBuffer.append(Yca.m1602c((int) mo280b()));
        stringBuffer.append(str);
        stringBuffer.append("    .xfindex   = ");
        stringBuffer.append(Yca.m1602c((int) mo277a()));
        stringBuffer.append(str);
        stringBuffer.append("    .string_len= ");
        stringBuffer.append(Yca.m1602c((int) this.f736d));
        stringBuffer.append(str);
        stringBuffer.append("    .unicode_flag= ");
        stringBuffer.append(Yca.m1596a((int) this.f737e));
        stringBuffer.append(str);
        stringBuffer.append("    .value       = ");
        stringBuffer.append(mo904g());
        stringBuffer.append(str);
        stringBuffer.append("[/LABEL]\n");
        return stringBuffer.toString();
    }
}
