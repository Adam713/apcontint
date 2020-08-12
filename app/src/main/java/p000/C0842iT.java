package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;

/* renamed from: iT */
class C0842iT implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ C0967oT f3105a;

    public C0842iT(C0967oT oTVar) {
        this.f3105a = oTVar;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f3105a.mo4919a(1);
        }
        this.f3105a.mo4927c(str);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f3105a.mo4919a(2);
        this.f3105a.mo4924b();
        return false;
    }
}
