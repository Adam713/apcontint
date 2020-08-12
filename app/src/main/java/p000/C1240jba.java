package p000;

/* renamed from: jba reason: case insensitive filesystem */
public final class C1240jba extends C0080DY {

    /* renamed from: a */
    public int f3188a;

    /* renamed from: b */
    public int f3189b;

    /* renamed from: c */
    public int f3190c;

    /* renamed from: d */
    public int f3191d;

    /* renamed from: e */
    public String f3192e;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3188a);
        jda.writeShort(this.f3189b);
        jda.writeShort(this.f3190c);
        jda.writeShort(this.f3191d);
        String str = this.f3192e;
        if (str != null) {
            qda.m3371a(jda, str);
        } else {
            jda.writeShort(65535);
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 177;
    }

    /* renamed from: g */
    public int mo36g() {
        String str = this.f3192e;
        if (str == null) {
            return 10;
        }
        return (str.length() * (qda.m3375b(this.f3192e) ? 2 : 1)) + 11;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SXVD]\n");
        stringBuffer.append("    .sxaxis    = ");
        stringBuffer.append(Yca.m1602c(this.f3188a));
        stringBuffer.append(10);
        stringBuffer.append("    .cSub      = ");
        stringBuffer.append(Yca.m1602c(this.f3189b));
        stringBuffer.append(10);
        stringBuffer.append("    .grbitSub  = ");
        stringBuffer.append(Yca.m1602c(this.f3190c));
        stringBuffer.append(10);
        stringBuffer.append("    .cItm      = ");
        stringBuffer.append(Yca.m1602c(this.f3191d));
        stringBuffer.append(10);
        stringBuffer.append("    .name      = ");
        stringBuffer.append(this.f3192e);
        stringBuffer.append(10);
        stringBuffer.append("[/SXVD]\n");
        return stringBuffer.toString();
    }
}
