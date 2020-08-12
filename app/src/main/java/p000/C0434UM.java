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
import com.valdio.valdioveliu.recyclerview.CircleImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: UM */
public class C0434UM extends ArrayAdapter<C0082EH> implements Filterable {

    /* renamed from: a */
    public Context f1234a;

    /* renamed from: b */
    public LayoutInflater f1235b;

    /* renamed from: c */
    public int f1236c;

    /* renamed from: d */
    public List<C0082EH> f1237d;

    /* renamed from: e */
    public List<C0082EH> f1238e;

    /* renamed from: f */
    public C0435a f1239f;

    /* renamed from: g */
    public String f1240g = "";

    /* renamed from: h */
    public SparseBooleanArray f1241h = new SparseBooleanArray();

    /* renamed from: i */
    public ArrayList<Integer> f1242i = new ArrayList<>();

    /* renamed from: UM$a */
    private class C0435a extends Filter {
        public C0435a() {
        }

        public FilterResults performFiltering(CharSequence charSequence) {
            FilterResults filterResults = new FilterResults();
            C0434UM.this.f1240g = charSequence.toString();
            if (charSequence == null || charSequence.length() <= 0) {
                filterResults.count = C0434UM.this.f1238e.size();
                filterResults.values = C0434UM.this.f1238e;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < C0434UM.this.f1238e.size(); i++) {
                    String str = "";
                    String str2 = ",";
                    if (((C0082EH) C0434UM.this.f1238e.get(i)).mo192g().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0082EH) C0434UM.this.f1238e.get(i)).mo189e().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0082EH) C0434UM.this.f1238e.get(i)).mo180a().replaceAll(str2, str).toUpperCase().contains(charSequence.toString().toUpperCase())) {
                        C0082EH eh = new C0082EH(((C0082EH) C0434UM.this.f1238e.get(i)).mo191f(), ((C0082EH) C0434UM.this.f1238e.get(i)).mo192g(), ((C0082EH) C0434UM.this.f1238e.get(i)).mo189e(), Double.valueOf(((C0082EH) C0434UM.this.f1238e.get(i)).mo180a().replaceAll(str2, str)).doubleValue(), ((C0082EH) C0434UM.this.f1238e.get(i)).mo193h(), ((C0082EH) C0434UM.this.f1238e.get(i)).mo185c());
                        arrayList.add(eh);
                    }
                }
                filterResults.count = arrayList.size();
                filterResults.values = arrayList;
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            C0434UM um = C0434UM.this;
            um.f1237d = (ArrayList) filterResults.values;
            um.notifyDataSetChanged();
        }
    }

    /* renamed from: UM$b */
    private class C0436b {

        /* renamed from: a */
        public TextView f1244a;

        /* renamed from: b */
        public TextView f1245b;

        /* renamed from: c */
        public TextView f1246c;

        /* renamed from: d */
        public TextView f1247d;

        /* renamed from: e */
        public ImageView f1248e;

        /* renamed from: f */
        public CircleImageView f1249f;

        /* renamed from: g */
        public TextView f1250g;

        /* renamed from: h */
        public TextView f1251h;

        public C0436b() {
        }
    }

    public C0434UM(Context context, int i, List<C0082EH> list) {
        super(context, i, list);
        this.f1234a = context;
        this.f1237d = list;
        this.f1238e = list;
        this.f1236c = i;
        this.f1235b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public int mo1273a() {
        return this.f1241h.size();
    }

    /* renamed from: a */
    public void mo1274a(int i) {
        if (this.f1242i.contains(Integer.valueOf(i))) {
            this.f1242i.remove(Integer.valueOf(i));
        } else {
            this.f1242i.add(Integer.valueOf(i));
        }
        mo1275a(i, !this.f1241h.get(i));
    }

    /* renamed from: a */
    public void mo1275a(int i, boolean z) {
        if (z) {
            this.f1241h.put(i, z);
        } else {
            this.f1241h.delete(i);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void remove(C0082EH eh) {
        this.f1237d.remove(eh);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public SparseBooleanArray mo1277b() {
        return this.f1241h;
    }

    /* renamed from: c */
    public void mo1278c() {
        this.f1241h = new SparseBooleanArray();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f1237d.size();
    }

    public Filter getFilter() {
        if (this.f1239f == null) {
            this.f1239f = new C0435a();
        }
        return this.f1239f;
    }

    public C0082EH getItem(int i) {
        return (C0082EH) this.f1237d.get(i);
    }

    public long getItemId(int i) {
        return (long) this.f1237d.indexOf(getItem(i));
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        View view3;
        C0436b bVar;
        String str;
        TextView textView;
        C0436b bVar2;
        View view4;
        C0436b bVar3;
        int i2 = i;
        int i3 = this.f1236c;
        String str2 = "#FFFFFF";
        if (i3 == 2131492938) {
            if (view == null) {
                bVar3 = new C0436b();
                view2 = this.f1235b.inflate(this.f1236c, null);
                bVar3.f1244a = (TextView) view2.findViewById(2131296385);
                bVar3.f1245b = (TextView) view2.findViewById(2131296394);
                bVar3.f1246c = (TextView) view2.findViewById(2131296389);
                view2.setTag(bVar3);
                view2.setBackgroundColor(Color.parseColor(str2));
            } else {
                bVar3 = (C0436b) view.getTag();
                view2 = view;
            }
            bVar3.f1244a.setText(((C0082EH) this.f1237d.get(i2)).mo191f());
            bVar3.f1245b.setText(((C0082EH) this.f1237d.get(i2)).mo192g());
            bVar3.f1246c.setText(((C0082EH) this.f1237d.get(i2)).mo189e());
        } else {
            String str3 = "";
            String str4 = ",";
            if (i3 == 2131492936) {
                if (view == null) {
                    bVar2 = new C0436b();
                    view4 = this.f1235b.inflate(this.f1236c, null);
                    bVar2.f1244a = (TextView) view4.findViewById(2131296385);
                    bVar2.f1245b = (TextView) view4.findViewById(2131296394);
                    bVar2.f1246c = (TextView) view4.findViewById(2131296389);
                    bVar2.f1247d = (TextView) view4.findViewById(2131296317);
                    bVar2.f1249f = (CircleImageView) view4.findViewById(2131296495);
                    bVar2.f1251h = (TextView) view4.findViewById(2131296377);
                    view4.setTag(bVar2);
                    view4.setBackgroundColor(Color.parseColor(str2));
                } else {
                    bVar2 = (C0436b) view.getTag();
                    view4 = view;
                }
                bVar2.f1244a.setText(((C0082EH) this.f1237d.get(i2)).mo191f());
                bVar2.f1245b.setText(((C0082EH) this.f1237d.get(i2)).mo192g());
                bVar2.f1246c.setText(((C0082EH) this.f1237d.get(i2)).mo189e());
                bVar2.f1247d.setText(((C0082EH) this.f1237d.get(i2)).mo180a());
                bVar2.f1249f.setImageResource(((C0082EH) this.f1237d.get(i2)).mo193h());
                bVar2.f1251h.setText(String.valueOf(((C0082EH) this.f1237d.get(i2)).mo194i()));
                C0082EH eh = (C0082EH) this.f1237d.get(i2);
                String lowerCase = eh.mo192g().toLowerCase(Locale.getDefault());
                if (lowerCase.contains(this.f1240g)) {
                    int indexOf = lowerCase.indexOf(this.f1240g);
                    int length = this.f1240g.length() + indexOf;
                    Spannable newSpannable = Factory.getInstance().newSpannable(bVar2.f1245b.getText());
                    newSpannable.setSpan(new ForegroundColorSpan(-65536), indexOf, length, 33);
                    bVar2.f1245b.setText(newSpannable, BufferType.SPANNABLE);
                }
                String lowerCase2 = eh.mo180a().replaceAll(str4, str3).toLowerCase(Locale.getDefault());
                if (lowerCase2.contains(this.f1240g)) {
                    int indexOf2 = lowerCase2.indexOf(this.f1240g);
                    int length2 = this.f1240g.length() + indexOf2;
                    String charSequence = bVar2.f1247d.getText().toString();
                    int length3 = charSequence.length() - charSequence.replaceAll(str4, str3).length();
                    if (this.f1240g.length() > 0) {
                        Spannable newSpannable2 = Factory.getInstance().newSpannable(charSequence);
                        newSpannable2.setSpan(new ForegroundColorSpan(-65536), indexOf2, length2 + length3, 33);
                        bVar2.f1247d.setText(newSpannable2, BufferType.SPANNABLE);
                    }
                }
            } else if (i3 == 2131493006 || i3 == 2131493009) {
                if (view == null) {
                    bVar = new C0436b();
                    view3 = this.f1235b.inflate(this.f1236c, null);
                    bVar.f1245b = (TextView) view3.findViewById(2131296394);
                    bVar.f1247d = (TextView) view3.findViewById(2131296317);
                    bVar.f1248e = (ImageView) view3.findViewById(2131296495);
                    bVar.f1250g = (TextView) view3.findViewById(2131296397);
                    view3.setTag(bVar);
                    view3.setBackgroundColor(Color.parseColor(str2));
                } else {
                    bVar = (C0436b) view.getTag();
                    view3 = view;
                }
                bVar.f1245b.setText(((C0082EH) this.f1237d.get(i2)).mo192g());
                if (this.f1236c == 2131493009) {
                    textView = bVar.f1250g;
                    str = ((C0082EH) this.f1237d.get(i2)).mo195j();
                } else {
                    textView = bVar.f1250g;
                    str = String.valueOf(((C0082EH) this.f1237d.get(i2)).mo185c());
                }
                textView.setText(str);
                bVar.f1247d.setText(((C0082EH) this.f1237d.get(i2)).mo180a());
                bVar.f1248e.setImageResource(((C0082EH) this.f1237d.get(i2)).mo193h());
                C0082EH eh2 = (C0082EH) this.f1237d.get(i2);
                String lowerCase3 = eh2.mo192g().toLowerCase(Locale.getDefault());
                if (lowerCase3.contains(this.f1240g)) {
                    int indexOf3 = lowerCase3.indexOf(this.f1240g);
                    int length4 = this.f1240g.length() + indexOf3;
                    Spannable newSpannable3 = Factory.getInstance().newSpannable(bVar.f1245b.getText());
                    newSpannable3.setSpan(new ForegroundColorSpan(-65536), indexOf3, length4, 33);
                    bVar.f1245b.setText(newSpannable3, BufferType.SPANNABLE);
                }
                String lowerCase4 = eh2.mo180a().replaceAll(str4, str3).toLowerCase(Locale.getDefault());
                if (lowerCase4.contains(this.f1240g)) {
                    int indexOf4 = lowerCase4.indexOf(this.f1240g);
                    int length5 = this.f1240g.length() + indexOf4;
                    String charSequence2 = bVar.f1247d.getText().toString();
                    int length6 = charSequence2.length() - charSequence2.replaceAll(str4, str3).length();
                    if (this.f1240g.length() > 0) {
                        Spannable newSpannable4 = Factory.getInstance().newSpannable(charSequence2);
                        newSpannable4.setSpan(new ForegroundColorSpan(-65536), indexOf4, length5 + length6, 33);
                        bVar.f1247d.setText(newSpannable4, BufferType.SPANNABLE);
                    }
                }
                view2 = view3;
            } else {
                view2 = view;
            }
        }
        view2.setBackgroundColor(this.f1242i.contains(Integer.valueOf(i)) ? Color.parseColor(this.f1234a.getString(2131755101)) : Color.parseColor(str2));
        return view2;
    }
}
