package p000;

/* renamed from: vaa reason: case insensitive filesystem */
public final class C1275vaa extends Caa {

    /* renamed from: c */
    public final int f3902c;

    public C1275vaa(int i) {
        this.f3902c = i;
    }

    public C1275vaa(hda hda) {
        this(hda.mo401a());
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 41);
        jda.writeShort(this.f3902c);
    }

    /* renamed from: c */
    public int mo80c() {
        return 3;
    }

    /* renamed from: e */
    public String mo81e() {
        return "";
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(C1275vaa.class.getName());
        stringBuffer.append(" [len=");
        stringBuffer.append(this.f3902c);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
