package p000;

/* renamed from: SY */
public final class C0402SY extends C0080DY {

    /* renamed from: a */
    public int f1173a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1173a);
    }

    /* renamed from: a */
    public void mo1211a(boolean z) {
        this.f1173a = z ? 1 : 0;
    }

    public Object clone() {
        C0402SY sy = new C0402SY();
        sy.f1173a = this.f1173a;
        return sy;
    }

    /* renamed from: e */
    public short mo34e() {
        return 132;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo1212h() {
        return this.f1173a == 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[VCENTER]\n");
        stringBuffer.append("    .vcenter        = ");
        stringBuffer.append(mo1212h());
        stringBuffer.append("\n");
        stringBuffer.append("[/VCENTER]\n");
        return stringBuffer.toString();
    }
}
