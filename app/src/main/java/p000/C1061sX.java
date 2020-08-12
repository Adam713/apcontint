package p000;

/* renamed from: sX */
public final class C1061sX extends C0080DY {

    /* renamed from: a */
    public int f3751a;

    /* renamed from: b */
    public int f3752b;

    /* renamed from: c */
    public int f3753c;

    /* renamed from: d */
    public byte[] f3754d;

    /* renamed from: e */
    public byte[] f3755e;

    /* renamed from: f */
    public byte[] f3756f;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3751a);
        jda.writeShort(this.f3752b);
        jda.writeShort(this.f3753c);
        jda.write(this.f3754d);
        jda.write(this.f3755e);
        jda.write(this.f3756f);
    }

    public Object clone() {
        return this;
    }

    /* renamed from: e */
    public short mo34e() {
        return 47;
    }

    /* renamed from: g */
    public int mo36g() {
        return 54;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[FILEPASS]\n");
        stringBuffer.append("    .type = ");
        stringBuffer.append(Yca.m1602c(this.f3751a));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .info = ");
        stringBuffer.append(Yca.m1602c(this.f3752b));
        stringBuffer.append(str);
        stringBuffer.append("    .ver  = ");
        stringBuffer.append(Yca.m1602c(this.f3753c));
        stringBuffer.append(str);
        stringBuffer.append("    .docId= ");
        stringBuffer.append(Yca.m1594a(this.f3754d));
        stringBuffer.append(str);
        stringBuffer.append("    .salt = ");
        stringBuffer.append(Yca.m1594a(this.f3755e));
        stringBuffer.append(str);
        stringBuffer.append("    .hash = ");
        stringBuffer.append(Yca.m1594a(this.f3756f));
        stringBuffer.append(str);
        stringBuffer.append("[/FILEPASS]\n");
        return stringBuffer.toString();
    }
}
