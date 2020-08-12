package p000;

/* renamed from: maa reason: case insensitive filesystem */
public final class C1248maa extends C0381RZ {

    /* renamed from: g */
    public static final Daa f3408g = m3105a("SUM", 1);

    public C1248maa(int i, int i2, byte[] bArr, int i3) {
        super(i, i2, bArr, i3);
    }

    /* renamed from: a */
    public static C1248maa m3104a(int i, int i2) {
        C1216bba a = C1222dba.m2583a(i2);
        if (a != null) {
            return new C1248maa(i2, a.mo1954e(), a.mo1953d(), i);
        }
        return new C1248maa(i2, 32, new byte[]{32}, i);
    }

    /* renamed from: a */
    public static C1248maa m3105a(String str, int i) {
        return m3104a(i, (int) C0381RZ.m1094a(str));
    }

    /* renamed from: b */
    public static C1248maa m3106b(hda hda) {
        return m3104a((int) hda.readByte(), (int) hda.readShort());
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 34);
        jda.writeByte(mo53f());
        jda.writeShort(mo1151g());
    }

    /* renamed from: c */
    public int mo80c() {
        return 4;
    }
}
