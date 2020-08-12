package p000;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;

/* renamed from: RP */
class C0371RP implements OnRefreshListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f1083a;

    public C0371RP(C0523YQ yq) {
        this.f1083a = yq;
    }

    public void onRefresh() {
        new Handler().post(new C0129GP(this));
    }
}
