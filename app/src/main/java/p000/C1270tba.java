package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: tba reason: case insensitive filesystem */
public final class C1270tba implements Fca {

    /* renamed from: a */
    public int f3805a;

    /* renamed from: b */
    public C1246lba[] f3806b;

    /* renamed from: c */
    public C1102uY f3807c;

    /* renamed from: d */
    public C1279wba f3808d;

    /* renamed from: e */
    public C1276vba f3809e;

    /* renamed from: tba$a */
    private class C1084a implements Iterator<C1274uca> {

        /* renamed from: a */
        public int f3810a = -1;

        /* renamed from: b */
        public int f3811b = -1;

        public C1084a() {
            mo5159a();
        }

        /* renamed from: a */
        public final void mo5159a() {
            int i = this.f3811b;
            do {
                i++;
                if (i >= C1270tba.this.f3806b.length) {
                    break;
                }
            } while (C1270tba.this.f3806b[i] == null);
            this.f3811b = i;
        }

        public boolean hasNext() {
            return this.f3811b < C1270tba.this.f3806b.length;
        }

        public C1274uca next() {
            if (hasNext()) {
                C1246lba[] a = C1270tba.this.f3806b;
                int i = this.f3811b;
                C1246lba lba = a[i];
                this.f3810a = i;
                mo5159a();
                return lba;
            }
            throw new NoSuchElementException("At last element");
        }

        public void remove() {
            if (this.f3810a != -1) {
                C1270tba.this.f3806b[this.f3810a] = null;
                return;
            }
            throw new IllegalStateException("remove() called before next()");
        }
    }

    public C1270tba(C1279wba wba, C1276vba vba, int i) {
        this(wba, vba, new C1102uY(i));
    }

    public C1270tba(C1279wba wba, C1276vba vba, C1102uY uYVar) {
        this.f3806b = new C1246lba[5];
        this.f3808d = wba;
        this.f3809e = vba;
        this.f3807c = uYVar;
        mo5156d(uYVar.mo5199q());
        uYVar.mo5202t();
    }

    /* renamed from: a */
    public Iterator<C1274uca> mo5148a() {
        return new C1084a();
    }

    /* renamed from: a */
    public C1246lba mo5149a(int i) {
        return mo5151a(i, this.f3808d.mo5395g());
    }

    /* renamed from: a */
    public C1246lba mo5150a(int i, int i2) {
        short s = (short) i;
        if (i > 32767) {
            s = (short) (65535 - i);
        }
        C1246lba lba = new C1246lba(this.f3808d, this.f3809e, mo5153b(), s, i2);
        mo5152a(lba);
        this.f3809e.mo5262c().mo5370a(mo5153b(), lba.mo4688k());
        return lba;
    }

    /* renamed from: a */
    public C1246lba mo5151a(int i, C0120a aVar) {
        C1246lba c = mo5154c(i);
        if (aVar == Fca.f267d) {
            return c;
        }
        if (aVar == Fca.f268e) {
            if (c != null && c.mo4687j() == 3) {
                return null;
            }
            return c;
        } else if (aVar == Fca.f269f) {
            return c == null ? mo5150a(i, 3) : c;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal policy ");
            sb.append(aVar);
            sb.append(" (");
            sb.append(aVar.f271b);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo5152a(C1246lba lba) {
        int a = lba.mo4671a();
        C1246lba[] lbaArr = this.f3806b;
        if (a >= lbaArr.length) {
            int length = lbaArr.length * 2;
            int i = a + 1;
            if (length < i) {
                length = i;
            }
            this.f3806b = new C1246lba[length];
            System.arraycopy(lbaArr, 0, this.f3806b, 0, lbaArr.length);
        }
        this.f3806b[a] = lba;
        if (this.f3807c.mo5201s() || a < this.f3807c.mo5192j()) {
            this.f3807c.mo5187a((int) (short) a);
        }
        if (this.f3807c.mo5201s() || a >= this.f3807c.mo5195m()) {
            this.f3807c.mo5188b((short) (a + 1));
        }
    }

    /* renamed from: b */
    public int mo5153b() {
        return this.f3805a;
    }

    /* renamed from: b */
    public C1246lba m3496b(int i) {
        return mo5150a(i, 3);
    }

    /* renamed from: c */
    public final C1246lba mo5154c(int i) {
        if (i >= 0) {
            C1246lba[] lbaArr = this.f3806b;
            if (i < lbaArr.length) {
                return lbaArr[i];
            }
        }
        return null;
    }

    /* renamed from: c */
    public C1102uY mo5155c() {
        return this.f3807c;
    }

    /* renamed from: d */
    public void mo5156d(int i) {
        int c = C1247lca.EXCEL97.mo4697c();
        if (i < 0 || i > c) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid row number (");
            sb.append(i);
            sb.append(") outside allowable range (0..");
            sb.append(c);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f3805a = i;
        C1102uY uYVar = this.f3807c;
        if (uYVar != null) {
            uYVar.mo5189c(i);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1270tba)) {
            return false;
        }
        return mo5153b() == ((C1270tba) obj).mo5153b();
    }

    public Iterator iterator() {
        return mo5148a();
    }
}
