package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.frag.CurrList_edit;

/* renamed from: sR */
class C1055sR implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f3738a;

    /* renamed from: b */
    public final /* synthetic */ CurrList_edit f3739b;

    public C1055sR(CurrList_edit currList_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f3739b = currList_edit;
        this.f3738a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3738a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
