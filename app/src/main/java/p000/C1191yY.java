package p000;

/* renamed from: yY */
public final class C1191yY extends C0080DY {

    /* renamed from: a */
    public short f4176a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f4176a);
    }

    /* renamed from: a */
    public void mo5516a(boolean z) {
        int i = 1;
        if (!z) {
            i = 0;
        }
        this.f4176a = (short) i;
    }

    public Object clone() {
        C1191yY yYVar = new C1191yY();
        yYVar.f4176a = this.f4176a;
        return yYVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 95;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo5517h() {
        return this.f4176a == 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SAVERECALC]\n");
        stringBuffer.append("    .recalc         = ");
        stringBuffer.append(mo5517h());
        stringBuffer.append("\n");
        stringBuffer.append("[/SAVERECALC]\n");
        return stringBuffer.toString();
    }
}
