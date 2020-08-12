package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: aH */
public interface C0593aH {

    /* renamed from: aH$a */
    public static class C0594a {

        /* renamed from: a */
        public final InputStream f1799a;

        /* renamed from: b */
        public final Bitmap f1800b;

        /* renamed from: c */
        public final boolean f1801c;

        /* renamed from: d */
        public final long f1802d;

        public C0594a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f1799a = inputStream;
                this.f1800b = null;
                this.f1801c = z;
                this.f1802d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }

        @Deprecated
        /* renamed from: a */
        public Bitmap mo1822a() {
            return this.f1800b;
        }

        /* renamed from: b */
        public long mo1823b() {
            return this.f1802d;
        }

        /* renamed from: c */
        public InputStream mo1824c() {
            return this.f1799a;
        }
    }

    /* renamed from: aH$b */
    public static class C0595b extends IOException {

        /* renamed from: a */
        public final boolean f1803a;

        /* renamed from: b */
        public final int f1804b;

        public C0595b(String str, int i, int i2) {
            super(str);
            this.f1803a = C0809hH.m2751a(i);
            this.f1804b = i2;
        }
    }

    /* renamed from: a */
    C0594a mo1a(Uri uri, int i);
}
