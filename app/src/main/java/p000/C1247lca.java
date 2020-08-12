package p000;

import com.itextpdf.tool.xml.css.parser.CssSelectorParser;

/* renamed from: lca reason: case insensitive filesystem */
public enum C1247lca {
    EXCEL97(CssSelectorParser.f2021a, 256, 30, 3, 32767),
    EXCEL2007(1048576, 16384, 255, Integer.MAX_VALUE, 32767);
    

    /* renamed from: d */
    public final int f3325d;

    /* renamed from: e */
    public final int f3326e;

    /* renamed from: f */
    public final int f3327f;

    /* renamed from: g */
    public final int f3328g;

    /* renamed from: h */
    public final int f3329h;

    /* access modifiers changed from: public */
    C1247lca(int i, int i2, int i3, int i4, int i5) {
        this.f3325d = i;
        this.f3326e = i2;
        this.f3327f = i3;
        this.f3328g = i4;
        this.f3329h = i5;
    }

    /* renamed from: a */
    public int mo4695a() {
        return this.f3326e - 1;
    }

    /* renamed from: b */
    public String mo4696b() {
        return Mca.m877a(mo4695a());
    }

    /* renamed from: c */
    public int mo4697c() {
        return this.f3325d - 1;
    }

    /* renamed from: d */
    public int mo4698d() {
        return this.f3325d;
    }

    /* renamed from: e */
    public int mo4699e() {
        return this.f3329h;
    }
}
