package p000;

/* renamed from: DX */
public final class C0079DX extends C0080DY {

    /* renamed from: a */
    public static final byte[] f182a = new byte[16];

    /* renamed from: b */
    public byte[] f183b;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.write(this.f183b);
    }

    public Object clone() {
        return mo4774d();
    }

    /* renamed from: e */
    public short mo34e() {
        return 2204;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f183b.length;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        String str = "HEADERFOOTER";
        stringBuffer.append(str);
        stringBuffer.append("] (0x");
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(2204).toUpperCase());
        sb.append(")\n");
        stringBuffer.append(sb.toString());
        stringBuffer.append("  rawData=");
        stringBuffer.append(Yca.m1594a(this.f183b));
        stringBuffer.append("\n");
        stringBuffer.append("[/");
        stringBuffer.append(str);
        stringBuffer.append("]\n");
        return stringBuffer.toString();
    }
}
