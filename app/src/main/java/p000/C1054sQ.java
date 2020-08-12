package p000;

import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: sQ */
class C1054sQ implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3737a;

    public C1054sQ(C0523YQ yq) {
        this.f3737a = yq;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() > 0) {
            C0523YQ yq = this.f3737a;
            yq.f1501Ba.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(yq.getActivity(), 17301594), null, null, null);
            return;
        }
        this.f3737a.f1501Ba.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }
}
