package p000;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: YG */
public class C0513YG implements OnPreDrawListener {

    /* renamed from: a */
    public final C1045sH f1483a;

    /* renamed from: b */
    public final WeakReference<ImageView> f1484b;

    /* renamed from: c */
    public C0451VG f1485c;

    public C0513YG(C1045sH sHVar, ImageView imageView, C0451VG vg) {
        this.f1483a = sHVar;
        this.f1484b = new WeakReference<>(imageView);
        this.f1485c = vg;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    /* renamed from: a */
    public void mo1509a() {
        this.f1485c = null;
        ImageView imageView = (ImageView) this.f1484b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f1484b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            C1045sH sHVar = this.f1483a;
            sHVar.mo5083b();
            sHVar.mo5080a(width, height);
            sHVar.mo5082a(imageView, this.f1485c);
        }
        return true;
    }
}
