package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: AS */
class C0012AS implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f20a;

    public C0012AS(C0239LS ls) {
        this.f20a = ls;
    }

    public boolean onQueryTextChange(String str) {
        Log.d("search=", "onQueryTextChange");
        TextUtils.isEmpty(str);
        this.f20a.mo794b(str);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f20a.mo789a(2);
        return false;
    }
}
