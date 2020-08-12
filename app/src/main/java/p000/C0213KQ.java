package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: KQ */
class C0213KQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f535a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f536b;

    public C0213KQ(C0523YQ yq, String[] strArr) {
        this.f536b = yq;
        this.f535a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            boolean a = C0760eU.m2615a(this.f536b.getActivity());
            if (this.f535a[i].equals(this.f536b.getActivity().getResources().getStringArray(2130903056)[0])) {
                this.f536b.f1582kb = this.f536b.getActivity().getResources().getStringArray(2130903056)[0];
                if (a) {
                    this.f536b.mo1591m();
                }
            } else if (this.f535a[i].equals(this.f536b.getActivity().getResources().getStringArray(2130903056)[1])) {
                this.f536b.f1582kb = this.f536b.getActivity().getResources().getStringArray(2130903056)[1];
                if (a) {
                    this.f536b.mo1523D();
                }
            } else if (this.f535a[i].equals(this.f536b.getActivity().getResources().getStringArray(2130903043)[0])) {
                C0195JU ju = this.f536b.f1606v;
                StringBuilder sb = new StringBuilder();
                sb.append(C0195JU.f442b);
                sb.append(this.f536b.f1523Ma.getTag().toString());
                ju.mo460H(sb.toString());
            } else if (this.f535a[i].equals(this.f536b.getActivity().getResources().getStringArray(2130903043)[1])) {
                this.f536b.f1523Ma.setTag(null);
                this.f536b.f1523Ma.setImageResource(2131230821);
                this.f536b.f1523Ma.getLayoutParams().width = (int) this.f536b.getResources().getDimension(2131165263);
                this.f536b.f1523Ma.getLayoutParams().height = (int) this.f536b.getResources().getDimension(2131165263);
            }
        } catch (Exception unused) {
        }
    }
}
