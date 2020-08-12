package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: MH */
class C0255MH implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f703a;

    /* renamed from: b */
    public final /* synthetic */ CustomerList f704b;

    public C0255MH(CustomerList customerList, AutoCompleteTextView autoCompleteTextView) {
        this.f704b = customerList;
        this.f703a = autoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f703a.setText(adapterView.getItemAtPosition(i).toString());
    }
}
