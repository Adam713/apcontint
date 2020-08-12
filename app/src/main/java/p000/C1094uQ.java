package p000;

import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: uQ */
class C1094uQ implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3829a;

    public C1094uQ(C0523YQ yq) {
        this.f3829a = yq;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() > 0) {
            C0523YQ yq = this.f3829a;
            yq.f1503Ca.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(yq.getActivity(), 17301594), null, null, null);
            return;
        }
        this.f3829a.f1503Ca.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }
}
