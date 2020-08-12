package p000;

/* renamed from: UX */
public final class C0448UX extends C0080DY {

    /* renamed from: a */
    public final short f1285a;

    /* renamed from: b */
    public final short f1286b;

    /* renamed from: c */
    public final long f1287c;

    /* renamed from: d */
    public String f1288d;

    /* renamed from: e */
    public String f1289e;

    /* renamed from: a */
    public void mo30a(jda jda) {
        int length = this.f1288d.length();
        int length2 = this.f1289e.length();
        jda.writeShort(this.f1285a);
        jda.writeShort(this.f1286b);
        jda.writeLong(this.f1287c);
        jda.writeShort(length);
        jda.writeShort(length2);
        jda.writeByte(0);
        jda.write(this.f1288d.getBytes());
        jda.writeByte(0);
        jda.write(this.f1289e.getBytes());
    }

    /* renamed from: e */
    public short mo34e() {
        return 2196;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f1288d.length() + 18 + this.f1289e.length();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[NAMECMT]\n");
        stringBuffer.append("    .record type            = ");
        stringBuffer.append(Yca.m1602c((int) this.f1285a));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .frt cell ref flag      = ");
        stringBuffer.append(Yca.m1596a((int) this.f1286b));
        stringBuffer.append(str);
        stringBuffer.append("    .reserved               = ");
        stringBuffer.append(this.f1287c);
        stringBuffer.append(str);
        stringBuffer.append("    .name length            = ");
        stringBuffer.append(this.f1288d.length());
        stringBuffer.append(str);
        stringBuffer.append("    .comment length         = ");
        stringBuffer.append(this.f1289e.length());
        stringBuffer.append(str);
        stringBuffer.append("    .name                   = ");
        stringBuffer.append(this.f1288d);
        stringBuffer.append(str);
        stringBuffer.append("    .comment                = ");
        stringBuffer.append(this.f1289e);
        stringBuffer.append(str);
        stringBuffer.append("[/NAMECMT]\n");
        return stringBuffer.toString();
    }
}
