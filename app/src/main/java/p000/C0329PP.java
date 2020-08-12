package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.support.v4.app.FragmentActivity;
import android.text.format.DateFormat;
import android.widget.ListView;
import android.widget.Toast;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: PP */
class C0329PP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f943a;

    public C0329PP(C0523YQ yq) {
        this.f943a = yq;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Cursor cursor;
        try {
            this.f943a.mo1573e();
            if (this.f943a.f1499Aa.getText() != null) {
                if (!this.f943a.f1499Aa.getText().toString().isEmpty()) {
                    this.f943a.f1613ya = this.f943a.f1499Aa.getText().toString();
                    this.f943a.f1609wa = 1;
                    boolean z = C0195JU.f451k;
                    String str = Value.PERCENTAGE;
                    if (!z) {
                        if (this.f943a.f1609wa == 0) {
                            cursor = this.f943a.f1606v.mo593l(this.f943a.f1553b);
                        } else {
                            this.f943a.f1611xa = this.f943a.f1611xa.isEmpty() ? str : this.f943a.f1611xa;
                            C0523YQ yq = this.f943a;
                            if (!this.f943a.f1613ya.isEmpty()) {
                                str = this.f943a.f1613ya;
                            }
                            yq.f1613ya = str;
                            cursor = this.f943a.f1606v.mo492a(this.f943a.f1553b, this.f943a.f1611xa, this.f943a.f1613ya);
                        }
                    } else if (this.f943a.f1609wa == 0) {
                        cursor = this.f943a.f1606v.mo570f(this.f943a.f1553b, this.f943a.f1562e);
                    } else {
                        this.f943a.f1611xa = this.f943a.f1611xa.isEmpty() ? str : this.f943a.f1611xa;
                        C0523YQ yq2 = this.f943a;
                        if (!this.f943a.f1613ya.isEmpty()) {
                            str = this.f943a.f1613ya;
                        }
                        yq2.f1613ya = str;
                        cursor = this.f943a.f1606v.mo527b(this.f943a.f1553b, this.f943a.f1611xa, this.f943a.f1613ya, this.f943a.f1562e);
                    }
                    if (cursor.getCount() == 0) {
                        cursor.close();
                        Toast.makeText(this.f943a.getActivity(), "No data found.", 1).show();
                        return;
                    }
                    cursor.close();
                    new DateFormat();
                    String str2 = "-";
                    if (!C0195JU.f451k) {
                        C0195JU ju = this.f943a.f1606v;
                        ListView listView = this.f943a.f1526O;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f943a.f1499Aa.getText().toString());
                        sb.append(str2);
                        sb.append(this.f943a.f1606v.mo465K(this.f943a.f1556c));
                        ju.mo507a(listView, sb.toString(), this.f943a.mo1536a(this.f943a.f1524N.f863d), this.f943a.f1611xa, this.f943a.f1613ya);
                    } else {
                        C0195JU ju2 = this.f943a.f1606v;
                        ListView listView2 = this.f943a.f1526O;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f943a.f1499Aa.getText().toString());
                        sb2.append(str2);
                        sb2.append(this.f943a.f1606v.mo465K(this.f943a.f1556c));
                        sb2.append(str2);
                        sb2.append(this.f943a.f1562e);
                        ju2.mo508a(listView2, sb2.toString(), this.f943a.mo1536a(this.f943a.f1524N.f863d), this.f943a.f1562e, this.f943a.f1611xa, this.f943a.f1613ya);
                    }
                    C0195JU ju3 = this.f943a.f1606v;
                    String str3 = this.f943a.f1553b;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f943a.getActivity().getString(2131755066));
                    sb3.append(str2);
                    sb3.append(this.f943a.f1499Aa.getText().toString());
                    ju3.mo517a(str3, sb3.toString(), this.f943a.f1499Aa.getText().toString(), !C0195JU.f451k ? "" : this.f943a.f1562e);
                    this.f943a.f1609wa = 0;
                    this.f943a.mo1524F();
                    FragmentStatePagerSupport_Main.f2451d = true;
                    FragmentActivity activity = this.f943a.getActivity();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f943a.f1499Aa.getText().toString());
                    sb4.append(str2);
                    sb4.append(this.f943a.f1606v.mo465K(this.f943a.f1556c));
                    sb4.append(".pdf");
                    Toast.makeText(activity, sb4.toString(), 1).show();
                    return;
                }
            }
            Toast.makeText(this.f943a.getActivity(), "Closing date is required.", 1).show();
        } catch (Exception unused) {
            Toast.makeText(this.f943a.getActivity(), "SQL Error.", 1);
        }
    }
}
