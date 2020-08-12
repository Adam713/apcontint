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

/* renamed from: ZM */
public class C0546ZM extends BaseExpandableListAdapter implements Filterable {

    /* renamed from: a */
    public Context f1650a;

    /* renamed from: b */
    public ArrayList<C0208KL> f1651b;

    /* renamed from: c */
    public List<C0208KL> f1652c;

    /* renamed from: d */
    public C0547a f1653d;

    /* renamed from: e */
    public String f1654e = "";

    /* renamed from: ZM$a */
    private class C0547a extends Filter {
        public C0547a() {
        }

        public FilterResults performFiltering(CharSequence charSequence) {
            FilterResults filterResults = new FilterResults();
            C0546ZM.this.f1654e = charSequence.toString();
            if (charSequence == null || charSequence.length() <= 0) {
                filterResults.count = C0546ZM.this.f1652c.size();
                filterResults.values = C0546ZM.this.f1652c;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < C0546ZM.this.f1652c.size(); i++) {
                    String str = "";
                    String str2 = ",";
                    if (((C0208KL) C0546ZM.this.f1652c.get(i)).mo675f().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0208KL) C0546ZM.this.f1652c.get(i)).mo673d().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((C0208KL) C0546ZM.this.f1652c.get(i)).mo668a().replaceAll(str2, str).toUpperCase().contains(charSequence.toString().toUpperCase())) {
                        C0208KL kl = new C0208KL(((C0208KL) C0546ZM.this.f1652c.get(i)).mo674e(), ((C0208KL) C0546ZM.this.f1652c.get(i)).mo675f(), ((C0208KL) C0546ZM.this.f1652c.get(i)).mo673d(), ((C0208KL) C0546ZM.this.f1652c.get(i)).mo668a().replaceAll(str2, str), ((C0208KL) C0546ZM.this.f1652c.get(i)).mo676g(), ((C0208KL) C0546ZM.this.f1652c.get(i)).mo672c());
                        kl.mo670a(((C0208KL) C0546ZM.this.f1652c.get(i)).mo671b());
                        arrayList.add(kl);
                    }
                }
                filterResults.count = arrayList.size();
                filterResults.values = arrayList;
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            C0546ZM zm = C0546ZM.this;
            zm.f1651b = (ArrayList) filterResults.values;
            zm.notifyDataSetChanged();
        }
    }

    public C0546ZM(Context context, ArrayList<C0208KL> arrayList) {
        this.f1650a = context;
        this.f1651b = arrayList;
        this.f1652c = arrayList;
    }

    public Object getChild(int i, int i2) {
        return ((C0208KL) this.f1651b.get(i)).mo671b().get(i2);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        C0186JL jl = (C0186JL) getChild(i, i2);
        if (view == null) {
            view = ((LayoutInflater) this.f1650a.getSystemService("layout_inflater")).inflate(2131493010, null);
        }
        TextView textView = (TextView) view.findViewById(2131296317);
        ImageView imageView = (ImageView) view.findViewById(2131296495);
        TextView textView2 = (TextView) view.findViewById(2131296397);
        ((TextView) view.findViewById(2131296394)).setText(jl.mo433c());
        textView2.setText(null);
        textView.setText(jl.mo430a());
        imageView.setImageResource(jl.mo434d());
        return view;
    }

    public int getChildrenCount(int i) {
        return ((C0208KL) this.f1651b.get(i)).mo671b().size();
    }

    public Filter getFilter() {
        if (this.f1653d == null) {
            this.f1653d = new C0547a();
        }
        return this.f1653d;
    }

    public Object getGroup(int i) {
        return this.f1651b.get(i);
    }

    public int getGroupCount() {
        return this.f1651b.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        C0208KL kl = (C0208KL) getGroup(i);
        if (view == null) {
            view = ((LayoutInflater) this.f1650a.getSystemService("layout_inflater")).inflate(2131493006, null);
        }
        TextView textView = (TextView) view.findViewById(2131296394);
        TextView textView2 = (TextView) view.findViewById(2131296317);
        ImageView imageView = (ImageView) view.findViewById(2131296495);
        TextView textView3 = (TextView) view.findViewById(2131296397);
        textView.setText(kl.mo675f());
        textView3.setText(String.valueOf(kl.mo677h()));
        textView2.setText(kl.mo668a());
        imageView.setImageResource(kl.mo676g());
        try {
            ImageView imageView2 = (ImageView) view.findViewById(2131296506);
            imageView2.setVisibility(0);
            imageView2.setImageResource(!z ? 2131230913 : 2131230915);
        } catch (Exception unused) {
        }
        String lowerCase = kl.mo675f().toLowerCase(Locale.getDefault());
        if (lowerCase.contains(this.f1654e)) {
            int indexOf = lowerCase.indexOf(this.f1654e);
            int length = this.f1654e.length() + indexOf;
            Spannable newSpannable = Factory.getInstance().newSpannable(textView.getText());
            newSpannable.setSpan(new ForegroundColorSpan(-65536), indexOf, length, 33);
            textView.setText(newSpannable, BufferType.SPANNABLE);
        }
        String str = "";
        String str2 = ",";
        String lowerCase2 = kl.mo668a().replaceAll(str2, str).toLowerCase(Locale.getDefault());
        if (lowerCase2.contains(this.f1654e)) {
            int indexOf2 = lowerCase2.indexOf(this.f1654e);
            int length2 = this.f1654e.length() + indexOf2;
            String charSequence = textView2.getText().toString();
            int length3 = charSequence.length() - charSequence.replaceAll(str2, str).length();
            if (this.f1654e.length() > 0) {
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
