package p000;

/* renamed from: rZ */
public final class C1043rZ extends C0080DY {

    /* renamed from: a */
    public short f3708a;

    /* renamed from: b */
    public short f3709b;

    /* renamed from: c */
    public byte f3710c;

    /* renamed from: d */
    public byte f3711d;

    /* renamed from: e */
    public C1044a[] f3712e;

    /* renamed from: rZ$a */
    private static final class C1044a {
        /* renamed from: a */
        public void mo5076a(jda jda) {
            throw null;
        }
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3708a);
        jda.writeShort(this.f3709b);
        jda.writeByte(this.f3710c);
        jda.writeByte(this.f3711d);
        int length = this.f3712e.length;
        jda.writeShort(length);
        if (length > 0) {
            this.f3712e[0].mo5076a(jda);
            throw null;
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 2128;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f3712e.length * 4) + 8;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CHARTFRTINFO]\n");
        stringBuffer.append("    .rt           =");
        stringBuffer.append(Yca.m1602c((int) this.f3708a));
        stringBuffer.append(10);
        stringBuffer.append("    .grbitFrt     =");
        stringBuffer.append(Yca.m1602c((int) this.f3709b));
        stringBuffer.append(10);
        stringBuffer.append("    .verOriginator=");
        stringBuffer.append(Yca.m1596a((int) this.f3710c));
        stringBuffer.append(10);
        stringBuffer.append("    .verWriter    =");
        stringBuffer.append(Yca.m1596a((int) this.f3710c));
        stringBuffer.append(10);
        stringBuffer.append("    .nCFRTIDs     =");
        stringBuffer.append(Yca.m1602c(this.f3712e.length));
        stringBuffer.append(10);
        stringBuffer.append("[/CHARTFRTINFO]\n");
        return stringBuffer.toString();
    }
}
