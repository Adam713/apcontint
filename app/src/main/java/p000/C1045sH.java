package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sH */
public class C1045sH {

    /* renamed from: a */
    public static final AtomicInteger f3714a = new AtomicInteger();

    /* renamed from: b */
    public final C0889lH f3715b;

    /* renamed from: c */
    public final C1025a f3716c;

    /* renamed from: d */
    public boolean f3717d;

    /* renamed from: e */
    public boolean f3718e;

    /* renamed from: f */
    public boolean f3719f = true;

    /* renamed from: g */
    public int f3720g;

    /* renamed from: h */
    public int f3721h;

    /* renamed from: i */
    public int f3722i;

    /* renamed from: j */
    public int f3723j;

    /* renamed from: k */
    public Drawable f3724k;

    /* renamed from: l */
    public Drawable f3725l;

    /* renamed from: m */
    public Object f3726m;

    public C1045sH(C0889lH lHVar, Uri uri, int i) {
        if (!lHVar.f3257q) {
            this.f3715b = lHVar;
            this.f3716c = new C1025a(uri, i, lHVar.f3254n);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: a */
    public final Drawable mo5078a() {
        return this.f3720g != 0 ? this.f3715b.f3247g.getResources().getDrawable(this.f3720g) : this.f3724k;
    }

    /* renamed from: a */
    public final C1024rH mo5079a(long j) {
        int andIncrement = f3714a.getAndIncrement();
        C1024rH a = this.f3716c.mo5055a();
        a.f3646b = andIncrement;
        a.f3647c = j;
        boolean z = this.f3715b.f3256p;
        String str = "Main";
        if (z) {
            C0039CH.m99a(str, "created", a.mo5052g(), a.toString());
        }
        this.f3715b.mo4597a(a);
        if (a != a) {
            a.f3646b = andIncrement;
            a.f3647c = j;
            if (z) {
                String d = a.mo5049d();
                StringBuilder sb = new StringBuilder();
                sb.append("into ");
                sb.append(a);
                C0039CH.m99a(str, "changed", d, sb.toString());
            }
        }
        return a;
    }

    /* renamed from: a */
    public C1045sH mo5080a(int i, int i2) {
        this.f3716c.mo5054a(i, i2);
        return this;
    }

    /* renamed from: a */
    public void mo5081a(ImageView imageView) {
        mo5082a(imageView, (C0451VG) null);
    }

    /* renamed from: a */
    public void mo5082a(ImageView imageView, C0451VG vg) {
        ImageView imageView2 = imageView;
        C0451VG vg2 = vg;
        long nanoTime = System.nanoTime();
        C0039CH.m95a();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f3716c.mo5056b()) {
            this.f3715b.mo4602a(imageView2);
            if (this.f3719f) {
                C0955oH.m3222a(imageView2, mo5078a());
            }
        } else {
            if (this.f3718e) {
                if (!this.f3716c.mo5057c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f3719f) {
                            C0955oH.m3222a(imageView2, mo5078a());
                        }
                        this.f3715b.mo4603a(imageView2, new C0513YG(this, imageView2, vg2));
                        return;
                    }
                    this.f3716c.mo5054a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C1024rH a = mo5079a(nanoTime);
            String a2 = C0039CH.m93a(a);
            if (C0789gH.m2710a(this.f3722i)) {
                Bitmap a3 = this.f3715b.mo4595a(a2);
                if (a3 != null) {
                    this.f3715b.mo4602a(imageView2);
                    C0889lH lHVar = this.f3715b;
                    C0955oH.m3221a(imageView, lHVar.f3247g, a3, C0893d.MEMORY, this.f3717d, lHVar.f3255o);
                    if (this.f3715b.f3256p) {
                        String g = a.mo5052g();
                        StringBuilder sb = new StringBuilder();
                        sb.append("from ");
                        sb.append(C0893d.MEMORY);
                        C0039CH.m99a("Main", "completed", g, sb.toString());
                    }
                    if (vg2 != null) {
                        vg.onSuccess();
                    }
                    return;
                }
            }
            if (this.f3719f) {
                C0955oH.m3222a(imageView2, mo5078a());
            }
            C0638cH cHVar = new C0638cH(this.f3715b, imageView, a, this.f3722i, this.f3723j, this.f3721h, this.f3725l, a2, this.f3726m, vg, this.f3717d);
            this.f3715b.mo4599a((C0202KG) cHVar);
        }
    }

    /* renamed from: b */
    public C1045sH mo5083b() {
        this.f3718e = false;
        return this;
    }
}
