package p000;

/* renamed from: zaa reason: case insensitive filesystem */
public final class C1287zaa extends Caa implements C1268sca {

    /* renamed from: c */
    public final int f4232c;

    /* renamed from: d */
    public final int f4233d;

    /* renamed from: e */
    public final int f4234e;

    public C1287zaa(int i, int i2, int i3) {
        this.f4232c = i;
        this.f4233d = i2;
        this.f4234e = i3;
    }

    public C1287zaa(hda hda) {
        this(hda.mo401a(), hda.mo401a(), hda.mo401a());
    }

    /* renamed from: a */
    public String mo742a(C1265rca rca) {
        return rca.mo5010a(this);
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 57);
        jda.writeShort(this.f4232c);
        jda.writeShort(this.f4233d);
        jda.writeShort(this.f4234e);
    }

    /* renamed from: c */
    public int mo80c() {
        return 7;
    }

    /* renamed from: e */
    public String mo81e() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }

    /* renamed from: g */
    public int mo5591g() {
        return this.f4233d - 1;
    }

    /* renamed from: h */
    public int mo5592h() {
        return this.f4232c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NameXPtg:[sheetRefIndex:");
        sb.append(this.f4232c);
        sb.append(" , nameNumber:");
        sb.append(this.f4233d);
        sb.append("]");
        return sb.toString();
    }
}
