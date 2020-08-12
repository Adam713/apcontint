package p000;

import android.content.Context;
import android.graphics.Color;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.style.ForegroundColorSpan;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: QM */
public class C0346QM extends ArrayAdapter<C0259ML> implements Filterable {

    /* renamed from: a */
    public Context f1000a;

    /* renamed from: b */
    public LayoutInflater f1001b;

    /* renamed from: c */
    public int f1002c;

    /* renamed from: d */
    public List<C0259ML> f1003d;

    /* renamed from: e */
    public List<C0259ML> f1004e;

    /* renamed from: f */
    public C0347a f1005f;

    /* renamed from: g */
    public String f1006g = "";

    /* renamed from: h */
    public SparseBooleanArray f1007h = new SparseBooleanArray();

    /* renamed from: i */
    public ArrayList<Integer> f1008i = new ArrayList<>();

    /* renamed from: QM$a */
    private class C0347a extends Filter {
        public C0347a() {
        }

        public FilterResults performFiltering(CharSequence charSequence) {
            FilterResults filterResults = new FilterResults();
            C0346QM.this.f1006g = charSequence.toString();
            if (charSequence == null || charSequence.length() <= 0) {
                filterResults.count = C0346QM.this.f1004e.size();
                filterResults.values = C0346QM.this.f1004e;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < C0346QM.this.f1004e.size(); i++) {
                    String str = "";
                    String str2 = ",";
                    if (((C0259ML) C0346QM.this.f1004e.get(i)).mo886e().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0259ML) C0346QM.this.f1004e.get(i)).mo882a().replaceAll(str2, str).toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0259ML) C0346QM.this.f1004e.get(i)).mo883b().toUpperCase(Locale.ENGLISH).contains(charSequence.toString().toUpperCase()) || ((C0259ML) C0346QM.this.f1004e.get(i)).mo885d().toUpperCase().contains(charSequence.toString().toUpperCase())) {
                        C0259ML ml = new C0259ML(((C0259ML) C0346QM.this.f1004e.get(i)).mo884c(), ((C0259ML) C0346QM.this.f1004e.get(i)).mo883b(), ((C0259ML) C0346QM.this.f1004e.get(i)).mo882a().replaceAll(str2, str), ((C0259ML) C0346QM.this.f1004e.get(i)).mo886e(), ((C0259ML) C0346QM.this.f1004e.get(i)).mo887f(), ((C0259ML) C0346QM.this.f1004e.get(i)).mo885d().replaceAll(str2, str));
                        arrayList.add(ml);
                    }
                }
                filterResults.count = arrayList.size();
                filterResults.values = arrayList;
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            C0346QM qm = C0346QM.this;
            qm.f1003d = (ArrayList) filterResults.values;
            qm.notifyDataSetChanged();
        }
    }

    /* renamed from: QM$b */
    private static class C0348b {

        /* renamed from: a */
        public TextView f1010a;

        /* renamed from: b */
        public TextView f1011b;

        /* renamed from: c */
        public TextView f1012c;

        /* renamed from: d */
        public TextView f1013d;

        /* renamed from: e */
        public ImageView f1014e;

        /* renamed from: f */
        public TextView f1015f;

        public C0348b() {
        }
    }

    public C0346QM(Context context, int i, List<C0259ML> list) {
        super(context, i, list);
        this.f1000a = context;
        this.f1003d = list;
        this.f1004e = list;
        this.f1002c = i;
        this.f1001b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public SparseBooleanArray mo1083a() {
        return this.f1007h;
    }

    /* renamed from: a */
    public void mo1084a(int i) {
        if (this.f1008i.contains(Integer.valueOf(i))) {
            this.f1008i.remove(Integer.valueOf(i));
        } else {
            this.f1008i.add(Integer.valueOf(i));
        }
        mo1085a(i, !this.f1007h.get(i));
    }

    /* renamed from: a */
    public void mo1085a(int i, boolean z) {
        if (z) {
            this.f1007h.put(i, z);
        } else {
            this.f1007h.delete(i);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void remove(C0259ML ml) {
        this.f1003d.remove(ml);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo1087b() {
        this.f1007h = new SparseBooleanArray();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f1003d.size();
    }

    public Filter getFilter() {
        if (this.f1005f == null) {
            this.f1005f = new C0347a();
        }
        return this.f1005f;
    }

    public C0259ML getItem(int i) {
        return (C0259ML) this.f1003d.get(i);
    }

    public long getItemId(int i) {
        return (long) this.f1003d.indexOf(getItem(i));
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C0348b bVar;
        View view2;
        String str = "#FFFFFF";
        if (view == null) {
            bVar = new C0348b();
            view2 = this.f1001b.inflate(this.f1002c, null);
            bVar.f1010a = (TextView) view2.findViewById(2131296680);
            bVar.f1011b = (TextView) view2.findViewById(2131296679);
            bVar.f1012c = (TextView) view2.findViewById(2131296675);
            bVar.f1013d = (TextView) view2.findViewById(2131296682);
            bVar.f1015f = (TextView) view2.findViewById(2131296681);
            bVar.f1014e = (ImageView) view2.findViewById(2131296495);
            view2.setTag(bVar);
            view2.setBackgroundColor(Color.parseColor(str));
        } else {
            view2 = view;
            bVar = (C0348b) view.getTag();
        }
        bVar.f1010a.setText(((C0259ML) this.f1003d.get(i)).mo884c());
        bVar.f1011b.setText(((C0259ML) this.f1003d.get(i)).mo883b());
        bVar.f1012c.setText(((C0259ML) this.f1003d.get(i)).mo882a());
        bVar.f1013d.setText(((C0259ML) this.f1003d.get(i)).mo886e());
        bVar.f1015f.setText(((C0259ML) this.f1003d.get(i)).mo885d());
        C0889lH.m2935a(this.f1000a).mo4598a(((C0259ML) this.f1003d.get(i)).mo887f()).mo5081a(bVar.f1014e);
        C0259ML ml = (C0259ML) this.f1003d.get(i);
        String lowerCase = ml.mo886e().toLowerCase(Locale.getDefault());
        String str2 = this.f1006g;
        if (str2 != null && !str2.isEmpty()) {
            if (lowerCase.contains(this.f1006g)) {
                int indexOf = lowerCase.indexOf(this.f1006g);
                int length = this.f1006g.length() + indexOf;
                Spannable newSpannable = Factory.getInstance().newSpannable(bVar.f1013d.getText());
                newSpannable.setSpan(new ForegroundColorSpan(-65536), indexOf, length, 33);
                bVar.f1013d.setText(newSpannable, BufferType.SPANNABLE);
            }
            String lowerCase2 = ml.mo885d().toLowerCase(Locale.getDefault());
            if (lowerCase2.contains(this.f1006g)) {
                int indexOf2 = lowerCase2.indexOf(this.f1006g);
                int length2 = this.f1006g.length() + indexOf2;
                Spannable newSpannable2 = Factory.getInstance().newSpannable(bVar.f1015f.getText());
                newSpannable2.setSpan(new ForegroundColorSpan(-65536), indexOf2, length2, 33);
                bVar.f1015f.setText(newSpannable2, BufferType.SPANNABLE);
            }
            String lowerCase3 = ml.mo883b().toLowerCase(Locale.getDefault());
            if (lowerCase3.contains(this.f1006g)) {
                int indexOf3 = lowerCase3.indexOf(this.f1006g);
                int length3 = this.f1006g.length() + indexOf3;
                Spannable newSpannable3 = Factory.getInstance().newSpannable(bVar.f1011b.getText());
                newSpannable3.setSpan(new ForegroundColorSpan(-65536), indexOf3, length3, 33);
                bVar.f1011b.setText(newSpannable3, BufferType.SPANNABLE);
            }
            String str3 = "";
            String str4 = ",";
            String lowerCase4 = ml.mo882a().replaceAll(str4, str3).toLowerCase(Locale.getDefault());
            if (lowerCase4.contains(this.f1006g)) {
                int indexOf4 = lowerCase4.indexOf(this.f1006g);
                int length4 = this.f1006g.length() + indexOf4;
                String charSequence = bVar.f1012c.getText().toString();
                int length5 = charSequence.length() - charSequence.replaceAll(str4, str3).length();
                if (this.f1006g.length() > 0) {
                    Spannable newSpannable4 = Factory.getInstance().newSpannable(charSequence);
                    newSpannable4.setSpan(new ForegroundColorSpan(-65536), indexOf4, length4 + length5, 33);
                    bVar.f1012c.setText(newSpannable4, BufferType.SPANNABLE);
                }
            }
        }
        view2.setBackgroundColor(this.f1008i.contains(Integer.valueOf(i)) ? Color.parseColor(this.f1000a.getString(2131755101)) : Color.parseColor(str));
        return view2;
    }
}
