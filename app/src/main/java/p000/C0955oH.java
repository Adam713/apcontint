package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* renamed from: oH */
public final class C0955oH extends BitmapDrawable {

    /* renamed from: a */
    public static final Paint f3489a = new Paint();

    /* renamed from: b */
    public final boolean f3490b;

    /* renamed from: c */
    public final float f3491c;

    /* renamed from: d */
    public final C0893d f3492d;

    /* renamed from: e */
    public Drawable f3493e;

    /* renamed from: f */
    public long f3494f;

    /* renamed from: g */
    public boolean f3495g;

    /* renamed from: h */
    public int f3496h = 255;

    public C0955oH(Context context, Bitmap bitmap, Drawable drawable, C0893d dVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f3490b = z2;
        this.f3491c = context.getResources().getDisplayMetrics().density;
        this.f3492d = dVar;
        if (dVar != C0893d.MEMORY && !z) {
            this.f3493e = drawable;
            this.f3495g = true;
            this.f3494f = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    public static Path m3220a(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    /* renamed from: a */
    public static void m3221a(ImageView imageView, Context context, Bitmap bitmap, C0893d dVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        C0955oH oHVar = new C0955oH(context, bitmap, drawable, dVar, z, z2);
        imageView.setImageDrawable(oHVar);
    }

    /* renamed from: a */
    public static void m3222a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    /* renamed from: a */
    public final void mo4893a(Canvas canvas) {
        f3489a.setColor(-1);
        canvas.drawPath(m3220a(new Point(0, 0), (int) (this.f3491c * 16.0f)), f3489a);
        f3489a.setColor(this.f3492d.f3274e);
        canvas.drawPath(m3220a(new Point(0, 0), (int) (this.f3491c * 15.0f)), f3489a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(Canvas r5) {
        /*
            r4 = this;
            boolean r0 = r4.f3495g
            if (r0 != 0) goto L_0x0008
        L_0x0004:
            super.draw(r5)
            goto L_0x0041
        L_0x0008:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.f3494f
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0020
            r0 = 0
            r4.f3495g = r0
            r0 = 0
            r4.f3493e = r0
            goto L_0x0004
        L_0x0020:
            android.graphics.drawable.Drawable r1 = r4.f3493e
            if (r1 == 0) goto L_0x0027
            r1.draw(r5)
        L_0x0027:
            int r1 = r4.f3496h
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r0 = r4.f3496h
            super.setAlpha(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 10
            if (r0 > r1) goto L_0x0041
            r4.invalidateSelf()
        L_0x0041:
            boolean r0 = r4.f3490b
            if (r0 == 0) goto L_0x0048
            r4.mo4893a(r5)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0955oH.draw(android.graphics.Canvas):void");
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3493e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f3496h = i;
        Drawable drawable = this.f3493e;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3493e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
