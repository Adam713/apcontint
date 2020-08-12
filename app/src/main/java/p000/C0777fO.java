package p000;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: fO */
public class C0777fO implements Serializable {

    /* renamed from: a */
    public ArrayList<C0754eO> f2953a = new ArrayList<>();

    /* renamed from: b */
    public String f2954b;

    /* renamed from: c */
    public String f2955c;

    /* renamed from: d */
    public String f2956d;

    /* renamed from: e */
    public String f2957e;

    /* renamed from: f */
    public String f2958f;

    /* renamed from: g */
    public String f2959g;

    /* renamed from: h */
    public String f2960h;

    public C0777fO(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f2954b = str;
        this.f2955c = str2;
        this.f2956d = str3;
        this.f2957e = str4;
        this.f2958f = str5;
        this.f2959g = str6;
    }

    public C0777fO(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f2954b = str;
        this.f2955c = str2;
        this.f2956d = str3;
        this.f2957e = str4;
        this.f2958f = str5;
        this.f2959g = str6;
        this.f2960h = str7;
    }

    /* renamed from: a */
    public String mo4350a() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f2957e));
    }

    /* renamed from: a */
    public void mo4351a(ArrayList<C0754eO> arrayList) {
        this.f2953a = arrayList;
    }

    /* renamed from: b */
    public ArrayList<C0754eO> mo4352b() {
        return this.f2953a;
    }

    /* renamed from: c */
    public String mo4353c() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f2958f));
    }

    /* renamed from: d */
    public String mo4354d() {
        return this.f2956d;
    }

    /* renamed from: e */
    public String mo4355e() {
        return this.f2954b;
    }

    /* renamed from: f */
    public String mo4356f() {
        return this.f2955c;
    }

    /* renamed from: g */
    public String mo4357g() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f2959g));
    }
}
