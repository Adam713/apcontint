package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: YL */
class C0518YL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0600aM f1492a;

    public C0518YL(C0600aM aMVar) {
        this.f1492a = aMVar;
    }

    public void onClick(View view) {
        String absolutePath = this.f1492a.f1817g.getAbsolutePath();
        String name = this.f1492a.f1818h != null ? this.f1492a.f1818h.getName() : null;
        if (this.f1492a.f1812b.mo1839b(absolutePath, name)) {
            this.f1492a.dismiss();
            this.f1492a.f1812b.mo1838a(absolutePath, name);
        }
    }
}
