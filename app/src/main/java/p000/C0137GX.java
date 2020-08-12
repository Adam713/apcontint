package p000;

import java.util.Iterator;

/* renamed from: GX */
public final class C0137GX extends C0587_X {
    public Object clone() {
        C0137GX gx = new C0137GX();
        Iterator h = mo1807h();
        while (h.hasNext()) {
            C0588a aVar = (C0588a) h.next();
            gx.mo1806a(aVar.f1784a, aVar.f1785b, aVar.f1786c);
        }
        return gx;
    }

    /* renamed from: e */
    public short mo34e() {
        return 27;
    }
}
