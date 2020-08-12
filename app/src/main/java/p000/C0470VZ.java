package p000;

/* renamed from: VZ */
public final class C0470VZ extends Caa {

    /* renamed from: c */
    public final int f1361c;

    /* renamed from: d */
    public final int f1362d;

    public C0470VZ(hda hda) {
        this.f1361c = hda.readInt();
        this.f1362d = hda.readInt();
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 43);
        jda.writeInt(this.f1361c);
        jda.writeInt(this.f1362d);
    }

    /* renamed from: c */
    public int mo80c() {
        return 9;
    }

    /* renamed from: e */
    public String mo81e() {
        return C1289zca.m3976a(23);
    }
}
