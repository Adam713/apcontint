package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/* renamed from: JR */
class C0192JR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ArrayAdapter f435a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f436b;

    /* renamed from: c */
    public final /* synthetic */ C0925mS f437c;

    public C0192JR(C0925mS mSVar, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        this.f437c = mSVar;
        this.f435a = arrayAdapter;
        this.f436b = autoCompleteTextView;
    }

    public void onClick(View view) {
        this.f437c.mo4728a(this.f435a, this.f436b);
    }
}
