package p000;

/* renamed from: UZ */
public final class C0450UZ extends C0560ZZ implements C1268sca, C1253nca {

    /* renamed from: j */
    public int f1301j;

    public C0450UZ(hda hda) {
        this.f1301j = hda.readShort();
        mo1687b(hda);
    }

    /* renamed from: a */
    public String mo742a(C1265rca rca) {
        return C1242kaa.m2920a(rca, this.f1301j, mo1694g());
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 59);
        jda.writeShort(this.f1301j);
        mo1688b(jda);
    }

    /* renamed from: c */
    public int mo80c() {
        return 11;
    }

    /* renamed from: e */
    public String mo81e() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }

    /* renamed from: p */
    public int mo1330p() {
        return this.f1301j;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C0450UZ.class.getName());
        stringBuffer.append(" [");
        stringBuffer.append("sheetIx=");
        stringBuffer.append(mo1330p());
        stringBuffer.append(" ! ");
        stringBuffer.append(mo1694g());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
