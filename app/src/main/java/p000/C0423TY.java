package p000;

import java.util.Iterator;

/* renamed from: TY */
public final class C0423TY extends C0587_X {
    public Object clone() {
        C0423TY ty = new C0423TY();
        Iterator h = mo1807h();
        while (h.hasNext()) {
            C0588a aVar = (C0588a) h.next();
            ty.mo1806a(aVar.f1784a, aVar.f1785b, aVar.f1786c);
        }
        return ty;
    }

    /* renamed from: e */
    public short mo34e() {
        return 26;
    }
}
