package p000;

/* renamed from: zX */
public final class C1209zX extends C0080DY {

    /* renamed from: a */
    public short f4224a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f4224a);
    }

    /* renamed from: a */
    public void mo5583a(boolean z) {
        if (z) {
            this.f4224a = 1;
        } else {
            this.f4224a = 0;
        }
    }

    public Object clone() {
        C1209zX zXVar = new C1209zX();
        zXVar.f4224a = this.f4224a;
        return zXVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 130;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo5584h() {
        return this.f4224a == 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[GRIDSET]\n");
        stringBuffer.append("    .gridset        = ");
        stringBuffer.append(mo5584h());
        stringBuffer.append("\n");
        stringBuffer.append("[/GRIDSET]\n");
        return stringBuffer.toString();
    }
}
