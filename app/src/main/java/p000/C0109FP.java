package p000;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: FP */
class C0109FP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f247a;

    public C0109FP(C0523YQ yq) {
        this.f247a = yq;
    }

    public void onClick(View view) {
        new Handler().post(new C0028BP(this));
    }
}
