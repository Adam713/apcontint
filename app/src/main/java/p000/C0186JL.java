package p000;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: JL */
public class C0186JL implements Serializable {

    /* renamed from: a */
    public String f424a;

    /* renamed from: b */
    public String f425b;

    /* renamed from: c */
    public String f426c;

    /* renamed from: d */
    public double f427d;

    /* renamed from: e */
    public int f428e;

    /* renamed from: f */
    public double f429f;

    public C0186JL(String str, String str2, String str3, double d, int i, int i2) {
        this.f424a = str;
        this.f425b = str2;
        this.f426c = str3;
        this.f427d = d;
        this.f428e = i;
        this.f429f = (double) i2;
    }

    /* renamed from: a */
    public String mo430a() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(this.f427d);
    }

    /* renamed from: a */
    public void mo431a(double d) {
        this.f429f = d;
    }

    /* renamed from: b */
    public String mo432b() {
        return this.f424a;
    }

    /* renamed from: c */
    public String mo433c() {
        return this.f425b;
    }

    /* renamed from: d */
    public int mo434d() {
        return this.f428e;
    }

    /* renamed from: e */
    public String mo435e() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(this.f429f);
    }
}
