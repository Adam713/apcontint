package p000;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: KL */
public class C0208KL implements Serializable {

    /* renamed from: a */
    public ArrayList<C0186JL> f521a = new ArrayList<>();

    /* renamed from: b */
    public String f522b;

    /* renamed from: c */
    public String f523c;

    /* renamed from: d */
    public String f524d;

    /* renamed from: e */
    public String f525e;

    /* renamed from: f */
    public int f526f;

    /* renamed from: g */
    public String f527g;

    public C0208KL(String str, String str2, String str3, String str4, int i, String str5) {
        this.f522b = str;
        this.f523c = str2;
        this.f524d = str3;
        this.f525e = str4;
        this.f526f = i;
        this.f527g = str5;
    }

    /* renamed from: a */
    public String mo668a() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f525e));
    }

    /* renamed from: a */
    public void mo669a(String str) {
        this.f527g = str;
    }

    /* renamed from: a */
    public void mo670a(ArrayList<C0186JL> arrayList) {
        this.f521a = arrayList;
    }

    /* renamed from: b */
    public ArrayList<C0186JL> mo671b() {
        return this.f521a;
    }

    /* renamed from: c */
    public String mo672c() {
        return this.f527g;
    }

    /* renamed from: d */
    public String mo673d() {
        return this.f524d;
    }

    /* renamed from: e */
    public String mo674e() {
        return this.f522b;
    }

    /* renamed from: f */
    public String mo675f() {
        return this.f523c;
    }

    /* renamed from: g */
    public int mo676g() {
        return this.f526f;
    }

    /* renamed from: h */
    public String mo677h() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f527g));
    }
}
