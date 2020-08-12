package p000;

/* renamed from: yaa reason: case insensitive filesystem */
public final class C1284yaa extends Caa implements C1268sca {

    /* renamed from: c */
    public int f4190c;

    /* renamed from: d */
    public short f4191d;

    public C1284yaa(hda hda) {
        this.f4190c = hda.readShort();
        this.f4191d = hda.readShort();
    }

    /* renamed from: a */
    public String mo742a(C1265rca rca) {
        return rca.mo5009a(this);
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 35);
        jda.writeShort(this.f4190c);
        jda.writeShort(this.f4191d);
    }

    /* renamed from: c */
    public int mo80c() {
        return 5;
    }

    /* renamed from: e */
    public String mo81e() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }

    public int getIndex() {
        return this.f4190c - 1;
    }
}
