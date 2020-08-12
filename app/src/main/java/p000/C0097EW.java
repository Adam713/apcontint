package p000;

/* renamed from: EW */
public final class C0097EW extends C0080DY {

    /* renamed from: a */
    public short f231a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo217h());
    }

    /* renamed from: b */
    public void mo216b(short s) {
        this.f231a = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 64;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo217h() {
        return this.f231a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[BACKUP]\n");
        stringBuffer.append("    .backup          = ");
        stringBuffer.append(Integer.toHexString(mo217h()));
        stringBuffer.append("\n");
        stringBuffer.append("[/BACKUP]\n");
        return stringBuffer.toString();
    }
}
