package p000;

/* renamed from: GW */
public final class C0136GW extends C0080DY implements C0420TW {

    /* renamed from: a */
    public int f292a;

    /* renamed from: b */
    public short f293b;

    /* renamed from: c */
    public short f294c;

    /* renamed from: a */
    public short mo277a() {
        return this.f294c;
    }

    /* renamed from: a */
    public void mo278a(int i) {
        this.f292a = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(getRow());
        jda.writeShort(mo280b());
        jda.writeShort(mo277a());
    }

    /* renamed from: a */
    public void mo279a(short s) {
        this.f294c = s;
    }

    /* renamed from: b */
    public short mo280b() {
        return this.f293b;
    }

    /* renamed from: b */
    public void mo281b(short s) {
        this.f293b = s;
    }

    public Object clone() {
        C0136GW gw = new C0136GW();
        gw.f292a = this.f292a;
        gw.f293b = this.f293b;
        gw.f294c = this.f294c;
        return gw;
    }

    /* renamed from: e */
    public short mo34e() {
        return 513;
    }

    /* renamed from: g */
    public int mo36g() {
        return 6;
    }

    public int getRow() {
        return this.f292a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[BLANK]\n");
        stringBuffer.append("    row= ");
        stringBuffer.append(Yca.m1602c(getRow()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    col= ");
        stringBuffer.append(Yca.m1602c((int) mo280b()));
        stringBuffer.append(str);
        stringBuffer.append("    xf = ");
        stringBuffer.append(Yca.m1602c((int) mo277a()));
        stringBuffer.append(str);
        stringBuffer.append("[/BLANK]\n");
        return stringBuffer.toString();
    }
}
