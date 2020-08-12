package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: NR */
class C0285NR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f771a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f772b;

    /* renamed from: c */
    public final /* synthetic */ int f773c;

    /* renamed from: d */
    public final /* synthetic */ AlertDialog f774d;

    /* renamed from: e */
    public final /* synthetic */ C0925mS f775e;

    public C0285NR(C0925mS mSVar, AutoCompleteTextView autoCompleteTextView, AutoCompleteTextView autoCompleteTextView2, int i, AlertDialog alertDialog) {
        this.f775e = mSVar;
        this.f771a = autoCompleteTextView;
        this.f772b = autoCompleteTextView2;
        this.f773c = i;
        this.f774d = alertDialog;
    }

    public void onClick(View view) {
        boolean a = C0008AO.m5a(this.f771a);
        if (!C0008AO.m5a(this.f772b)) {
            a = false;
        }
        if (this.f775e.f3372c.mo584i(this.f771a.getText().toString()).getCount() == 0 || this.f775e.f3372c.mo590k(this.f772b.getText().toString()) == 0) {
            a = false;
        }
        if (a) {
            C0925mS mSVar = this.f775e;
            C0082EH item = mSVar.f3383n.getItem(mSVar.f3386q.keyAt(this.f773c));
            this.f775e.f3383n.remove(item);
            C0195JU ju = this.f775e.f3372c;
            StringBuilder sb = new StringBuilder();
            String str = "update transactions  set curr_id=(select b.id from currency b where b.name='";
            sb.append(str);
            sb.append(this.f771a.getText().toString());
            String str2 = "') , cus_id=(select b.id from customers b where b.name='";
            sb.append(str2);
            sb.append(this.f772b.getText().toString());
            sb.append("') where cus_id='");
            sb.append(item.mo191f());
            sb.append("' and t_cus_id is null  and curr_id=(select b.id from currency b where b.name='");
            sb.append(this.f775e.f3380k);
            String str3 = "')";
            sb.append(str3);
            ju.mo562d(sb.toString());
            C0195JU ju2 = this.f775e.f3372c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f771a.getText().toString());
            sb2.append("') , t_cus_id=(select b.id from customers b where b.name='");
            sb2.append(this.f772b.getText().toString());
            sb2.append("') where t_cus_id is not null and  t_cus_id='");
            sb2.append(item.mo191f());
            sb2.append("' and cus_id<> '");
            sb2.append(item.mo191f());
            String str4 = "' and curr_id=(select b.id from currency b where b.name='";
            sb2.append(str4);
            sb2.append(this.f775e.f3380k);
            sb2.append(str3);
            ju2.mo562d(sb2.toString());
            C0195JU ju3 = this.f775e.f3372c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f771a.getText().toString());
            sb3.append(str2);
            sb3.append(this.f772b.getText().toString());
            sb3.append("') where t_cus_id is not null  and cus_id='");
            sb3.append(item.mo191f());
            sb3.append("' and t_cus_id<> '");
            sb3.append(item.mo191f());
            sb3.append(str4);
            sb3.append(this.f775e.f3380k);
            sb3.append(str3);
            ju3.mo562d(sb3.toString());
            this.f775e.f3380k = this.f771a.getText().toString();
            FragmentStatePagerSupport_Main.f2451d = true;
            this.f775e.mo4730a(this.f771a.getText().toString(), this.f775e.f3380k);
            this.f774d.dismiss();
        }
    }
}
