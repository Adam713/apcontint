package p000;

import com.itextpdf.xmp.options.PropertyOptions;

/* renamed from: kZ */
public final class C0888kZ {

    /* renamed from: a */
    public static final Tca f3221a = Uca.m1284a(15);

    /* renamed from: b */
    public static final Tca f3222b = Uca.m1284a(240);

    /* renamed from: c */
    public static final Tca f3223c = Uca.m1284a(3840);

    /* renamed from: d */
    public static final Tca f3224d = Uca.m1284a(61440);

    /* renamed from: e */
    public static final Tca f3225e = Uca.m1284a(8323072);

    /* renamed from: f */
    public static final Tca f3226f = Uca.m1284a(1065353216);

    /* renamed from: g */
    public static final Tca f3227g = Uca.m1284a(PropertyOptions.SEPARATE_NODE);

    /* renamed from: h */
    public static final Tca f3228h = Uca.m1284a(Integer.MIN_VALUE);

    /* renamed from: i */
    public static final Tca f3229i = Uca.m1284a(127);

    /* renamed from: j */
    public static final Tca f3230j = Uca.m1284a(16256);

    /* renamed from: k */
    public static final Tca f3231k = Uca.m1284a(2080768);

    /* renamed from: l */
    public static final Tca f3232l = Uca.m1284a(31457280);

    /* renamed from: m */
    public int f3233m = 0;

    /* renamed from: n */
    public int f3234n = 0;

    /* renamed from: a */
    public int mo4579a() {
        return f3224d.mo1256c(this.f3233m);
    }

    /* renamed from: a */
    public void mo4580a(jda jda) {
        jda.writeInt(this.f3233m);
        jda.writeInt(this.f3234n);
    }

    /* renamed from: b */
    public int mo4581b() {
        return f3221a.mo1256c(this.f3233m);
    }

    /* renamed from: c */
    public int mo4582c() {
        return f3222b.mo1256c(this.f3233m);
    }

    public Object clone() {
        C0888kZ kZVar = new C0888kZ();
        kZVar.f3233m = this.f3233m;
        kZVar.f3234n = this.f3234n;
        return kZVar;
    }

    /* renamed from: d */
    public int mo4584d() {
        return f3223c.mo1256c(this.f3233m);
    }

    /* renamed from: e */
    public int mo4585e() {
        return f3230j.mo1256c(this.f3234n);
    }

    /* renamed from: f */
    public int mo4586f() {
        return f3225e.mo1256c(this.f3233m);
    }

    /* renamed from: g */
    public int mo4587g() {
        return f3226f.mo1256c(this.f3233m);
    }

    /* renamed from: h */
    public int mo4588h() {
        return f3229i.mo1256c(this.f3234n);
    }

    /* renamed from: i */
    public boolean mo4589i() {
        return f3227g.mo1258d(this.f3233m);
    }

    /* renamed from: j */
    public boolean mo4590j() {
        return f3228h.mo1258d(this.f3233m);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("    [Border Formatting]\n");
        stringBuffer.append("          .lftln     = ");
        stringBuffer.append(Integer.toHexString(mo4581b()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("          .rgtln     = ");
        stringBuffer.append(Integer.toHexString(mo4582c()));
        stringBuffer.append(str);
        stringBuffer.append("          .topln     = ");
        stringBuffer.append(Integer.toHexString(mo4584d()));
        stringBuffer.append(str);
        stringBuffer.append("          .btmln     = ");
        stringBuffer.append(Integer.toHexString(mo4579a()));
        stringBuffer.append(str);
        stringBuffer.append("          .leftborder= ");
        stringBuffer.append(Integer.toHexString(mo4586f()));
        stringBuffer.append(str);
        stringBuffer.append("          .rghtborder= ");
        stringBuffer.append(Integer.toHexString(mo4587g()));
        stringBuffer.append(str);
        stringBuffer.append("          .topborder= ");
        stringBuffer.append(Integer.toHexString(mo4588h()));
        stringBuffer.append(str);
        stringBuffer.append("          .bottomborder= ");
        stringBuffer.append(Integer.toHexString(mo4585e()));
        stringBuffer.append(str);
        stringBuffer.append("          .fwdiag= ");
        stringBuffer.append(mo4590j());
        stringBuffer.append(str);
        stringBuffer.append("          .bwdiag= ");
        stringBuffer.append(mo4589i());
        stringBuffer.append(str);
        stringBuffer.append("    [/Border Formatting]\n");
        return stringBuffer.toString();
    }
}
