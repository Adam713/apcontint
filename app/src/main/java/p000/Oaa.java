package p000;

/* renamed from: Oaa */
public abstract class Oaa extends Caa {

    /* renamed from: c */
    public static final Tca f908c = Uca.m1284a(32768);

    /* renamed from: d */
    public static final Tca f909d = Uca.m1284a(16384);

    /* renamed from: e */
    public static final Tca f910e = Uca.m1284a(255);

    /* renamed from: f */
    public int f911f;

    /* renamed from: g */
    public int f912g;

    /* renamed from: a */
    public final void mo1003a(int i) {
        this.f912g = f910e.mo1248a(this.f912g, i);
    }

    /* renamed from: a */
    public final void mo1004a(boolean z) {
        this.f912g = f909d.mo1249a(this.f912g, z);
    }

    /* renamed from: b */
    public final void mo1005b(int i) {
        this.f911f = i;
    }

    /* renamed from: b */
    public final void mo1006b(hda hda) {
        this.f911f = hda.mo401a();
        this.f912g = hda.mo401a();
    }

    /* renamed from: b */
    public final void mo1007b(jda jda) {
        jda.writeShort(this.f911f);
        jda.writeShort(this.f912g);
    }

    /* renamed from: b */
    public final void mo1008b(boolean z) {
        this.f912g = f908c.mo1249a(this.f912g, z);
    }

    /* renamed from: g */
    public final String mo1009g() {
        return new Mca(mo1011i(), mo1010h(), !mo1013k(), !mo1012j()).mo910a();
    }

    /* renamed from: h */
    public final int mo1010h() {
        return f910e.mo1256c(this.f912g);
    }

    /* renamed from: i */
    public final int mo1011i() {
        return this.f911f;
    }

    /* renamed from: j */
    public final boolean mo1012j() {
        return f909d.mo1258d(this.f912g);
    }

    /* renamed from: k */
    public final boolean mo1013k() {
        return f908c.mo1258d(this.f912g);
    }
}
