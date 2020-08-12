package p000;

/* renamed from: uX */
public final class C1101uX extends C0080DY {

    /* renamed from: a */
    public short f3839a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo5185h());
    }

    /* renamed from: b */
    public void mo5184b(short s) {
        this.f3839a = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 156;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo5185h() {
        return this.f3839a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[FNGROUPCOUNT]\n");
        stringBuffer.append("    .count            = ");
        stringBuffer.append(mo5185h());
        stringBuffer.append("\n");
        stringBuffer.append("[/FNGROUPCOUNT]\n");
        return stringBuffer.toString();
    }
}
