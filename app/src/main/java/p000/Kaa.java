package p000;

/* renamed from: Kaa */
public final class Kaa extends Oaa implements C1268sca, C1253nca {

    /* renamed from: h */
    public int f590h;

    public Kaa(hda hda) {
        this.f590h = hda.readShort();
        mo1006b(hda);
    }

    /* renamed from: a */
    public String mo742a(C1265rca rca) {
        return C1242kaa.m2920a(rca, this.f590h, mo1009g());
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 58);
        jda.writeShort(mo743l());
        mo1007b(jda);
    }

    /* renamed from: c */
    public int mo80c() {
        return 7;
    }

    /* renamed from: e */
    public String mo81e() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }

    /* renamed from: l */
    public int mo743l() {
        return this.f590h;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Kaa.class.getName());
        stringBuffer.append(" [");
        stringBuffer.append("sheetIx=");
        stringBuffer.append(mo743l());
        stringBuffer.append(" ! ");
        stringBuffer.append(mo1009g());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
