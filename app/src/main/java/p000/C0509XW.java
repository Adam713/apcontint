package p000;

/* renamed from: XW */
public final class C0509XW extends C0080DY {

    /* renamed from: a */
    public short f1455a;

    /* renamed from: b */
    public short f1456b;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1473i());
        jda.writeShort(mo1472h());
    }

    /* renamed from: b */
    public void mo1470b(short s) {
        this.f1456b = s;
    }

    /* renamed from: c */
    public void mo1471c(short s) {
        this.f1455a = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 140;
    }

    /* renamed from: g */
    public int mo36g() {
        return 4;
    }

    /* renamed from: h */
    public short mo1472h() {
        return this.f1456b;
    }

    /* renamed from: i */
    public short mo1473i() {
        return this.f1455a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[COUNTRY]\n");
        stringBuffer.append("    .defaultcountry  = ");
        stringBuffer.append(Integer.toHexString(mo1473i()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .currentcountry  = ");
        stringBuffer.append(Integer.toHexString(mo1472h()));
        stringBuffer.append(str);
        stringBuffer.append("[/COUNTRY]\n");
        return stringBuffer.toString();
    }
}
