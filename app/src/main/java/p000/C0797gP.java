package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;

/* renamed from: gP */
class C0797gP implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f3019a;

    public C0797gP(C1134wP wPVar) {
        this.f3019a = wPVar;
    }

    public boolean onQueryTextChange(String str) {
        TextUtils.isEmpty(str);
        this.f3019a.mo5303c(str);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f3019a.mo5298b(2);
        return false;
    }
}
