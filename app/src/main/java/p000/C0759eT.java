package p000;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: eT */
class C0759eT implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0967oT f2919a;

    public C0759eT(C0967oT oTVar) {
        this.f2919a = oTVar;
    }

    public void onClick(View view) {
        if (view.getId() == 2131296497) {
            this.f2919a.amount_add_btn(view);
        } else if (view.getId() == 2131296503) {
            Log.d("onItemClicked=", ":before....");
            this.f2919a.f3516D.onButtonClicked(view);
        }
    }
}
