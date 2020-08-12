package p000;

import android.view.animation.Interpolator;

/* renamed from: uR */
class C1095uR implements Interpolator {
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2) + 1.0f;
    }
}
