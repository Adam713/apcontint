package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cU */
public class C0651cU extends ArrayAdapter {

    /* renamed from: a */
    public Context f1951a;

    /* renamed from: b */
    public int f1952b;

    /* renamed from: c */
    public List<String> f1953c;

    /* renamed from: d */
    public List<String> f1954d;

    /* renamed from: e */
    public List<String> f1955e;

    /* renamed from: f */
    public Filter f1956f = new C0632bU(this);

    public C0651cU(Context context, int i, List<String> list) {
        super(context, i, 0, list);
        this.f1951a = context;
        this.f1952b = i;
        this.f1953c = list;
        this.f1954d = new ArrayList(list);
        this.f1955e = new ArrayList();
    }

    public Filter getFilter() {
        return this.f1956f;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f1951a.getSystemService("layout_inflater")).inflate(this.f1952b, viewGroup, false);
        }
        String str = (String) this.f1953c.get(i);
        if (str != null && (view instanceof TextView)) {
            ((TextView) view).setText(str);
        }
        return view;
    }
}
