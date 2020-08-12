package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: cH */
public class C0638cH extends C0202KG<ImageView> {

    /* renamed from: m */
    public C0451VG f1932m;

    public C0638cH(C0889lH lHVar, ImageView imageView, C1024rH rHVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, C0451VG vg, boolean z) {
        super(lHVar, imageView, rHVar, i, i2, i3, drawable, str, obj, z);
        this.f1932m = vg;
    }

    /* renamed from: a */
    public void mo650a() {
        super.mo650a();
        if (this.f1932m != null) {
            this.f1932m = null;
        }
    }

    /* renamed from: a */
    public void mo651a(Bitmap bitmap, C0893d dVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f502c.get();
            if (imageView != null) {
                C0889lH lHVar = this.f500a;
                Bitmap bitmap2 = bitmap;
                C0893d dVar2 = dVar;
                C0955oH.m3221a(imageView, lHVar.f3247g, bitmap2, dVar2, this.f503d, lHVar.f3255o);
                C0451VG vg = this.f1932m;
                if (vg != null) {
                    vg.onSuccess();
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: b */
    public void mo652b() {
        ImageView imageView = (ImageView) this.f502c.get();
        if (imageView != null) {
            int i = this.f506g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable = this.f507h;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            C0451VG vg = this.f1932m;
            if (vg != null) {
                vg.mo1334a();
            }
        }
    }
}
