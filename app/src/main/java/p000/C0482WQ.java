package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* renamed from: WQ */
class C0482WQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f1377a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f1378b;

    /* renamed from: c */
    public final /* synthetic */ String f1379c;

    /* renamed from: d */
    public final /* synthetic */ EditText f1380d;

    /* renamed from: e */
    public final /* synthetic */ AlertDialog f1381e;

    /* renamed from: f */
    public final /* synthetic */ C0523YQ f1382f;

    public C0482WQ(C0523YQ yq, EditText editText, AutoCompleteTextView autoCompleteTextView, String str, EditText editText2, AlertDialog alertDialog) {
        this.f1382f = yq;
        this.f1377a = editText;
        this.f1378b = autoCompleteTextView;
        this.f1379c = str;
        this.f1380d = editText2;
        this.f1381e = alertDialog;
    }

    public void onClick(View view) {
        C0195JU ju;
        String obj;
        String sb;
        boolean a = C0008AO.m5a(this.f1377a);
        boolean z = false;
        if (!C0008AO.m5a(this.f1378b)) {
            a = false;
        }
        if (this.f1382f.f1606v.mo629x(this.f1378b.getText().toString()).getCount() != 0 || this.f1378b.getText().toString().equals("")) {
            z = true;
        } else {
            this.f1382f.f1588mb = this.f1378b.getText().toString();
            C0523YQ yq = this.f1382f;
            String string = yq.getActivity().getString(2131755420);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f1382f.getActivity().getString(2131755420));
            sb2.append("#");
            sb2.append(this.f1382f.f1588mb);
            yq.mo1559b(string, sb2.toString(), this.f1382f.getActivity());
        }
        if ((z || this.f1382f.f1595pa) && a) {
            if (this.f1379c != null) {
                C0195JU ju2 = this.f1382f.f1606v;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("update customers set name='");
                sb3.append(this.f1380d.getText().toString());
                sb3.append("',gsm='");
                sb3.append(this.f1377a.getText().toString());
                sb3.append("',g_id=(select b.id from groups b where b.name='");
                sb3.append(this.f1378b.getText().toString());
                sb3.append("') where id='");
                sb3.append(this.f1382f.f1553b);
                sb3.append("'");
                ju2.mo562d(sb3.toString());
                this.f1382f.f1568g = this.f1377a.getText().toString();
                C0523YQ yq2 = this.f1382f;
                int i = yq2.f1607va;
                if (i == 1) {
                    yq2.f1606v.mo541b(this.f1377a.getText().toString());
                } else {
                    if (i == 2) {
                        ju = yq2.f1606v;
                        obj = this.f1377a.getText().toString();
                        C0523YQ yq3 = this.f1382f;
                        sb = yq3.f1606v.mo531b(yq3.f1526O, yq3.f1556c, yq3.mo1536a(yq3.f1524N.f863d));
                    } else if (i == 3) {
                        ju = yq2.f1606v;
                        obj = this.f1377a.getText().toString();
                        C0523YQ yq4 = this.f1382f;
                        C0195JU ju3 = yq4.f1606v;
                        C0232LL f = yq4.mo1521B();
                        C0523YQ yq5 = this.f1382f;
                        sb = ju3.mo498a(f, yq5.f1556c, yq5.mo1536a(yq5.f1524N.f863d));
                    } else if (i == 4) {
                        C0195JU ju4 = yq2.f1606v;
                        String obj2 = this.f1377a.getText().toString();
                        C0523YQ yq6 = this.f1382f;
                        C0195JU ju5 = yq6.f1606v;
                        C0232LL f2 = yq6.mo1521B();
                        C0523YQ yq7 = this.f1382f;
                        ju4.mo637z(obj2, ju5.mo498a(f2, yq7.f1556c, yq7.mo1536a(yq7.f1524N.f863d)));
                    } else if (i == 5) {
                        yq2.mo1561c(2);
                    } else {
                        ju = yq2.f1606v;
                        obj = this.f1377a.getText().toString();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(this.f1382f.getActivity().getString(2131755382));
                        sb4.append(this.f1382f.f1565f);
                        sb = sb4.toString();
                    }
                    ju.mo634y(obj, sb);
                }
            }
            this.f1381e.dismiss();
        }
    }
}
