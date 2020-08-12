package p000;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: rH */
public final class C1024rH {

    /* renamed from: a */
    public static final long f3645a = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: b */
    public int f3646b;

    /* renamed from: c */
    public long f3647c;

    /* renamed from: d */
    public int f3648d;

    /* renamed from: e */
    public final Uri f3649e;

    /* renamed from: f */
    public final int f3650f;

    /* renamed from: g */
    public final String f3651g;

    /* renamed from: h */
    public final List<C1171yH> f3652h;

    /* renamed from: i */
    public final int f3653i;

    /* renamed from: j */
    public final int f3654j;

    /* renamed from: k */
    public final boolean f3655k;

    /* renamed from: l */
    public final boolean f3656l;

    /* renamed from: m */
    public final boolean f3657m;

    /* renamed from: n */
    public final float f3658n;

    /* renamed from: o */
    public final float f3659o;

    /* renamed from: p */
    public final float f3660p;

    /* renamed from: q */
    public final boolean f3661q;

    /* renamed from: r */
    public final Config f3662r;

    /* renamed from: s */
    public final C0894e f3663s;

    /* renamed from: rH$a */
    public static final class C1025a {

        /* renamed from: a */
        public Uri f3664a;

        /* renamed from: b */
        public int f3665b;

        /* renamed from: c */
        public String f3666c;

        /* renamed from: d */
        public int f3667d;

        /* renamed from: e */
        public int f3668e;

        /* renamed from: f */
        public boolean f3669f;

        /* renamed from: g */
        public boolean f3670g;

        /* renamed from: h */
        public boolean f3671h;

        /* renamed from: i */
        public float f3672i;

        /* renamed from: j */
        public float f3673j;

        /* renamed from: k */
        public float f3674k;

        /* renamed from: l */
        public boolean f3675l;

        /* renamed from: m */
        public List<C1171yH> f3676m;

        /* renamed from: n */
        public Config f3677n;

        /* renamed from: o */
        public C0894e f3678o;

        public C1025a(Uri uri, int i, Config config) {
            this.f3664a = uri;
            this.f3665b = i;
            this.f3677n = config;
        }

        /* renamed from: a */
        public C1025a mo5054a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f3667d = i;
                this.f3668e = i2;
                return this;
            }
        }

        /* renamed from: a */
        public C1024rH mo5055a() {
            if (this.f3670g && this.f3669f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f3669f && this.f3667d == 0 && this.f3668e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f3670g && this.f3667d == 0 && this.f3668e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f3678o == null) {
                    this.f3678o = C0894e.NORMAL;
                }
                C1024rH rHVar = r2;
                C1024rH rHVar2 = new C1024rH(this.f3664a, this.f3665b, this.f3666c, this.f3676m, this.f3667d, this.f3668e, this.f3669f, this.f3670g, this.f3671h, this.f3672i, this.f3673j, this.f3674k, this.f3675l, this.f3677n, this.f3678o);
                return rHVar;
            }
        }

        /* renamed from: b */
        public boolean mo5056b() {
            return (this.f3664a == null && this.f3665b == 0) ? false : true;
        }

        /* renamed from: c */
        public boolean mo5057c() {
            return (this.f3667d == 0 && this.f3668e == 0) ? false : true;
        }
    }

    public C1024rH(Uri uri, int i, String str, List<C1171yH> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Config config, C0894e eVar) {
        this.f3649e = uri;
        this.f3650f = i;
        this.f3651g = str;
        this.f3652h = list == null ? null : Collections.unmodifiableList(list);
        this.f3653i = i2;
        this.f3654j = i3;
        this.f3655k = z;
        this.f3656l = z2;
        this.f3657m = z3;
        this.f3658n = f;
        this.f3659o = f2;
        this.f3660p = f3;
        this.f3661q = z4;
        this.f3662r = config;
        this.f3663s = eVar;
    }

    /* renamed from: a */
    public String mo5046a() {
        Uri uri = this.f3649e;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f3650f);
    }

    /* renamed from: b */
    public boolean mo5047b() {
        return this.f3652h != null;
    }

    /* renamed from: c */
    public boolean mo5048c() {
        return (this.f3653i == 0 && this.f3654j == 0) ? false : true;
    }

    /* renamed from: d */
    public String mo5049d() {
        StringBuilder sb;
        long nanoTime = System.nanoTime() - this.f3647c;
        if (nanoTime > f3645a) {
            sb = new StringBuilder();
            sb.append(mo5052g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(mo5052g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    /* renamed from: e */
    public boolean mo5050e() {
        return mo5048c() || this.f3658n != 0.0f;
    }

    /* renamed from: f */
    public boolean mo5051f() {
        return mo5050e() || mo5047b();
    }

    /* renamed from: g */
    public String mo5052g() {
        StringBuilder sb = new StringBuilder();
        sb.append("[R");
        sb.append(this.f3646b);
        sb.append(']');
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f3650f;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f3649e);
        }
        List<C1171yH> list = this.f3652h;
        if (list != null && !list.isEmpty()) {
            for (C1171yH yHVar : this.f3652h) {
                sb.append(' ');
                sb.append(yHVar.key());
            }
        }
        if (this.f3651g != null) {
            sb.append(" stableKey(");
            sb.append(this.f3651g);
            sb.append(')');
        }
        if (this.f3653i > 0) {
            sb.append(" resize(");
            sb.append(this.f3653i);
            sb.append(',');
            sb.append(this.f3654j);
            sb.append(')');
        }
        if (this.f3655k) {
            sb.append(" centerCrop");
        }
        if (this.f3656l) {
            sb.append(" centerInside");
        }
        if (this.f3658n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f3658n);
            if (this.f3661q) {
                sb.append(" @ ");
                sb.append(this.f3659o);
                sb.append(',');
                sb.append(this.f3660p);
            }
            sb.append(')');
        }
        if (this.f3662r != null) {
            sb.append(' ');
            sb.append(this.f3662r);
        }
        sb.append('}');
        return sb.toString();
    }
}
