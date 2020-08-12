package p000;

/* renamed from: CQ */
class C0053CQ implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f97a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f98b;

    public C0053CQ(C0523YQ yq, int i) {
        this.f98b = yq;
        this.f97a = i;
    }

    public void run() {
        int i = this.f97a;
        if (i == 0) {
            this.f98b.mo1588k();
            this.f98b.f1524N.notifyDataSetChanged();
        } else if (i == 1) {
            this.f98b.mo1588k();
            this.f98b.mo1534P();
        } else if (i == 4) {
            this.f98b.f1505Da.selectAll();
        }
    }
}
