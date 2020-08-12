package p000;

import android.os.Message;
import android.widget.ListView;

/* renamed from: HQ */
class C0152HQ implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f333a;

    public C0152HQ(C0523YQ yq) {
        this.f333a = yq;
    }

    public void run() {
        if (!C0195JU.f451k) {
            C0523YQ yq = this.f333a;
            yq.f1567fb = yq.f1606v.mo465K(yq.f1556c);
            C0523YQ yq2 = this.f333a;
            C0195JU ju = yq2.f1606v;
            ListView listView = yq2.f1526O;
            String K = ju.mo465K(yq2.f1556c);
            C0523YQ yq3 = this.f333a;
            double a = yq3.mo1536a(yq3.f1524N.f863d);
            C0523YQ yq4 = this.f333a;
            ju.mo507a(listView, K, a, yq4.f1611xa, yq4.f1613ya);
        } else {
            C0523YQ yq5 = this.f333a;
            C0195JU ju2 = yq5.f1606v;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f333a.f1556c);
            String str = "-";
            sb.append(str);
            sb.append(this.f333a.f1562e);
            yq5.f1567fb = ju2.mo465K(sb.toString());
            C0523YQ yq6 = this.f333a;
            C0195JU ju3 = yq6.f1606v;
            ListView listView2 = yq6.f1526O;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f333a.f1556c);
            sb2.append(str);
            sb2.append(this.f333a.f1562e);
            String K2 = ju3.mo465K(sb2.toString());
            C0523YQ yq7 = this.f333a;
            double a2 = yq7.mo1536a(yq7.f1524N.f863d);
            C0523YQ yq8 = this.f333a;
            ju3.mo508a(listView2, K2, a2, yq8.f1562e, yq8.f1611xa, yq8.f1613ya);
        }
        Message message = new Message();
        message.obj = "1";
        this.f333a.f1564eb.sendMessage(message);
    }
}
