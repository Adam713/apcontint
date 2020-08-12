package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/* renamed from: QR */
class C0353QR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ArrayAdapter f1021a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f1022b;

    /* renamed from: c */
    public final /* synthetic */ C0925mS f1023c;

    public C0353QR(C0925mS mSVar, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        this.f1023c = mSVar;
        this.f1021a = arrayAdapter;
        this.f1022b = autoCompleteTextView;
    }

    public void onClick(View view) {
        this.f1023c.mo4728a(this.f1021a, this.f1022b);
    }
}
