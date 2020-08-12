package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.frag.GroupList_edit;

/* renamed from: VT */
class C0464VT implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f1320a;

    /* renamed from: b */
    public final /* synthetic */ GroupList_edit f1321b;

    public C0464VT(GroupList_edit groupList_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f1321b = groupList_edit;
        this.f1320a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1320a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
