package p000;

/* renamed from: fY */
public final class C0787fY extends C0080DY {

    /* renamed from: a */
    public short f2980a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f2980a);
    }

    /* renamed from: a */
    public void mo4381a(boolean z) {
        if (z) {
            this.f2980a = 1;
        } else {
            this.f2980a = 0;
        }
    }

    public Object clone() {
        C0787fY fYVar = new C0787fY();
        fYVar.f2980a = this.f2980a;
        return fYVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 43;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public boolean mo4382h() {
        return this.f2980a == 1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PRINTGRIDLINES]\n");
        stringBuffer.append("    .printgridlines = ");
        stringBuffer.append(mo4382h());
        stringBuffer.append("\n");
        stringBuffer.append("[/PRINTGRIDLINES]\n");
        return stringBuffer.toString();
    }
}
