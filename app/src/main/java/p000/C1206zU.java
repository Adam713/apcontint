package p000;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;

/* renamed from: zU */
class C1206zU implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f4210a;

    /* renamed from: b */
    public final /* synthetic */ Context f4211b;

    /* renamed from: c */
    public final /* synthetic */ C0195JU f4212c;

    public C1206zU(C0195JU ju, AutoCompleteTextView autoCompleteTextView, Context context) {
        this.f4212c = ju;
        this.f4210a = autoCompleteTextView;
        this.f4211b = context;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() > 0) {
            this.f4210a.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this.f4211b, 17301594), null, this.f4210a.getCompoundDrawables()[2], null);
            return;
        }
        AutoCompleteTextView autoCompleteTextView = this.f4210a;
        autoCompleteTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, autoCompleteTextView.getCompoundDrawables()[2], null);
    }
}
