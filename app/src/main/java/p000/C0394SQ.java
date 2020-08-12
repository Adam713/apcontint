package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/* renamed from: SQ */
class C0394SQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ArrayAdapter f1157a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f1158b;

    /* renamed from: c */
    public final /* synthetic */ C0523YQ f1159c;

    public C0394SQ(C0523YQ yq, ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        this.f1159c = yq;
        this.f1157a = arrayAdapter;
        this.f1158b = autoCompleteTextView;
    }

    public void onClick(View view) {
        this.f1159c.mo1543a(this.f1157a, this.f1158b);
    }
}
