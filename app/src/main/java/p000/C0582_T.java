package p000;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: _T */
public class C0582_T extends Adapter<C0583a> {

    /* renamed from: a */
    public String[] f1770a;

    /* renamed from: b */
    public String f1771b;

    /* renamed from: _T$a */
    public static class C0583a extends ViewHolder {

        /* renamed from: a */
        public TextView f1772a;

        /* renamed from: b */
        public TextView f1773b;

        public C0583a(View view) {
            super(view);
            this.f1772a = (TextView) view.findViewById(2131296509);
            this.f1773b = (TextView) view.findViewById(2131296664);
        }
    }

    public C0582_T(String[] strArr, String str) {
        this.f1770a = strArr;
        this.f1771b = str;
    }

    /* renamed from: a */
    public void onBindViewHolder(C0583a aVar, int i) {
        aVar.f1772a.setText(this.f1770a[i]);
        aVar.f1773b.setText(this.f1771b);
    }

    public int getItemCount() {
        return this.f1770a.length;
    }

    public C0583a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C0583a(LayoutInflater.from(viewGroup.getContext()).inflate(2131492906, viewGroup, false));
    }
}
