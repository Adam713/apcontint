package p000;

import java.io.Serializable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: LL */
public class C0232LL implements Serializable {

    /* renamed from: a */
    public String f605a;

    /* renamed from: b */
    public String f606b;

    /* renamed from: c */
    public String f607c;

    /* renamed from: d */
    public String f608d;

    /* renamed from: e */
    public String f609e;

    /* renamed from: f */
    public int f610f;

    /* renamed from: g */
    public String f611g;

    /* renamed from: h */
    public String f612h;

    /* renamed from: i */
    public String f613i;

    /* renamed from: j */
    public String f614j;

    /* renamed from: k */
    public String f615k;

    public C0232LL(String str, String str2, String str3, String str4, int i, String str5) {
        String str6 = "";
        this.f609e = str6;
        this.f613i = str6;
        this.f614j = str6;
        this.f615k = str6;
        this.f605a = str;
        this.f606b = str2;
        this.f607c = str3;
        this.f608d = str4;
        this.f610f = i;
        this.f611g = str5;
    }

    public C0232LL(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        String str7 = "";
        this.f609e = str7;
        this.f613i = str7;
        this.f614j = str7;
        this.f615k = str7;
        this.f605a = str;
        this.f606b = str2;
        this.f607c = str3;
        this.f608d = str4;
        this.f610f = i;
        this.f611g = str5;
        this.f609e = str6;
    }

    public C0232LL(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7) {
        String str8 = "";
        this.f609e = str8;
        this.f613i = str8;
        this.f614j = str8;
        this.f615k = str8;
        this.f605a = str;
        this.f606b = str2;
        this.f607c = str3;
        this.f608d = str4;
        this.f610f = i;
        this.f611g = str5;
        this.f609e = str6;
        this.f612h = str7;
    }

    /* renamed from: a */
    public String mo766a() {
        return this.f612h;
    }

    /* renamed from: a */
    public void mo767a(String str) {
        this.f615k = str;
    }

    /* renamed from: b */
    public String mo768b() {
        return this.f615k;
    }

    /* renamed from: b */
    public void mo769b(String str) {
        this.f611g = NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(str));
    }

    /* renamed from: c */
    public String mo770c() {
        return this.f611g;
    }

    /* renamed from: c */
    public void mo771c(String str) {
        this.f614j = str;
    }

    /* renamed from: d */
    public String mo772d() {
        return this.f614j;
    }

    /* renamed from: d */
    public void mo773d(String str) {
        this.f613i = str;
    }

    /* renamed from: e */
    public String mo774e() {
        return this.f613i;
    }

    /* renamed from: f */
    public String mo775f() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f607c));
    }

    /* renamed from: g */
    public String mo776g() {
        return this.f609e;
    }

    /* renamed from: h */
    public String mo777h() {
        String str = "dd-MM-yyyy";
        try {
            return new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(new SimpleDateFormat(str, Locale.ENGLISH).parse(this.f606b).getTime()));
        } catch (Exception unused) {
            return this.f606b;
        }
    }

    /* renamed from: i */
    public String mo778i() {
        return this.f605a;
    }

    /* renamed from: j */
    public String mo779j() {
        return this.f608d;
    }

    /* renamed from: k */
    public int mo780k() {
        return this.f610f;
    }
}
