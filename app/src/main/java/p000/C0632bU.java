package p000;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;

/* renamed from: bU */
class C0632bU extends Filter {

    /* renamed from: a */
    public final /* synthetic */ C0651cU f1909a;

    public C0632bU(C0651cU cUVar) {
        this.f1909a = cUVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return (String) obj;
    }

    public FilterResults performFiltering(CharSequence charSequence) {
        if (charSequence == null) {
            return new FilterResults();
        }
        this.f1909a.f1955e.clear();
        for (String str : this.f1909a.f1954d) {
            if (str.toLowerCase().contains(charSequence.toString().toLowerCase())) {
                this.f1909a.f1955e.add(str);
            }
        }
        FilterResults filterResults = new FilterResults();
        filterResults.values = this.f1909a.f1955e;
        filterResults.count = this.f1909a.f1955e.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        ArrayList<String> arrayList = (ArrayList) filterResults.values;
        if (filterResults != null && filterResults.count > 0) {
            this.f1909a.clear();
            for (String add : arrayList) {
                this.f1909a.add(add);
                this.f1909a.notifyDataSetChanged();
            }
        }
    }
}
