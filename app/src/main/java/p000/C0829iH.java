package p000;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: iH */
public class C0829iH extends C1064tH {

    /* renamed from: a */
    public final C0593aH f3089a;

    /* renamed from: b */
    public final C1125wH f3090b;

    /* renamed from: iH$a */
    static class C0830a extends IOException {
        public C0830a(String str) {
            super(str);
        }
    }

    public C0829iH(C0593aH aHVar, C1125wH wHVar) {
        this.f3089a = aHVar;
        this.f3090b = wHVar;
    }

    /* renamed from: a */
    public int mo4500a() {
        return 2;
    }

    /* renamed from: a */
    public C1065a mo759a(C1024rH rHVar, int i) {
        C0594a a = this.f3089a.mo1a(rHVar.f3649e, rHVar.f3648d);
        if (a == null) {
            return null;
        }
        C0893d dVar = a.f1801c ? C0893d.DISK : C0893d.NETWORK;
        Bitmap a2 = a.mo1822a();
        if (a2 != null) {
            return new C1065a(a2, dVar);
        }
        InputStream c = a.mo1824c();
        if (c == null) {
            return null;
        }
        if (dVar == C0893d.DISK && a.mo1823b() == 0) {
            C0039CH.m97a(c);
            throw new C0830a("Received response with 0 content-length header.");
        }
        if (dVar == C0893d.NETWORK && a.mo1823b() > 0) {
            this.f3090b.mo5268a(a.mo1823b());
        }
        return new C1065a(c, dVar);
    }

    /* renamed from: a */
    public boolean mo760a(C1024rH rHVar) {
        String scheme = rHVar.f3649e.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* renamed from: a */
    public boolean mo4501a(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* renamed from: b */
    public boolean mo4502b() {
        return true;
    }
}
