package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.frag.CurrList_edit;

/* renamed from: nR */
class C0946nR implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f3426a;

    /* renamed from: b */
    public final /* synthetic */ CurrList_edit f3427b;

    public C0946nR(CurrList_edit currList_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f3427b = currList_edit;
        this.f3426a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3426a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
