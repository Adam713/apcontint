package p000;

/* renamed from: ZX */
public final class C0558ZX extends C0080DY {

    /* renamed from: a */
    public short f1684a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1684a);
    }

    public Object clone() {
        C0558ZX zx = new C0558ZX();
        zx.f1684a = this.f1684a;
        return zx;
    }

    /* renamed from: e */
    public short mo34e() {
        return 99;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo1683h() {
        return this.f1684a == 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SCENARIOPROTECT]\n");
        stringBuffer.append("    .protect         = ");
        stringBuffer.append(mo1683h());
        stringBuffer.append("\n");
        stringBuffer.append("[/SCENARIOPROTECT]\n");
        return stringBuffer.toString();
    }
}
