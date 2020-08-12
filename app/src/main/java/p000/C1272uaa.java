package p000;

/* renamed from: uaa reason: case insensitive filesystem */
public final class C1272uaa extends Caa {

    /* renamed from: c */
    public int f3859c;

    /* renamed from: d */
    public short f3860d;

    public C1272uaa(hda hda) {
        this.f3859c = hda.readInt();
        this.f3860d = hda.readShort();
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 39);
        jda.writeInt(this.f3859c);
        jda.writeShort(this.f3860d);
    }

    /* renamed from: c */
    public int mo80c() {
        return 7;
    }

    /* renamed from: e */
    public String mo81e() {
        return "ERR#";
    }
}
