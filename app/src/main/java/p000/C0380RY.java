package p000;

/* renamed from: RY */
public final class C0380RY extends C0080DY {

    /* renamed from: a */
    public byte[] f1094a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.write(this.f1094a);
    }

    public Object clone() {
        return mo4774d();
    }

    /* renamed from: e */
    public short mo34e() {
        return 427;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f1094a.length;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        String str = "USERSVIEWEND";
        stringBuffer.append(str);
        stringBuffer.append("] (0x");
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(427).toUpperCase());
        sb.append(")\n");
        stringBuffer.append(sb.toString());
        stringBuffer.append("  rawData=");
        stringBuffer.append(Yca.m1594a(this.f1094a));
        stringBuffer.append("\n");
        stringBuffer.append("[/");
        stringBuffer.append(str);
        stringBuffer.append("]\n");
        return stringBuffer.toString();
    }
}
