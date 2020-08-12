package p000;

import android.content.Context;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: aN */
public class C0604aN extends BaseExpandableListAdapter implements Filterable {

    /* renamed from: a */
    public Context f1831a;

    /* renamed from: b */
    public ArrayList<C0777fO> f1832b;

    /* renamed from: c */
    public List<C0777fO> f1833c;

    /* renamed from: d */
    public C0605a f1834d;

    /* renamed from: e */
    public String f1835e = "";

    /* renamed from: aN$a */
    private class C0605a extends Filter {
        public C0605a() {
        }

        public FilterResults performFiltering(CharSequence charSequence) {
            FilterResults filterResults = new FilterResults();
            C0604aN.this.f1835e = charSequence.toString();
            if (charSequence == null || charSequence.length() <= 0) {
                filterResults.count = C0604aN.this.f1833c.size();
                filterResults.values = C0604aN.this.f1833c;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < C0604aN.this.f1833c.size(); i++) {
                    if (((C0777fO) C0604aN.this.f1833c.get(i)).mo4356f().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0777fO) C0604aN.this.f1833c.get(i)).mo4354d().toUpperCase().contains(charSequence.toString().toUpperCase())) {
                        String str = "";
                        String str2 = ",";
                        C0777fO fOVar = new C0777fO(((C0777fO) C0604aN.this.f1833c.get(i)).mo4355e(), ((C0777fO) C0604aN.this.f1833c.get(i)).mo4356f(), ((C0777fO) C0604aN.this.f1833c.get(i)).mo4354d(), ((C0777fO) C0604aN.this.f1833c.get(i)).mo4350a().replaceAll(str2, str), ((C0777fO) C0604aN.this.f1833c.get(i)).mo4353c().replaceAll(str2, str), ((C0777fO) C0604aN.this.f1833c.get(i)).mo4357g().replaceAll(str2, str));
                        fOVar.mo4351a(((C0777fO) C0604aN.this.f1833c.get(i)).mo4352b());
                        arrayList.add(fOVar);
                    }
                }
                filterResults.count = arrayList.size();
                filterResults.values = arrayList;
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            C0604aN aNVar = C0604aN.this;
            aNVar.f1832b = (ArrayList) filterResults.values;
            aNVar.notifyDataSetChanged();
        }
    }

    public C0604aN(Context context, ArrayList<C0777fO> arrayList) {
        this.f1831a = context;
        this.f1832b = arrayList;
        this.f1833c = arrayList;
    }

    public Object getChild(int i, int i2) {
        return ((C0777fO) this.f1832b.get(i)).mo4352b().get(i2);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        C0754eO eOVar = (C0754eO) getChild(i, i2);
        if (view == null) {
            view = ((LayoutInflater) this.f1831a.getSystemService("layout_inflater")).inflate(2131493008, null);
        }
        TextView textView = (TextView) view.findViewById(2131296378);
        TextView textView2 = (TextView) view.findViewById(2131296398);
        TextView textView3 = (TextView) view.findViewById(2131296555);
        ((TextView) view.findViewById(2131296394)).setText(eOVar.mo4328c());
        textView3.setText(eOVar.mo4329d());
        textView.setText(eOVar.mo4326a());
        textView2.setText(eOVar.mo4327b());
        return view;
    }

    public int getChildrenCount(int i) {
        return ((C0777fO) this.f1832b.get(i)).mo4352b().size();
    }

    public Filter getFilter() {
        if (this.f1834d == null) {
            this.f1834d = new C0605a();
        }
        return this.f1834d;
    }

    public Object getGroup(int i) {
        return this.f1832b.get(i);
    }

    public int getGroupCount() {
        return this.f1832b.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        C0777fO fOVar = (C0777fO) getGroup(i);
        if (view == null) {
            view = ((LayoutInflater) this.f1831a.getSystemService("layout_inflater")).inflate(2131493007, null);
        }
        TextView textView = (TextView) view.findViewById(2131296394);
        TextView textView2 = (TextView) view.findViewById(2131296378);
        TextView textView3 = (TextView) view.findViewById(2131296398);
        TextView textView4 = (TextView) view.findViewById(2131296555);
        textView.setText(fOVar.mo4356f());
        textView2.setText(fOVar.mo4350a());
        textView3.setText(fOVar.mo4353c());
        textView4.setText(fOVar.mo4357g());
        try {
            ImageView imageView = (ImageView) view.findViewById(2131296506);
            imageView.setVisibility(0);
            imageView.setImageResource(!z ? 2131230913 : 2131230915);
        } catch (Exception unused) {
        }
        String lowerCase = fOVar.mo4356f().toLowerCase(Locale.getDefault());
        if (lowerCase.contains(this.f1835e)) {
            int indexOf = lowerCase.indexOf(this.f1835e);
            int length = this.f1835e.length() + indexOf;
            Spannable newSpannable = Factory.getInstance().newSpannable(textView.getText());
            newSpannable.setSpan(new ForegroundColorSpan(-65536), indexOf, length, 33);
            textView.setText(newSpannable, BufferType.SPANNABLE);
        }
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
