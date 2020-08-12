package p000;

/* renamed from: paa reason: case insensitive filesystem */
public final class C1257paa extends Paa {

    /* renamed from: c */
    public final int f3595c;

    public C1257paa(int i) {
        if (m3320a(i)) {
            this.f3595c = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("value is out of range: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public C1257paa(hda hda) {
        this(hda.mo401a());
    }

    /* renamed from: a */
    public static boolean m3320a(int i) {
        return i >= 0 && i <= 65535;
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 30);
        jda.writeShort(mo5007f());
    }

    /* renamed from: c */
    public int mo80c() {
        return 3;
    }

    /* renamed from: e */
    public String mo81e() {
        return String.valueOf(mo5007f());
    }

    /* renamed from: f */
    public int mo5007f() {
        return this.f3595c;
    }
}
