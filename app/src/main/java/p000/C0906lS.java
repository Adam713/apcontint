package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/* renamed from: lS */
class C0906lS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ArrayAdapter f3294a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f3295b;

    /* renamed from: c */
    public final /* synthetic */ C0925mS f3296c;

    public C0906lS(C0925mS mSVar, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        this.f3296c = mSVar;
        this.f3294a = arrayAdapter;
        this.f3295b = autoCompleteTextView;
    }

    public void onClick(View view) {
        this.f3296c.mo4728a(this.f3294a, this.f3295b);
    }
}
