package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: Tba */
public class Tba extends Wba implements Vba {

    /* renamed from: t */
    public List<Wba> f1203t = new ArrayList();

    /* renamed from: u */
    public Set<String> f1204u = new HashSet();

    /* renamed from: Tba$a */
    public static class C0425a implements Comparator<Wba> {
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
            if (r6.startsWith(r0) != false) goto L_0x0025;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(p000.Wba r5, p000.Wba r6) {
            /*
                r4 = this;
                java.lang.String r5 = r5.mo1428b()
                java.lang.String r6 = r6.mo1428b()
                int r0 = r5.length()
                int r1 = r6.length()
                int r0 = r0 - r1
                r1 = -1
                r2 = 1
                if (r0 != 0) goto L_0x0048
                java.lang.String r0 = "_VBA_PROJECT"
                int r3 = r5.compareTo(r0)
                if (r3 != 0) goto L_0x001f
            L_0x001d:
                r0 = 1
                goto L_0x0048
            L_0x001f:
                int r0 = r6.compareTo(r0)
                if (r0 != 0) goto L_0x0027
            L_0x0025:
                r0 = -1
                goto L_0x0048
            L_0x0027:
                java.lang.String r0 = "__"
                boolean r3 = r5.startsWith(r0)
                if (r3 == 0) goto L_0x003a
                boolean r3 = r6.startsWith(r0)
                if (r3 == 0) goto L_0x003a
            L_0x0035:
                int r0 = r5.compareToIgnoreCase(r6)
                goto L_0x0048
            L_0x003a:
                boolean r3 = r5.startsWith(r0)
                if (r3 == 0) goto L_0x0041
                goto L_0x001d
            L_0x0041:
                boolean r0 = r6.startsWith(r0)
                if (r0 == 0) goto L_0x0035
                goto L_0x0025
            L_0x0048:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.Tba.C0425a.compare(Wba, Wba):int");
        }

        public boolean equals(Object obj) {
            return this == obj;
        }
    }

    public Tba(String str) {
        mo1427a(str);
        mo1435d(0);
        mo1429b(1);
        mo1436e(0);
        mo1423a(1);
    }

    /* renamed from: a */
    public void mo1239a(Wba wba) {
        String b = wba.mo1428b();
        if (!this.f1204u.contains(b)) {
            this.f1204u.add(b);
            this.f1203t.add(wba);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Duplicate name \"");
        sb.append(b);
        sb.append("\"");
        throw new IOException(sb.toString());
    }

    /* renamed from: e */
    public boolean mo1240e() {
        return true;
    }

    /* renamed from: f */
    public void mo1241f() {
        Wba wba;
        if (this.f1203t.size() > 0) {
            Wba[] wbaArr = (Wba[]) this.f1203t.toArray(new Wba[0]);
            Arrays.sort(wbaArr, new C0425a());
            int length = wbaArr.length / 2;
            mo1430b(wbaArr[length].mo1422a());
            wbaArr[0].mo1431b((Sba) null);
            wbaArr[0].mo1424a((Sba) null);
            for (int i = 1; i < length; i++) {
                wbaArr[i].mo1431b((Sba) wbaArr[i - 1]);
                wbaArr[i].mo1424a((Sba) null);
            }
            if (length != 0) {
                wbaArr[length].mo1431b((Sba) wbaArr[length - 1]);
            }
            if (length != wbaArr.length - 1) {
                Wba wba2 = wbaArr[length];
                int i2 = length + 1;
                Wba wba3 = wbaArr[i2];
                while (true) {
                    wba2.mo1424a((Sba) wba3);
                    if (i2 >= wbaArr.length - 1) {
                        break;
                    }
                    wbaArr[i2].mo1431b((Sba) null);
                    wba2 = wbaArr[i2];
                    i2++;
                    wba3 = wbaArr[i2];
                }
                wbaArr[wbaArr.length - 1].mo1431b((Sba) null);
                wba = wbaArr[wbaArr.length - 1];
            } else {
                wba = wbaArr[length];
            }
            wba.mo1424a((Sba) null);
        }
    }

    /* renamed from: h */
    public Iterator<Wba> mo1242h() {
        return this.f1203t.iterator();
    }
}
