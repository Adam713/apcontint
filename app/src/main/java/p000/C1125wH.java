package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: wH */
public class C1125wH {

    /* renamed from: a */
    public final HandlerThread f3911a = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: b */
    public final C0426UG f3912b;

    /* renamed from: c */
    public final Handler f3913c;

    /* renamed from: d */
    public long f3914d;

    /* renamed from: e */
    public long f3915e;

    /* renamed from: f */
    public long f3916f;

    /* renamed from: g */
    public long f3917g;

    /* renamed from: h */
    public long f3918h;

    /* renamed from: i */
    public long f3919i;

    /* renamed from: j */
    public long f3920j;

    /* renamed from: k */
    public long f3921k;

    /* renamed from: l */
    public int f3922l;

    /* renamed from: m */
    public int f3923m;

    /* renamed from: n */
    public int f3924n;

    /* renamed from: wH$a */
    private static class C1126a extends Handler {

        /* renamed from: a */
        public final C1125wH f3925a;

        public C1126a(Looper looper, C1125wH wHVar) {
            super(looper);
            this.f3925a = wHVar;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f3925a.mo5277d();
            } else if (i == 1) {
                this.f3925a.mo5278e();
            } else if (i == 2) {
                this.f3925a.mo5273b((long) message.arg1);
            } else if (i == 3) {
                this.f3925a.mo5276c((long) message.arg1);
            } else if (i != 4) {
                C0889lH.f3241a.post(new C1105vH(this, message));
            } else {
                this.f3925a.mo5271a((Long) message.obj);
            }
        }
    }

    public C1125wH(C0426UG ug) {
        this.f3912b = ug;
        this.f3911a.start();
        C0039CH.m96a(this.f3911a.getLooper());
        this.f3913c = new C1126a(this.f3911a.getLooper(), this);
    }

    /* renamed from: a */
    public static long m3622a(int i, long j) {
        return j / ((long) i);
    }

    /* renamed from: a */
    public C1152xH mo5267a() {
        C1152xH xHVar = new C1152xH(this.f3912b.mo1213a(), this.f3912b.size(), this.f3914d, this.f3915e, this.f3916f, this.f3917g, this.f3918h, this.f3919i, this.f3920j, this.f3921k, this.f3922l, this.f3923m, this.f3924n, System.currentTimeMillis());
        return xHVar;
    }

    /* renamed from: a */
    public void mo5268a(long j) {
        Handler handler = this.f3913c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* renamed from: a */
    public void mo5269a(Bitmap bitmap) {
        mo5270a(bitmap, 2);
    }

    /* renamed from: a */
    public final void mo5270a(Bitmap bitmap, int i) {
        int a = C0039CH.m86a(bitmap);
        Handler handler = this.f3913c;
        handler.sendMessage(handler.obtainMessage(i, a, 0));
    }

    /* renamed from: a */
    public void mo5271a(Long l) {
        this.f3922l++;
        this.f3916f += l.longValue();
        this.f3919i = m3622a(this.f3922l, this.f3916f);
    }

    /* renamed from: b */
    public void mo5272b() {
        this.f3913c.sendEmptyMessage(0);
    }

    /* renamed from: b */
    public void mo5273b(long j) {
        this.f3923m++;
        this.f3917g += j;
        this.f3920j = m3622a(this.f3923m, this.f3917g);
    }

    /* renamed from: b */
    public void mo5274b(Bitmap bitmap) {
        mo5270a(bitmap, 3);
    }

    /* renamed from: c */
    public void mo5275c() {
        this.f3913c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public void mo5276c(long j) {
        this.f3924n++;
        this.f3918h += j;
        this.f3921k = m3622a(this.f3923m, this.f3918h);
    }

    /* renamed from: d */
    public void mo5277d() {
        this.f3914d++;
    }

    /* renamed from: e */
    public void mo5278e() {
        this.f3915e++;
    }
}
