package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;

/* renamed from: GR */
class C0131GR implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f285a;

    /* renamed from: b */
    public final /* synthetic */ C0925mS f286b;

    public C0131GR(C0925mS mSVar, AutoCompleteTextView autoCompleteTextView) {
        this.f286b = mSVar;
        this.f285a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f285a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
