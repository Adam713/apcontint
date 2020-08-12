package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;

/* renamed from: VS */
class C0463VS implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ C0576_S f1319a;

    public C0463VS(C0576_S _s) {
        this.f1319a = _s;
    }

    public boolean onQueryTextChange(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                this.f1319a.mo1746a(1);
            }
            this.f1319a.mo1755c(str);
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f1319a.mo1746a(2);
        this.f1319a.mo1752b();
        return false;
    }
}
