package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: IP */
class C0171IP implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f380a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f381b;

    public C0171IP(C0523YQ yq, Dialog dialog) {
        this.f381b = yq;
        this.f380a = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            C0523YQ yq = this.f381b;
            yq.f1607va = 4;
            String str = yq.f1568g;
            if (str != null && str.length() >= 3) {
                C0523YQ yq2 = this.f381b;
                C0195JU ju = yq2.f1606v;
                String str2 = yq2.f1568g;
                C0232LL f = yq2.mo1521B();
                C0523YQ yq3 = this.f381b;
                ju.mo637z(str2, ju.mo498a(f, yq3.f1556c, yq3.mo1536a(yq3.f1524N.f863d)));
                this.f380a.dismiss();
            }
        } else {
            if (i == 1) {
                C0523YQ yq4 = this.f381b;
                yq4.f1607va = 3;
                String str3 = yq4.f1568g;
                if (str3 != null && str3.length() >= 3) {
                    C0523YQ yq5 = this.f381b;
                    C0195JU ju2 = yq5.f1606v;
                    String str4 = yq5.f1568g;
                    C0232LL f2 = yq5.mo1521B();
                    C0523YQ yq6 = this.f381b;
                    ju2.mo634y(str4, ju2.mo498a(f2, yq6.f1556c, yq6.mo1536a(yq6.f1524N.f863d)));
                }
            } else if (i == 2) {
                C0523YQ yq7 = this.f381b;
                yq7.f1607va = 5;
                C0195JU ju3 = yq7.f1606v;
                C0232LL f3 = yq7.mo1521B();
                C0523YQ yq8 = this.f381b;
                ju3.mo486V(ju3.mo498a(f3, yq8.f1556c, yq8.mo1536a(yq8.f1524N.f863d)));
            }
            this.f380a.dismiss();
        }
        C0523YQ yq9 = this.f381b;
        yq9.mo1547a(yq9.f1553b, yq9.f1556c, yq9.f1568g, yq9.f1559d);
        this.f380a.dismiss();
    }
}
