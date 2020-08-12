package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: KG */
public abstract class C0202KG<T> {

    /* renamed from: a */
    public final C0889lH f500a;

    /* renamed from: b */
    public final C1024rH f501b;

    /* renamed from: c */
    public final WeakReference<T> f502c;

    /* renamed from: d */
    public final boolean f503d;

    /* renamed from: e */
    public final int f504e;

    /* renamed from: f */
    public final int f505f;

    /* renamed from: g */
    public final int f506g;

    /* renamed from: h */
    public final Drawable f507h;

    /* renamed from: i */
    public final String f508i;

    /* renamed from: j */
    public final Object f509j;

    /* renamed from: k */
    public boolean f510k;

    /* renamed from: l */
    public boolean f511l;

    /* renamed from: KG$a */
    static class C0203a<M> extends WeakReference<M> {

        /* renamed from: a */
        public final C0202KG f512a;

        public C0203a(C0202KG kg, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f512a = kg;
        }
    }

    public C0202KG(C0889lH lHVar, T t, C1024rH rHVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.f500a = lHVar;
        this.f501b = rHVar;
        this.f502c = t == null ? null : new C0203a<>(this, t, lHVar.f3253m);
        this.f504e = i;
        this.f505f = i2;
        this.f503d = z;
        this.f506g = i3;
        this.f507h = drawable;
        this.f508i = str;
        if (obj == 0) {
            obj = this;
        }
        this.f509j = obj;
    }

    /* renamed from: a */
    public void mo650a() {
        this.f511l = true;
    }

    /* renamed from: a */
    public abstract void mo651a(Bitmap bitmap, C0893d dVar);

    /* renamed from: b */
    public abstract void mo652b();

    /* renamed from: c */
    public String mo653c() {
        return this.f508i;
    }

    /* renamed from: d */
    public int mo654d() {
        return this.f504e;
    }

    /* renamed from: e */
    public int mo655e() {
        return this.f505f;
    }

    /* renamed from: f */
    public C0889lH mo656f() {
        return this.f500a;
    }

    /* renamed from: g */
    public C0894e mo657g() {
        return this.f501b.f3663s;
    }

    /* renamed from: h */
    public C1024rH mo658h() {
        return this.f501b;
    }

    /* renamed from: i */
    public Object mo659i() {
        return this.f509j;
    }

    /* renamed from: j */
    public T mo660j() {
        WeakReference<T> weakReference = this.f502c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: k */
    public boolean mo661k() {
        return this.f511l;
    }

    /* renamed from: l */
    public boolean mo662l() {
        return this.f510k;
    }
}
