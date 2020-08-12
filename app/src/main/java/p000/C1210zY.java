package p000;

/* renamed from: zY */
public final class C1210zY extends C0080DY {

    /* renamed from: a */
    public short f4225a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f4225a);
    }

    public Object clone() {
        C1210zY zYVar = new C1210zY();
        zYVar.f4225a = this.f4225a;
        return zYVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 221;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo5585h() {
        return this.f4225a == 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SCENARIOPROTECT]\n");
        stringBuffer.append("    .protect         = ");
        stringBuffer.append(mo5585h());
        stringBuffer.append("\n");
        stringBuffer.append("[/SCENARIOPROTECT]\n");
        return stringBuffer.toString();
    }
}
