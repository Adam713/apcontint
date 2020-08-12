package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import java.io.InputStream;

/* renamed from: tH */
public abstract class C1064tH {

    /* renamed from: tH$a */
    public static final class C1065a {

        /* renamed from: a */
        public final C0893d f3770a;

        /* renamed from: b */
        public final Bitmap f3771b;

        /* renamed from: c */
        public final InputStream f3772c;

        /* renamed from: d */
        public final int f3773d;

        public C1065a(Bitmap bitmap, InputStream inputStream, C0893d dVar, int i) {
            boolean z = true;
            boolean z2 = bitmap != null;
            if (inputStream == null) {
                z = false;
            }
            if (z ^ z2) {
                this.f3771b = bitmap;
                this.f3772c = inputStream;
                C0039CH.m90a(dVar, "loadedFrom == null");
                this.f3770a = dVar;
                this.f3773d = i;
                return;
            }
            throw new AssertionError();
        }

        public C1065a(Bitmap bitmap, C0893d dVar) {
            C0039CH.m90a(bitmap, "bitmap == null");
            this(bitmap, null, dVar, 0);
        }

        public C1065a(InputStream inputStream, C0893d dVar) {
            C0039CH.m90a(inputStream, "stream == null");
            this(null, inputStream, dVar, 0);
        }

        /* renamed from: a */
        public Bitmap mo5120a() {
            return this.f3771b;
        }

        /* renamed from: b */
        public int mo5121b() {
            return this.f3773d;
        }

        /* renamed from: c */
        public C0893d mo5122c() {
            return this.f3770a;
        }

        /* renamed from: d */
        public InputStream mo5123d() {
            return this.f3772c;
        }
    }

    /* renamed from: a */
    public static void m3453a(int i, int i2, int i3, int i4, Options options, C1024rH rHVar) {
        int i5;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = (double) (((float) i3) / ((float) i));
            } else if (i == 0) {
                d = (double) (((float) i4) / ((float) i2));
            } else {
                int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                i5 = rHVar.f3656l ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i5 = (int) Math.floor(d);
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: a */
    public static void m3454a(int i, int i2, Options options, C1024rH rHVar) {
        m3453a(i, i2, options.outWidth, options.outHeight, options, rHVar);
    }

    /* renamed from: a */
    public static boolean m3455a(Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: b */
    public static Options m3456b(C1024rH rHVar) {
        boolean c = rHVar.mo5048c();
        boolean z = rHVar.f3662r != null;
        Options options = null;
        if (c || z) {
            options = new Options();
            options.inJustDecodeBounds = c;
            if (z) {
                options.inPreferredConfig = rHVar.f3662r;
            }
        }
        return options;
    }

    /* renamed from: a */
    public int mo4500a() {
        return 0;
    }

    /* renamed from: a */
    public abstract C1065a mo759a(C1024rH rHVar, int i);

    /* renamed from: a */
    public abstract boolean mo760a(C1024rH rHVar);

    /* renamed from: a */
    public boolean mo4501a(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* renamed from: b */
    public boolean mo4502b() {
        return false;
    }
}
