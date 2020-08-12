package p000;

/* renamed from: IW */
public final class C0178IW extends C0400SW {

    /* renamed from: d */
    public int f392d;

    /* renamed from: e */
    public boolean f393e;

    /* renamed from: a */
    public void mo381a(byte b) {
        if (b == 0 || b == 7 || b == 15 || b == 23 || b == 29 || b == 36 || b == 42) {
            this.f392d = b;
            this.f393e = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Error Value can only be 0,7,15,23,29,36 or 42. It cannot be ");
        sb.append(b);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo382a(StringBuilder sb) {
        if (mo389l()) {
            sb.append("  .boolVal = ");
            sb.append(mo387j());
            return;
        }
        sb.append("  .errCode = ");
        sb.append(C1289zca.m3976a(mo388k()));
        sb.append(" (");
        sb.append(Yca.m1596a((int) mo388k()));
        sb.append(")");
    }

    /* renamed from: a */
    public void mo383a(boolean z) {
        this.f392d = z ? 1 : 0;
        this.f393e = false;
    }

    /* renamed from: b */
    public void mo384b(jda jda) {
        jda.writeByte(this.f392d);
        jda.writeByte(this.f393e ? 1 : 0);
    }

    public Object clone() {
        C0178IW iw = new C0178IW();
        mo1205a((C0400SW) iw);
        iw.f392d = this.f392d;
        iw.f393e = this.f393e;
        return iw;
    }

    /* renamed from: e */
    public short mo34e() {
        return 517;
    }

    /* renamed from: h */
    public String mo385h() {
        return "BOOLERR";
    }

    /* renamed from: i */
    public int mo386i() {
        return 2;
    }

    /* renamed from: j */
    public boolean mo387j() {
        return this.f392d != 0;
    }

    /* renamed from: k */
    public byte mo388k() {
        return (byte) this.f392d;
    }

    /* renamed from: l */
    public boolean mo389l() {
        return !this.f393e;
    }
}
