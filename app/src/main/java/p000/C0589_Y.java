package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: _Y */
public final class C0589_Y extends C0765eZ {

    /* renamed from: a */
    public final List f1787a = new ArrayList();

    /* renamed from: _Y$a */
    private static final class C0590a implements Comparator {

        /* renamed from: a */
        public static final Comparator f1788a = new C0590a();

        /* renamed from: a */
        public static int m1729a(C0467VW vw, C0467VW vw2) {
            return vw.mo1355j() - vw2.mo1355j();
        }

        public int compare(Object obj, Object obj2) {
            return m1729a((C0467VW) obj, (C0467VW) obj2);
        }
    }

    /* renamed from: a */
    public C0467VW mo1811a(int i) {
        int size = this.f1787a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0467VW b = mo1813b(i2);
            if (b.mo1351a(i)) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1812a(C0768c cVar) {
        int size = this.f1787a.size();
        if (size >= 1) {
            C0467VW vw = null;
            int i = 0;
            while (i < size) {
                C0467VW vw2 = (C0467VW) this.f1787a.get(i);
                cVar.mo4341a(vw2);
                if (vw == null || C0590a.m1729a(vw, vw2) <= 0) {
                    i++;
                    vw = vw2;
                } else {
                    throw new RuntimeException("Column info records are out of order");
                }
            }
        }
    }

    /* renamed from: b */
    public final C0467VW mo1813b(int i) {
        return (C0467VW) this.f1787a.get(i);
    }

    public Object clone() {
        C0589_Y _y = new C0589_Y();
        for (int i = 0; i < this.f1787a.size(); i++) {
            _y.f1787a.add(((C0467VW) this.f1787a.get(i)).clone());
        }
        return _y;
    }
}
