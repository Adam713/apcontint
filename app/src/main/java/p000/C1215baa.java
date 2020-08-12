package p000;

/* renamed from: baa reason: case insensitive filesystem */
public final class C1215baa extends Paa {

    /* renamed from: c */
    public static final C1215baa f1921c = new C1215baa(false);

    /* renamed from: d */
    public static final C1215baa f1922d = new C1215baa(true);

    /* renamed from: e */
    public final boolean f1923e;

    public C1215baa(boolean z) {
        this.f1923e = z;
    }

    /* renamed from: a */
    public static C1215baa m1860a(boolean z) {
        return z ? f1922d : f1921c;
    }

    /* renamed from: b */
    public static C1215baa m1861b(hda hda) {
        boolean z = true;
        if (hda.readByte() != 1) {
            z = false;
        }
        return m1860a(z);
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 29);
        jda.writeByte(this.f1923e ? 1 : 0);
    }

    /* renamed from: c */
    public int mo80c() {
        return 2;
    }

    /* renamed from: e */
    public String mo81e() {
        return this.f1923e ? "TRUE" : "FALSE";
    }
}
