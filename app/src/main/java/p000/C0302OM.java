package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
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

/* renamed from: OM */
public class C0302OM extends ArrayAdapter<C0232LL> implements Filterable {

    /* renamed from: a */
    public Context f860a;

    /* renamed from: b */
    public LayoutInflater f861b;

    /* renamed from: c */
    public int f862c;

    /* renamed from: d */
    public List<C0232LL> f863d;

    /* renamed from: e */
    public List<C0232LL> f864e;

    /* renamed from: f */
    public C0303a f865f;

    /* renamed from: g */
    public String f866g = "";

    /* renamed from: h */
    public SparseBooleanArray f867h = new SparseBooleanArray();

    /* renamed from: i */
    public ArrayList<Integer> f868i = new ArrayList<>();

    /* renamed from: j */
    public int[] f869j = {2131230923, 1, 2131230855};

    /* renamed from: k */
    public Bitmap f870k;

    /* renamed from: l */
    public Bitmap f871l;

    /* renamed from: OM$a */
    private class C0303a extends Filter {
        public C0303a() {
        }

        public FilterResults performFiltering(CharSequence charSequence) {
            FilterResults filterResults = new FilterResults();
            C0302OM.this.f866g = charSequence.toString();
            if (charSequence == null || charSequence.length() <= 0) {
                filterResults.count = C0302OM.this.f864e.size();
                filterResults.values = C0302OM.this.f864e;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < C0302OM.this.f864e.size(); i++) {
                    String str = "";
                    String str2 = ",";
                    if (((C0232LL) C0302OM.this.f864e.get(i)).mo779j().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0232LL) C0302OM.this.f864e.get(i)).mo775f().replaceAll(str2, str).toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0232LL) C0302OM.this.f864e.get(i)).mo777h().toUpperCase(Locale.ENGLISH).contains(charSequence.toString().toUpperCase())) {
                        C0232LL ll = new C0232LL(((C0232LL) C0302OM.this.f864e.get(i)).mo778i(), ((C0232LL) C0302OM.this.f864e.get(i)).mo777h(), ((C0232LL) C0302OM.this.f864e.get(i)).mo775f().replaceAll(str2, str), ((C0232LL) C0302OM.this.f864e.get(i)).mo779j(), ((C0232LL) C0302OM.this.f864e.get(i)).mo780k(), ((C0232LL) C0302OM.this.f864e.get(i)).mo770c().replaceAll(str2, str));
                        arrayList.add(ll);
                    }
                }
                filterResults.count = arrayList.size();
                filterResults.values = arrayList;
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            try {
                C0302OM.this.f863d = (ArrayList) filterResults.values;
                C0302OM.this.notifyDataSetChanged();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: OM$b */
    private static class C0304b {

        /* renamed from: a */
        public TextView f873a;

        /* renamed from: b */
        public TextView f874b;

        /* renamed from: c */
        public TextView f875c;

        /* renamed from: d */
        public TextView f876d;

        /* renamed from: e */
        public ImageView f877e;

        /* renamed from: f */
        public TextView f878f;

        /* renamed from: g */
        public int f879g;

        public C0304b() {
        }
    }

    public C0302OM(Context context, int i, List<C0232LL> list) {
        super(context, i, list);
        this.f860a = context;
        this.f863d = list;
        this.f864e = list;
        this.f862c = i;
        this.f861b = LayoutInflater.from(context);
        this.f870k = ((BitmapDrawable) context.getResources().getDrawable(this.f869j[0])).getBitmap();
        this.f871l = ((BitmapDrawable) context.getResources().getDrawable(this.f869j[2])).getBitmap();
    }

    /* renamed from: a */
    public SparseBooleanArray mo963a() {
        return this.f867h;
    }

    /* renamed from: a */
    public void mo964a(int i) {
        if (this.f868i.contains(Integer.valueOf(i))) {
            this.f868i.remove(Integer.valueOf(i));
        } else {
            this.f868i.add(Integer.valueOf(i));
        }
        mo965a(i, !this.f867h.get(i));
    }

    /* renamed from: a */
    public void mo965a(int i, boolean z) {
        if (z) {
            this.f867h.put(i, z);
        } else {
            this.f867h.delete(i);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void remove(C0232LL ll) {
        this.f863d.remove(ll);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo967b() {
        this.f867h = new SparseBooleanArray();
        notifyDataSetChanged();
    }

    public int getCount() {
        List<C0232LL> list = this.f863d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Filter getFilter() {
        if (this.f865f == null) {
            this.f865f = new C0303a();
        }
        return this.f865f;
    }

    public C0232LL getItem(int i) {
        return (C0232LL) this.f863d.get(i);
    }

    public long getItemId(int i) {
        return (long) this.f863d.indexOf(getItem(i));
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C0304b bVar;
        View view2;
        String str = "";
        String str2 = ",";
        if (view == null) {
            bVar = new C0304b();
            view2 = this.f861b.inflate(this.f862c, null);
            bVar.f873a = (TextView) view2.findViewById(2131296680);
            bVar.f874b = (TextView) view2.findViewById(2131296679);
            bVar.f875c = (TextView) view2.findViewById(2131296675);
            bVar.f876d = (TextView) view2.findViewById(2131296682);
            bVar.f878f = (TextView) view2.findViewById(2131296676);
            bVar.f877e = (ImageView) view2.findViewById(2131296495);
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (C0304b) view.getTag();
        }
        bVar.f873a.setText(((C0232LL) this.f863d.get(i)).mo778i());
        bVar.f874b.setText(((C0232LL) this.f863d.get(i)).mo777h());
        bVar.f875c.setText(((C0232LL) this.f863d.get(i)).mo775f());
        bVar.f876d.setText(((C0232LL) this.f863d.get(i)).mo779j());
        bVar.f878f.setText(((C0232LL) this.f863d.get(i)).mo770c());
        bVar.f879g = i;
        C0889lH.m2935a(this.f860a).mo4598a(((C0232LL) this.f863d.get(i)).mo780k()).mo5081a(bVar.f877e);
        bVar.f877e.setTag(Integer.valueOf(((C0232LL) this.f863d.get(i)).mo780k()));
        bVar.f876d.setTag(((C0232LL) this.f863d.get(i)).mo776g());
        bVar.f875c.setTag(((C0232LL) this.f863d.get(i)).mo766a());
        C0232LL ll = (C0232LL) this.f863d.get(i);
        try {
            if (ll.mo779j() != null) {
                String lowerCase = ll.mo779j().toLowerCase(Locale.getDefault());
                if (this.f866g != null && !this.f866g.isEmpty() && lowerCase.contains(this.f866g)) {
                    int indexOf = lowerCase.indexOf(this.f866g);
                    int length = this.f866g.length() + indexOf;
                    Spannable newSpannable = Factory.getInstance().newSpannable(bVar.f876d.getText());
                    newSpannable.setSpan(new ForegroundColorSpan(-65536), indexOf, length, 33);
                    bVar.f876d.setText(newSpannable, BufferType.SPANNABLE);
                }
                String lowerCase2 = ll.mo777h().toLowerCase(Locale.getDefault());
                if (lowerCase2.contains(this.f866g)) {
                    int indexOf2 = lowerCase2.indexOf(this.f866g);
                    int length2 = this.f866g.length() + indexOf2;
                    Spannable newSpannable2 = Factory.getInstance().newSpannable(bVar.f874b.getText());
                    newSpannable2.setSpan(new ForegroundColorSpan(-65536), indexOf2, length2, 33);
                    bVar.f874b.setText(newSpannable2, BufferType.SPANNABLE);
                }
                String lowerCase3 = ll.mo775f().replaceAll(str2, str).toLowerCase(Locale.getDefault());
                if (lowerCase3.contains(this.f866g)) {
                    int indexOf3 = lowerCase3.indexOf(this.f866g);
                    int length3 = this.f866g.length() + indexOf3;
                    String charSequence = bVar.f875c.getText().toString();
                    int length4 = charSequence.length() - charSequence.replaceAll(str2, str).length();
                    if (this.f866g.length() > 0) {
                        Spannable newSpannable3 = Factory.getInstance().newSpannable(charSequence);
                        newSpannable3.setSpan(new ForegroundColorSpan(-65536), indexOf3, length3 + length4, 33);
                        bVar.f875c.setText(newSpannable3, BufferType.SPANNABLE);
                    }
                }
            }
        } catch (Exception unused) {
        }
        view2.setBackgroundColor(Color.parseColor(this.f868i.contains(Integer.valueOf(i)) ? this.f860a.getString(2131755101) : "#FFFFFF"));
        return view2;
    }
}
