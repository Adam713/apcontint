package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;

/* renamed from: iS */
class C0841iS implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f3103a;

    /* renamed from: b */
    public final /* synthetic */ C0925mS f3104b;

    public C0841iS(C0925mS mSVar, AutoCompleteTextView autoCompleteTextView) {
        this.f3104b = mSVar;
        this.f3103a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3103a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
