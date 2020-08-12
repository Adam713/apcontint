package com.adam.myapplication;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class TouchHighlightImageButton extends ImageButton {

    /* renamed from: a */
    public Drawable f2677a;

    /* renamed from: b */
    public Rect f2678b = new Rect();

    public TouchHighlightImageButton(Context context) {
        super(context);
        mo4118a();
    }

    public TouchHighlightImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4118a();
    }

    public TouchHighlightImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4118a();
    }

    /* renamed from: a */
    public final void mo4118a() {
        setBackgroundColor(0);
        setPadding(0, 0, 0, 0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843534});
        this.f2677a = obtainStyledAttributes.getDrawable(0);
        this.f2677a.setCallback(this);
        obtainStyledAttributes.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2677a.isStateful()) {
            this.f2677a.setState(getDrawableState());
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2677a.setBounds(this.f2678b);
        this.f2677a.draw(canvas);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2678b.set(0, 0, i, i2);
    }
}
