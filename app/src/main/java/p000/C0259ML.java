package p000;

import java.io.Serializable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: ML */
public class C0259ML implements Serializable {

    /* renamed from: a */
    public String f711a;

    /* renamed from: b */
    public String f712b;

    /* renamed from: c */
    public String f713c;

    /* renamed from: d */
    public String f714d;

    /* renamed from: e */
    public int f715e;

    /* renamed from: f */
    public String f716f;

    public C0259ML(String str, String str2, String str3, String str4, int i, String str5) {
        this.f711a = str;
        this.f712b = str2;
        this.f713c = str3;
        this.f714d = str4;
        this.f715e = i;
        this.f716f = str5;
    }

    /* renamed from: a */
    public String mo882a() {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(this.f713c));
    }

    /* renamed from: b */
    public String mo883b() {
        String str = "dd-MM-yyyy";
        try {
            return new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(new SimpleDateFormat(str, Locale.ENGLISH).parse(this.f712b).getTime()));
        } catch (Exception unused) {
            return this.f712b;
        }
    }

    /* renamed from: c */
    public String mo884c() {
        return this.f711a;
    }

    /* renamed from: d */
    public String mo885d() {
        return this.f716f;
    }

    /* renamed from: e */
    public String mo886e() {
        return this.f714d;
    }

    /* renamed from: f */
    public int mo887f() {
        return this.f715e;
    }
}
