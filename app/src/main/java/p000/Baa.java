package p000;

/* renamed from: Baa */
public final class Baa extends Paa {

    /* renamed from: c */
    public final double f67c;

    public Baa(double d) {
        this.f67c = d;
    }

    public Baa(hda hda) {
        this(hda.readDouble());
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 31);
        jda.writeDouble(mo82f());
    }

    /* renamed from: c */
    public int mo80c() {
        return 9;
    }

    /* renamed from: e */
    public String mo81e() {
        return Qca.m1073a(this.f67c);
    }

    /* renamed from: f */
    public double mo82f() {
        return this.f67c;
    }
}
