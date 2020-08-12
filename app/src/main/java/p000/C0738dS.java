package p000;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;

/* renamed from: dS */
class C0738dS implements OnRefreshListener {

    /* renamed from: a */
    public final /* synthetic */ C0925mS f2864a;

    public C0738dS(C0925mS mSVar) {
        this.f2864a = mSVar;
    }

    public void onRefresh() {
        new Handler().post(new C0530YR(this));
    }
}
