package p000;

/* renamed from: faa reason: case insensitive filesystem */
public final class C1227faa extends Caa implements C1268sca {

    /* renamed from: c */
    public final int f2987c;

    /* renamed from: d */
    public final int f2988d;

    public C1227faa(hda hda) {
        this.f2987c = hda.mo401a();
        this.f2988d = hda.readInt();
    }

    /* renamed from: a */
    public String mo742a(C1265rca rca) {
        return C1242kaa.m2920a(rca, this.f2987c, C1289zca.m3976a(23));
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 60);
        jda.writeShort(this.f2987c);
        jda.writeInt(this.f2988d);
    }

    /* renamed from: c */
    public int mo80c() {
        return 7;
    }

    /* renamed from: e */
    public String mo81e() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }
}
