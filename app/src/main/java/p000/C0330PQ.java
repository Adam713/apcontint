package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;

/* renamed from: PQ */
class C0330PQ implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f944a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f945b;

    public C0330PQ(C0523YQ yq, AutoCompleteTextView autoCompleteTextView) {
        this.f945b = yq;
        this.f944a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f944a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
