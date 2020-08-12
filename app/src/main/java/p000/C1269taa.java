package p000;

/* renamed from: taa reason: case insensitive filesystem */
public final class C1269taa extends Caa {

    /* renamed from: c */
    public final int f3803c;

    /* renamed from: d */
    public final int f3804d;

    public C1269taa(hda hda) {
        this.f3803c = hda.readInt();
        this.f3804d = hda.readShort();
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 38);
        jda.writeInt(this.f3803c);
        jda.writeShort(this.f3804d);
    }

    /* renamed from: c */
    public int mo80c() {
        return 7;
    }

    /* renamed from: e */
    public String mo81e() {
        return "";
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(C1269taa.class.getName());
        stringBuffer.append(" [len=");
        stringBuffer.append(this.f3804d);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
