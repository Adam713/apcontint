package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;

/* renamed from: FR */
class C0111FR implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f249a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f250b;

    /* renamed from: c */
    public final /* synthetic */ C0925mS f251c;

    public C0111FR(C0925mS mSVar, AutoCompleteTextView autoCompleteTextView, Dialog dialog) {
        this.f251c = mSVar;
        this.f249a = autoCompleteTextView;
        this.f250b = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f249a.setText(adapterView.getItemAtPosition(i).toString());
        this.f250b.dismiss();
    }
}
