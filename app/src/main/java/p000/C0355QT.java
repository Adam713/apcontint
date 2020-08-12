package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.frag.GroupList_edit;

/* renamed from: QT */
class C0355QT implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f1025a;

    /* renamed from: b */
    public final /* synthetic */ GroupList_edit f1026b;

    public C0355QT(GroupList_edit groupList_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f1026b = groupList_edit;
        this.f1025a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1025a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
