package p000;

/* renamed from: RG */
class C0362RG implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1171yH f1067a;

    public C0362RG(C1171yH yHVar) {
        this.f1067a = yHVar;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transformation ");
        sb.append(this.f1067a.key());
        sb.append(" mutated input Bitmap but failed to recycle the original.");
        throw new IllegalStateException(sb.toString());
    }
}
