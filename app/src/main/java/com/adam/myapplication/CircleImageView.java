package com.adam.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class CircleImageView extends ImageView {

    /* renamed from: a */
    public static final ScaleType f2057a = ScaleType.CENTER_CROP;

    /* renamed from: b */
    public static final Config f2058b = Config.ARGB_8888;

    /* renamed from: c */
    public final RectF f2059c;

    /* renamed from: d */
    public final RectF f2060d;

    /* renamed from: e */
    public final Matrix f2061e;

    /* renamed from: f */
    public final Paint f2062f;

    /* renamed from: g */
    public final Paint f2063g;

    /* renamed from: h */
    public final Paint f2064h;

    /* renamed from: i */
    public int f2065i;

    /* renamed from: j */
    public int f2066j;

    /* renamed from: k */
    public int f2067k;

    /* renamed from: l */
    public Bitmap f2068l;

    /* renamed from: m */
    public BitmapShader f2069m;

    /* renamed from: n */
    public int f2070n;

    /* renamed from: o */
    public int f2071o;

    /* renamed from: p */
    public float f2072p;

    /* renamed from: q */
    public float f2073q;

    /* renamed from: r */
    public ColorFilter f2074r;

    /* renamed from: s */
    public boolean f2075s;

    /* renamed from: t */
    public boolean f2076t;

    /* renamed from: u */
    public boolean f2077u;

    public CircleImageView(Context context) {
        super(context);
        this.f2059c = new RectF();
        this.f2060d = new RectF();
        this.f2061e = new Matrix();
        this.f2062f = new Paint();
        this.f2063g = new Paint();
        this.f2064h = new Paint();
        this.f2065i = -16777216;
        this.f2066j = 0;
        this.f2067k = 0;
        mo3347b();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2059c = new RectF();
        this.f2060d = new RectF();
        this.f2061e = new Matrix();
        this.f2062f = new Paint();
        this.f2063g = new Paint();
        this.f2064h = new Paint();
        this.f2065i = -16777216;
        this.f2066j = 0;
        this.f2067k = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0776fN.CircleImageView, i, 0);
        this.f2066j = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2065i = obtainStyledAttributes.getColor(0, -16777216);
        this.f2077u = obtainStyledAttributes.getBoolean(1, false);
        this.f2067k = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        mo3347b();
    }

    /* renamed from: a */
    public final Bitmap mo3345a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f2058b) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f2058b);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo3346a() {
        Paint paint = this.f2062f;
        if (paint != null) {
            paint.setColorFilter(this.f2074r);
        }
    }

    /* renamed from: b */
    public final void mo3347b() {
        super.setScaleType(f2057a);
        this.f2075s = true;
        if (this.f2076t) {
            mo3348c();
            this.f2076t = false;
        }
    }

    /* renamed from: c */
    public final void mo3348c() {
        if (!this.f2075s) {
            this.f2076t = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.f2068l;
            if (bitmap == null) {
                invalidate();
                return;
            }
            TileMode tileMode = TileMode.CLAMP;
            this.f2069m = new BitmapShader(bitmap, tileMode, tileMode);
            this.f2062f.setAntiAlias(true);
            this.f2062f.setShader(this.f2069m);
            this.f2063g.setStyle(Style.STROKE);
            this.f2063g.setAntiAlias(true);
            this.f2063g.setColor(this.f2065i);
            this.f2063g.setStrokeWidth((float) this.f2066j);
            this.f2064h.setStyle(Style.FILL);
            this.f2064h.setAntiAlias(true);
            this.f2064h.setColor(this.f2067k);
            this.f2071o = this.f2068l.getHeight();
            this.f2070n = this.f2068l.getWidth();
            this.f2060d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2073q = Math.min((this.f2060d.height() - ((float) this.f2066j)) / 2.0f, (this.f2060d.width() - ((float) this.f2066j)) / 2.0f);
            this.f2059c.set(this.f2060d);
            if (!this.f2077u) {
                RectF rectF = this.f2059c;
                int i = this.f2066j;
                rectF.inset((float) i, (float) i);
            }
            this.f2072p = Math.min(this.f2059c.height() / 2.0f, this.f2059c.width() / 2.0f);
            mo3346a();
            mo3349d();
            invalidate();
        }
    }

    /* renamed from: d */
    public final void mo3349d() {
        float f;
        float f2;
        this.f2061e.set(null);
        float f3 = 0.0f;
        if (((float) this.f2070n) * this.f2059c.height() > this.f2059c.width() * ((float) this.f2071o)) {
            f2 = this.f2059c.height() / ((float) this.f2071o);
            f = (this.f2059c.width() - (((float) this.f2070n) * f2)) * 0.5f;
        } else {
            f2 = this.f2059c.width() / ((float) this.f2070n);
            f3 = (this.f2059c.height() - (((float) this.f2071o) * f2)) * 0.5f;
            f = 0.0f;
        }
        this.f2061e.setScale(f2, f2);
        Matrix matrix = this.f2061e;
        float f4 = (float) ((int) (f + 0.5f));
        RectF rectF = this.f2059c;
        matrix.postTranslate(f4 + rectF.left, ((float) ((int) (f3 + 0.5f))) + rectF.top);
        this.f2069m.setLocalMatrix(this.f2061e);
    }

    public int getBorderColor() {
        return this.f2065i;
    }

    public int getBorderWidth() {
        return this.f2066j;
    }

    public int getFillColor() {
        return this.f2067k;
    }

    public ScaleType getScaleType() {
        return f2057a;
    }

    public void onDraw(Canvas canvas) {
        if (this.f2068l != null) {
            if (this.f2067k != 0) {
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f2072p, this.f2064h);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f2072p, this.f2062f);
            if (this.f2066j != 0) {
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f2073q, this.f2063g);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo3348c();
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@ColorInt int i) {
        if (i != this.f2065i) {
            this.f2065i = i;
            this.f2063g.setColor(this.f2065i);
            invalidate();
        }
    }

    public void setBorderColorResource(@ColorRes int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f2077u) {
            this.f2077u = z;
            mo3348c();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f2066j) {
            this.f2066j = i;
            mo3348c();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f2074r) {
            this.f2074r = colorFilter;
            mo3346a();
            invalidate();
        }
    }

    public void setFillColor(@ColorInt int i) {
        if (i != this.f2067k) {
            this.f2067k = i;
            this.f2064h.setColor(i);
            invalidate();
        }
    }

    public void setFillColorResource(@ColorRes int i) {
        setFillColor(getContext().getResources().getColor(i));
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f2068l = bitmap;
        mo3348c();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f2068l = mo3345a(drawable);
        mo3348c();
    }

    public void setImageResource(@DrawableRes int i) {
        super.setImageResource(i);
        this.f2068l = mo3345a(getDrawable());
        mo3348c();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f2068l = uri != null ? mo3345a(getDrawable()) : null;
        mo3348c();
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != f2057a) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }
}
