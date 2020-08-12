package p000;

import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

/* renamed from: HP */
class C0151HP implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f331a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f332b;

    public C0151HP(C0523YQ yq, Dialog dialog) {
        this.f332b = yq;
        this.f331a = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Dialog dialog;
        C0195JU ju;
        String sb;
        String str = "cus_details.jpg";
        String str2 = "-";
        if (this.f332b.f1606v.mo524a("prefPrintSort", true)) {
            C0523YQ yq = this.f332b;
            yq.mo1581h(yq.f1596q);
            this.f332b.f1524N.notifyDataSetChanged();
            this.f332b.f1530Q = 1;
        }
        if (i == 0) {
            try {
                this.f332b.mo1573e();
                String str3 = ".pdf";
                if (!C0195JU.f451k) {
                    this.f332b.f1606v.mo507a(this.f332b.f1526O, this.f332b.f1606v.mo465K(this.f332b.f1556c), this.f332b.mo1536a(this.f332b.f1524N.f863d), this.f332b.f1611xa, this.f332b.f1613ya);
                    ju = this.f332b.f1606v;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f332b.f1606v.mo465K(this.f332b.f1556c));
                    sb2.append(str3);
                    sb = sb2.toString();
                } else {
                    C0195JU ju2 = this.f332b.f1606v;
                    ListView listView = this.f332b.f1526O;
                    C0195JU ju3 = this.f332b.f1606v;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f332b.f1556c);
                    sb3.append(str2);
                    sb3.append(this.f332b.f1562e);
                    ju2.mo508a(listView, ju3.mo465K(sb3.toString()), this.f332b.mo1536a(this.f332b.f1524N.f863d), this.f332b.f1562e, this.f332b.f1611xa, this.f332b.f1613ya);
                    ju = this.f332b.f1606v;
                    StringBuilder sb4 = new StringBuilder();
                    C0195JU ju4 = this.f332b.f1606v;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(this.f332b.f1556c);
                    sb5.append(str2);
                    sb5.append(this.f332b.f1562e);
                    sb4.append(ju4.mo465K(sb5.toString()));
                    sb4.append(str3);
                    sb = sb4.toString();
                }
                ju.mo484U(sb);
                dialog = this.f331a;
            } catch (Exception e) {
                Log.d("share_err", e.getMessage());
                return;
            }
        } else if (i == 1) {
            this.f332b.mo1573e();
            if (this.f332b.f1526O.getCount() <= 100) {
                this.f332b.f1606v.mo521a(this.f332b.f1606v.mo493a(this.f332b.f1526O, this.f332b.f1548Z), str);
                this.f332b.f1606v.mo482T(str);
                dialog = this.f331a;
            } else {
                Toast.makeText(this.f332b.getActivity(), "Share PDF as the data is too long!", 1).show();
                return;
            }
        } else if (i == 2) {
            this.f332b.f1607va = 2;
            if (this.f332b.f1568g != null) {
                if (this.f332b.f1568g.length() >= 3) {
                    this.f332b.f1606v.mo634y(this.f332b.f1568g, this.f332b.f1606v.mo531b(this.f332b.f1526O, this.f332b.f1556c, this.f332b.mo1536a(this.f332b.f1524N.f863d)));
                    dialog = this.f331a;
                }
            }
            this.f332b.mo1547a(this.f332b.f1553b, this.f332b.f1556c, this.f332b.f1568g, this.f332b.f1559d);
            dialog = this.f331a;
        } else if (i == 3) {
            this.f332b.mo1573e();
            this.f332b.f1606v.mo522a(this.f332b.f1526O, this.f332b.f1606v.mo465K(this.f332b.f1556c), this.f332b.mo1536a(this.f332b.f1524N.f863d));
            C0195JU ju5 = this.f332b.f1606v;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.f332b.f1606v.mo465K(this.f332b.f1556c));
            sb6.append(".xls");
            ju5.mo478R(sb6.toString());
            dialog = this.f331a;
        } else {
            return;
        }
        dialog.dismiss();
    }
}
