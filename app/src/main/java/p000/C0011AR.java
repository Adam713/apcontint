package p000;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: AR */
public class C0011AR extends AsyncTaskLoader<List<String>> {

    /* renamed from: a */
    public String f14a;

    /* renamed from: b */
    public String f15b;

    /* renamed from: c */
    public C0195JU f16c;

    /* renamed from: d */
    public int[] f17d = {2131230923, 1, 2131230855};

    /* renamed from: e */
    public double f18e = 0.0d;

    /* renamed from: f */
    public int f19f = 0;

    public C0011AR(Context context, String str, String str2, C0195JU ju, int i) {
        super(context);
        this.f14a = str;
        this.f15b = str2;
        this.f16c = ju;
        this.f19f = i;
    }

    public List<String> loadInBackground() {
        ArrayList arrayList = new ArrayList();
        int i = this.f19f;
        return i == 0 ? !C0195JU.f451k ? this.f16c.mo606p(this.f14a) : this.f16c.mo585i(this.f14a, this.f15b) : i == 1 ? !C0195JU.f451k ? this.f16c.mo633y() : this.f16c.mo610q(this.f15b) : arrayList;
    }
}
