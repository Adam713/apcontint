package p000;

/* renamed from: mH */
class C0914mH implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Exception f3330a;

    /* renamed from: b */
    public final /* synthetic */ C0891b f3331b;

    public C0914mH(C0891b bVar, Exception exc) {
        this.f3331b = bVar;
        this.f3330a = exc;
    }

    public void run() {
        throw new RuntimeException(this.f3330a);
    }
}
