package p000;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;

/* renamed from: TR */
class C0415TR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f1188a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f1189b;

    /* renamed from: c */
    public final /* synthetic */ C0925mS f1190c;

    public C0415TR(C0925mS mSVar, AutoCompleteTextView autoCompleteTextView, AlertDialog alertDialog) {
        this.f1190c = mSVar;
        this.f1188a = autoCompleteTextView;
        this.f1189b = alertDialog;
    }

    public void onClick(View view) {
        boolean z;
        boolean a = C0008AO.m5a(this.f1188a);
        if (this.f1190c.f3372c.mo629x(this.f1188a.getText().toString()).getCount() == 0) {
            z = false;
            this.f1190c.f3363T = this.f1188a.getText().toString();
            C0925mS mSVar = this.f1190c;
            String string = mSVar.getActivity().getString(2131755420);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1190c.getActivity().getString(2131755420));
            sb.append("#");
            sb.append(this.f1190c.f3363T);
            mSVar.mo4732a(string, sb.toString(), (Context) this.f1190c.getActivity());
        } else {
            z = true;
        }
        if ((z || this.f1190c.f3362S) && a) {
            for (int size = this.f1190c.f3386q.size() - 1; size >= 0; size--) {
                if (this.f1190c.f3386q.valueAt(size)) {
                    C0925mS mSVar2 = this.f1190c;
                    C0082EH item = mSVar2.f3383n.getItem(mSVar2.f3386q.keyAt(size));
                    this.f1190c.f3383n.remove(item);
                    C0195JU ju = this.f1190c.f3372c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("update customers  set g_id=(select b.id from groups b where b.name='");
                    sb2.append(this.f1188a.getText().toString());
                    sb2.append("') where id='");
                    sb2.append(item.mo191f());
                    sb2.append("'");
                    ju.mo562d(sb2.toString());
                }
            }
            this.f1190c.mo4741c(1);
            this.f1190c.mo4729a(this.f1188a.getText().toString());
            this.f1189b.dismiss();
        }
    }
}
