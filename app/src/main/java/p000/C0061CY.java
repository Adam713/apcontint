package p000;

/* renamed from: CY */
public abstract class C0061CY extends C0080DY {

    /* renamed from: a */
    public C1282xba f106a;

    public C0061CY(C1282xba xba) {
        if (xba != null) {
            this.f106a = xba;
            return;
        }
        throw new IllegalArgumentException("range must be supplied.");
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        this.f106a.mo5455a(jda);
        mo71b(jda);
    }

    /* renamed from: a */
    public final boolean mo112a(int i, int i2) {
        C1282xba m = mo118m();
        return m.mo754b() == i && m.mo751a() == i2;
    }

    /* renamed from: b */
    public abstract void mo71b(jda jda);

    /* renamed from: b */
    public final boolean mo113b(int i, int i2) {
        C1282xba xba = this.f106a;
        return xba.mo754b() <= i && xba.mo756d() >= i && xba.mo751a() <= i2 && xba.mo755c() >= i2;
    }

    /* renamed from: g */
    public int mo36g() {
        return mo72h() + 6;
    }

    /* renamed from: h */
    public abstract int mo72h();

    /* renamed from: i */
    public final int mo114i() {
        return (short) this.f106a.mo751a();
    }

    /* renamed from: j */
    public final int mo115j() {
        return this.f106a.mo754b();
    }

    /* renamed from: k */
    public final int mo116k() {
        return (short) this.f106a.mo755c();
    }

    /* renamed from: l */
    public final int mo117l() {
        return this.f106a.mo756d();
    }

    /* renamed from: m */
    public final C1282xba mo118m() {
        return this.f106a;
    }
}
