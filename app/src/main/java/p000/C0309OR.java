package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;

/* renamed from: OR */
class C0309OR implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f886a;

    /* renamed from: b */
    public final /* synthetic */ C0925mS f887b;

    public C0309OR(C0925mS mSVar, AutoCompleteTextView autoCompleteTextView) {
        this.f887b = mSVar;
        this.f886a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f886a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
