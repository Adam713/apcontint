package p000;

/* renamed from: laa reason: case insensitive filesystem */
public final class C1245laa extends C0381RZ {
    public C1245laa(int i, C1216bba bba) {
        super(i, bba.mo1954e(), bba.mo1953d(), bba.mo1951b());
    }

    /* renamed from: a */
    public static C1245laa m3004a(int i) {
        C1216bba a = C1222dba.m2583a(i);
        if (a != null) {
            return new C1245laa(i, a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid built-in function index (");
        sb.append(i);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: b */
    public static C1245laa m3005b(hda hda) {
        return m3004a(hda.mo401a());
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 33);
        jda.writeShort(mo1151g());
    }

    /* renamed from: c */
    public int mo80c() {
        return 3;
    }
}
