package p000;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: MR */
class C0265MR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0925mS f725a;

    public C0265MR(C0925mS mSVar) {
        this.f725a = mSVar;
    }

    public void onClick(View view) {
        new Handler().post(new C0030BR(this));
    }
}
