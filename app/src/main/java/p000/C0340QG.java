package p000;

/* renamed from: QG */
class C0340QG implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1171yH f994a;

    public C0340QG(C1171yH yHVar) {
        this.f994a = yHVar;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transformation ");
        sb.append(this.f994a.key());
        sb.append(" returned input Bitmap but recycled it.");
        throw new IllegalStateException(sb.toString());
    }
}
