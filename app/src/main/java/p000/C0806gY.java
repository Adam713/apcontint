package p000;

/* renamed from: gY */
public final class C0806gY extends C0080DY {

    /* renamed from: a */
    public short f3033a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3033a);
    }

    /* renamed from: a */
    public void mo4438a(boolean z) {
        if (z) {
            this.f3033a = 1;
        } else {
            this.f3033a = 0;
        }
    }

    public Object clone() {
        C0806gY gYVar = new C0806gY();
        gYVar.f3033a = this.f3033a;
        return gYVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 42;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo4439h() {
        return this.f3033a == 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PRINTHEADERS]\n");
        stringBuffer.append("    .printheaders   = ");
        stringBuffer.append(mo4439h());
        stringBuffer.append("\n");
        stringBuffer.append("[/PRINTHEADERS]\n");
        return stringBuffer.toString();
    }
}
