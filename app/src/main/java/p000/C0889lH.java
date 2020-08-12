package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: lH */
public class C0889lH {

    /* renamed from: a */
    public static final Handler f3241a = new C0870kH(Looper.getMainLooper());

    /* renamed from: b */
    public static volatile C0889lH f3242b = null;

    /* renamed from: c */
    public final C0892c f3243c;

    /* renamed from: d */
    public final C0895f f3244d;

    /* renamed from: e */
    public final C0891b f3245e;

    /* renamed from: f */
    public final List<C1064tH> f3246f;

    /* renamed from: g */
    public final Context f3247g;

    /* renamed from: h */
    public final C0561_G f3248h;

    /* renamed from: i */
    public final C0426UG f3249i;

    /* renamed from: j */
    public final C1125wH f3250j;

    /* renamed from: k */
    public final Map<Object, C0202KG> f3251k;

    /* renamed from: l */
    public final Map<ImageView, C0513YG> f3252l;

    /* renamed from: m */
    public final ReferenceQueue<Object> f3253m;

    /* renamed from: n */
    public final Config f3254n;

    /* renamed from: o */
    public boolean f3255o;

    /* renamed from: p */
    public volatile boolean f3256p;

    /* renamed from: q */
    public boolean f3257q;

    /* renamed from: lH$a */
    public static class C0890a {

        /* renamed from: a */
        public final Context f3258a;

        /* renamed from: b */
        public C0593aH f3259b;

        /* renamed from: c */
        public ExecutorService f3260c;

        /* renamed from: d */
        public C0426UG f3261d;

        /* renamed from: e */
        public C0892c f3262e;

        /* renamed from: f */
        public C0895f f3263f;

        /* renamed from: g */
        public List<C1064tH> f3264g;

        /* renamed from: h */
        public Config f3265h;

        /* renamed from: i */
        public boolean f3266i;

        /* renamed from: j */
        public boolean f3267j;

        public C0890a(Context context) {
            if (context != null) {
                this.f3258a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C0889lH mo4607a() {
            Context context = this.f3258a;
            if (this.f3259b == null) {
                this.f3259b = C0039CH.m105c(context);
            }
            if (this.f3261d == null) {
                this.f3261d = new C0727dH(context);
            }
            if (this.f3260c == null) {
                this.f3260c = new C0983pH();
            }
            if (this.f3263f == null) {
                this.f3263f = C0895f.f3279a;
            }
            C1125wH wHVar = new C1125wH(this.f3261d);
            Context context2 = context;
            C0561_G _g = new C0561_G(context2, this.f3260c, C0889lH.f3241a, this.f3259b, this.f3261d, wHVar);
            C0889lH lHVar = new C0889lH(context2, _g, this.f3261d, this.f3262e, this.f3263f, this.f3264g, wHVar, this.f3265h, this.f3266i, this.f3267j);
            return lHVar;
        }
    }

    /* renamed from: lH$b */
    private static class C0891b extends Thread {

        /* renamed from: a */
        public final ReferenceQueue<Object> f3268a;

        /* renamed from: b */
        public final Handler f3269b;

        public C0891b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f3268a = referenceQueue;
            this.f3269b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C0203a aVar = (C0203a) this.f3268a.remove(1000);
                    Message obtainMessage = this.f3269b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f512a;
                        this.f3269b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f3269b.post(new C0914mH(this, e));
                    return;
                }
            }
        }
    }

    /* renamed from: lH$c */
    public interface C0892c {
        /* renamed from: a */
        void mo4609a(C0889lH lHVar, Uri uri, Exception exc);
    }

    /* renamed from: lH$d */
    public enum C0893d {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: e */
        public final int f3274e;

        /* access modifiers changed from: public */
        C0893d(int i) {
            this.f3274e = i;
        }
    }

    /* renamed from: lH$e */
    public enum C0894e {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: lH$f */
    public interface C0895f {

        /* renamed from: a */
        public static final C0895f f3279a = new C0936nH();

        /* renamed from: a */
        C1024rH mo4610a(C1024rH rHVar);
    }

    public C0889lH(Context context, C0561_G _g, C0426UG ug, C0892c cVar, C0895f fVar, List<C1064tH> list, C1125wH wHVar, Config config, boolean z, boolean z2) {
        this.f3247g = context;
        this.f3248h = _g;
        this.f3249i = ug;
        this.f3243c = cVar;
        this.f3244d = fVar;
        this.f3254n = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new C1085uH(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C0471WG(context));
        arrayList.add(new C0769fH(context));
        arrayList.add(new C0492XG(context));
        arrayList.add(new C0227LG(context));
        arrayList.add(new C0619bH(context));
        arrayList.add(new C0829iH(_g.f1707d, wHVar));
        this.f3246f = Collections.unmodifiableList(arrayList);
        this.f3250j = wHVar;
        this.f3251k = new WeakHashMap();
        this.f3252l = new WeakHashMap();
        this.f3255o = z;
        this.f3256p = z2;
        this.f3253m = new ReferenceQueue<>();
        this.f3245e = new C0891b(this.f3253m, f3241a);
        this.f3245e.start();
    }

    /* renamed from: a */
    public static C0889lH m2935a(Context context) {
        if (f3242b == null) {
            synchronized (C0889lH.class) {
                if (f3242b == null) {
                    f3242b = new C0890a(context).mo4607a();
                }
            }
        }
        return f3242b;
    }

    /* renamed from: a */
    public Bitmap mo4595a(String str) {
        Bitmap bitmap = this.f3249i.get(str);
        if (bitmap != null) {
            this.f3250j.mo5272b();
        } else {
            this.f3250j.mo5275c();
        }
        return bitmap;
    }

    /* renamed from: a */
    public List<C1064tH> mo4596a() {
        return this.f3246f;
    }

    /* renamed from: a */
    public C1024rH mo4597a(C1024rH rHVar) {
        this.f3244d.mo4610a(rHVar);
        if (rHVar != null) {
            return rHVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Request transformer ");
        sb.append(this.f3244d.getClass().getCanonicalName());
        sb.append(" returned null for ");
        sb.append(rHVar);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public C1045sH mo4598a(int i) {
        if (i != 0) {
            return new C1045sH(this, null, i);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    /* renamed from: a */
    public void mo4599a(C0202KG kg) {
        Object j = kg.mo660j();
        if (!(j == null || this.f3251k.get(j) == kg)) {
            mo4604a(j);
            this.f3251k.put(j, kg);
        }
        mo4606c(kg);
    }

    /* renamed from: a */
    public void mo4600a(C0382SG sg) {
        C0202KG c = sg.mo1160c();
        List d = sg.mo1161d();
        boolean z = true;
        boolean z2 = d != null && !d.isEmpty();
        if (c == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = sg.mo1162e().f3649e;
            Exception f = sg.mo1163f();
            Bitmap l = sg.mo1169l();
            C0893d h = sg.mo1165h();
            if (c != null) {
                mo4601a(l, h, c);
            }
            if (z2) {
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    mo4601a(l, h, (C0202KG) d.get(i));
                }
            }
            C0892c cVar = this.f3243c;
            if (!(cVar == null || f == null)) {
                cVar.mo4609a(this, uri, f);
            }
        }
    }

    /* renamed from: a */
    public final void mo4601a(Bitmap bitmap, C0893d dVar, C0202KG kg) {
        if (!kg.mo661k()) {
            if (!kg.mo662l()) {
                this.f3251k.remove(kg.mo660j());
            }
            String str = "Main";
            if (bitmap == null) {
                kg.mo652b();
                if (this.f3256p) {
                    C0039CH.m98a(str, "errored", kg.f501b.mo5049d());
                }
            } else if (dVar != null) {
                kg.mo651a(bitmap, dVar);
                if (this.f3256p) {
                    String d = kg.f501b.mo5049d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("from ");
                    sb.append(dVar);
                    C0039CH.m99a(str, "completed", d, sb.toString());
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* renamed from: a */
    public void mo4602a(ImageView imageView) {
        mo4604a((Object) imageView);
    }

    /* renamed from: a */
    public void mo4603a(ImageView imageView, C0513YG yg) {
        this.f3252l.put(imageView, yg);
    }

    /* renamed from: a */
    public final void mo4604a(Object obj) {
        C0039CH.m95a();
        C0202KG kg = (C0202KG) this.f3251k.remove(obj);
        if (kg != null) {
            kg.mo650a();
            this.f3248h.mo1707a(kg);
        }
        if (obj instanceof ImageView) {
            C0513YG yg = (C0513YG) this.f3252l.remove((ImageView) obj);
            if (yg != null) {
                yg.mo1509a();
            }
        }
    }

    /* renamed from: b */
    public void mo4605b(C0202KG kg) {
        Bitmap a = C0789gH.m2710a(kg.f504e) ? mo4595a(kg.mo653c()) : null;
        String str = "Main";
        if (a != null) {
            mo4601a(a, C0893d.MEMORY, kg);
            if (this.f3256p) {
                String d = kg.f501b.mo5049d();
                StringBuilder sb = new StringBuilder();
                sb.append("from ");
                sb.append(C0893d.MEMORY);
                C0039CH.m99a(str, "completed", d, sb.toString());
                return;
            }
            return;
        }
        mo4599a(kg);
        if (this.f3256p) {
            C0039CH.m98a(str, "resumed", kg.f501b.mo5049d());
        }
    }

    /* renamed from: c */
    public void mo4606c(C0202KG kg) {
        this.f3248h.mo1716b(kg);
    }
}
