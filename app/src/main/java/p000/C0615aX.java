package p000;

/* renamed from: aX */
public final class C0615aX extends C0080DY {

    /* renamed from: a */
    public static final C0139GZ f1851a = new C0139GZ("\u0000");

    /* renamed from: b */
    public static final Tca f1852b = new Tca(15);

    /* renamed from: c */
    public static final Tca f1853c = new Tca(C0776fN.AppCompatTheme_windowActionBarOverlay);

    /* renamed from: d */
    public static final Tca f1854d = new Tca(128);

    /* renamed from: e */
    public static final Tca f1855e = new Tca(256);

    /* renamed from: f */
    public static final Tca f1856f = new Tca(512);

    /* renamed from: g */
    public static final Tca f1857g = new Tca(262144);

    /* renamed from: h */
    public static final Tca f1858h = new Tca(524288);

    /* renamed from: i */
    public static final Tca f1859i = new Tca(7340032);

    /* renamed from: j */
    public int f1860j;

    /* renamed from: k */
    public C0139GZ f1861k;

    /* renamed from: l */
    public C0139GZ f1862l;

    /* renamed from: m */
    public C0139GZ f1863m;

    /* renamed from: n */
    public C0139GZ f1864n;

    /* renamed from: o */
    public short f1865o;

    /* renamed from: p */
    public C1256oca f1866p;

    /* renamed from: q */
    public short f1867q;

    /* renamed from: r */
    public C1256oca f1868r;

    /* renamed from: s */
    public Lca f1869s;

    /* renamed from: a */
    public static String m1774a(C0139GZ gz) {
        String e = gz.mo297e();
        return (e.length() == 1 && e.charAt(0) == 0) ? "'\\0'" : e;
    }

    /* renamed from: a */
    public static void m1775a(C0139GZ gz, jda jda) {
        qda.m3371a(jda, gz.mo297e());
    }

    /* renamed from: a */
    public static void m1776a(StringBuffer stringBuffer, String str, C1256oca oca) {
        stringBuffer.append(str);
        if (oca == null) {
            stringBuffer.append("<empty>\n");
            return;
        }
        Haa[] e = oca.mo4981e();
        stringBuffer.append(10);
        for (Haa haa : e) {
            stringBuffer.append(9);
            stringBuffer.append(haa.toString());
            stringBuffer.append(10);
        }
    }

    /* renamed from: b */
    public static int m1777b(C0139GZ gz) {
        String e = gz.mo297e();
        return (e.length() * (qda.m3375b(e) ? 2 : 1)) + 3;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeInt(this.f1860j);
        m1775a(this.f1861k, jda);
        m1775a(this.f1862l, jda);
        m1775a(this.f1863m, jda);
        m1775a(this.f1864n, jda);
        jda.writeShort(this.f1866p.mo4978c());
        jda.writeShort(this.f1865o);
        this.f1866p.mo4979c(jda);
        jda.writeShort(this.f1868r.mo4978c());
        jda.writeShort(this.f1867q);
        this.f1868r.mo4979c(jda);
        this.f1869s.mo873a(jda);
    }

    public Object clone() {
        return mo4774d();
    }

    /* renamed from: e */
    public short mo34e() {
        return 446;
    }

    /* renamed from: g */
    public int mo36g() {
        return m1777b(this.f1861k) + 12 + m1777b(this.f1862l) + m1777b(this.f1863m) + m1777b(this.f1864n) + this.f1866p.mo4978c() + this.f1868r.mo4978c() + this.f1869s.mo875c();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DV]\n");
        stringBuffer.append(" options=");
        stringBuffer.append(Integer.toHexString(this.f1860j));
        stringBuffer.append(" title-prompt=");
        stringBuffer.append(m1774a(this.f1861k));
        stringBuffer.append(" title-error=");
        stringBuffer.append(m1774a(this.f1862l));
        stringBuffer.append(" text-prompt=");
        stringBuffer.append(m1774a(this.f1863m));
        stringBuffer.append(" text-error=");
        stringBuffer.append(m1774a(this.f1864n));
        String str = "\n";
        stringBuffer.append(str);
        m1776a(stringBuffer, "Formula 1:", this.f1866p);
        m1776a(stringBuffer, "Formula 2:", this.f1868r);
        stringBuffer.append("Regions: ");
        int b = this.f1869s.mo874b();
        for (int i = 0; i < b; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            Jca a = this.f1869s.mo870a(i);
            stringBuffer.append('(');
            stringBuffer.append(a.mo754b());
            stringBuffer.append(',');
            stringBuffer.append(a.mo756d());
            stringBuffer.append(',');
            stringBuffer.append(a.mo751a());
            stringBuffer.append(',');
            stringBuffer.append(a.mo755c());
            stringBuffer.append(')');
        }
        stringBuffer.append(str);
        stringBuffer.append("[/DV]");
        return stringBuffer.toString();
    }
}
