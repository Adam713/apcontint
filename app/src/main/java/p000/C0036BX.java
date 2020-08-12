package p000;

/* renamed from: BX */
public final class C0036BX extends C0080DY {

    /* renamed from: a */
    public short f61a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f61a);
    }

    /* renamed from: a */
    public void mo74a(boolean z) {
        if (z) {
            this.f61a = 1;
        } else {
            this.f61a = 0;
        }
    }

    public Object clone() {
        C0036BX bx = new C0036BX();
        bx.f61a = this.f61a;
        return bx;
    }

    /* renamed from: e */
    public short mo34e() {
        return 131;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo75h() {
        return this.f61a == 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[HCENTER]\n");
        stringBuffer.append("    .hcenter        = ");
        stringBuffer.append(mo75h());
        stringBuffer.append("\n");
        stringBuffer.append("[/HCENTER]\n");
        return stringBuffer.toString();
    }
}
