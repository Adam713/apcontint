package p000;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: pH */
public class C0983pH extends ThreadPoolExecutor {

    /* renamed from: pH$a */
    private static final class C0984a extends FutureTask<C0382SG> implements Comparable<C0984a> {

        /* renamed from: a */
        public final C0382SG f3568a;

        public C0984a(C0382SG sg) {
            super(sg, null);
            this.f3568a = sg;
        }

        /* renamed from: a */
        public int compareTo(C0984a aVar) {
            C0894e k = this.f3568a.mo1168k();
            C0894e k2 = aVar.f3568a.mo1168k();
            return k == k2 ? this.f3568a.f1105e - aVar.f3568a.f1105e : k2.ordinal() - k.ordinal();
        }
    }

    public C0983pH() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C0044e());
    }

    /* renamed from: a */
    public final void mo4982a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r4 = 2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4983a(android.net.NetworkInfo r4) {
        /*
            r3 = this;
            r0 = 3
            if (r4 == 0) goto L_0x0034
            boolean r1 = r4.isConnectedOrConnecting()
            if (r1 != 0) goto L_0x000a
            goto L_0x0034
        L_0x000a:
            int r1 = r4.getType()
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r2) goto L_0x001e
            r4 = 6
            if (r1 == r4) goto L_0x001e
            r4 = 9
            if (r1 == r4) goto L_0x001e
        L_0x001a:
            r3.mo4982a(r0)
            goto L_0x0033
        L_0x001e:
            r4 = 4
        L_0x001f:
            r3.mo4982a(r4)
            goto L_0x0033
        L_0x0023:
            int r4 = r4.getSubtype()
            switch(r4) {
                case 1: goto L_0x0030;
                case 2: goto L_0x0030;
                case 3: goto L_0x002e;
                case 4: goto L_0x002e;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r4) {
                case 12: goto L_0x002e;
                case 13: goto L_0x001a;
                case 14: goto L_0x001a;
                case 15: goto L_0x001a;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x001a
        L_0x002e:
            r4 = 2
            goto L_0x001f
        L_0x0030:
            r3.mo4982a(r2)
        L_0x0033:
            return
        L_0x0034:
            r3.mo4982a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0983pH.mo4983a(android.net.NetworkInfo):void");
    }

    public Future<?> submit(Runnable runnable) {
        C0984a aVar = new C0984a((C0382SG) runnable);
        execute(aVar);
        return aVar;
    }
}
