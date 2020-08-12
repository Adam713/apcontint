package p000;

/* renamed from: EZ */
public final class C0100EZ {

    /* renamed from: a */
    public short f234a;

    /* renamed from: b */
    public short f235b;

    /* renamed from: c */
    public byte[] f236c = new byte[8];

    /* renamed from: a */
    public void mo221a(jda jda) {
        jda.writeShort(this.f234a);
        jda.writeShort(this.f235b);
        jda.write(this.f236c);
    }

    /* renamed from: a */
    public void mo222a(short s) {
        this.f234a = s;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" [FUTURE HEADER]\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   Type ");
        sb.append(this.f234a);
        stringBuffer.append(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("   Flags ");
        sb2.append(this.f235b);
        stringBuffer.append(sb2.toString());
        stringBuffer.append(" [/FUTURE HEADER]\n");
        return stringBuffer.toString();
    }
}
