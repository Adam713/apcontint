package com.adam.myapplication.frag;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.options.PropertyOptions;
import java.util.ArrayList;
import java.util.Comparator;

public class CustomViewPager extends ViewGroup {

    /* renamed from: a */
    public static final Comparator<C0721a> f2712a = new C1075tR();

    /* renamed from: b */
    public static final Interpolator f2713b = new C1095uR();

    /* renamed from: A */
    public int f2714A;

    /* renamed from: B */
    public int f2715B;

    /* renamed from: C */
    public float f2716C;

    /* renamed from: D */
    public float f2717D;

    /* renamed from: E */
    public boolean f2718E;

    /* renamed from: F */
    public EdgeEffectCompat f2719F;

    /* renamed from: G */
    public EdgeEffectCompat f2720G;

    /* renamed from: H */
    public boolean f2721H = true;

    /* renamed from: I */
    public C0722b f2722I;

    /* renamed from: J */
    public int f2723J = 0;

    /* renamed from: c */
    public final ArrayList<C0721a> f2724c = new ArrayList<>();

    /* renamed from: d */
    public PagerAdapter f2725d;

    /* renamed from: e */
    public int f2726e;

    /* renamed from: f */
    public int f2727f = -1;

    /* renamed from: g */
    public Parcelable f2728g = null;

    /* renamed from: h */
    public ClassLoader f2729h = null;

    /* renamed from: i */
    public Scroller f2730i;

    /* renamed from: j */
    public int f2731j;

    /* renamed from: k */
    public Drawable f2732k;

    /* renamed from: l */
    public int f2733l;

    /* renamed from: m */
    public int f2734m;

    /* renamed from: n */
    public boolean f2735n;

    /* renamed from: o */
    public boolean f2736o;

    /* renamed from: p */
    public boolean f2737p;

    /* renamed from: q */
    public boolean f2738q;

    /* renamed from: r */
    public int f2739r = 0;

    /* renamed from: s */
    public boolean f2740s;

    /* renamed from: t */
    public boolean f2741t;

    /* renamed from: u */
    public int f2742u;

    /* renamed from: v */
    public float f2743v;

    /* renamed from: w */
    public float f2744w;

    /* renamed from: x */
    public float f2745x;

    /* renamed from: y */
    public int f2746y = -1;

    /* renamed from: z */
    public VelocityTracker f2747z;

    /* renamed from: com.valdio.valdioveliu.recyclerview.frag.CustomViewPager$a */
    static class C0721a {

        /* renamed from: a */
        public Object f2748a;

        /* renamed from: b */
        public int f2749b;

        /* renamed from: c */
        public boolean f2750c;
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.frag.CustomViewPager$b */
    public interface C0722b {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.frag.CustomViewPager$c */
    public static class C0723c extends BaseSavedState {
        public static final Creator<C0723c> CREATOR = ParcelableCompat.newCreator(new C1115vR());

        /* renamed from: a */
        public int f2751a;

        /* renamed from: b */
        public Parcelable f2752b;

        /* renamed from: c */
        public ClassLoader f2753c;

        public C0723c(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = C0723c.class.getClassLoader();
            }
            this.f2751a = parcel.readInt();
            this.f2752b = parcel.readParcelable(classLoader);
            this.f2753c = classLoader;
        }

        public C0723c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f2751a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2751a);
            parcel.writeParcelable(this.f2752b, i);
        }
    }

    public CustomViewPager(Context context) {
        super(context);
        mo4170c();
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4170c();
    }

    private void setScrollState(int i) {
        if (this.f2723J != i) {
            this.f2723J = i;
            C0722b bVar = this.f2722I;
            if (bVar != null) {
                bVar.onPageScrollStateChanged(i);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f2736o != z) {
            this.f2736o = z;
        }
    }

    /* renamed from: a */
    public C0721a mo4154a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo4168b(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo4155a() {
        boolean z = this.f2738q;
        if (z) {
            setScrollingCacheEnabled(false);
            this.f2730i.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f2730i.getCurrX();
            int currY = this.f2730i.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
            setScrollState(0);
        }
        this.f2737p = false;
        this.f2738q = false;
        boolean z2 = z;
        for (int i = 0; i < this.f2724c.size(); i++) {
            C0721a aVar = (C0721a) this.f2724c.get(i);
            if (aVar.f2750c) {
                aVar.f2750c = false;
                z2 = true;
            }
        }
        if (z2) {
            mo4178f();
        }
    }

    /* renamed from: a */
    public void mo4156a(int i, int i2) {
        C0721a aVar = new C0721a();
        aVar.f2749b = i;
        aVar.f2748a = this.f2725d.instantiateItem(this, i);
        if (i2 < 0) {
            this.f2724c.add(aVar);
        } else {
            this.f2724c.add(i2, aVar);
        }
    }

    /* renamed from: a */
    public void mo4157a(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i5 = i - scrollX;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            mo4155a();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        this.f2738q = true;
        setScrollState(2);
        int abs = (int) ((((float) Math.abs(i5)) / ((float) (getWidth() + this.f2731j))) * 100.0f);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            float f = (float) abs;
            i4 = (int) (f + ((f / (((float) abs2) / this.f2716C)) * this.f2717D));
        } else {
            i4 = abs + 100;
        }
        this.f2730i.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
        invalidate();
    }

    /* renamed from: a */
    public final void mo4158a(int i, int i2, int i3, int i4) {
        int i5 = i + i3;
        if (i2 > 0) {
            int scrollX = getScrollX();
            int i6 = i2 + i4;
            int i7 = scrollX / i6;
            int i8 = (int) ((((float) i7) + (((float) (scrollX % i6)) / ((float) i6))) * ((float) i5));
            scrollTo(i8, getScrollY());
            if (!this.f2730i.isFinished()) {
                this.f2730i.startScroll(i8, 0, this.f2726e * i5, 0, this.f2730i.getDuration() - this.f2730i.timePassed());
                return;
            }
            return;
        }
        int i9 = this.f2726e * i5;
        if (i9 != getScrollX()) {
            mo4155a();
            scrollTo(i9, getScrollY());
        }
    }

    /* renamed from: a */
    public void mo4159a(int i, boolean z, boolean z2) {
        mo4160a(i, z, z2, 0);
    }

    /* renamed from: a */
    public void mo4160a(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.f2725d;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f2726e != i || this.f2724c.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f2725d.getCount()) {
                i = this.f2725d.getCount() - 1;
            }
            int i3 = this.f2739r;
            int i4 = this.f2726e;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f2724c.size(); i5++) {
                    ((C0721a) this.f2724c.get(i5)).f2750c = true;
                }
            }
            if (this.f2726e == i) {
                z3 = false;
            }
            this.f2726e = i;
            mo4178f();
            int width = (getWidth() + this.f2731j) * i;
            if (z) {
                mo4157a(width, 0, i2);
                if (z3) {
                    C0722b bVar = this.f2722I;
                    if (bVar != null) {
                        bVar.onPageSelected(i);
                    }
                }
            } else {
                if (z3) {
                    C0722b bVar2 = this.f2722I;
                    if (bVar2 != null) {
                        bVar2.onPageSelected(i);
                    }
                }
                mo4155a();
                scrollTo(width, 0);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    public final void mo4161a(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.f2746y) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2744w = MotionEventCompat.getX(motionEvent, i);
            this.f2746y = MotionEventCompat.getPointerId(motionEvent, i);
            VelocityTracker velocityTracker = this.f2747z;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r2.getLeft() <= r0.getLeft()) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r6 != 2) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r2.getLeft() >= r0.getLeft()) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4162a(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            if (r0 != r5) goto L_0x0007
            r0 = 0
        L_0x0007:
            r1 = 0
            android.view.FocusFinder r2 = android.view.FocusFinder.getInstance()
            android.view.View r2 = r2.findNextFocus(r5, r0, r6)
            r3 = 66
            r4 = 17
            if (r2 == 0) goto L_0x003b
            if (r2 == r0) goto L_0x003b
            if (r6 != r4) goto L_0x002c
            if (r0 == 0) goto L_0x0027
            int r1 = r2.getLeft()
            int r0 = r0.getLeft()
            if (r1 < r0) goto L_0x0027
            goto L_0x004b
        L_0x0027:
            boolean r1 = r2.requestFocus()
            goto L_0x004f
        L_0x002c:
            if (r6 != r3) goto L_0x004f
            if (r0 == 0) goto L_0x0027
            int r1 = r2.getLeft()
            int r0 = r0.getLeft()
            if (r1 > r0) goto L_0x0027
            goto L_0x0046
        L_0x003b:
            if (r6 == r4) goto L_0x004b
            r0 = 1
            if (r6 != r0) goto L_0x0041
            goto L_0x004b
        L_0x0041:
            if (r6 == r3) goto L_0x0046
            r0 = 2
            if (r6 != r0) goto L_0x004f
        L_0x0046:
            boolean r1 = r5.mo4177e()
            goto L_0x004f
        L_0x004b:
            boolean r1 = r5.mo4172d()
        L_0x004f:
            if (r1 == 0) goto L_0x0058
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.frag.CustomViewPager.mo4162a(int):boolean");
    }

    /* renamed from: a */
    public boolean mo4163a(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                i = 17;
            } else if (keyCode == 22) {
                i = 66;
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    i = 2;
                } else if (keyEvent.hasModifiers(1)) {
                    return mo4162a(1);
                }
            }
            return mo4162a(i);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo4164a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (mo4164a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !ViewCompat.canScrollHorizontally(view, -i)) {
            z2 = false;
        }
        return z2;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0721a b = mo4168b(childAt);
                    if (b != null && b.f2749b == this.f2726e) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0721a b = mo4168b(childAt);
                if (b != null && b.f2749b == this.f2726e) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (this.f2735n) {
            addViewInLayout(view, i, layoutParams);
            view.measure(this.f2733l, this.f2734m);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public C0721a mo4168b(View view) {
        for (int i = 0; i < this.f2724c.size(); i++) {
            C0721a aVar = (C0721a) this.f2724c.get(i);
            if (this.f2725d.isViewFromObject(view, aVar.f2748a)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo4169b() {
        this.f2740s = false;
        this.f2741t = false;
        VelocityTracker velocityTracker = this.f2747z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2747z = null;
        }
    }

    /* renamed from: c */
    public void mo4170c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f2730i = new Scroller(context, f2713b);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2742u = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.f2714A = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2715B = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2719F = new EdgeEffectCompat(context);
        this.f2720G = new EdgeEffectCompat(context);
        this.f2716C = context.getResources().getDisplayMetrics().density * 2500.0f;
        this.f2717D = 0.4f;
    }

    public void computeScroll() {
        if (this.f2730i.isFinished() || !this.f2730i.computeScrollOffset()) {
            mo4155a();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f2730i.getCurrX();
        int currY = this.f2730i.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
        }
        if (this.f2722I != null) {
            int width = getWidth() + this.f2731j;
            int i = currX / width;
            int i2 = currX % width;
            this.f2722I.onPageScrolled(i, ((float) i2) / ((float) width), i2);
        }
        invalidate();
    }

    /* renamed from: d */
    public boolean mo4172d() {
        int i = this.f2726e;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo4163a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0721a b = mo4168b(childAt);
                if (b != null && b.f2749b == this.f2726e && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0.getCount() > 1) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            super.draw(r9)
            int r0 = android.support.v4.view.ViewCompat.getOverScrollMode(r8)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0024
            if (r0 != r1) goto L_0x0018
            android.support.v4.view.PagerAdapter r0 = r8.f2725d
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getCount()
            if (r0 <= r1) goto L_0x0018
            goto L_0x0024
        L_0x0018:
            android.support.v4.widget.EdgeEffectCompat r9 = r8.f2719F
            r9.finish()
            android.support.v4.widget.EdgeEffectCompat r9 = r8.f2720G
            r9.finish()
            goto L_0x00ad
        L_0x0024:
            android.support.v4.widget.EdgeEffectCompat r0 = r8.f2719F
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0061
            int r0 = r9.save()
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1132920832(0x43870000, float:270.0)
            r9.rotate(r4)
            int r4 = -r3
            int r5 = r8.getPaddingTop()
            int r4 = r4 + r5
            float r4 = (float) r4
            r5 = 0
            r9.translate(r4, r5)
            android.support.v4.widget.EdgeEffectCompat r4 = r8.f2719F
            int r5 = r8.getWidth()
            r4.setSize(r3, r5)
            android.support.v4.widget.EdgeEffectCompat r3 = r8.f2719F
            boolean r3 = r3.draw(r9)
            r2 = r2 | r3
            r9.restoreToCount(r0)
        L_0x0061:
            android.support.v4.widget.EdgeEffectCompat r0 = r8.f2720G
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00ad
            int r0 = r9.save()
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            android.support.v4.view.PagerAdapter r5 = r8.f2725d
            if (r5 == 0) goto L_0x0087
            int r1 = r5.getCount()
        L_0x0087:
            r5 = 1119092736(0x42b40000, float:90.0)
            r9.rotate(r5)
            int r5 = r8.getPaddingTop()
            int r5 = -r5
            float r5 = (float) r5
            int r1 = -r1
            int r6 = r8.f2731j
            int r7 = r3 + r6
            int r1 = r1 * r7
            int r1 = r1 + r6
            float r1 = (float) r1
            r9.translate(r5, r1)
            android.support.v4.widget.EdgeEffectCompat r1 = r8.f2720G
            r1.setSize(r4, r3)
            android.support.v4.widget.EdgeEffectCompat r1 = r8.f2720G
            boolean r1 = r1.draw(r9)
            r2 = r2 | r1
            r9.restoreToCount(r0)
        L_0x00ad:
            if (r2 == 0) goto L_0x00b2
            r8.invalidate()
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.frag.CustomViewPager.draw(android.graphics.Canvas):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2732k;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: e */
    public boolean mo4177e() {
        PagerAdapter pagerAdapter = this.f2725d;
        if (pagerAdapter == null || this.f2726e >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.f2726e + 1, true);
        return true;
    }

    /* renamed from: f */
    public void mo4178f() {
        int i;
        C0721a aVar;
        C0721a aVar2;
        if (this.f2725d != null && !this.f2737p && getWindowToken() != null) {
            this.f2725d.startUpdate(this);
            int i2 = this.f2739r;
            int max = Math.max(0, this.f2726e - i2);
            int min = Math.min(this.f2725d.getCount() - 1, this.f2726e + i2);
            int i3 = 0;
            int i4 = -1;
            while (i3 < this.f2724c.size()) {
                C0721a aVar3 = (C0721a) this.f2724c.get(i3);
                int i5 = aVar3.f2749b;
                if ((i5 < max || i5 > min) && !aVar3.f2750c) {
                    this.f2724c.remove(i3);
                    i3--;
                    this.f2725d.destroyItem(this, aVar3.f2749b, aVar3.f2748a);
                } else if (i4 < min && aVar3.f2749b > max) {
                    int i6 = i4 + 1;
                    if (i6 < max) {
                        i6 = max;
                    }
                    while (i6 <= min && i6 < aVar3.f2749b) {
                        mo4156a(i6, i3);
                        i6++;
                        i3++;
                    }
                }
                i4 = aVar3.f2749b;
                i3++;
            }
            if (this.f2724c.size() > 0) {
                ArrayList<C0721a> arrayList = this.f2724c;
                i = ((C0721a) arrayList.get(arrayList.size() - 1)).f2749b;
            } else {
                i = -1;
            }
            if (i < min) {
                int i7 = i + 1;
                if (i7 > max) {
                    max = i7;
                }
                while (max <= min) {
                    mo4156a(max, -1);
                    max++;
                }
            }
            int i8 = 0;
            while (true) {
                aVar = null;
                if (i8 >= this.f2724c.size()) {
                    aVar2 = null;
                    break;
                } else if (((C0721a) this.f2724c.get(i8)).f2749b == this.f2726e) {
                    aVar2 = (C0721a) this.f2724c.get(i8);
                    break;
                } else {
                    i8++;
                }
            }
            this.f2725d.setPrimaryItem(this, this.f2726e, aVar2 != null ? aVar2.f2748a : null);
            this.f2725d.finishUpdate(this);
            if (hasFocus()) {
                View findFocus = findFocus();
                if (findFocus != null) {
                    aVar = mo4154a(findFocus);
                }
                if (aVar == null || aVar.f2749b != this.f2726e) {
                    for (int i9 = 0; i9 < getChildCount(); i9++) {
                        View childAt = getChildAt(i9);
                        C0721a b = mo4168b(childAt);
                        if (b != null && b.f2749b == this.f2726e && childAt.requestFocus(2)) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public PagerAdapter getAdapter() {
        return this.f2725d;
    }

    public int getCurrentItem() {
        return this.f2726e;
    }

    public int getOffscreenPageLimit() {
        return this.f2739r;
    }

    public int getPageMargin() {
        return this.f2731j;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2721H = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2731j > 0 && this.f2732k != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            int i = this.f2731j;
            int i2 = scrollX % (width + i);
            if (i2 != 0) {
                int i3 = (scrollX - i2) + width;
                this.f2732k.setBounds(i3, 0, i + i3, getHeight());
                this.f2732k.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f2740s = false;
            this.f2741t = false;
            this.f2746y = -1;
            return false;
        }
        if (action != 0) {
            if (this.f2740s) {
                return true;
            }
            if (this.f2741t) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f2743v = x;
            this.f2744w = x;
            this.f2745x = motionEvent.getY();
            this.f2746y = MotionEventCompat.getPointerId(motionEvent, 0);
            if (this.f2723J == 2) {
                this.f2740s = true;
                this.f2741t = false;
                setScrollState(1);
            } else {
                mo4155a();
                this.f2740s = false;
                this.f2741t = false;
            }
        } else if (action == 2) {
            int i = this.f2746y;
            if (i != -1) {
                int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
                float x2 = MotionEventCompat.getX(motionEvent, findPointerIndex);
                float f = x2 - this.f2744w;
                float abs = Math.abs(f);
                float y = MotionEventCompat.getY(motionEvent, findPointerIndex);
                float abs2 = Math.abs(y - this.f2745x);
                int scrollX = getScrollX();
                if ((f <= 0.0f || scrollX != 0) && f < 0.0f) {
                    PagerAdapter pagerAdapter = this.f2725d;
                    if (pagerAdapter != null) {
                        int count = ((pagerAdapter.getCount() - 1) * getWidth()) - 1;
                    }
                }
                if (mo4164a(this, false, (int) f, (int) x2, (int) y)) {
                    this.f2744w = x2;
                    this.f2743v = x2;
                    this.f2745x = y;
                    return false;
                } else if (abs > ((float) this.f2742u) && abs > abs2) {
                    this.f2740s = true;
                    setScrollState(1);
                    this.f2744w = x2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f2742u)) {
                    this.f2741t = true;
                }
            }
        } else if (action == 6) {
            mo4161a(motionEvent);
        }
        return this.f2740s;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2735n = true;
        mo4178f();
        this.f2735n = false;
        int childCount = getChildCount();
        int i5 = i3 - i;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0721a b = mo4168b(childAt);
                if (b != null) {
                    int paddingLeft = getPaddingLeft() + ((this.f2731j + i5) * b.f2749b);
                    int paddingTop = getPaddingTop();
                    childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f2721H = false;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        this.f2733l = MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), PropertyOptions.SEPARATE_NODE);
        this.f2734m = MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), PropertyOptions.SEPARATE_NODE);
        this.f2735n = true;
        mo4178f();
        this.f2735n = false;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                childAt.measure(this.f2733l, this.f2734m);
            }
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C0721a b = mo4168b(childAt);
                if (b != null && b.f2749b == this.f2726e && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0723c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0723c cVar = (C0723c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        PagerAdapter pagerAdapter = this.f2725d;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(cVar.f2752b, cVar.f2753c);
            mo4159a(cVar.f2751a, false, true);
        } else {
            this.f2727f = cVar.f2751a;
            this.f2728g = cVar.f2752b;
            this.f2729h = cVar.f2753c;
        }
    }

    public Parcelable onSaveInstanceState() {
        C0723c cVar = new C0723c(super.onSaveInstanceState());
        cVar.f2751a = this.f2726e;
        PagerAdapter pagerAdapter = this.f2725d;
        if (pagerAdapter != null) {
            cVar.f2752b = pagerAdapter.saveState();
        }
        return cVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f2731j;
            mo4158a(i, i3, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.f2718E
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r9.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            android.support.v4.view.PagerAdapter r0 = r8.f2725d
            if (r0 == 0) goto L_0x0182
            int r0 = r0.getCount()
            if (r0 != 0) goto L_0x0020
            goto L_0x0182
        L_0x0020:
            android.view.VelocityTracker r0 = r8.f2747z
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r8.f2747z = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r8.f2747z
            r0.addMovement(r9)
            int r0 = r9.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x016b
            r3 = -1
            if (r0 == r1) goto L_0x013e
            r4 = 2
            if (r0 == r4) goto L_0x0087
            r4 = 3
            if (r0 == r4) goto L_0x0069
            r3 = 5
            if (r0 == r3) goto L_0x0059
            r3 = 6
            if (r0 == r3) goto L_0x0048
            goto L_0x017c
        L_0x0048:
            r8.mo4161a(r9)
            int r0 = r8.f2746y
            int r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r9, r0)
            float r9 = android.support.v4.view.MotionEventCompat.getX(r9, r0)
            r8.f2744w = r9
            goto L_0x017c
        L_0x0059:
            int r0 = android.support.v4.view.MotionEventCompat.getActionIndex(r9)
            float r3 = android.support.v4.view.MotionEventCompat.getX(r9, r0)
            r8.f2744w = r3
            int r9 = android.support.v4.view.MotionEventCompat.getPointerId(r9, r0)
            goto L_0x017a
        L_0x0069:
            boolean r9 = r8.f2740s
            if (r9 == 0) goto L_0x017c
            int r9 = r8.f2726e
            r8.mo4159a(r9, r1, r1)
        L_0x0072:
            r8.f2746y = r3
            r8.mo4169b()
            android.support.v4.widget.EdgeEffectCompat r9 = r8.f2719F
            boolean r9 = r9.onRelease()
            android.support.v4.widget.EdgeEffectCompat r0 = r8.f2720G
            boolean r0 = r0.onRelease()
            r2 = r9 | r0
            goto L_0x017c
        L_0x0087:
            boolean r0 = r8.f2740s
            if (r0 != 0) goto L_0x00bd
            int r0 = r8.f2746y
            int r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r9, r0)
            float r3 = android.support.v4.view.MotionEventCompat.getX(r9, r0)
            float r4 = r8.f2744w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = android.support.v4.view.MotionEventCompat.getY(r9, r0)
            float r5 = r8.f2745x
            float r0 = r0 - r5
            float r0 = java.lang.Math.abs(r0)
            int r5 = r8.f2742u
            float r5 = (float) r5
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00bd
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bd
            r8.f2740s = r1
            r8.f2744w = r3
            r8.setScrollState(r1)
            r8.setScrollingCacheEnabled(r1)
        L_0x00bd:
            boolean r0 = r8.f2740s
            if (r0 == 0) goto L_0x017c
            int r0 = r8.f2746y
            int r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r9, r0)
            float r9 = android.support.v4.view.MotionEventCompat.getX(r9, r0)
            float r0 = r8.f2744w
            float r0 = r0 - r9
            r8.f2744w = r9
            int r9 = r8.getScrollX()
            float r9 = (float) r9
            float r9 = r9 + r0
            int r0 = r8.getWidth()
            int r3 = r8.f2731j
            int r3 = r3 + r0
            android.support.v4.view.PagerAdapter r4 = r8.f2725d
            int r4 = r4.getCount()
            int r4 = r4 - r1
            int r5 = r8.f2726e
            int r5 = r5 - r1
            int r5 = r5 * r3
            int r5 = java.lang.Math.max(r2, r5)
            float r5 = (float) r5
            int r6 = r8.f2726e
            int r6 = r6 + r1
            int r6 = java.lang.Math.min(r6, r4)
            int r6 = r6 * r3
            float r6 = (float) r6
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x010c
            r4 = 0
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x010a
            float r9 = -r9
            android.support.v4.widget.EdgeEffectCompat r2 = r8.f2719F
            float r0 = (float) r0
            float r9 = r9 / r0
            boolean r2 = r2.onPull(r9)
        L_0x010a:
            r9 = r5
            goto L_0x0121
        L_0x010c:
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0121
            int r4 = r4 * r3
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0120
            float r9 = r9 - r6
            android.support.v4.widget.EdgeEffectCompat r2 = r8.f2720G
            float r0 = (float) r0
            float r9 = r9 / r0
            boolean r2 = r2.onPull(r9)
        L_0x0120:
            r9 = r6
        L_0x0121:
            float r0 = r8.f2744w
            int r4 = (int) r9
            float r5 = (float) r4
            float r9 = r9 - r5
            float r0 = r0 + r9
            r8.f2744w = r0
            int r9 = r8.getScrollY()
            r8.scrollTo(r4, r9)
            com.valdio.valdioveliu.recyclerview.frag.CustomViewPager$b r9 = r8.f2722I
            if (r9 == 0) goto L_0x017c
            int r0 = r4 / r3
            int r4 = r4 % r3
            float r5 = (float) r4
            float r3 = (float) r3
            float r5 = r5 / r3
            r9.onPageScrolled(r0, r5, r4)
            goto L_0x017c
        L_0x013e:
            boolean r9 = r8.f2740s
            if (r9 == 0) goto L_0x017c
            android.view.VelocityTracker r9 = r8.f2747z
            r0 = 1000(0x3e8, float:1.401E-42)
            int r2 = r8.f2715B
            float r2 = (float) r2
            r9.computeCurrentVelocity(r0, r2)
            int r0 = r8.f2746y
            float r9 = android.support.v4.view.VelocityTrackerCompat.getXVelocity(r9, r0)
            int r9 = (int) r9
            r8.f2737p = r1
            int r0 = r8.getWidth()
            int r2 = r8.f2731j
            int r0 = r0 + r2
            int r2 = r8.getScrollX()
            int r2 = r2 / r0
            if (r9 <= 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            int r2 = r2 + 1
        L_0x0166:
            r8.mo4160a(r2, r1, r1, r9)
            goto L_0x0072
        L_0x016b:
            r8.mo4155a()
            float r0 = r9.getX()
            r8.f2743v = r0
            r8.f2744w = r0
            int r9 = android.support.v4.view.MotionEventCompat.getPointerId(r9, r2)
        L_0x017a:
            r8.f2746y = r9
        L_0x017c:
            if (r2 == 0) goto L_0x0181
            r8.invalidate()
        L_0x0181:
            return r1
        L_0x0182:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.frag.CustomViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f2725d;
        if (pagerAdapter2 != null) {
            pagerAdapter2.startUpdate(this);
            for (int i = 0; i < this.f2724c.size(); i++) {
                C0721a aVar = (C0721a) this.f2724c.get(i);
                this.f2725d.destroyItem(this, aVar.f2749b, aVar.f2748a);
            }
            this.f2725d.finishUpdate(this);
            this.f2724c.clear();
            removeAllViews();
            this.f2726e = 0;
            scrollTo(0, 0);
        }
        this.f2725d = pagerAdapter;
        PagerAdapter pagerAdapter3 = this.f2725d;
        if (pagerAdapter3 != null) {
            this.f2737p = false;
            if (this.f2727f >= 0) {
                pagerAdapter3.restoreState(this.f2728g, this.f2729h);
                mo4159a(this.f2727f, false, true);
                this.f2727f = -1;
                this.f2728g = null;
                this.f2729h = null;
                return;
            }
            mo4178f();
        }
    }

    public void setCurrentItem(int i) {
        this.f2737p = false;
        mo4159a(i, !this.f2721H, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.f2737p = false;
        mo4159a(i, z, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(0);
            Log.w("ViewPager", sb.toString());
            i = 0;
        }
        if (i != this.f2739r) {
            this.f2739r = i;
            mo4178f();
        }
    }

    public void setOnPageChangeListener(C0722b bVar) {
        this.f2722I = bVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f2731j;
        this.f2731j = i;
        int width = getWidth();
        mo4158a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2732k = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2732k;
    }
}
