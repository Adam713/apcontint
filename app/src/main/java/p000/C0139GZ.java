package p000;

import com.itextpdf.tool.xml.css.parser.CssSelectorParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: GZ */
public class C0139GZ implements Comparable<C0139GZ> {

    /* renamed from: a */
    public static final Tca f295a = Uca.m1284a(1);

    /* renamed from: b */
    public static final Tca f296b = Uca.m1284a(4);

    /* renamed from: c */
    public static final Tca f297c = Uca.m1284a(8);

    /* renamed from: d */
    public short f298d;

    /* renamed from: e */
    public byte f299e;

    /* renamed from: f */
    public String f300f;

    /* renamed from: g */
    public List<C0141b> f301g;

    /* renamed from: h */
    public C0140a f302h;

    /* renamed from: GZ$a */
    public static class C0140a implements Comparable<C0140a> {
        /* renamed from: a */
        public int mo303a() {
            throw null;
        }

        /* renamed from: a */
        public int mo304a(C0140a aVar) {
            throw null;
        }

        public C0140a clone() {
            throw null;
        }
    }

    /* renamed from: GZ$b */
    public static class C0141b implements Comparable<C0141b> {

        /* renamed from: a */
        public final short f303a;

        /* renamed from: b */
        public short f304b;

        public C0141b(short s, short s2) {
            this.f303a = s;
            this.f304b = s2;
        }

        /* renamed from: a */
        public int compareTo(C0141b bVar) {
            if (this.f303a == bVar.f303a && this.f304b == bVar.f304b) {
                return 0;
            }
            short s = this.f303a;
            short s2 = bVar.f303a;
            return s == s2 ? this.f304b - bVar.f304b : s - s2;
        }

        /* renamed from: a */
        public short mo307a() {
            return this.f303a;
        }

        /* renamed from: a */
        public void mo308a(jda jda) {
            jda.writeShort(this.f303a);
            jda.writeShort(this.f304b);
        }

        /* renamed from: b */
        public short mo309b() {
            return this.f304b;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C0141b)) {
                return false;
            }
            C0141b bVar = (C0141b) obj;
            if (this.f303a == bVar.f303a && this.f304b == bVar.f304b) {
                z = true;
            }
            return z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("character=");
            sb.append(this.f303a);
            sb.append(",fontIndex=");
            sb.append(this.f304b);
            return sb.toString();
        }
    }

    public C0139GZ() {
    }

    public C0139GZ(String str) {
        mo290a(str);
    }

    /* renamed from: a */
    public int mo286a() {
        short s = this.f298d;
        return s < 0 ? s + CssSelectorParser.f2021a : s;
    }

    /* renamed from: a */
    public int compareTo(C0139GZ gz) {
        int compareTo = mo297e().compareTo(gz.mo297e());
        if (compareTo != 0) {
            return compareTo;
        }
        if (this.f301g == null && gz.f301g == null) {
            return 0;
        }
        if (this.f301g == null && gz.f301g != null) {
            return 1;
        }
        if (this.f301g != null && gz.f301g == null) {
            return -1;
        }
        int size = this.f301g.size();
        if (size != gz.f301g.size()) {
            return size - gz.f301g.size();
        }
        for (int i = 0; i < size; i++) {
            int a = ((C0141b) this.f301g.get(i)).compareTo((C0141b) gz.f301g.get(i));
            if (a != 0) {
                return a;
            }
        }
        if (this.f302h == null && gz.f302h == null) {
            return 0;
        }
        if (this.f302h == null && gz.f302h != null) {
            return 1;
        }
        if (this.f302h != null && gz.f302h == null) {
            return -1;
        }
        this.f302h.mo304a(gz.f302h);
        throw null;
    }

    /* renamed from: a */
    public C0141b mo288a(int i) {
        List<C0141b> list = this.f301g;
        if (list != null && i >= 0 && i < list.size()) {
            return (C0141b) this.f301g.get(i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[LOOP:0: B:14:0x0028->B:18:0x0034, LOOP_START, PHI: r1 
      PHI: (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:13:0x0026, B:18:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo289a(p000.C0253LZ r5) {
        /*
            r4 = this;
            boolean r0 = r4.mo300g()
            r1 = 0
            if (r0 == 0) goto L_0x0010
            java.util.List<GZ$b> r0 = r4.f301g
            if (r0 == 0) goto L_0x0010
            int r0 = r0.size()
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            boolean r2 = r4.mo299f()
            if (r2 == 0) goto L_0x0021
            GZ$a r2 = r4.f302h
            if (r2 != 0) goto L_0x001c
            goto L_0x0021
        L_0x001c:
            r2.mo303a()
            r5 = 0
            throw r5
        L_0x0021:
            java.lang.String r2 = r4.f300f
            r5.mo862a(r2, r0, r1)
            if (r0 <= 0) goto L_0x0042
        L_0x0028:
            if (r1 >= r0) goto L_0x0042
            int r2 = r5.mo864b()
            r3 = 4
            if (r2 >= r3) goto L_0x0034
            r5.mo868e()
        L_0x0034:
            java.util.List<GZ$b> r2 = r4.f301g
            java.lang.Object r2 = r2.get(r1)
            GZ$b r2 = (p000.C0139GZ.C0141b) r2
            r2.mo308a(r5)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0139GZ.mo289a(LZ):void");
    }

    /* renamed from: a */
    public void mo290a(String str) {
        this.f300f = str;
        mo291a((short) this.f300f.length());
        int length = str.length();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (str.charAt(i) > 255) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.f299e = z ? f295a.mo1253b(this.f299e) : f295a.mo1246a(this.f299e);
    }

    /* renamed from: a */
    public void mo291a(short s) {
        this.f298d = s;
    }

    /* renamed from: b */
    public String mo292b() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[UNICODESTRING]\n");
        stringBuffer.append("    .charcount       = ");
        stringBuffer.append(Integer.toHexString(mo286a()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .optionflags     = ");
        stringBuffer.append(Integer.toHexString(mo296d()));
        stringBuffer.append(str);
        stringBuffer.append("    .string          = ");
        stringBuffer.append(mo297e());
        stringBuffer.append(str);
        if (this.f301g != null) {
            for (int i = 0; i < this.f301g.size(); i++) {
                C0141b bVar = (C0141b) this.f301g.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append("      .format_run");
                sb.append(i);
                sb.append("          = ");
                stringBuffer.append(sb.toString());
                stringBuffer.append(bVar.toString());
                stringBuffer.append(str);
            }
        }
        if (this.f302h != null) {
            stringBuffer.append("    .field_5_ext_rst          = ");
            stringBuffer.append(str);
            stringBuffer.append(this.f302h.toString());
            stringBuffer.append(str);
        }
        stringBuffer.append("[/UNICODESTRING]\n");
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public int mo293c() {
        List<C0141b> list = this.f301g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object clone() {
        C0139GZ gz = new C0139GZ();
        gz.f298d = this.f298d;
        gz.f299e = this.f299e;
        gz.f300f = this.f300f;
        if (this.f301g != null) {
            gz.f301g = new ArrayList();
            for (C0141b bVar : this.f301g) {
                gz.f301g.add(new C0141b(bVar.f303a, bVar.f304b));
            }
        }
        C0140a aVar = this.f302h;
        if (aVar == null) {
            return gz;
        }
        aVar.clone();
        throw null;
    }

    /* renamed from: d */
    public byte mo296d() {
        return this.f299e;
    }

    /* renamed from: e */
    public String mo297e() {
        return this.f300f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0139GZ)) {
            return false;
        }
        C0139GZ gz = (C0139GZ) obj;
        if (!(this.f298d == gz.f298d && this.f299e == gz.f299e && this.f300f.equals(gz.f300f))) {
            return false;
        }
        if (this.f301g == null && gz.f301g == null) {
            return true;
        }
        if ((this.f301g == null && gz.f301g != null) || (this.f301g != null && gz.f301g == null)) {
            return false;
        }
        int size = this.f301g.size();
        if (size != gz.f301g.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!((C0141b) this.f301g.get(i)).equals((C0141b) gz.f301g.get(i))) {
                return false;
            }
        }
        if (this.f302h == null && gz.f302h == null) {
            return true;
        }
        C0140a aVar = this.f302h;
        if (aVar != null) {
            C0140a aVar2 = gz.f302h;
            if (aVar2 != null) {
                aVar.mo304a(aVar2);
                throw null;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo299f() {
        return f296b.mo1258d(mo296d());
    }

    /* renamed from: g */
    public final boolean mo300g() {
        return f297c.mo1258d(mo296d());
    }

    public int hashCode() {
        String str = this.f300f;
        return this.f298d + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return mo297e();
    }
}
