package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: DH */
public class C0063DH extends BaseAdapter {

    /* renamed from: a */
    public Context f161a;

    /* renamed from: b */
    public List<C0796gO> f162b;

    public C0063DH(Context context, List<C0796gO> list) {
        this.f161a = context;
        this.f162b = list;
    }

    public int getCount() {
        return this.f162b.size();
    }

    public Object getItem(int i) {
        return this.f162b.get(i);
    }

    public long getItemId(int i) {
        return (long) this.f162b.indexOf(getItem(i));
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f161a.getSystemService("layout_inflater")).inflate(2131492984, null);
        }
        TextView textView = (TextView) view.findViewById(2131296664);
        C0796gO gOVar = (C0796gO) this.f162b.get(i);
        ((ImageView) view.findViewById(2131296484)).setImageResource(gOVar.mo4408a());
        textView.setText(gOVar.mo4409b());
        return view;
    }
}
