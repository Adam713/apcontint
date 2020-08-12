package p000;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: eO */
public class C0754eO implements Serializable {

    /* renamed from: a */
    public ArrayList<C0186JL> f2907a = new ArrayList<>();

    /* renamed from: b */
    public String f2908b;

    /* renamed from: c */
    public String f2909c;

    /* renamed from: d */
    public String f2910d;

    /* renamed from: e */
    public String f2911e;

    /* renamed from: f */
    public String f2912f;

    /* renamed from: g */
    public String f2913g;

    public C0754eO(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f2908b = str;
        this.f2909c = str2;
        this.f2910d = str3;
        this.f2911e = str4;
        this.f2912f = str5;
        this.f2913g = str6;
    }

    /* renamed from: a */
    public String mo4326a() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f2911e));
    }

    /* renamed from: b */
    public String mo4327b() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f2912f));
    }

    /* renamed from: c */
    public String mo4328c() {
        return this.f2909c;
    }

    /* renamed from: d */
    public String mo4329d() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f2913g));
    }
}
