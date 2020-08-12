package p000;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: EH */
public class C0082EH implements Serializable {

    /* renamed from: a */
    public String f199a;

    /* renamed from: b */
    public String f200b;

    /* renamed from: c */
    public String f201c;

    /* renamed from: d */
    public double f202d;

    /* renamed from: e */
    public int f203e;

    /* renamed from: f */
    public String f204f;

    /* renamed from: g */
    public int f205g;

    /* renamed from: h */
    public String f206h;

    /* renamed from: i */
    public String f207i;

    public C0082EH(String str, String str2, String str3, double d, int i, int i2) {
        this.f199a = str;
        this.f200b = str2;
        this.f201c = str3;
        this.f202d = d;
        this.f203e = i;
        this.f205g = i2;
    }

    public C0082EH(String str, String str2, String str3, double d, int i, int i2, String str4) {
        this.f199a = str;
        this.f200b = str2;
        this.f201c = str3;
        this.f202d = d;
        this.f203e = i;
        this.f205g = i2;
        this.f206h = str4;
    }

    public C0082EH(String str, String str2, String str3, double d, int i, int i2, String str4, String str5) {
        this.f199a = str;
        this.f200b = str2;
        this.f201c = str3;
        this.f202d = d;
        this.f203e = i;
        this.f205g = i2;
        this.f206h = str4;
        this.f207i = str5;
    }

    public C0082EH(String str, String str2, String str3, double d, int i, int i2, String str4, String str5, String str6) {
        this.f199a = str;
        this.f200b = str2;
        this.f201c = str3;
        this.f202d = d;
        this.f203e = i;
        this.f205g = i2;
        this.f206h = str4;
        this.f207i = str5;
        this.f204f = str6;
    }

    /* renamed from: a */
    public String mo180a() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(this.f202d);
    }

    /* renamed from: a */
    public void mo181a(int i) {
        this.f205g = i;
    }

    /* renamed from: a */
    public void mo182a(String str) {
        this.f206h = str;
    }

    /* renamed from: b */
    public String mo183b() {
        return this.f207i;
    }

    /* renamed from: b */
    public void mo184b(String str) {
        this.f201c = str;
    }

    /* renamed from: c */
    public int mo185c() {
        return this.f205g;
    }

    /* renamed from: c */
    public void mo186c(String str) {
        this.f199a = str;
    }

    /* renamed from: d */
    public String mo187d() {
        return this.f206h;
    }

    /* renamed from: d */
    public void mo188d(String str) {
        this.f200b = str;
    }

    /* renamed from: e */
    public String mo189e() {
        return this.f201c;
    }

    /* renamed from: e */
    public void mo190e(String str) {
        this.f204f = str;
    }

    /* renamed from: f */
    public String mo191f() {
        return this.f199a;
    }

    /* renamed from: g */
    public String mo192g() {
        return this.f200b;
    }

    /* renamed from: h */
    public int mo193h() {
        return this.f203e;
    }

    /* renamed from: i */
    public String mo194i() {
        return this.f204f;
    }

    /* renamed from: j */
    public String mo195j() {
        return NumberFormat.getInstance(Locale.ENGLISH).format((long) this.f205g);
    }
}
