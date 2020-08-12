package p000;

/* renamed from: WX */
public final class C0489WX extends C0080DY {

    /* renamed from: a */
    public static final C0489WX[] f1398a = new C0489WX[0];

    /* renamed from: b */
    public static final Byte f1399b = Byte.valueOf(0);

    /* renamed from: c */
    public int f1400c;

    /* renamed from: d */
    public int f1401d;

    /* renamed from: e */
    public short f1402e = 0;

    /* renamed from: f */
    public int f1403f;

    /* renamed from: g */
    public boolean f1404g;

    /* renamed from: h */
    public String f1405h = "";

    /* renamed from: i */
    public Byte f1406i = f1399b;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1400c);
        jda.writeShort(this.f1401d);
        jda.writeShort(this.f1402e);
        jda.writeShort(this.f1403f);
        jda.writeShort(this.f1405h.length());
        jda.writeByte(this.f1404g ? 1 : 0);
        if (this.f1404g) {
            qda.m3373b(this.f1405h, jda);
        } else {
            qda.m3370a(this.f1405h, jda);
        }
        Byte b = this.f1406i;
        if (b != null) {
            jda.writeByte(b.intValue());
        }
    }

    public Object clone() {
        C0489WX wx = new C0489WX();
        wx.f1400c = this.f1400c;
        wx.f1401d = this.f1401d;
        wx.f1402e = this.f1402e;
        wx.f1403f = this.f1403f;
        wx.f1405h = this.f1405h;
        return wx;
    }

    /* renamed from: e */
    public short mo34e() {
        return 28;
    }

    /* renamed from: g */
    public int mo36g() {
        int i = 1;
        int length = (this.f1405h.length() * (this.f1404g ? 2 : 1)) + 11;
        if (this.f1406i == null) {
            i = 0;
        }
        return length + i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[NOTE]\n");
        stringBuffer.append("    .row    = ");
        stringBuffer.append(this.f1400c);
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .col    = ");
        stringBuffer.append(this.f1401d);
        stringBuffer.append(str);
        stringBuffer.append("    .flags  = ");
        stringBuffer.append(this.f1402e);
        stringBuffer.append(str);
        stringBuffer.append("    .shapeid= ");
        stringBuffer.append(this.f1403f);
        stringBuffer.append(str);
        stringBuffer.append("    .author = ");
        stringBuffer.append(this.f1405h);
        stringBuffer.append(str);
        stringBuffer.append("[/NOTE]\n");
        return stringBuffer.toString();
    }
}
