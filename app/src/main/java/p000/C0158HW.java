package p000;

/* renamed from: HW */
public final class C0158HW extends C0080DY {

    /* renamed from: a */
    public short f341a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f341a);
    }

    /* renamed from: b */
    public void mo341b(short s) {
        this.f341a = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 218;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo342h() {
        return this.f341a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[BOOKBOOL]\n");
        stringBuffer.append("    .savelinkvalues  = ");
        stringBuffer.append(Integer.toHexString(mo342h()));
        stringBuffer.append("\n");
        stringBuffer.append("[/BOOKBOOL]\n");
        return stringBuffer.toString();
    }
}
