package p000;

/* renamed from: OG */
class C0296OG implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1171yH f847a;

    /* renamed from: b */
    public final /* synthetic */ RuntimeException f848b;

    public C0296OG(C1171yH yHVar, RuntimeException runtimeException) {
        this.f847a = yHVar;
        this.f848b = runtimeException;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transformation ");
        sb.append(this.f847a.key());
        sb.append(" crashed with exception.");
        throw new RuntimeException(sb.toString(), this.f848b);
    }
}
