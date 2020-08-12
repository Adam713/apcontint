package p000;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cM */
public class C0643cM extends AsyncTaskLoader<List<String>> {

    /* renamed from: a */
    public String f1939a;

    /* renamed from: b */
    public String f1940b;

    /* renamed from: c */
    public C0195JU f1941c;

    /* renamed from: d */
    public int[] f1942d = {2131230923, 1, 2131230855};

    /* renamed from: e */
    public double f1943e = 0.0d;

    public C0643cM(Context context, String str, String str2, C0195JU ju) {
        super(context);
        this.f1939a = str;
        this.f1940b = str2;
        this.f1941c = ju;
    }

    public List<String> loadInBackground() {
        new ArrayList();
        return !C0195JU.f451k ? this.f1941c.mo604o(this.f1939a) : this.f1941c.mo581h(this.f1939a, this.f1940b);
    }
}
