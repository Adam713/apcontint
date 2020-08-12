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

/* renamed from: XM */
public class C0498XM extends BaseExpandableListAdapter implements Filterable {

    /* renamed from: a */
    public Context f1437a;

    /* renamed from: b */
    public ArrayList<C0208KL> f1438b;

    /* renamed from: c */
    public List<C0208KL> f1439c;

    /* renamed from: d */
    public C0499a f1440d;

    /* renamed from: e */
    public String f1441e = "";

    /* renamed from: XM$a */
    private class C0499a extends Filter {
        public C0499a() {
        }

        public FilterResults performFiltering(CharSequence charSequence) {
            FilterResults filterResults = new FilterResults();
            C0498XM.this.f1441e = charSequence.toString();
            if (charSequence == null || charSequence.length() <= 0) {
                filterResults.count = C0498XM.this.f1439c.size();
                filterResults.values = C0498XM.this.f1439c;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < C0498XM.this.f1439c.size(); i++) {
                    String str = "";
                    String str2 = ",";
                    if (((C0208KL) C0498XM.this.f1439c.get(i)).mo675f().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0208KL) C0498XM.this.f1439c.get(i)).mo673d().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0208KL) C0498XM.this.f1439c.get(i)).mo668a().replaceAll(str2, str).toUpperCase().contains(charSequence.toString().toUpperCase())) {
                        C0208KL kl = new C0208KL(((C0208KL) C0498XM.this.f1439c.get(i)).mo674e(), ((C0208KL) C0498XM.this.f1439c.get(i)).mo675f(), ((C0208KL) C0498XM.this.f1439c.get(i)).mo673d(), ((C0208KL) C0498XM.this.f1439c.get(i)).mo668a().replaceAll(str2, str), ((C0208KL) C0498XM.this.f1439c.get(i)).mo676g(), ((C0208KL) C0498XM.this.f1439c.get(i)).mo672c());
                        kl.mo670a(((C0208KL) C0498XM.this.f1439c.get(i)).mo671b());
                        arrayList.add(kl);
                    }
                }
                filterResults.count = arrayList.size();
                filterResults.values = arrayList;
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            C0498XM xm = C0498XM.this;
            xm.f1438b = (ArrayList) filterResults.values;
            xm.notifyDataSetChanged();
        }
    }

    public C0498XM(Context context, ArrayList<C0208KL> arrayList) {
        this.f1437a = context;
        this.f1438b = arrayList;
        this.f1439c = arrayList;
    }

    public Object getChild(int i, int i2) {
        return ((C0208KL) this.f1438b.get(i)).mo671b().get(i2);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        C0186JL jl = (C0186JL) getChild(i, i2);
        if (view == null) {
            view = ((LayoutInflater) this.f1437a.getSystemService("layout_inflater")).inflate(2131493010, null);
        }
        TextView textView = (TextView) view.findViewById(2131296317);
        ImageView imageView = (ImageView) view.findViewById(2131296495);
        TextView textView2 = (TextView) view.findViewById(2131296397);
        ((TextView) view.findViewById(2131296394)).setText(jl.mo433c());
        textView2.setText(jl.mo435e());
        textView.setText(jl.mo430a());
        imageView.setImageResource(jl.mo434d());
        return view;
    }

    public int getChildrenCount(int i) {
        return ((C0208KL) this.f1438b.get(i)).mo671b().size();
    }

    public Filter getFilter() {
        if (this.f1440d == null) {
            this.f1440d = new C0499a();
        }
        return this.f1440d;
    }

    public Object getGroup(int i) {
        return this.f1438b.get(i);
    }

    public int getGroupCount() {
        return this.f1438b.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        C0208KL kl = (C0208KL) getGroup(i);
        if (view == null) {
            view = ((LayoutInflater) this.f1437a.getSystemService("layout_inflater")).inflate(2131493006, null);
        }
        TextView textView = (TextView) view.findViewById(2131296394);
        TextView textView2 = (TextView) view.findViewById(2131296317);
        ImageView imageView = (ImageView) view.findViewById(2131296495);
        TextView textView3 = (TextView) view.findViewById(2131296397);
        textView.setText(kl.mo675f());
        textView3.setText(String.valueOf(kl.mo672c()));
        textView2.setText(kl.mo668a());
        imageView.setImageResource(kl.mo676g());
        try {
            ImageView imageView2 = (ImageView) view.findViewById(2131296506);
            imageView2.setVisibility(0);
            imageView2.setImageResource(!z ? 2131230913 : 2131230915);
        } catch (Exception unused) {
        }
        String lowerCase = kl.mo675f().toLowerCase(Locale.getDefault());
        if (lowerCase.contains(this.f1441e)) {
            int indexOf = lowerCase.indexOf(this.f1441e);
            int length = this.f1441e.length() + indexOf;
            Spannable newSpannable = Factory.getInstance().newSpannable(textView.getText());
            newSpannable.setSpan(new ForegroundColorSpan(-65536), indexOf, length, 33);
            textView.setText(newSpannable, BufferType.SPANNABLE);
        }
        String str = "";
        String str2 = ",";
        String lowerCase2 = kl.mo668a().replaceAll(str2, str).toLowerCase(Locale.getDefault());
        if (lowerCase2.contains(this.f1441e)) {
            int indexOf2 = lowerCase2.indexOf(this.f1441e);
            int length2 = this.f1441e.length() + indexOf2;
            String charSequence = textView2.getText().toString();
            int length3 = charSequence.length() - charSequence.replaceAll(str2, str).length();
            if (this.f1441e.length() > 0) {
                Spannable newSpannable2 = Factory.getInstance().newSpannable(charSequence);
                newSpannable2.setSpan(new ForegroundColorSpan(-65536), indexOf2, length2 + length3, 33);
                textView2.setText(newSpannable2, BufferType.SPANNABLE);
            }
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
