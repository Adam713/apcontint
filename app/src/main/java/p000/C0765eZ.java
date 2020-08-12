package p000;

/* renamed from: eZ */
public abstract class C0765eZ extends C0953nY {

    /* renamed from: eZ$a */
    public static final class C0766a implements C0768c {

        /* renamed from: a */
        public final C0768c f2922a;

        /* renamed from: b */
        public int f2923b;

        public C0766a(C0768c cVar, int i) {
            this.f2922a = cVar;
            this.f2923b = i;
        }

        /* renamed from: a */
        public int mo4339a() {
            return this.f2923b;
        }

        /* renamed from: a */
        public void mo4340a(int i) {
            this.f2923b = i;
        }

        /* renamed from: a */
        public void mo4341a(C0933mY mYVar) {
            this.f2923b += mYVar.mo163c();
            this.f2922a.mo4341a(mYVar);
        }
    }

    /* renamed from: eZ$b */
    private static final class C0767b implements C0768c {

        /* renamed from: a */
        public int f2924a = 0;

        /* renamed from: a */
        public int mo4342a() {
            return this.f2924a;
        }

        /* renamed from: a */
        public void mo4341a(C0933mY mYVar) {
            this.f2924a += mYVar.mo163c();
        }
    }

    /* renamed from: eZ$c */
    public interface C0768c {
        /* renamed from: a */
        void mo4341a(C0933mY mYVar);
    }

    /* renamed from: a */
    public abstract void mo1812a(C0768c cVar);

    /* renamed from: c */
    public int mo163c() {
        C0767b bVar = new C0767b();
        mo1812a(bVar);
        return bVar.mo4342a();
    }
}
