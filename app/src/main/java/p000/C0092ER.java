package p000;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* renamed from: ER */
class C0092ER implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f220a;

    /* renamed from: b */
    public final /* synthetic */ EditText f221b;

    /* renamed from: c */
    public final /* synthetic */ AutoCompleteTextView f222c;

    /* renamed from: d */
    public final /* synthetic */ String f223d;

    /* renamed from: e */
    public final /* synthetic */ AlertDialog f224e;

    /* renamed from: f */
    public final /* synthetic */ C0925mS f225f;

    public C0092ER(C0925mS mSVar, EditText editText, EditText editText2, AutoCompleteTextView autoCompleteTextView, String str, AlertDialog alertDialog) {
        this.f225f = mSVar;
        this.f220a = editText;
        this.f221b = editText2;
        this.f222c = autoCompleteTextView;
        this.f223d = str;
        this.f224e = alertDialog;
    }

    public void onClick(View view) {
        boolean a = C0008AO.m5a(this.f220a);
        boolean z = false;
        if (!C0008AO.m5a(this.f221b)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f222c)) {
            a = false;
        }
        if (this.f225f.f3372c.mo629x(this.f222c.getText().toString()).getCount() != 0 || this.f222c.getText().toString().equals("")) {
            z = true;
        } else {
            this.f225f.f3363T = this.f222c.getText().toString();
            C0925mS mSVar = this.f225f;
            String string = mSVar.getActivity().getString(2131755420);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f225f.getActivity().getString(2131755420));
            sb.append("#");
            sb.append(this.f225f.f3363T);
            mSVar.mo4732a(string, sb.toString(), (Context) this.f225f.getActivity());
        }
        if ((z || this.f225f.f3362S) && a) {
            if (this.f223d != null) {
                C0195JU ju = this.f225f.f3372c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("update customers set name='");
                sb2.append(this.f220a.getText().toString());
                sb2.append("',gsm='");
                sb2.append(this.f221b.getText().toString());
                sb2.append("',g_id=(select b.id from groups b where b.name='");
                sb2.append(this.f222c.getText().toString());
                sb2.append("') where id='");
                sb2.append(this.f225f.f3376g);
                sb2.append("'");
                ju.mo562d(sb2.toString());
                this.f225f.mo4741c(1);
                this.f225f.mo4729a(this.f222c.getText().toString());
            }
            this.f224e.dismiss();
        }
    }
}
