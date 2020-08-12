package p000;

/* renamed from: eaa reason: case insensitive filesystem */
public final class C1224eaa extends Caa implements C1268sca {

    /* renamed from: c */
    public final int f2925c;

    /* renamed from: d */
    public final int f2926d;

    /* renamed from: e */
    public final int f2927e;

    public C1224eaa(hda hda) {
        this.f2925c = hda.mo401a();
        this.f2926d = hda.readInt();
        this.f2927e = hda.readInt();
    }

    /* renamed from: a */
    public String mo742a(C1265rca rca) {
        return C1242kaa.m2920a(rca, this.f2925c, C1289zca.m3976a(23));
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 61);
        jda.writeShort(this.f2925c);
        jda.writeInt(this.f2926d);
        jda.writeInt(this.f2927e);
    }

    /* renamed from: c */
    public int mo80c() {
        return 11;
    }

    /* renamed from: e */
    public String mo81e() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }
}
