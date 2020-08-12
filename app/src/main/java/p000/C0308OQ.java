package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;

/* renamed from: OQ */
class C0308OQ implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f883a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f884b;

    /* renamed from: c */
    public final /* synthetic */ C0523YQ f885c;

    public C0308OQ(C0523YQ yq, AutoCompleteTextView autoCompleteTextView, Dialog dialog) {
        this.f885c = yq;
        this.f883a = autoCompleteTextView;
        this.f884b = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f883a.setText(adapterView.getItemAtPosition(i).toString());
        this.f884b.dismiss();
    }
}
