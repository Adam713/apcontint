package p000;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zR */
public class C1203zR extends AsyncTaskLoader<List<String>> {

    /* renamed from: a */
    public String f4203a;

    /* renamed from: b */
    public String f4204b;

    /* renamed from: c */
    public C0195JU f4205c;

    /* renamed from: d */
    public int[] f4206d = {2131230923, 1, 2131230855};

    /* renamed from: e */
    public double f4207e = 0.0d;

    public C1203zR(Context context, String str, String str2, C0195JU ju) {
        super(context);
        this.f4203a = str;
        this.f4204b = str2;
        this.f4205c = ju;
    }

    public List<String> loadInBackground() {
        try {
            new ArrayList();
            return !C0195JU.f451k ? this.f4205c.mo613r(this.f4203a) : this.f4205c.mo588j(this.f4203a, this.f4204b);
        } catch (Exception unused) {
            return null;
        }
    }
}
