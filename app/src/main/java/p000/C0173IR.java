package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/* renamed from: IR */
class C0173IR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ArrayAdapter f384a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f385b;

    /* renamed from: c */
    public final /* synthetic */ C0925mS f386c;

    public C0173IR(C0925mS mSVar, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        this.f386c = mSVar;
        this.f384a = arrayAdapter;
        this.f385b = autoCompleteTextView;
    }

    public void onClick(View view) {
        this.f386c.mo4728a(this.f384a, this.f385b);
    }
}
