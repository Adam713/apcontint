package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;

/* renamed from: ET */
class C0094ET implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ C0216KT f227a;

    public C0094ET(C0216KT kt) {
        this.f227a = kt;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f227a.mo687a(1);
        }
        this.f227a.mo696c(str);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f227a.mo687a(2);
        this.f227a.mo695c();
        return false;
    }
}
