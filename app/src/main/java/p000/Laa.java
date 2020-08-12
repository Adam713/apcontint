package p000;

/* renamed from: Laa */
public final class Laa extends Caa {

    /* renamed from: c */
    public int f701c;

    public Laa(hda hda) {
        this.f701c = hda.readInt();
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 42);
        jda.writeInt(this.f701c);
    }

    /* renamed from: c */
    public int mo80c() {
        return 5;
    }

    /* renamed from: e */
    public String mo81e() {
        return C1289zca.m3976a(23);
    }

    public String toString() {
        return Laa.class.getName();
    }
}
